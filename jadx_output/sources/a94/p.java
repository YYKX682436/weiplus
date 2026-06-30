package a94;

/* loaded from: classes4.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView f2461d;

    public p(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView) {
        this.f2461d = shakeCardAnimView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$3");
        try {
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(this.f2461d).g();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "startPAGAnim, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$3");
    }
}
