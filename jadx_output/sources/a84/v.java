package a84;

/* loaded from: classes4.dex */
public class v extends n74.z1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17) {
        super(imageView);
        this.f2365b = str;
        this.f2366c = f17;
        this.f2367d = z17;
    }

    @Override // n74.z1, za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        java.lang.ref.WeakReference weakReference = this.f335456a;
        if (weakReference != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView != null) {
                imageView.setTag(com.tencent.mm.R.id.n1z, "");
                com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f2365b);
            } else {
                com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloadError, realImageView==null");
            }
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloadError, imgViewRef==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
    }

    @Override // n74.z1, za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
    }

    @Override // n74.z1, za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        try {
            java.lang.ref.WeakReference weakReference = this.f335456a;
            if (weakReference != null) {
                android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
                if (imageView != null) {
                    imageView.hashCode();
                    a84.z.a(imageView, str, this.f2366c, this.f2367d);
                } else {
                    com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloaded, realImageView==null");
                }
            } else {
                com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloaded, imgViewRef==null");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "loadImageByCdn, onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
    }
}
