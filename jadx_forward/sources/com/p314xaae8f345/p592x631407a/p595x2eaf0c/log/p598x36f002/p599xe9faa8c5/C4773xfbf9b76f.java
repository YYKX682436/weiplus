package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5;

/* renamed from: com.tencent.midas.comm.log.util.compressor.CachedByteArrayStream */
/* loaded from: classes13.dex */
public class C4773xfbf9b76f extends java.io.OutputStream {

    /* renamed from: BUFFER_SIZE */
    private final int f20384x44fe30a0;

    /* renamed from: _bytes */
    private final byte[] f20385xa7ba236c;
    protected byte[] buf;

    /* renamed from: count */
    protected int f20386x5a7510f;

    public C4773xfbf9b76f() {
        this.f20384x44fe30a0 = 512;
        byte[] bArr = new byte[512];
        this.f20385xa7ba236c = bArr;
        this.buf = bArr;
    }

    /* renamed from: checkOffsetAndCount */
    private static void m41736xa133e53(int i17, int i18, int i19) {
        if ((i18 | i19) < 0 || i18 > i17 || i17 - i18 < i19) {
            throw new java.lang.ArrayIndexOutOfBoundsException("arrayLength: " + i17 + ", offset: " + i18 + ", count: " + i19);
        }
    }

    /* renamed from: expand */
    private void m41737xb328de9a(int i17) {
        int i18 = this.f20386x5a7510f;
        int i19 = i18 + i17;
        byte[] bArr = this.buf;
        if (i19 <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[(i17 + i18) * 2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i18);
        this.buf = bArr2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    /* renamed from: reset */
    public synchronized void m41738x6761d4f() {
        this.buf = this.f20385xa7ba236c;
        this.f20386x5a7510f = 0;
    }

    /* renamed from: size */
    public int m41739x35e001() {
        return this.f20386x5a7510f;
    }

    /* renamed from: toByteArray */
    public synchronized byte[] m41740x5f01b1f6() {
        byte[] bArr;
        int i17 = this.f20386x5a7510f;
        bArr = new byte[i17];
        java.lang.System.arraycopy(this.buf, 0, bArr, 0, i17);
        return bArr;
    }

    /* renamed from: toString */
    public java.lang.String m41741x9616526c() {
        return new java.lang.String(this.buf, 0, this.f20386x5a7510f);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i17, int i18) {
        m41736xa133e53(bArr.length, i17, i18);
        if (i18 == 0) {
            return;
        }
        m41737xb328de9a(i18);
        java.lang.System.arraycopy(bArr, i17, this.buf, this.f20386x5a7510f, i18);
        this.f20386x5a7510f += i18;
    }

    /* renamed from: writeTo */
    public synchronized void m41744x5f8be6ba(java.io.OutputStream outputStream) {
        outputStream.write(this.buf, 0, this.f20386x5a7510f);
    }

    @java.lang.Deprecated
    /* renamed from: toString */
    public java.lang.String m41742x9616526c(int i17) {
        int m41739x35e001 = m41739x35e001();
        char[] cArr = new char[m41739x35e001];
        for (int i18 = 0; i18 < m41739x35e001; i18++) {
            cArr[i18] = (char) (((i17 & 255) << 8) | (this.buf[i18] & 255));
        }
        return new java.lang.String(cArr);
    }

    public C4773xfbf9b76f(int i17) {
        this.f20384x44fe30a0 = 512;
        this.f20385xa7ba236c = new byte[512];
        if (i17 >= 0) {
            this.buf = new byte[i17];
            return;
        }
        throw new java.lang.IllegalArgumentException("size < 0");
    }

    /* renamed from: toString */
    public java.lang.String m41743x9616526c(java.lang.String str) {
        return new java.lang.String(this.buf, 0, this.f20386x5a7510f, str);
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i17) {
        if (this.f20386x5a7510f == this.buf.length) {
            m41737xb328de9a(1);
        }
        byte[] bArr = this.buf;
        int i18 = this.f20386x5a7510f;
        this.f20386x5a7510f = i18 + 1;
        bArr[i18] = (byte) i17;
    }
}
