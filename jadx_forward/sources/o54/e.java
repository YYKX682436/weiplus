package o54;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {
    public e(o54.f fVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder$1");
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                o54.g.a(1676L, 9L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageStaticHelper", "network wifi");
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context)) {
                o54.g.a(1676L, 10L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageStaticHelper", "network 5G");
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
                o54.g.a(1676L, 11L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageStaticHelper", "network 4G");
            } else {
                o54.g.a(1676L, 12L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageStaticHelper", "network other");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageStaticHelper", "reportEnterNetWorkType, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder$1");
    }
}
