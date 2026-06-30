package m64;

/* loaded from: classes.dex */
public class a implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405922a;

    public a(java.lang.String str) {
        this.f405922a = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickInfoPreloadHelper", "preloadOpenAppHalfScreenInfo, appImageUrl preload failed: " + this.f405922a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickInfoPreloadHelper", "preloadOpenAppHalfScreenInfo, appImageUrl preload success: " + this.f405922a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
    }
}
