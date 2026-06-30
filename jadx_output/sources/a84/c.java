package a84;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a84.d f2265e;

    public c(a84.d dVar, android.graphics.Bitmap bitmap) {
        this.f2265e = dVar;
        this.f2264d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2$1");
        try {
            this.f2265e.f2268f.setImageBitmap(this.f2264d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync set bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$2$1");
    }
}
