package com.tencent.midas.comm.log.internal;

/* loaded from: classes13.dex */
public class APLogAppender {
    private static final int AUTO_FLUSH_INTERVAL = 15000;
    private static final int BUFFER_BLOCK_SIZE = 153600;
    private static final int POSITION_INIT = 12;
    private static com.tencent.midas.comm.log.internal.APLogAppender instance;
    private static boolean stopAutoFlush;
    private android.os.Handler autoFlushHandler;
    private android.os.HandlerThread autoFlushThread;
    private com.tencent.midas.comm.log.processor.APLogCompressor mCompressor = null;
    private com.tencent.midas.comm.log.processor.APLogEncryptor mEncryptor = null;
    private com.tencent.midas.comm.log.processor.APLogWriter mWriter = null;
    private java.io.RandomAccessFile randomAccessFile = null;
    private java.nio.channels.FileChannel fileChannel = null;
    private java.nio.MappedByteBuffer mappedByteBuffer = null;
    private java.lang.Runnable autoFlushRunnable = new java.lang.Runnable() { // from class: com.tencent.midas.comm.log.internal.APLogAppender.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.tencent.midas.comm.log.internal.APLogAppender.this.flushAndWrite();
                if (com.tencent.midas.comm.log.internal.APLogAppender.stopAutoFlush || com.tencent.midas.comm.log.internal.APLogAppender.this.autoFlushHandler == null) {
                    return;
                }
                com.tencent.midas.comm.log.internal.APLogAppender.this.autoFlushHandler.postDelayed(com.tencent.midas.comm.log.internal.APLogAppender.this.autoFlushRunnable, 15000L);
            } catch (java.lang.Throwable th6) {
                th6.getMessage();
            }
        }
    };
    private volatile long seq = 12;
    private final byte[] _bytes = new byte[0];
    private final java.lang.String SPACE = " ";
    private byte[] EMPTY_BUFFER = new byte[BUFFER_BLOCK_SIZE];
    private java.lang.String FLAG_BEGIN = "============mmap cache begin===========\r\n";
    private java.lang.String FLAG_END = "============mmap cache end=============\r\n";

    private APLogAppender() {
        this.autoFlushThread = null;
        this.autoFlushHandler = null;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("LOG-FLUSH");
        this.autoFlushThread = handlerThread;
        handlerThread.start();
        this.autoFlushHandler = new android.os.Handler(this.autoFlushThread.getLooper());
    }

    private synchronized void checkAndFlushBuffer() {
        java.nio.MappedByteBuffer mappedByteBuffer;
        try {
            mappedByteBuffer = this.mappedByteBuffer;
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "check and flush buffer error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
        if (mappedByteBuffer == null) {
            return;
        }
        int i17 = (int) mappedByteBuffer.getLong(0);
        if (i17 <= 12) {
            this.seq = 12L;
        } else {
            flushBuffer(i17 - 12);
        }
    }

    private void createBufferProcessor() {
        if (com.tencent.midas.comm.APLog.getLogInfo() != null && com.tencent.midas.comm.APLog.getLogInfo().isCompressLog()) {
            this.mCompressor = com.tencent.midas.comm.log.processor.APLogCompressor.create();
        }
        if (com.tencent.midas.comm.APLog.getLogInfo() != null && com.tencent.midas.comm.APLog.getLogInfo().isEncryptLog()) {
            this.mEncryptor = com.tencent.midas.comm.log.processor.APLogEncryptor.create();
        }
        this.mWriter = com.tencent.midas.comm.log.processor.APLogWriter.create();
    }

    private void flushBuffer(int i17) {
        java.nio.MappedByteBuffer mappedByteBuffer = this.mappedByteBuffer;
        if (mappedByteBuffer == null) {
            return;
        }
        if (i17 > BUFFER_BLOCK_SIZE) {
            i17 = BUFFER_BLOCK_SIZE;
        }
        byte[] bArr = new byte[i17];
        mappedByteBuffer.position(12);
        this.mappedByteBuffer.get(bArr);
        this.mWriter.write(bArr, process(this.FLAG_BEGIN), process(this.FLAG_END));
        this.mappedByteBuffer.position(12);
        this.mappedByteBuffer.put(this.EMPTY_BUFFER, 12, i17);
        this.mappedByteBuffer.putLong(0, 0L);
        resetPosAndSeq();
    }

    private void initMmap() {
        if (this.mappedByteBuffer == null) {
            return;
        }
        checkAndFlushBuffer();
        this.mappedByteBuffer.putLong(0, 12L);
        this.mappedByteBuffer.putInt(8, 45);
        resetPosAndSeq();
    }

    public static com.tencent.midas.comm.log.internal.APLogAppender open() {
        com.tencent.midas.comm.log.internal.APLogAppender aPLogAppender = instance;
        if (aPLogAppender != null) {
            return aPLogAppender;
        }
        com.tencent.midas.comm.log.internal.APLogAppender aPLogAppender2 = new com.tencent.midas.comm.log.internal.APLogAppender();
        instance = aPLogAppender2;
        aPLogAppender2.createBufferProcessor();
        instance.openMmapFile();
        instance.initMmap();
        instance.startAutoFlush();
        return instance;
    }

    private void openMmapFile() {
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(com.tencent.midas.comm.log.APLogFileInfo.mmapName, "rw");
            this.randomAccessFile = randomAccessFile;
            java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
            this.fileChannel = channel;
            this.mappedByteBuffer = channel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, 153600L);
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "open log mmap file error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
    }

    private synchronized byte[] process(java.lang.String str) {
        byte[] bytes;
        try {
            bytes = (java.lang.System.currentTimeMillis() + " " + str).getBytes();
            com.tencent.midas.comm.log.processor.APLogCompressor aPLogCompressor = this.mCompressor;
            if (aPLogCompressor != null) {
                bytes = aPLogCompressor.compress(bytes);
            }
            com.tencent.midas.comm.log.processor.APLogEncryptor aPLogEncryptor = this.mEncryptor;
            if (aPLogEncryptor != null) {
                bytes = aPLogEncryptor.encrypt(bytes);
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "process log error: <%s>%s", th6.getClass().getName(), th6.getMessage());
            return this._bytes;
        }
        return bytes;
    }

    private void resetPosAndSeq() {
        if (this.mappedByteBuffer == null) {
            return;
        }
        this.seq = 12L;
        this.mappedByteBuffer.position(12);
    }

    private void startAutoFlush() {
        if (com.tencent.midas.comm.APLog.getLogInfo() == null || !com.tencent.midas.comm.APLog.getLogInfo().isAutoFlush()) {
            return;
        }
        try {
            this.autoFlushHandler.postDelayed(this.autoFlushRunnable, 15000L);
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }

    private void stopAutoFlush() {
        stopAutoFlush = true;
    }

    public void append(java.lang.String str) {
        try {
            updateMmap(process(str));
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "append log error: <%s> %s", th6.getClass().getName(), th6.getMessage());
        }
    }

    public void flushAndWrite() {
        try {
            checkAndFlushBuffer();
            com.tencent.midas.comm.log.processor.APLogWriter aPLogWriter = this.mWriter;
            if (aPLogWriter != null) {
                aPLogWriter.flush();
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "flush buffer and write error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
    }

    public synchronized void updateMmap(byte[] bArr) {
        if (this.seq + bArr.length > 102400) {
            checkAndFlushBuffer();
        }
        java.nio.MappedByteBuffer mappedByteBuffer = this.mappedByteBuffer;
        if (mappedByteBuffer == null) {
            return;
        }
        mappedByteBuffer.put(bArr);
        this.seq += bArr.length;
        this.mappedByteBuffer.putLong(0, this.seq);
    }
}
