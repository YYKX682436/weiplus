package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadProgressResponse */
/* loaded from: classes13.dex */
public final class C26722x5083338c extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_requestParam */
    static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 f56491x3d45f4db;

    /* renamed from: allTaskTotalLength */
    public long f56492x446964a4;

    /* renamed from: allTaskTotalProgress */
    public long f56493x208c746b;

    /* renamed from: receivedLen */
    public long f56494x82a6e874;

    /* renamed from: requestParam */
    public com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 f56495x4cd2773e;

    /* renamed from: totalLen */
    public long f56496xcd575831;

    public C26722x5083338c() {
        this.f56495x4cd2773e = null;
        this.f56494x82a6e874 = 0L;
        this.f56496xcd575831 = 0L;
        this.f56493x208c746b = 0L;
        this.f56492x446964a4 = 0L;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        if (f56491x3d45f4db == null) {
            f56491x3d45f4db = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0();
        }
        this.f56495x4cd2773e = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f56491x3d45f4db, 0, true);
        this.f56494x82a6e874 = c2859xe10ac61e.m21300x355996(this.f56494x82a6e874, 1, false);
        this.f56496xcd575831 = c2859xe10ac61e.m21300x355996(this.f56496xcd575831, 2, false);
        this.f56493x208c746b = c2859xe10ac61e.m21300x355996(this.f56493x208c746b, 3, false);
        this.f56492x446964a4 = c2859xe10ac61e.m21300x355996(this.f56492x446964a4, 4, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) this.f56495x4cd2773e, 0);
        c2860x6de9642d.m21339x6c257df(this.f56494x82a6e874, 1);
        c2860x6de9642d.m21339x6c257df(this.f56496xcd575831, 2);
        c2860x6de9642d.m21339x6c257df(this.f56493x208c746b, 3);
        c2860x6de9642d.m21339x6c257df(this.f56492x446964a4, 4);
    }

    public C26722x5083338c(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 c26724xb2aa7ba0, long j17, long j18, long j19, long j27) {
        this.f56495x4cd2773e = c26724xb2aa7ba0;
        this.f56494x82a6e874 = j17;
        this.f56496xcd575831 = j18;
        this.f56493x208c746b = j19;
        this.f56492x446964a4 = j27;
    }
}
