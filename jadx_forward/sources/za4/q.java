package za4;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.r f552717d;

    public q(za4.r rVar) {
        this.f552717d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$2");
        za4.r rVar = this.f552717d;
        za4.t a17 = za4.u.a(rVar.f552719a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        java.lang.String str = rVar.f552719a.f552731h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        za4.c0 c0Var = (za4.c0) a17;
        c0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        java.lang.String str2 = c0Var.f552603b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for cdn file %s, path %s", str2, str);
        c0Var.f552602a.c(c0Var.f552605d);
        if (c0Var.f552604c == 0) {
            n74.t.b(0, 1, 1, str2);
            m44.d.d("AdLandingPageDownloadFileHelper_CDN", str2, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$2");
    }
}
