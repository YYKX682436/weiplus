package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8Function */
/* loaded from: classes7.dex */
public class C1474xd5ce209a extends com.p159x477cd522.p160x333422.C1477x4679881 {
    public C1474xd5ce209a(com.p159x477cd522.p160x333422.V8 v86, com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7) {
        super(v86, interfaceC1456x656040a7);
    }

    /* renamed from: call */
    public java.lang.Object m16420x2e7a5e(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        this.f125529v8.m16140x2edbf932();
        m16472x6f109a65();
        this.f125529v8.m16139x58d449b0(c1477x4679881);
        this.f125529v8.m16139x58d449b0(c1469x28b0ccd7);
        if (c1477x4679881 == null) {
            c1477x4679881 = this.f125529v8;
        }
        long m16473x1c19911e = c1469x28b0ccd7 == null ? 0L : c1469x28b0ccd7.m16473x1c19911e();
        if (c1477x4679881.mo16336x85ca346()) {
            c1477x4679881 = this.f125529v8;
        }
        long m16473x1c19911e2 = c1477x4679881.m16473x1c19911e();
        com.p159x477cd522.p160x333422.V8 v86 = this.f125529v8;
        return v86.m16174xf9e28a6d(v86.m16218xd618fe8e(), m16473x1c19911e2, this.f4856x9fca5247, m16473x1c19911e);
    }

    @Override // com.p159x477cd522.p160x333422.C1477x4679881, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: createTwin */
    public com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef mo16283x519cbe04() {
        return new com.p159x477cd522.p160x333422.C1474xd5ce209a(this.f125529v8);
    }

    @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: initialize */
    public void mo15907x33ebcb90(long j17, java.lang.Object obj) {
        if (obj == null) {
            super.mo15907x33ebcb90(j17, null);
            return;
        }
        long[] m16226xf6f6c70a = this.f125529v8.m16226xf6f6c70a(j17);
        this.f125529v8.m16143xdc233a4e((com.p159x477cd522.p160x333422.InterfaceC1456x656040a7) obj, m16226xf6f6c70a[1]);
        this.f4857xdf23d93d = false;
        m16471x9d95bbeb(m16226xf6f6c70a[0]);
    }

    @Override // com.p159x477cd522.p160x333422.C1477x4679881
    /* renamed from: toString */
    public java.lang.String mo16313x9616526c() {
        return (this.f4857xdf23d93d || this.f125529v8.mo16335xafdb8087()) ? "[Function released]" : super.mo16313x9616526c();
    }

    public C1474xd5ce209a(com.p159x477cd522.p160x333422.V8 v86) {
        this(v86, null);
    }

    @Override // com.p159x477cd522.p160x333422.C1477x4679881, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef
    /* renamed from: twin */
    public com.p159x477cd522.p160x333422.C1474xd5ce209a mo16314x3686e8() {
        return (com.p159x477cd522.p160x333422.C1474xd5ce209a) super.mo16314x3686e8();
    }
}
