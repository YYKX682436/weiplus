package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class f implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.i f78088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78089b;

    public f(com.tencent.mm.plugin.appbrand.floatball.i iVar, int i17) {
        this.f78088a = iVar;
        this.f78089b = i17;
    }

    @Override // qp1.k0
    public final void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.tencent.mm.plugin.appbrand.floatball.i iVar = this.f78088a;
        com.tencent.mars.xlog.Log.i(iVar.f78100w, "onCheckResult#onClose, isOk: " + h17);
        if (h17) {
            iVar.t0(this.f78089b);
            return;
        }
        iVar.d();
        iVar.f93239n.q(true);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.c(iVar.f78099v);
        if (c17 != null) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(c17, false, 1, null);
        }
    }
}
