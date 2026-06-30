package a84;

/* loaded from: classes.dex */
public class b implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f83794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83795b;

    public b(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f83794a = weakReference;
        this.f83795b = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f83794a.get();
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdCdnImageLoaderMM", "imageViewRef released");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            return;
        }
        imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        imageView.setImageDrawable(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdCdnImageLoaderMM", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f83795b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        try {
            imageView = (android.widget.ImageView) this.f83794a.get();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdCdnImageLoaderMM", "onDownloaded, exp=" + th6.toString());
        }
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdCdnImageLoaderMM", "imageViewRef released");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            return;
        }
        java.lang.String str2 = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z);
        java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId_mm", str2);
        if (!android.text.TextUtils.isEmpty(str) && str.equals(l17)) {
            java.lang.String str3 = this.f83795b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            ((ku5.t0) ku5.t0.f394148d).g(new a84.d(str, str3, imageView));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
    }
}
