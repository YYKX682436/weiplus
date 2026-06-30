package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92;

/* renamed from: com.tencent.midas.comm.log.processor.APLogWriter */
/* loaded from: classes13.dex */
public class C4769x17878d68 {

    /* renamed from: fileChannel */
    private java.nio.channels.FileChannel f20358x9d383be7 = null;

    /* renamed from: mappedByteBuffer */
    private java.nio.MappedByteBuffer f20359xeb6bb1fb = null;

    /* renamed from: randomAccessFile */
    private java.io.RandomAccessFile f20360xa5b3b623 = null;

    /* renamed from: create */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4769x17878d68 m41705xaf65a0fc() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4769x17878d68 c4769x17878d68 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4769x17878d68();
        c4769x17878d68.m41706x89c7536();
        return c4769x17878d68;
    }

    /* renamed from: openLogFile */
    private void m41706x89c7536() {
        try {
            java.lang.String str = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20314xd425c627;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20314xd425c627, "rw");
            this.f20360xa5b3b623 = randomAccessFile;
            this.f20358x9d383be7 = randomAccessFile.getChannel();
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    /* renamed from: refreshFileChannel */
    private long m41707xa1f88a0c(long j17) {
        long j18;
        try {
            j18 = this.f20358x9d383be7.size();
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.m41671x8038a10();
            m41706x89c7536();
            j18 = 0;
        }
        long j19 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20380xe5c36952 * 1024 * 1024;
        long j27 = (j17 + j18) - j19;
        java.lang.String.format(java.util.Locale.CHINA, "size to write: %d, channel size: %d, limit: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
        if (j27 <= 0) {
            return j18;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.m41671x8038a10();
        m41706x89c7536();
        return 0L;
    }

    /* renamed from: close */
    public void m41708x5a5ddf8() {
        try {
            java.nio.channels.FileChannel fileChannel = this.f20358x9d383be7;
            if (fileChannel != null) {
                fileChannel.close();
            }
            java.io.RandomAccessFile randomAccessFile = this.f20360xa5b3b623;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            java.nio.MappedByteBuffer mappedByteBuffer = this.f20359xeb6bb1fb;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.force();
                this.f20359xeb6bb1fb.clear();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: flush */
    public void m41709x5d03b04() {
        java.nio.MappedByteBuffer mappedByteBuffer = this.f20359xeb6bb1fb;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
        }
    }

    /* renamed from: write */
    public void m41710x6c257df(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            long m41707xa1f88a0c = m41707xa1f88a0c(bArr.length);
            java.lang.System.currentTimeMillis();
            this.f20359xeb6bb1fb = this.f20358x9d383be7.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, m41707xa1f88a0c, bArr.length + bArr2.length + bArr3.length);
            java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
            this.f20359xeb6bb1fb.put(bArr2);
            this.f20359xeb6bb1fb.put(bArr);
            this.f20359xeb6bb1fb.put(bArr3);
            this.f20359xeb6bb1fb.force();
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41722x70a9e609(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8);
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "cache log to file error: <%s>%s", th6.getClass().getName(), th6.getMessage());
        }
    }
}
