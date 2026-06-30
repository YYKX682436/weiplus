package a84;

/* loaded from: classes4.dex */
public class w implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t84.c f2368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2370c;

    public w(t84.c cVar, java.lang.String str, float f17) {
        this.f2368a = cVar;
        this.f2369b = str;
        this.f2370c = f17;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + this.f2368a.hashCode() + ", url=" + this.f2369b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        t84.c cVar = this.f2368a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        try {
            cVar.hashCode();
            a84.z.b(cVar, str, this.f2370c);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "loadImageByCdn, onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }
}
