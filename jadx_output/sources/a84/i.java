package a84;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a84.l f2302f;

    public i(java.lang.String str, java.lang.String str2, a84.l lVar) {
        this.f2300d = str;
        this.f2301e = str2;
        this.f2302f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6");
        try {
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f2300d, null);
            if (J2 == null || J2.isRecycled()) {
                com.tencent.mars.xlog.Log.w("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, setImageBitmapAsync bitmap is not exist and imgUrl is " + this.f2301e);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                java.lang.Object obj = a84.m.f2329a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                ((com.tencent.mm.sdk.platformtools.r2) obj).put(this.f2301e, J2);
                com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, setImageBitmapAsync bitmap is exist and imgUrl is " + this.f2301e);
                ((ku5.t0) ku5.t0.f312615d).B(new a84.h(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6");
    }
}
