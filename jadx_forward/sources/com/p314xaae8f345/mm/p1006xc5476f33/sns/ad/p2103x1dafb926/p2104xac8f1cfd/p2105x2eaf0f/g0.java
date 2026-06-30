package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class g0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q64.b f244356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.h0 f244357g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.h0 h0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, q64.b bVar) {
        this.f244357g = h0Var;
        this.f244351a = str;
        this.f244352b = str2;
        this.f244353c = str3;
        this.f244354d = str4;
        this.f244355e = str5;
        this.f244356f = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLivingNoticeComp", "Subscription out sns id is " + this.f244351a + ", inner snsId is " + str);
        if (i18 == 0) {
            i19 = 513;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.g(str, 513);
        } else {
            i19 = 257;
        }
        int i27 = i19;
        java.lang.String str2 = this.f244352b;
        java.lang.String str3 = this.f244353c;
        java.lang.String str4 = this.f244354d;
        java.lang.String str5 = this.f244355e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        this.f244357g.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        d44.a aVar = new d44.a();
        aVar.c(str, str2, str3, str4, str5, i18, 0);
        a84.t0.a(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        q64.b bVar = this.f244356f;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i18);
            bundle.putInt("status", i27);
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving$1");
    }
}
