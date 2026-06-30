package a84;

/* loaded from: classes4.dex */
public class g implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a84.l f83818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83819b;

    public g(a84.l lVar, java.lang.String str) {
        this.f83818a = lVar;
        this.f83819b = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        a84.l lVar = this.f83818a;
        lVar.a(null, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloadError, hash=" + lVar.hashCode() + ", url=" + this.f83819b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloaded and imageUrl is " + this.f83819b);
            java.lang.String str2 = this.f83819b;
            a84.l lVar = this.f83818a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            ((ku5.t0) ku5.t0.f394148d).g(new a84.i(str, str2, lVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
    }
}
