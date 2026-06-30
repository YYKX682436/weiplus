package a84;

/* loaded from: classes.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a84.u f2357e;

    public t(a84.u uVar, android.graphics.Bitmap bitmap) {
        this.f2357e = uVar;
        this.f2356d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        a84.u uVar = this.f2357e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3$1");
        try {
            java.lang.String str = (java.lang.String) uVar.f2364m.getTag(com.tencent.mm.R.id.n1z);
            if (uVar.f2360f.equals(android.text.TextUtils.isEmpty(str) ? "" : za4.t0.l("adId", str))) {
                uVar.f2364m.setImageBitmap(this.f2356d);
            } else {
                com.tencent.mars.xlog.Log.w("SnsAd.AdImageLoader", "url changed");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync set bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3$1");
    }
}
