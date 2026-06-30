package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.SharedV8ArrayBuffer */
/* loaded from: classes7.dex */
public class C1466x7b8b3792 extends com.p159x477cd522.p160x333422.C1470x40840ff7 {
    private C1466x7b8b3792(com.p159x477cd522.p160x333422.V8 v86, int i17) {
        super(v86, i17);
        throw new java.lang.IllegalArgumentException("not support this way construct");
    }

    @Override // com.p159x477cd522.p160x333422.C1470x40840ff7, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: initialize */
    public void mo15907x33ebcb90(long j17, java.lang.Object obj) {
        this.f125529v8.m16140x2edbf932();
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        int limit = byteBuffer.limit();
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        long m16220xa6decf22 = v86.m16220xa6decf22(v86.m16218xd618fe8e(), byteBuffer, limit);
        this.f4856x9fca5247 = m16220xa6decf22;
        this.f4857xdf23d93d = false;
        m16471x9d95bbeb(m16220xa6decf22);
    }

    /* renamed from: manualRelease */
    public void m15908xbd15ad61() {
        super.mo15825x41012807();
    }

    @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
    }

    public C1466x7b8b3792(com.p159x477cd522.p160x333422.V8 v86, java.nio.ByteBuffer byteBuffer) {
        super(v86, byteBuffer);
    }
}
