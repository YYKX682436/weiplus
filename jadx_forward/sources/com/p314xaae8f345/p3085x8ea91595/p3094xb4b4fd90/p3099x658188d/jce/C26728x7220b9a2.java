package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo */
/* loaded from: classes13.dex */
public final class C26728x7220b9a2 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: allTaskTotalLength */
    public long f56541x446964a4;

    /* renamed from: allTaskTotalProgress */
    public long f56542x208c746b;

    /* renamed from: receivedLen */
    public long f56543x82a6e874;

    /* renamed from: savePath */
    public java.lang.String f56544x84749342;

    /* renamed from: state */
    public int f56545x68ac491;

    /* renamed from: totalLen */
    public long f56546xcd575831;
    public java.lang.String url;

    public C26728x7220b9a2() {
        this.url = "";
        this.f56544x84749342 = "";
        this.f56545x68ac491 = 0;
        this.f56543x82a6e874 = 0L;
        this.f56546xcd575831 = 0L;
        this.f56542x208c746b = 0L;
        this.f56541x446964a4 = 0L;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.url = c2859xe10ac61e.m21321xe22f9d47(0, true);
        this.f56544x84749342 = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f56545x68ac491 = c2859xe10ac61e.m21299x355996(this.f56545x68ac491, 2, false);
        this.f56543x82a6e874 = c2859xe10ac61e.m21300x355996(this.f56543x82a6e874, 3, false);
        this.f56546xcd575831 = c2859xe10ac61e.m21300x355996(this.f56546xcd575831, 4, false);
        this.f56542x208c746b = c2859xe10ac61e.m21300x355996(this.f56542x208c746b, 5, false);
        this.f56541x446964a4 = c2859xe10ac61e.m21300x355996(this.f56541x446964a4, 6, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21349x6c257df(this.url, 0);
        java.lang.String str = this.f56544x84749342;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 1);
        }
        c2860x6de9642d.m21338x6c257df(this.f56545x68ac491, 2);
        c2860x6de9642d.m21339x6c257df(this.f56543x82a6e874, 3);
        c2860x6de9642d.m21339x6c257df(this.f56546xcd575831, 4);
        c2860x6de9642d.m21339x6c257df(this.f56542x208c746b, 5);
        c2860x6de9642d.m21339x6c257df(this.f56541x446964a4, 6);
    }

    public C26728x7220b9a2(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, long j19, long j27) {
        this.url = str;
        this.f56544x84749342 = str2;
        this.f56545x68ac491 = i17;
        this.f56543x82a6e874 = j17;
        this.f56546xcd575831 = j18;
        this.f56542x208c746b = j19;
        this.f56541x446964a4 = j27;
    }
}
