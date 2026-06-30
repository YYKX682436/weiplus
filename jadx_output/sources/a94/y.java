package a94;

/* loaded from: classes4.dex */
public class y extends a94.a0 {

    /* renamed from: i, reason: collision with root package name */
    public long f2467i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f2468m;

    public y(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView, int i17, int i18) {
        super(i17, i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f2467i = android.os.SystemClock.elapsedRealtime();
        this.f2468m = new java.lang.ref.WeakReference(shakeCoverView);
    }

    @Override // a94.a0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "onRelease");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
    }

    @Override // a94.a0
    public void b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = (com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView) this.f2468m.get();
        if (shakeCoverView == null) {
            com.tencent.mars.xlog.Log.w("ShakeCoverView", "onShake， shakeCoverView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        android.content.Context context = shakeCoverView.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("ShakeCoverView", "onShake， context==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.e("ShakeCoverView", "onShake, ui finished");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        long j17 = this.f2467i;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime < 1000) {
            com.tencent.mars.xlog.Log.i("ShakeCoverView", "onShake, too short, delay=" + elapsedRealtime);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        this.f2467i = android.os.SystemClock.elapsedRealtime();
        ca4.z0.I0(new long[]{0, 80});
        c();
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "onShake succ");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        a94.x xVar = shakeCoverView.B;
        if (xVar != null) {
            xVar.a();
        }
        shakeCoverView.f163846x = true;
        a94.m.b(shakeCoverView.f163835m, 1, shakeCoverView.f163840r);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
    }
}
