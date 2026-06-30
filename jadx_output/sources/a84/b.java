package a84;

/* loaded from: classes.dex */
public class b implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f2261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2262b;

    public b(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f2261a = weakReference;
        this.f2262b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f2261a.get();
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdCdnImageLoaderMM", "imageViewRef released");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            return;
        }
        imageView.setTag(com.tencent.mm.R.id.n1z, "");
        imageView.setImageDrawable(null);
        com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f2262b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
        try {
            imageView = (android.widget.ImageView) this.f2261a.get();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "onDownloaded, exp=" + th6.toString());
        }
        if (imageView == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdCdnImageLoaderMM", "imageViewRef released");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
            return;
        }
        java.lang.String str2 = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z);
        java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId_mm", str2);
        if (!android.text.TextUtils.isEmpty(str) && str.equals(l17)) {
            java.lang.String str3 = this.f2262b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            ((ku5.t0) ku5.t0.f312615d).g(new a84.d(str, str3, imageView));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$1");
    }
}
