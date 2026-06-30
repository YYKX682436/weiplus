package a84;

/* loaded from: classes4.dex */
public class s implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2352a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f2354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2355d;

    public s(int i17, android.widget.ImageView imageView, java.lang.String str) {
        this.f2353b = i17;
        this.f2354c = imageView;
        this.f2355d = str;
    }

    @Override // za4.e0
    public void a() {
        android.widget.ImageView imageView = this.f2354c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        try {
            ca4.m0.t0(this.f2353b, 1);
            imageView.setTag(com.tencent.mm.R.id.n1z, "");
            imageView.setImageDrawable(null);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f2355d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        this.f2352a = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        a84.z.a(this.f2354c, str, 0.0f, false);
        try {
            if (this.f2352a) {
                ca4.m0.t0(this.f2353b, 0);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
    }
}
