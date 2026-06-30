package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class u0 implements com.tencent.mm.plugin.appbrand.backgroundrunning.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.w0 f78164a;

    public u0(com.tencent.mm.plugin.appbrand.floatball.w0 w0Var) {
        this.f78164a = w0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.u0
    public void a(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        if (appBrandBackgroundRunningOperationParcel != null && (o6Var = this.f78164a.f78167v) != null && o6Var.f74803n.equals(appBrandBackgroundRunningOperationParcel.f76932d) && this.f78164a.f78167v.f74805p.f77281g == appBrandBackgroundRunningOperationParcel.f76933e && appBrandBackgroundRunningOperationParcel.f76934f == 4 && appBrandBackgroundRunningOperationParcel.f76935g == 1) {
            com.tencent.mm.plugin.appbrand.floatball.w0 w0Var = this.f78164a;
            if (w0Var.u()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onVOIPStateChanged, already add this float ball, so update state");
                w0Var.b0(w0Var.t0());
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onVOIPStateChanged, add passive float ball");
            w0Var.a0(true);
            w0Var.W(true);
            w0Var.b0(w0Var.t0());
            w0Var.j();
        }
    }
}
