package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class c1 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78076b;

    public c1(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var, int i17) {
        this.f78076b = k1Var;
        this.f78075a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.tencent.mars.xlog.Log.i(this.f78076b.f78107v, "onClose, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        if (h17) {
            this.f78076b.B0(this.f78075a);
            com.tencent.mm.plugin.appbrand.floatball.k1.u0(this.f78076b, true);
            if (this.f78076b.B) {
                return;
            }
            this.f78076b.d();
            this.f78076b.A = false;
            com.tencent.mm.plugin.appbrand.floatball.k1.t0(this.f78076b);
            return;
        }
        com.tencent.mars.xlog.Log.w(this.f78076b.f78107v, "onClose, refuse permission, remove ball and stop background play");
        this.f78076b.d();
        this.f78076b.A = false;
        this.f78076b.B = false;
        this.f78076b.z0();
        com.tencent.mm.plugin.appbrand.floatball.k1.u0(this.f78076b, false);
        this.f78076b.f93239n.q(true);
    }
}
