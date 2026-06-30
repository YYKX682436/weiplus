package a84;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f2268f;

    public d(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView) {
        this.f2266d = str;
        this.f2267e = str2;
        this.f2268f = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f2266d, options);
            m44.a.c(this.f2267e, J2, options);
            if (J2 != null && !J2.isRecycled()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                java.lang.Object obj = a84.m.f2329a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                ((com.tencent.mm.sdk.platformtools.r2) obj).put(this.f2267e, J2);
                ((ku5.t0) ku5.t0.f312615d).B(new a84.c(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2");
    }
}
