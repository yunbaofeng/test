package com.cn.huijie.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

public class oneDay {

    public static void main(String[] args) throws Exception {


        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create("hdfs://test01:9000"), conf, "root");


        /*
        IO流

         input  output

         上传
          input   output

         */
        //  FileInputStream fio = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\hdfs命令.doc"));
        //FSDataOutputStream fos=fs.create(new Path("/lw/aa"));
        //IOUtils.copyBytes(fio,fos,conf);
        //IOUtils.closeStream(fos);
        //IOUtils.closeStream(fio);

        fs.close();


    }

}
