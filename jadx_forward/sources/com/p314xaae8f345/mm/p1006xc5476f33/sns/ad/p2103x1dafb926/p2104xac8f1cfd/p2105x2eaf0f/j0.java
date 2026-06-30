package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class j0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q64.b f244391b;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.k0 k0Var, java.lang.String str, q64.b bVar) {
        this.f244390a = str;
        this.f244391b = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        q64.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnAcquiringFinderLivingNoticeStatus onServerCall, sns id is ");
            sb6.append(this.f244390a);
            sb6.append(", inner snsId is ");
            sb6.append(str);
            sb6.append(", errorCode is ");
            sb6.append(i18);
            sb6.append(", data is ");
            sb6.append(obj instanceof java.lang.Integer ? (java.lang.Integer) obj : "not Integer");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", sb6.toString());
            bVar = this.f244391b;
        } catch (java.lang.Throwable unused) {
        }
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
            return;
        }
        int intValue = (i18 == 0 && (obj instanceof java.lang.Integer)) ? ((java.lang.Integer) obj).intValue() : 257;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("status", intValue);
        bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i18);
        ((r64.b) bVar).e(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
    }
}
