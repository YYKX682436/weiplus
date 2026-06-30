package a94;

/* loaded from: classes4.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView f2465d;

    public v(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView) {
        this.f2465d = shakeCoverView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$5");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = this.f2465d;
        boolean z17 = shakeCoverView.f163838p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (z17) {
            com.tencent.mars.xlog.Log.w("ShakeCoverView", "do startShakeAnim, isDestroyed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$5");
        } else {
            com.tencent.mars.xlog.Log.i("ShakeCoverView", "do startShakeAnim");
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.a(shakeCoverView).g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$5");
        }
    }
}
