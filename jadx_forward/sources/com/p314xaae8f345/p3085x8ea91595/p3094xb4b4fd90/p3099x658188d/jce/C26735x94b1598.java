package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.ServiceFreeActionResponse */
/* loaded from: classes13.dex */
public final class C26735x94b1598 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_revertField */
    static byte[] f56570x7b3f3039;

    /* renamed from: revertField */
    public byte[] f56571x5ab75576;

    public C26735x94b1598() {
        this.f56571x5ab75576 = null;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        if (f56570x7b3f3039 == null) {
            f56570x7b3f3039 = r0;
            byte[] bArr = {0};
        }
        this.f56571x5ab75576 = c2859xe10ac61e.m21306x355996(f56570x7b3f3039, 0, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        byte[] bArr = this.f56571x5ab75576;
        if (bArr != null) {
            c2860x6de9642d.m21354x6c257df(bArr, 0);
        }
    }

    public C26735x94b1598(byte[] bArr) {
        this.f56571x5ab75576 = bArr;
    }
}
