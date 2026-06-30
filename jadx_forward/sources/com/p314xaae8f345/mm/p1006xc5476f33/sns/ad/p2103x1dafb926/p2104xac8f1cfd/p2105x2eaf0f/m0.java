package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class m0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q64.b f244424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.n0 f244425g;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.n0 n0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, q64.b bVar) {
        this.f244425g = n0Var;
        this.f244419a = str;
        this.f244420b = str2;
        this.f244421c = str3;
        this.f244422d = str4;
        this.f244423e = str5;
        this.f244424f = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnSubscriptionOfFinderLiving onServerCall, sns id is " + this.f244419a + ", inner snsId is " + str);
        int i19 = i18 == 0 ? 513 : 257;
        java.lang.String str2 = this.f244420b;
        java.lang.String str3 = this.f244421c;
        java.lang.String str4 = this.f244422d;
        java.lang.String str5 = this.f244423e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        this.f244425g.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        d44.a aVar = new d44.a();
        aVar.c(str, str2, str3, str4, str5, i18, 2);
        a84.t0.a(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        q64.b bVar = this.f244424f;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("status", i19);
            bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i18);
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving$1");
    }
}
