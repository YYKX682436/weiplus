package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class d0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q64.b f244315b;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e0 e0Var, java.lang.String str, q64.b bVar) {
        this.f244314a = str;
        this.f244315b = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLivingNoticeComp", "Subscription out sns id is " + this.f244314a + ", inner snsId is " + str + "errorCode = " + i18);
        } catch (java.lang.Throwable unused) {
        }
        if (i18 == 0 && (obj instanceof java.lang.Integer)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.g(str, ((java.lang.Integer) obj).intValue());
            q64.b bVar = this.f244315b;
            if (bVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("status", ((java.lang.Integer) obj).intValue());
            bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i18);
            ((r64.b) bVar).e(bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
    }
}
