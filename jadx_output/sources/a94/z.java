package a94;

/* loaded from: classes4.dex */
public class z extends a94.a0 {

    /* renamed from: i, reason: collision with root package name */
    public long f2469i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f2470m;

    public z(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView shakeRandomEncoreView, int i17, int i18) {
        super(i17, i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f2469i = android.os.SystemClock.elapsedRealtime();
        this.f2470m = new java.lang.ref.WeakReference(shakeRandomEncoreView);
        com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onShake, init, hash=" + hashCode());
    }

    @Override // a94.a0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
        com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onRelease");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
    }

    @Override // a94.a0
    public void b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView shakeRandomEncoreView = (com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView) this.f2470m.get();
        if (shakeRandomEncoreView == null) {
            com.tencent.mars.xlog.Log.w("ShakeRandomEncoreView", "onShake， shakeView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        android.content.Context context = shakeRandomEncoreView.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("ShakeRandomEncoreView", "onShake， context==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.e("ShakeRandomEncoreView", "onShake, ui finished");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        long j17 = this.f2469i;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime < 600) {
            com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onShake, too short, delay=" + elapsedRealtime + ", hash=" + hashCode());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        this.f2469i = android.os.SystemClock.elapsedRealtime();
        ca4.z0.I0(new long[]{0, 80});
        c();
        com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onShake succ, hash=" + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        a94.x xVar = shakeRandomEncoreView.f163854i;
        if (xVar != null) {
            xVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
    }
}
