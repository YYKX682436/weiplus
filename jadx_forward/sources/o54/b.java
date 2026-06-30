package o54;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f424654d;

    public b(boolean z17) {
        this.f424654d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper$2");
        try {
            int i17 = o54.g.f424681a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWifi", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWifi", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            boolean z17 = this.f424654d;
            if (m40093xb9aa8b5f) {
                if (z17) {
                    o54.g.a(1676L, 5L);
                } else {
                    o54.g.a(1676L, 6L);
                }
            } else if (z17) {
                o54.g.a(1676L, 7L);
            } else {
                o54.g.a(1676L, 8L);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageStaticHelper.CacheHitStaticHelper", "reportSightCacheHit exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper$2");
    }
}
