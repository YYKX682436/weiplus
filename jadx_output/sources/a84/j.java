package a84;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a84.k f2305e;

    public j(a84.k kVar, boolean z17) {
        this.f2305e = kVar;
        this.f2304d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener$1");
        boolean z17 = this.f2304d;
        a84.k kVar = this.f2305e;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloaded, filePath=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            java.lang.String str = kVar.f2324e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            sb6.append(str);
            sb6.append(", url=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            sb6.append(kVar.f2325f);
            com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            kVar.f2326g.c(kVar.f2324e);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            za4.e0 e0Var = kVar.f2326g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
            e0Var.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener$1");
    }
}
