package a84;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f83837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a84.k f83838e;

    public j(a84.k kVar, boolean z17) {
        this.f83838e = kVar;
        this.f83837d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener$1");
        boolean z17 = this.f83837d;
        a84.k kVar = this.f83838e;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloaded, filePath=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            java.lang.String str = kVar.f83857e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            sb6.append(str);
            sb6.append(", url=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            sb6.append(kVar.f83858f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdCdnImageLoaderMM", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            kVar.f83859g.c(kVar.f83857e);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            za4.e0 e0Var = kVar.f83859g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            e0Var.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener$1");
    }
}
