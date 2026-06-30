package za4;

/* loaded from: classes4.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552610d;

    public e1(java.lang.String str) {
        this.f552610d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        q34.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$5");
        java.lang.String str = this.f552610d;
        if (za4.z0.u(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            try {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_forbid_jsapi_preload, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "adVideoPreload, isJsApiPreload, cfg=" + Ni);
                z17 = Ni == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", "isJsApiPreload, exp=" + th6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload");
                bVar = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload，forbid preload video");
                bVar = new q34.b();
                bVar.f441501c = true;
                bVar.f441502d = 0;
            }
            za4.o0.g().o(str, dm.n.f67493x36901555, bVar, 8);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload, inValidCanvas");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$5");
    }
}
