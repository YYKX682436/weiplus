package a84;

/* loaded from: classes.dex */
public class r implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f2350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2351b;

    public r(android.widget.ImageView imageView, java.lang.String str) {
        this.f2350a = imageView;
        this.f2351b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        android.widget.ImageView imageView = this.f2350a;
        imageView.setTag(com.tencent.mm.R.id.n1z, "");
        com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f2351b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView = this.f2350a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        try {
            java.lang.String str2 = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z);
            java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2);
            if (!android.text.TextUtils.isEmpty(str) && str.equals(l17)) {
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
                if (J2 != null) {
                    imageView.setImageBitmap(J2);
                    imageView.hashCode();
                } else {
                    com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloaded, bitmap==null");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }
}
