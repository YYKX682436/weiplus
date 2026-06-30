package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class s0 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.w0 f78141b;

    public s0(com.tencent.mm.plugin.appbrand.floatball.w0 w0Var, int i17) {
        this.f78141b = w0Var;
        this.f78140a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseAfterCheckingTip, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        com.tencent.mm.plugin.appbrand.floatball.w0 w0Var = this.f78141b;
        if (h17) {
            w0Var.v0(this.f78140a);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseAfterCheckingTip, refuse permission, remove ball and stop voip");
        w0Var.d();
        w0Var.y0();
        w0Var.f93239n.q(true);
    }
}
