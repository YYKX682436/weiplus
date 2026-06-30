package ca4;

/* loaded from: classes4.dex */
public class f0 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.d f39895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca4.g0 f39896b;

    public f0(ca4.g0 g0Var, ca4.d dVar) {
        this.f39896b = g0Var;
        this.f39895a = dVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1$1");
        com.tencent.mars.xlog.Log.i("SnsAdUtil", "appPageUrl!=null, onLaunchApp=" + z17 + ", launchCancel=" + z18);
        ca4.g0 g0Var = this.f39896b;
        if (z17) {
            int i17 = g0Var.f39928h;
            ca4.d dVar = this.f39895a;
            if (i17 != 2) {
                ca4.c0.e(g0Var.f39929i, g0Var.f39930m, 1, 2, g0Var.f39924d, g0Var.f39926f, g0Var.f39927g);
                l44.z.i(dVar);
            }
            java.util.ArrayList arrayList = l44.z.f316428a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDeepLinkComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                ca4.f fVar = new ca4.f();
                fVar.m(4002011);
                fVar.o(dVar.f39851a);
                fVar.f(dVar.f39852b);
                fVar.l(dVar.f39853c);
                fVar.c(dVar.f39854d);
                fVar.p(dVar.f39856f);
                fVar.n(dVar.f39857g);
                fVar.q(dVar.f39858h);
                fVar.h(dVar.f39861k);
                fVar.j(dVar.f39863m);
                fVar.i(1);
                a84.t0.a(fVar.a());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkComplete, exp is " + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDeepLinkComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 80);
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.e(g0Var.f39931n);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1$1");
    }
}
