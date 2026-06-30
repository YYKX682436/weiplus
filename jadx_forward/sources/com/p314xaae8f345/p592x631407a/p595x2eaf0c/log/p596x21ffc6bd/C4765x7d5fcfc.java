package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd;

/* renamed from: com.tencent.midas.comm.log.internal.APLogAppender */
/* loaded from: classes13.dex */
public class C4765x7d5fcfc {

    /* renamed from: AUTO_FLUSH_INTERVAL */
    private static final int f20324x593f6850 = 15000;

    /* renamed from: BUFFER_BLOCK_SIZE */
    private static final int f20325x724fa5f2 = 153600;

    /* renamed from: POSITION_INIT */
    private static final int f20326xfb08de66 = 12;

    /* renamed from: instance */
    private static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc f20327x21169495;

    /* renamed from: stopAutoFlush */
    private static boolean f20328xe9b99cb3;

    /* renamed from: autoFlushHandler */
    private android.os.Handler f20334x38372af5;

    /* renamed from: autoFlushThread */
    private android.os.HandlerThread f20336xf5a698ff;

    /* renamed from: mCompressor */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4767xd3c20f3a f20338xc62ca112 = null;

    /* renamed from: mEncryptor */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3 f20339xdae7851b = null;

    /* renamed from: mWriter */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4769x17878d68 f20340x20f4cb40 = null;

    /* renamed from: randomAccessFile */
    private java.io.RandomAccessFile f20342xa5b3b623 = null;

    /* renamed from: fileChannel */
    private java.nio.channels.FileChannel f20337x9d383be7 = null;

    /* renamed from: mappedByteBuffer */
    private java.nio.MappedByteBuffer f20341xeb6bb1fb = null;

    /* renamed from: autoFlushRunnable */
    private java.lang.Runnable f20335xfffe74d2 = new java.lang.Runnable() { // from class: com.tencent.midas.comm.log.internal.APLogAppender.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc.this.m41688x1734d76c();
                if (com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc.f20328xe9b99cb3 || com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc.this.f20334x38372af5 == null) {
                    return;
                }
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc.this.f20334x38372af5.postDelayed(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc.this.f20335xfffe74d2, 15000L);
            } catch (java.lang.Throwable th6) {
                th6.getMessage();
            }
        }
    };
    private volatile long seq = 12;

    /* renamed from: _bytes */
    private final byte[] f20333xa7ba236c = new byte[0];

    /* renamed from: SPACE */
    private final java.lang.String f20332x4b6f8e6 = " ";

    /* renamed from: EMPTY_BUFFER */
    private byte[] f20329xd3a3b92 = new byte[f20325x724fa5f2];

    /* renamed from: FLAG_BEGIN */
    private java.lang.String f20330x824b99f6 = "============mmap cache begin===========\r\n";

    /* renamed from: FLAG_END */
    private java.lang.String f20331x8eeb9d68 = "============mmap cache end=============\r\n";

    private C4765x7d5fcfc() {
        this.f20336xf5a698ff = null;
        this.f20334x38372af5 = null;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("LOG-FLUSH");
        this.f20336xf5a698ff = handlerThread;
        handlerThread.start();
        this.f20334x38372af5 = new android.os.Handler(this.f20336xf5a698ff.getLooper());
    }

    /* renamed from: checkAndFlushBuffer */
    private synchronized void m41677x71d35() {
        java.nio.MappedByteBuffer mappedByteBuffer;
        try {
            mappedByteBuffer = this.f20341xeb6bb1fb;
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
            m41679xc4516864(i17 - 12);
        }
    }

    /* renamed from: createBufferProcessor */
    private void m41678x6b481f96() {
        if (com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc() != null && com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc().m41622x14e88f8()) {
            this.f20338xc62ca112 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4767xd3c20f3a.m41694xaf65a0fc();
        }
        if (com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc() != null && com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc().m41623x27419f69()) {
            this.f20339xdae7851b = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3.m41699xaf65a0fc();
        }
        this.f20340x20f4cb40 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4769x17878d68.m41705xaf65a0fc();
    }

    /* renamed from: flushBuffer */
    private void m41679xc4516864(int i17) {
        java.nio.MappedByteBuffer mappedByteBuffer = this.f20341xeb6bb1fb;
        if (mappedByteBuffer == null) {
            return;
        }
        if (i17 > f20325x724fa5f2) {
            i17 = f20325x724fa5f2;
        }
        byte[] bArr = new byte[i17];
        mappedByteBuffer.position(12);
        this.f20341xeb6bb1fb.get(bArr);
        this.f20340x20f4cb40.m41710x6c257df(bArr, m41683xed8d1e6f(this.f20330x824b99f6), m41683xed8d1e6f(this.f20331x8eeb9d68));
        this.f20341xeb6bb1fb.position(12);
        this.f20341xeb6bb1fb.put(this.f20329xd3a3b92, 12, i17);
        this.f20341xeb6bb1fb.putLong(0, 0L);
        m41684x2b5e01ed();
    }

    /* renamed from: initMmap */
    private void m41680xffd02ff() {
        if (this.f20341xeb6bb1fb == null) {
            return;
        }
        m41677x71d35();
        this.f20341xeb6bb1fb.putLong(0, 12L);
        this.f20341xeb6bb1fb.putInt(8, 45);
        m41684x2b5e01ed();
    }

    /* renamed from: open */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc m41681x34264a() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc c4765x7d5fcfc = f20327x21169495;
        if (c4765x7d5fcfc != null) {
            return c4765x7d5fcfc;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc c4765x7d5fcfc2 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc();
        f20327x21169495 = c4765x7d5fcfc2;
        c4765x7d5fcfc2.m41678x6b481f96();
        f20327x21169495.m41682x109bc55();
        f20327x21169495.m41680xffd02ff();
        f20327x21169495.m41685x4c82cc53();
        return f20327x21169495;
    }

    /* renamed from: openMmapFile */
    private void m41682x109bc55() {
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20315x6cbca0fa, "rw");
            this.f20342xa5b3b623 = randomAccessFile;
            java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
            this.f20337x9d383be7 = channel;
            this.f20341xeb6bb1fb = channel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, 153600L);
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "open log mmap file error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
    }

    /* renamed from: process */
    private synchronized byte[] m41683xed8d1e6f(java.lang.String str) {
        byte[] bytes;
        try {
            bytes = (java.lang.System.currentTimeMillis() + " " + str).getBytes();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4767xd3c20f3a c4767xd3c20f3a = this.f20338xc62ca112;
            if (c4767xd3c20f3a != null) {
                bytes = c4767xd3c20f3a.m41696xdc47eb62(bytes);
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3 c4768xdb57b1f3 = this.f20339xdae7851b;
            if (c4768xdb57b1f3 != null) {
                bytes = c4768xdb57b1f3.m41704xa0333265(bytes);
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "process log error: <%s>%s", th6.getClass().getName(), th6.getMessage());
            return this.f20333xa7ba236c;
        }
        return bytes;
    }

    /* renamed from: resetPosAndSeq */
    private void m41684x2b5e01ed() {
        if (this.f20341xeb6bb1fb == null) {
            return;
        }
        this.seq = 12L;
        this.f20341xeb6bb1fb.position(12);
    }

    /* renamed from: startAutoFlush */
    private void m41685x4c82cc53() {
        if (com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc() == null || !com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc().m41621xa7dee48b()) {
            return;
        }
        try {
            this.f20334x38372af5.postDelayed(this.f20335xfffe74d2, 15000L);
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }

    /* renamed from: stopAutoFlush */
    private void m41686xe9b99cb3() {
        f20328xe9b99cb3 = true;
    }

    /* renamed from: append */
    public void m41687xabe4cf1a(java.lang.String str) {
        try {
            m41689xee595238(m41683xed8d1e6f(str));
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "append log error: <%s> %s", th6.getClass().getName(), th6.getMessage());
        }
    }

    /* renamed from: flushAndWrite */
    public void m41688x1734d76c() {
        try {
            m41677x71d35();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4769x17878d68 c4769x17878d68 = this.f20340x20f4cb40;
            if (c4769x17878d68 != null) {
                c4769x17878d68.m41709x5d03b04();
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "flush buffer and write error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
    }

    /* renamed from: updateMmap */
    public synchronized void m41689xee595238(byte[] bArr) {
        if (this.seq + bArr.length > 102400) {
            m41677x71d35();
        }
        java.nio.MappedByteBuffer mappedByteBuffer = this.f20341xeb6bb1fb;
        if (mappedByteBuffer == null) {
            return;
        }
        mappedByteBuffer.put(bArr);
        this.seq += bArr.length;
        this.f20341xeb6bb1fb.putLong(0, this.seq);
    }
}
