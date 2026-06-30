package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class l0 implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.Reference f244409d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f244410e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o0 o0Var, boolean z17) {
        this.f244409d = new java.lang.ref.WeakReference(o0Var);
        this.f244410e = z17;
    }

    @Override // p64.a
    @o64.b
    /* renamed from: onCallbackFromServer */
    public void mo69375xe57d25f1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o0 o0Var;
        boolean z17 = this.f244410e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
        try {
            o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o0) this.f244409d.get();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", th6, "onFinderLivingNoticeStatusOnClient failed.", new java.lang.Object[0]);
        }
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient onCallbackFromServer, comp is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
            return;
        }
        int f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "status", 257);
        int f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient onCallbackFromServer, mRequestNoticeStatus is " + z17 + ", status is " + f17 + ", errorCode is " + f18);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", " request status, status is " + f17 + ", errorCode is " + f18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            o0Var.j0(f17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", " do appointment callback, status is " + f17 + ", errorCode is " + f18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = o0Var.C;
            if (u3Var != null && u3Var.isShowing()) {
                u3Var.dismiss();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o0.h0(o0Var, f18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        o0Var.D = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
    }
}
