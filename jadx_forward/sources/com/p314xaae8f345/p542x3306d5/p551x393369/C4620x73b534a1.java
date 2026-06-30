package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdInputStream */
/* loaded from: classes13.dex */
public class C4620x73b534a1 extends java.io.FilterInputStream {

    /* renamed from: srcBuffSize */
    private static final int f19840xab0140f8 = (int) m40717x59af456f();

    /* renamed from: dict */
    private byte[] f19841x2f0bb6;

    /* renamed from: dstPos */
    private long f19842xb12f224f;

    /* renamed from: fastDict */
    private com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 f19843x39b4ca32;

    /* renamed from: frameFinished */
    private boolean f19844x3df010ff;

    /* renamed from: isClosed */
    private boolean f19845xd742d336;

    /* renamed from: isContinuous */
    private boolean f19846x9803cfd9;
    private byte[] src;

    /* renamed from: srcPos */
    private long f19847xcab201d0;

    /* renamed from: srcSize */
    private long f19848x8b8f8005;

    /* renamed from: stream */
    private long f19849xcad54f80;

    public C4620x73b534a1(java.io.InputStream inputStream) {
        super(inputStream);
        this.f19842xb12f224f = 0L;
        this.f19847xcab201d0 = 0L;
        this.f19848x8b8f8005 = 0L;
        this.src = null;
        this.f19846x9803cfd9 = false;
        this.f19844x3df010ff = true;
        this.f19845xd742d336 = false;
        this.f19841x2f0bb6 = null;
        this.f19843x39b4ca32 = null;
        this.src = new byte[f19840xab0140f8];
        this.f19849xcad54f80 = m40711xc4108468();
    }

    /* renamed from: createDStream */
    private static native long m40711xc4108468();

    /* renamed from: decompressStream */
    private native int m40712x8542c43(long j17, byte[] bArr, int i17, byte[] bArr2, int i18);

    /* renamed from: freeDStream */
    private static native int m40713x380c10f8(long j17);

    /* renamed from: initDStream */
    private native int m40714x8cd7c1d4(long j17);

    /* renamed from: initDStreamWithDict */
    private native int m40715xf1f36f90(long j17, byte[] bArr, int i17);

    /* renamed from: initDStreamWithFastDict */
    private native int m40716x288fb10c(long j17, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322);

    /* renamed from: recommendedDInSize */
    private static native long m40717x59af456f();

    /* renamed from: recommendedDOutSize */
    private static native long m40718x275782e6();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (this.f19845xd742d336) {
            throw new java.io.IOException("Stream closed");
        }
        long j17 = this.f19848x8b8f8005 - this.f19847xcab201d0;
        return j17 > 0 ? (int) j17 : ((java.io.FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19845xd742d336) {
            return;
        }
        m40713x380c10f8(this.f19849xcad54f80);
        ((java.io.FilterInputStream) this).in.close();
        this.f19845xd742d336 = true;
    }

    /* renamed from: finalize */
    public void m40719xd764dc1e() {
        close();
    }

    /* renamed from: getContinuous */
    public boolean m40720x4d98b05() {
        return this.f19846x9803cfd9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        long j17;
        int m40714x8cd7c1d4;
        if (!this.f19845xd742d336) {
            if (this.f19844x3df010ff) {
                com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322 = this.f19843x39b4ca32;
                if (c4616x2a2b3322 != null) {
                    m40714x8cd7c1d4 = m40716x288fb10c(this.f19849xcad54f80, c4616x2a2b3322);
                } else {
                    byte[] bArr2 = this.f19841x2f0bb6;
                    if (bArr2 != null) {
                        m40714x8cd7c1d4 = m40715xf1f36f90(this.f19849xcad54f80, bArr2, bArr2.length);
                    } else {
                        m40714x8cd7c1d4 = m40714x8cd7c1d4(this.f19849xcad54f80);
                    }
                }
                long j18 = m40714x8cd7c1d4;
                if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(j18)) {
                    throw new java.io.IOException("Decompression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(j18));
                }
            }
            if (i17 >= 0 && i18 <= bArr.length - i17) {
                int i19 = i17 + i18;
                long j19 = i17;
                this.f19842xb12f224f = j19;
                while (this.f19842xb12f224f < i19) {
                    if (this.f19848x8b8f8005 - this.f19847xcab201d0 == 0) {
                        long read = ((java.io.FilterInputStream) this).in.read(this.src, 0, f19840xab0140f8);
                        this.f19848x8b8f8005 = read;
                        this.f19847xcab201d0 = 0L;
                        if (read < 0) {
                            this.f19848x8b8f8005 = 0L;
                            if (this.f19844x3df010ff) {
                                return -1;
                            }
                            if (this.f19846x9803cfd9) {
                                j17 = this.f19842xb12f224f;
                                return (int) (j17 - j19);
                            }
                            throw new java.io.IOException("Read error or truncated source");
                        }
                        this.f19844x3df010ff = false;
                    }
                    int m40712x8542c43 = m40712x8542c43(this.f19849xcad54f80, bArr, i19, this.src, (int) this.f19848x8b8f8005);
                    long j27 = m40712x8542c43;
                    if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(j27)) {
                        throw new java.io.IOException("Decompression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(j27));
                    }
                    if (m40712x8542c43 == 0) {
                        this.f19844x3df010ff = true;
                        j17 = this.f19842xb12f224f;
                        return (int) (j17 - j19);
                    }
                }
                return i18;
            }
            throw new java.lang.IndexOutOfBoundsException("Requested lenght " + i18 + " from offset " + i17 + " in buffer of size " + bArr.length);
        }
        throw new java.io.IOException("Stream closed");
    }

    /* renamed from: setContinuous */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4620x73b534a1 m40721x32fdd911(boolean z17) {
        this.f19846x9803cfd9 = z17;
        return this;
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4620x73b534a1 m40723x76493b38(byte[] bArr) {
        if (this.f19844x3df010ff) {
            this.f19841x2f0bb6 = bArr;
            this.f19843x39b4ca32 = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        int read;
        if (this.f19845xd742d336) {
            throw new java.io.IOException("Stream closed");
        }
        if (j17 <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(m40718x275782e6(), j17);
        byte[] bArr = new byte[min];
        long j18 = j17;
        while (j18 > 0 && (read = read(bArr, 0, (int) java.lang.Math.min(min, j18))) >= 0) {
            j18 -= read;
        }
        return j17 - j18;
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4620x73b534a1 m40722x76493b38(com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322) {
        if (this.f19844x3df010ff) {
            this.f19843x39b4ca32 = c4616x2a2b3322;
            this.f19841x2f0bb6 = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read > 0 ? bArr[0] & 255 : read;
    }
}
