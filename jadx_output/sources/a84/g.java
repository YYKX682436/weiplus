package a84;

/* loaded from: classes4.dex */
public class g implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a84.l f2285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2286b;

    public g(a84.l lVar, java.lang.String str) {
        this.f2285a = lVar;
        this.f2286b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        a84.l lVar = this.f2285a;
        lVar.a(null, false);
        com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloadError, hash=" + lVar.hashCode() + ", url=" + this.f2286b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloaded and imageUrl is " + this.f2286b);
            java.lang.String str2 = this.f2286b;
            a84.l lVar = this.f2285a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            ((ku5.t0) ku5.t0.f312615d).g(new a84.i(str, str2, lVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$5");
    }
}
