package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadStateResponse */
/* loaded from: classes13.dex */
public final class C26723x6f7196b4 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_requestParam */
    static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 f56497x3d45f4db;

    /* renamed from: errorCode */
    public int f56498x139cb015;

    /* renamed from: errorMsg */
    public java.lang.String f56499x5336c059;

    /* renamed from: requestParam */
    public com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 f56500x4cd2773e;

    /* renamed from: state */
    public int f56501x68ac491;

    public C26723x6f7196b4() {
        this.f56500x4cd2773e = null;
        this.f56501x68ac491 = 0;
        this.f56498x139cb015 = 0;
        this.f56499x5336c059 = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        if (f56497x3d45f4db == null) {
            f56497x3d45f4db = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0();
        }
        this.f56500x4cd2773e = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56497x3d45f4db, 0, true);
        this.f56501x68ac491 = c2859xe10ac61e.m21299x355996(this.f56501x68ac491, 1, false);
        this.f56498x139cb015 = c2859xe10ac61e.m21299x355996(this.f56498x139cb015, 2, false);
        this.f56499x5336c059 = c2859xe10ac61e.m21321xe22f9d47(3, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56500x4cd2773e, 0);
        c2860x6de9642d.m21338x6c257df(this.f56501x68ac491, 1);
        c2860x6de9642d.m21338x6c257df(this.f56498x139cb015, 2);
        java.lang.String str = this.f56499x5336c059;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 3);
        }
    }

    public C26723x6f7196b4(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 c26724xb2aa7ba0, int i17, int i18, java.lang.String str) {
        this.f56500x4cd2773e = c26724xb2aa7ba0;
        this.f56501x68ac491 = i17;
        this.f56498x139cb015 = i18;
        this.f56499x5336c059 = str;
    }
}
