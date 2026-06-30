package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdDirectBufferDecompressingStream */
/* loaded from: classes13.dex */
public class C4619xd45c16d implements java.io.Closeable {

    /* renamed from: consumed */
    private int f19831xde2883e8;

    /* renamed from: produced */
    private int f19836xc42bcf84;

    /* renamed from: source */
    private java.nio.ByteBuffer f19837xca90681b;

    /* renamed from: stream */
    private final long f19838xcad54f80;

    /* renamed from: finishedFrame */
    private boolean f19834xb837701b = false;

    /* renamed from: closed */
    private boolean f19830xaf15e16c = false;

    /* renamed from: streamEnd */
    private boolean f19839xed2f913b = false;

    /* renamed from: initialized */
    private boolean f19835x498da6d4 = false;

    /* renamed from: dict */
    private byte[] f19832x2f0bb6 = null;

    /* renamed from: fastDict */
    private com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 f19833x39b4ca32 = null;

    public C4619xd45c16d(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Source buffer should be a direct buffer");
        }
        this.f19837xca90681b = byteBuffer;
        this.f19838xcad54f80 = m40695xc4108468();
    }

    /* renamed from: createDStream */
    private static native long m40695xc4108468();

    /* renamed from: decompressStream */
    private native long m40696x8542c43(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    /* renamed from: freeDStream */
    private static native int m40697x380c10f8(long j17);

    /* renamed from: initDStream */
    private native int m40698x8cd7c1d4(long j17);

    /* renamed from: initDStreamWithDict */
    private native int m40699xf1f36f90(long j17, byte[] bArr, int i17);

    /* renamed from: initDStreamWithFastDict */
    private native int m40700x288fb10c(long j17, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322);

    /* renamed from: initStream */
    private void m40701xf6f94b0() {
        int m40699xf1f36f90;
        com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322 = this.f19833x39b4ca32;
        if (c4616x2a2b3322 != null) {
            m40699xf1f36f90 = m40700x288fb10c(this.f19838xcad54f80, c4616x2a2b3322);
        } else {
            byte[] bArr = this.f19832x2f0bb6;
            m40699xf1f36f90 = bArr != null ? m40699xf1f36f90(this.f19838xcad54f80, bArr, bArr.length) : m40698x8cd7c1d4(this.f19838xcad54f80);
        }
        long j17 = m40699xf1f36f90;
        if (!com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(j17)) {
            this.f19835x498da6d4 = true;
        } else {
            throw new java.io.IOException("Decompression error: " + com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(j17));
        }
    }

    /* renamed from: recommendedDOutSize */
    private static native int m40702x275782e6();

    /* renamed from: recommendedTargetBufferSize */
    public static int m40703x6d3e214d() {
        return m40702x275782e6();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19830xaf15e16c) {
            return;
        }
        try {
            if (this.f19835x498da6d4) {
                m40697x380c10f8(this.f19838xcad54f80);
            }
        } finally {
            this.f19830xaf15e16c = true;
            this.f19835x498da6d4 = false;
        }
    }

    /* renamed from: finalize */
    public void m40704xd764dc1e() {
        if (!this.f19830xaf15e16c && this.f19835x498da6d4) {
            m40697x380c10f8(this.f19838xcad54f80);
        }
        this.f19837xca90681b = null;
    }

    /* renamed from: hasRemaining */
    public boolean m40705xf31b887c() {
        return !this.f19839xed2f913b && (this.f19837xca90681b.hasRemaining() || !this.f19834xb837701b);
    }

    /* renamed from: read */
    public int m40706x355996(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Target buffer should be a direct buffer");
        }
        if (this.f19830xaf15e16c) {
            throw new java.io.IOException("Stream closed");
        }
        if (this.f19839xed2f913b) {
            return 0;
        }
        if (!this.f19835x498da6d4) {
            m40701xf6f94b0();
        }
        long j17 = this.f19838xcad54f80;
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        java.nio.ByteBuffer byteBuffer2 = this.f19837xca90681b;
        long m40696x8542c43 = m40696x8542c43(j17, byteBuffer, position, remaining, byteBuffer2, byteBuffer2.position(), this.f19837xca90681b.remaining());
        if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40696x8542c43)) {
            throw new java.io.IOException(com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40662x130eedfd(m40696x8542c43));
        }
        java.nio.ByteBuffer byteBuffer3 = this.f19837xca90681b;
        byteBuffer3.position(byteBuffer3.position() + this.f19831xde2883e8);
        byteBuffer.position(byteBuffer.position() + this.f19836xc42bcf84);
        if (!this.f19837xca90681b.hasRemaining()) {
            java.nio.ByteBuffer m40707xc847b236 = m40707xc847b236(this.f19837xca90681b);
            this.f19837xca90681b = m40707xc847b236;
            if (!m40707xc847b236.isDirect()) {
                throw new java.lang.IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z17 = m40696x8542c43 == 0;
        this.f19834xb837701b = z17;
        if (z17) {
            if (this.f19837xca90681b.hasRemaining()) {
                m40701xf6f94b0();
            } else {
                this.f19839xed2f913b = true;
            }
        }
        return this.f19836xc42bcf84;
    }

    /* renamed from: refill */
    public java.nio.ByteBuffer m40707xc847b236(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4619xd45c16d m40709x76493b38(byte[] bArr) {
        if (!this.f19835x498da6d4) {
            this.f19832x2f0bb6 = bArr;
            this.f19833x39b4ca32 = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }

    /* renamed from: setDict */
    public com.p314xaae8f345.p542x3306d5.p551x393369.C4619xd45c16d m40708x76493b38(com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322) {
        if (!this.f19835x498da6d4) {
            this.f19833x39b4ca32 = c4616x2a2b3322;
            this.f19832x2f0bb6 = null;
            return this;
        }
        throw new java.io.IOException("Change of parameter on initialized stream");
    }
}
