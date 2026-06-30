package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class z0 implements com.tencent.mm.plugin.appbrand.backgroundrunning.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78180a;

    public z0(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var) {
        this.f78180a = k1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.u0
    public void a(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        if (appBrandBackgroundRunningOperationParcel != null && this.f78180a.f78108w.f74803n.equals(appBrandBackgroundRunningOperationParcel.f76932d) && this.f78180a.f78108w.f74805p.f77281g == appBrandBackgroundRunningOperationParcel.f76933e && appBrandBackgroundRunningOperationParcel.f76934f == 64) {
            int i17 = appBrandBackgroundRunningOperationParcel.f76935g;
            if (i17 == 1) {
                com.tencent.mm.plugin.appbrand.floatball.k1.t0(this.f78180a);
            } else if (i17 == 2 || i17 == 3) {
                this.f78180a.C0();
            }
        }
    }
}
