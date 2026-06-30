package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse */
/* loaded from: classes13.dex */
public final class C26730x89a4d85d extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_body */
    static byte[] f56551x1b3a43f;

    /* renamed from: cache_head */
    static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc f56552x1b6387d;

    /* renamed from: body */
    public byte[] f56553x2e39a2;

    /* renamed from: head */
    public com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc f56554x30cde0;

    public C26730x89a4d85d() {
        this.f56554x30cde0 = null;
        this.f56553x2e39a2 = null;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        if (f56552x1b6387d == null) {
            f56552x1b6387d = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc();
        }
        this.f56554x30cde0 = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56552x1b6387d, 0, true);
        if (f56551x1b3a43f == null) {
            f56551x1b3a43f = r0;
            byte[] bArr = {0};
        }
        this.f56553x2e39a2 = c2859xe10ac61e.m21306x355996(f56551x1b3a43f, 1, true);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56554x30cde0, 0);
        c2860x6de9642d.m21354x6c257df(this.f56553x2e39a2, 1);
    }

    public C26730x89a4d85d(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc c26727xa1fcfffc, byte[] bArr) {
        this.f56554x30cde0 = c26727xa1fcfffc;
        this.f56553x2e39a2 = bArr;
    }
}
