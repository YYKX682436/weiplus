package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class m0 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.p0 f78120b;

    public m0(com.tencent.mm.plugin.appbrand.floatball.p0 p0Var, int i17) {
        this.f78120b = p0Var;
        this.f78119a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        com.tencent.mm.plugin.appbrand.floatball.p0 p0Var = this.f78120b;
        if (h17) {
            p0Var.t0(this.f78119a);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, refuse permission, remove ball and stop location");
        p0Var.d();
        p0Var.u0();
        p0Var.f93239n.q(true);
    }
}
