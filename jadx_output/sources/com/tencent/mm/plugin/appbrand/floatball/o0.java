package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class o0 implements com.tencent.mm.plugin.appbrand.backgroundrunning.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.p0 f78127a;

    public o0(com.tencent.mm.plugin.appbrand.floatball.p0 p0Var) {
        this.f78127a = p0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.u0
    public void a(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        if (appBrandBackgroundRunningOperationParcel != null && (o6Var = this.f78127a.f78129v) != null && o6Var.f74803n.equals(appBrandBackgroundRunningOperationParcel.f76932d) && this.f78127a.f78129v.f74805p.f77281g == appBrandBackgroundRunningOperationParcel.f76933e && appBrandBackgroundRunningOperationParcel.f76934f == 2 && appBrandBackgroundRunningOperationParcel.f76935g == 1) {
            com.tencent.mm.plugin.appbrand.floatball.p0 p0Var = this.f78127a;
            if (p0Var.u()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onBackgroundLocationStateChanged, add location state to float ball");
                pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                int i17 = p0Var.f93132d.H;
                ((ov.p0) j0Var).getClass();
                java.lang.Boolean bool = qp1.w.f365755a;
                p0Var.b0(1 | i17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onBackgroundLocationStateChanged, add passive location float ball");
            p0Var.a0(true);
            p0Var.W(true);
            pv.j0 j0Var2 = (pv.j0) i95.n0.c(pv.j0.class);
            int i18 = p0Var.f93132d.H;
            ((ov.p0) j0Var2).getClass();
            java.lang.Boolean bool2 = qp1.w.f365755a;
            p0Var.b0(1 | i18);
            p0Var.j();
        }
    }
}
