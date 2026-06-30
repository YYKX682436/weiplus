package ca4;

/* loaded from: classes4.dex */
public class h0 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.i0 f39938a;

    public h0(ca4.i0 i0Var) {
        this.f39938a = i0Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2$1");
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "onLaunchApp=" + z17 + ", launchCancel=" + z18);
        ca4.i0 i0Var = this.f39938a;
        if (z17) {
            if (i0Var.f39945f != 2) {
                ca4.c0.e(i0Var.f39946g, i0Var.f39947h, 1, 2, i0Var.f39948i, i0Var.f39949m, i0Var.f39950n);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 83);
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.e(i0Var.f39943d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2$1");
    }
}
