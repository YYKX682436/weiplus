package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class k0 implements p64.b {
    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "sns_id");
        java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "finderUsername");
        java.lang.String k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "finderLiveNoticeId");
        if (!android.text.TextUtils.isEmpty(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnAcquiringFinderLivingNoticeStatus start, snsId is " + k17 + ", finderUsername is " + k18 + ", finderLiveNoticeId is " + k19);
            d44.h.c(k17, k18, k19, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j0(this, k17, bVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus");
        return null;
    }
}
