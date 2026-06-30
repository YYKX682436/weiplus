package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.OperateDownloadTaskRequest */
/* loaded from: classes13.dex */
public final class C26731x84e8039e extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_baseParam */
    static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 f56555xaa156bbf;

    /* renamed from: actionFlag */
    public java.lang.String f56556x6e5ae6c2;

    /* renamed from: baseParam */
    public com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 f56557x92dfbc3c;

    /* renamed from: opList */
    public java.lang.String f56558xc3b85a1f;

    /* renamed from: requestType */
    public int f56559x448d1669;

    /* renamed from: verifyType */
    public java.lang.String f56560xc26da753;

    public C26731x84e8039e() {
        this.f56559x448d1669 = 0;
        this.f56557x92dfbc3c = null;
        this.f56558xc3b85a1f = "";
        this.f56556x6e5ae6c2 = "";
        this.f56560xc26da753 = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56559x448d1669 = c2859xe10ac61e.m21299x355996(this.f56559x448d1669, 0, true);
        if (f56555xaa156bbf == null) {
            f56555xaa156bbf = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0();
        }
        this.f56557x92dfbc3c = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56555xaa156bbf, 1, true);
        this.f56558xc3b85a1f = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56556x6e5ae6c2 = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.f56560xc26da753 = c2859xe10ac61e.m21321xe22f9d47(4, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56559x448d1669, 0);
        c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56557x92dfbc3c, 1);
        java.lang.String str = this.f56558xc3b85a1f;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 2);
        }
        java.lang.String str2 = this.f56556x6e5ae6c2;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 3);
        }
        java.lang.String str3 = this.f56560xc26da753;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 4);
        }
    }

    public C26731x84e8039e(int i17, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 c26724xb2aa7ba0, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f56559x448d1669 = i17;
        this.f56557x92dfbc3c = c26724xb2aa7ba0;
        this.f56558xc3b85a1f = str;
        this.f56556x6e5ae6c2 = str2;
        this.f56560xc26da753 = str3;
    }
}
