package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8ArrayBuffer */
/* loaded from: classes7.dex */
public class C1470x40840ff7 extends com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef {

    /* renamed from: byteBuffer */
    private java.nio.ByteBuffer f4794x93fb68;

    public C1470x40840ff7(com.p159x477cd522.p160x333422.V8 v86, int i17) {
        super(v86);
        mo15907x33ebcb90(v86.m16218xd618fe8e(), java.lang.Integer.valueOf(i17));
        java.nio.ByteBuffer m16148xecb69821 = v86.m16148xecb69821(v86.m16218xd618fe8e(), this.f4856x9fca5247, i17);
        this.f4794x93fb68 = m16148xecb69821;
        m16148xecb69821.order(java.nio.ByteOrder.nativeOrder());
    }

    @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: createTwin */
    public com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16283x519cbe04() {
        return new com.p159x477cd522.p160x333422.C1470x40840ff7(this.f125529v8, this.f4794x93fb68);
    }

    /* renamed from: getBackingStore */
    public java.nio.ByteBuffer m16341x3970ce7c() {
        this.f125529v8.m16472x6f109a65();
        this.f125529v8.m16140x2edbf932();
        return this.f4794x93fb68;
    }

    @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: initialize */
    public void mo15907x33ebcb90(long j17, java.lang.Object obj) {
        this.f125529v8.m16140x2edbf932();
        if (obj instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            int limit = byteBuffer.limit();
            com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
            this.f4856x9fca5247 = v86.m16223xfa049387(v86.m16218xd618fe8e(), byteBuffer, limit);
        } else {
            int intValue = ((java.lang.Integer) obj).intValue();
            com.p159x477cd522.p160x333422.V8 v87 = this.f125529v8;
            this.f4856x9fca5247 = v87.m16222xfa049387(v87.m16218xd618fe8e(), intValue);
        }
        this.f4857xdf23d93d = false;
        m16471x9d95bbeb(this.f4856x9fca5247);
    }

    @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: twin */
    public com.p159x477cd522.p160x333422.C1470x40840ff7 mo16314x3686e8() {
        return (com.p159x477cd522.p160x333422.C1470x40840ff7) super.mo16314x3686e8();
    }

    public C1470x40840ff7(com.p159x477cd522.p160x333422.V8 v86, java.nio.ByteBuffer byteBuffer) {
        this(v86, byteBuffer, false);
    }

    public C1470x40840ff7(com.p159x477cd522.p160x333422.V8 v86, java.nio.ByteBuffer byteBuffer, boolean z17) {
        super(v86);
        if (byteBuffer.isDirect()) {
            mo15907x33ebcb90(v86.m16218xd618fe8e(), byteBuffer);
            if (z17) {
                this.f4794x93fb68 = byteBuffer;
            } else {
                this.f4794x93fb68 = v86.m16198x3970ce7c(v86.m16218xd618fe8e(), this.f4856x9fca5247);
            }
            java.nio.ByteBuffer byteBuffer2 = this.f4794x93fb68;
            if (byteBuffer2 != null) {
                byteBuffer2.order(java.nio.ByteOrder.nativeOrder());
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
}
