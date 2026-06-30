package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class b implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.d f78069b;

    public b(com.tencent.mm.plugin.appbrand.floatball.d dVar, int i17) {
        this.f78069b = dVar;
        this.f78068a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.tencent.mars.xlog.Log.i(this.f78069b.f78077v, "onClose, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        if (h17) {
            this.f78069b.w0(this.f78068a);
            com.tencent.mm.plugin.appbrand.floatball.d.t0(this.f78069b, true);
            return;
        }
        com.tencent.mars.xlog.Log.w(this.f78069b.f78077v, "onClose, refuse permission, remove ball and stop background play");
        this.f78069b.d();
        this.f78069b.f78080y = false;
        this.f78069b.v0();
        com.tencent.mm.plugin.appbrand.floatball.d.t0(this.f78069b, false);
        this.f78069b.f93239n.q(true);
    }
}
