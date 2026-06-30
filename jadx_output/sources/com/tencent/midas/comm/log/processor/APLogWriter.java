package com.tencent.midas.comm.log.processor;

/* loaded from: classes13.dex */
public class APLogWriter {
    private java.nio.channels.FileChannel fileChannel = null;
    private java.nio.MappedByteBuffer mappedByteBuffer = null;
    private java.io.RandomAccessFile randomAccessFile = null;

    public static com.tencent.midas.comm.log.processor.APLogWriter create() {
        com.tencent.midas.comm.log.processor.APLogWriter aPLogWriter = new com.tencent.midas.comm.log.processor.APLogWriter();
        aPLogWriter.openLogFile();
        return aPLogWriter;
    }

    private void openLogFile() {
        try {
            java.lang.String str = com.tencent.midas.comm.log.APLogFileInfo.fileName;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(com.tencent.midas.comm.log.APLogFileInfo.fileName, "rw");
            this.randomAccessFile = randomAccessFile;
            this.fileChannel = randomAccessFile.getChannel();
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    private long refreshFileChannel(long j17) {
        long j18;
        try {
            j18 = this.fileChannel.size();
        } catch (java.io.IOException unused) {
            com.tencent.midas.comm.log.APLogFileInfo.updateFileName();
            openLogFile();
            j18 = 0;
        }
        long j19 = com.tencent.midas.comm.log.util.APLogFileUtil.maxLogFileSizeMB * 1024 * 1024;
        long j27 = (j17 + j18) - j19;
        java.lang.String.format(java.util.Locale.CHINA, "size to write: %d, channel size: %d, limit: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
        if (j27 <= 0) {
            return j18;
        }
        com.tencent.midas.comm.log.APLogFileInfo.updateFileName();
        openLogFile();
        return 0L;
    }

    public void close() {
        try {
            java.nio.channels.FileChannel fileChannel = this.fileChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
            java.io.RandomAccessFile randomAccessFile = this.randomAccessFile;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            java.nio.MappedByteBuffer mappedByteBuffer = this.mappedByteBuffer;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.force();
                this.mappedByteBuffer.clear();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void flush() {
        java.nio.MappedByteBuffer mappedByteBuffer = this.mappedByteBuffer;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
        }
    }

    public void write(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            long refreshFileChannel = refreshFileChannel(bArr.length);
            java.lang.System.currentTimeMillis();
            this.mappedByteBuffer = this.fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, refreshFileChannel, bArr.length + bArr2.length + bArr3.length);
            java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
            this.mappedByteBuffer.put(bArr2);
            this.mappedByteBuffer.put(bArr);
            this.mappedByteBuffer.put(bArr3);
            this.mappedByteBuffer.force();
            java.lang.System.currentTimeMillis();
            com.tencent.midas.comm.log.util.APLogFileUtil.deleteOldFileToday(com.tencent.midas.comm.log.APLogFileInfo.dirName);
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "cache log to file error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
    }
}
