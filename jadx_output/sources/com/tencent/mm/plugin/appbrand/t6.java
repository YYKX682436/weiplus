package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class t6 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.g3 f88967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.u6 f88968e;

    public t6(com.tencent.mm.plugin.appbrand.u6 u6Var, com.tencent.mm.plugin.appbrand.g3 g3Var) {
        this.f88968e = u6Var;
        this.f88967d = g3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) obj;
        if (!this.f88968e.f89271c.L0()) {
            this.f88968e.f89271c.u3();
            java.lang.String str = this.f88968e.f89271c.f74803n;
            java.lang.String W0 = iCommLibReader.W0();
            com.tencent.mm.plugin.appbrand.report.quality.t0 t0Var = (com.tencent.mm.plugin.appbrand.report.quality.t0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.report.quality.t0.f88313m).get(str);
            if (t0Var != null) {
                t0Var.f88323i = W0;
            }
            this.f88967d.d();
            com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f88968e.f89271c.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForCommLibConfirm);
        }
        return jz5.f0.f302826a;
    }
}
