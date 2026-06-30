package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class n1 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.t1 f78125b;

    public n1(com.tencent.mm.plugin.appbrand.floatball.t1 t1Var, int i17) {
        this.f78125b = t1Var;
        this.f78124a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseAfterCheckingTip, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        com.tencent.mm.plugin.appbrand.floatball.t1 t1Var = this.f78125b;
        if (h17) {
            t1Var.v0(this.f78124a);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseAfterCheckingTip, refuse permission, remove ball and stop voip");
        t1Var.d();
        t1Var.x0();
        t1Var.f93239n.q(true);
    }
}
