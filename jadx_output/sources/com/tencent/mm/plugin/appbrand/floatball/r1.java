package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class r1 implements com.tencent.mm.plugin.appbrand.backgroundrunning.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.t1 f78139a;

    public r1(com.tencent.mm.plugin.appbrand.floatball.t1 t1Var) {
        this.f78139a = t1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.u0
    public void a(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        if (appBrandBackgroundRunningOperationParcel != null && (o6Var = this.f78139a.f78143v) != null && o6Var.f74803n.equals(appBrandBackgroundRunningOperationParcel.f76932d) && this.f78139a.f78143v.f74805p.f77281g == appBrandBackgroundRunningOperationParcel.f76933e && appBrandBackgroundRunningOperationParcel.f76934f == 16 && appBrandBackgroundRunningOperationParcel.f76935g == 1) {
            com.tencent.mm.plugin.appbrand.floatball.t1 t1Var = this.f78139a;
            if (t1Var.u()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onVOIPStateChanged, already add this float ball, so update state");
                t1Var.b0(t1Var.t0());
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onVOIPStateChanged, add passive float ball");
            t1Var.a0(true);
            t1Var.W(false);
            t1Var.b0(t1Var.t0());
            t1Var.j();
        }
    }
}
