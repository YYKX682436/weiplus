package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdOutputStream */
/* loaded from: classes13.dex */
public class C4621x308cc60a extends java.io.FilterOutputStream {

    /* renamed from: dstSize */
    private static final int f19850x74b66f66 = (int) m40733xbf765607();

    /* renamed from: closeFrameOnFlush */
    private boolean f19851x9b7f850;

    /* renamed from: dict */
    private byte[] f19852x2f0bb6;
    private byte[] dst;

    /* renamed from: dstPos */
    private long f19853xb12f224f;

    /* renamed from: fastDict */
    private com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 f19854x39b4ca32;

    /* renamed from: frameClosed */
    private boolean f19855xdbf1f139;

    /* renamed from: isClosed */
    private boolean f19856xd742d336;

    /* renamed from: level */
    private int f19857x6219b84;

    /* renamed from: srcPos */
    private long f19858xcab201d0;

    /* renamed from: stream */
    private long f19859xcad54f80;

    /* renamed from: useChecksum */
    private boolean f19860xa7f90eea;

    public C4621x308cc60a(java.io.OutputStream outputStream, int i17, boolean z17, boolean z18) {
        super(outputStream);
        this.f19858xcab201d0 = 0L;
        this.f19853xb12f224f = 0L;
        this.dst = null;
        this.f19856xd742d336 = false;
        this.f19855xdbf1f139 = true;
        this.f19852x2f0bb6 = null;
        this.f19854x39b4ca32 = null;
        this.f19851x9b7f850 = z17;
        this.f19857x6219b84 = i17;
        this.f19860xa7f90eea = z18;
        this.f19859xcad54f80 = m40726x8f2a4927();
        this.dst = new byte[f19850x74b66f66];
    }

    /* renamed from: compressStream */
    private native int m40725x77c89582(long j17, byte[] bArr, int i17, byte[] bArr2, int i18);

    /* renamed from: createCStream */
    private static native long m40726x8f2a4927();

    /* renamed from: endStream */
    private native int m40727x5fea743b(long j17, byte[] bArr, int i17);

    /* renamed from: flushStream */
    private native int m40728xe14b23a4(long j17, byte[] bArr, int i17);

    /* renamed from: freeCStream */
    private static native int m40729x325d5b7(long j17);

    /* renamed from: initCStream */
    private native int m40730x57f18693(long j17, int i17, int i18);

    /* renamed from: initCStreamWithDict */
    private native int m40731x9818054f(long j17, byte[] bArr, int i17, int i18, int i19);

    /* renamed from: initCStreamWithFastDict */
    private native int m40732x5ae54f4b(long j17, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61, int i17);

    /* renamed from: recommendedCOutSize */
    private static native long m40733xbf765607();

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19856xd742d336) {
            return;
        }
        if (!this.f19855xdbf1f139) {
            long m40727x5fea743b = m40727x5fea743b(this.f19859xcad54f80, this.dst, f19850x74b66f66);
            if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40727x5fea743b)) {
                throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(m40727x5fea743b));
            }
            ((java.io.FilterOutputStream) this).out.write(this.dst, 0, (int) this.f19853xb12f224f);
        }
        m40729x325d5b7(this.f19859xcad54f80);
        ((java.io.FilterOutputStream) this).out.close();
        this.f19856xd742d336 = true;
    }

    /* renamed from: finalize */
    public void m40734xd764dc1e() {
        close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.f19856xd742d336) {
            throw new java.io.IOException("Stream closed");
        }
        if (this.f19855xdbf1f139) {
            return;
        }
        if (this.f19851x9b7f850) {
            long m40727x5fea743b = m40727x5fea743b(this.f19859xcad54f80, this.dst, f19850x74b66f66);
            if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40727x5fea743b)) {
                throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(m40727x5fea743b));
            }
            this.f19855xdbf1f139 = true;
        } else {
            long m40728xe14b23a4 = m40728xe14b23a4(this.f19859xcad54f80, this.dst, f19850x74b66f66);
            if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40728xe14b23a4)) {
                throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(m40728xe14b23a4));
            }
        }
        ((java.io.FilterOutputStream) this).out.write(this.dst, 0, (int) this.f19853xb12f224f);
        ((java.io.FilterOutputStream) this).out.flush();
    }

    /* renamed from: setChecksum */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4621x308cc60a m40735xd22dfac5(boolean z17) {
        if (!this.f19855xdbf1f139) {
            throw new java.io.IOException("Change of parameter on initialized stream");
        }
        this.f19860xa7f90eea = z17;
        return this;
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4621x308cc60a m40737x76493b38(byte[] bArr) {
        if (this.f19855xdbf1f139) {
            this.f19854x39b4ca32 = null;
            this.f19852x2f0bb6 = bArr;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int m40730x57f18693;
        if (!this.f19856xd742d336) {
            if (this.f19855xdbf1f139) {
                com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61 = this.f19854x39b4ca32;
                if (c4615xd30f3b61 != null) {
                    m40730x57f18693 = m40732x5ae54f4b(this.f19859xcad54f80, c4615xd30f3b61, this.f19860xa7f90eea ? 1 : 0);
                } else {
                    byte[] bArr2 = this.f19852x2f0bb6;
                    if (bArr2 != null) {
                        m40730x57f18693 = m40731x9818054f(this.f19859xcad54f80, bArr2, bArr2.length, this.f19857x6219b84, this.f19860xa7f90eea ? 1 : 0);
                    } else {
                        m40730x57f18693 = m40730x57f18693(this.f19859xcad54f80, this.f19857x6219b84, this.f19860xa7f90eea ? 1 : 0);
                    }
                }
                long j17 = m40730x57f18693;
                if (!com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(j17)) {
                    this.f19855xdbf1f139 = false;
                } else {
                    throw new java.io.IOException("Compression error: cannot create header: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(j17));
                }
            }
            int i19 = i18 + i17;
            this.f19858xcab201d0 = i17;
            while (this.f19858xcab201d0 < i19) {
                long m40725x77c89582 = m40725x77c89582(this.f19859xcad54f80, this.dst, f19850x74b66f66, bArr, i19);
                if (!com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40725x77c89582)) {
                    long j18 = this.f19853xb12f224f;
                    if (j18 > 0) {
                        ((java.io.FilterOutputStream) this).out.write(this.dst, 0, (int) j18);
                    }
                } else {
                    throw new java.io.IOException("Compression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(m40725x77c89582));
                }
            }
            return;
        }
        throw new java.io.IOException("Stream closed");
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4621x308cc60a m40736x76493b38(com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61) {
        if (this.f19855xdbf1f139) {
            this.f19852x2f0bb6 = null;
            this.f19854x39b4ca32 = c4615xd30f3b61;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    public C4621x308cc60a(java.io.OutputStream outputStream, int i17, boolean z17) {
        this(outputStream, i17, z17, false);
    }

    public C4621x308cc60a(java.io.OutputStream outputStream, int i17) {
        this(outputStream, i17, false);
    }

    public C4621x308cc60a(java.io.OutputStream outputStream) {
        this(outputStream, 3, false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        write(new byte[]{(byte) i17}, 0, 1);
    }
}
