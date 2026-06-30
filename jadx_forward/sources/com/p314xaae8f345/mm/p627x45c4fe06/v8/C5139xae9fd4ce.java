package com.p314xaae8f345.mm.p627x45c4fe06.v8;

/* renamed from: com.tencent.mm.appbrand.v8.NativeBufferJNI */
/* loaded from: classes7.dex */
public class C5139xae9fd4ce implements cl.u {

    /* renamed from: nativeInst */
    private long f21484xb90146fd = m43222x73c02ff3();

    static {
        int i17 = cl.o3.f124246b;
    }

    /* renamed from: nativeBindTo */
    private native void m43221x7190a28f(long j17, long j18, long j19);

    /* renamed from: nativeCreate */
    private native long m43222x73c02ff3();

    /* renamed from: nativeDestroy */
    private native void m43223x23caefe3(long j17);

    /* renamed from: nativeGenerateId */
    private native int m43224xf834d0e7(long j17);

    /* renamed from: nativeGetBuffer */
    private native byte[] m43225xf955b0df(long j17, int i17);

    /* renamed from: nativeGetDirectBuffer */
    private native java.nio.ByteBuffer m43226x4801b2e8(long j17, int i17);

    /* renamed from: nativeReleaseDirectBuffer */
    private native void m43227x572d2d99(java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeSetBuffer */
    private native void m43228xec8ae4eb(long j17, int i17, java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeSetBufferForLegacyArray */
    private native void m43229x94ad3152(long j17, int i17, byte[] bArr, int i18);

    /* renamed from: bindTo */
    public void m43230xad361398(long j17, long j18) {
        m43221x7190a28f(this.f21484xb90146fd, j17, j18);
    }

    @Override // cl.u
    /* renamed from: bufferStoreBindTo */
    public void mo15016x2418f779(long j17, long j18) {
        m43230xad361398(j17, j18);
    }

    /* renamed from: destroy */
    public void m43231x5cd39ffa() {
    }

    /* renamed from: finalize */
    public void m43232xd764dc1e() {
        super.finalize();
        long j17 = this.f21484xb90146fd;
        if (j17 != 0) {
            m43223x23caefe3(j17);
            this.f21484xb90146fd = 0L;
        }
    }

    @Override // cl.u
    /* renamed from: generateId */
    public int mo15017x12389570() {
        return m43224xf834d0e7(this.f21484xb90146fd);
    }

    @Override // cl.u
    /* renamed from: getBuffer */
    public java.nio.ByteBuffer mo15018x12f2b736(int i17, boolean z17) {
        if (z17) {
            return m43226x4801b2e8(this.f21484xb90146fd, i17);
        }
        byte[] m43225xf955b0df = m43225xf955b0df(this.f21484xb90146fd, i17);
        if (m43225xf955b0df == null) {
            return null;
        }
        return java.nio.ByteBuffer.wrap(m43225xf955b0df);
    }

    @Override // cl.u
    /* renamed from: releaseDirectByteBuffer */
    public void mo15019x3b42e258(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.isDirect()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            m43227x572d2d99(byteBuffer);
        }
    }

    @Override // cl.u
    /* renamed from: setBuffer */
    public void mo15020x627eb42(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.capacity() == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            m43228xec8ae4eb(this.f21484xb90146fd, i17, byteBuffer);
        } else {
            byte[] array = byteBuffer.array();
            m43229x94ad3152(this.f21484xb90146fd, i17, array, array.length);
        }
    }

    @Override // cl.u
    /* renamed from: supportBufferStoreBindTo */
    public boolean mo15021xa0ce6f6a() {
        return true;
    }
}
