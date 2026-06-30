package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public final class v0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.x0 f87559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.q0 f87560e;

    public v0(com.tencent.mm.plugin.appbrand.pip.x0 x0Var, com.tencent.mm.plugin.appbrand.pip.q0 q0Var) {
        this.f87559d = x0Var;
        this.f87560e = q0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.graphics.Point point = (android.graphics.Point) obj;
        this.f87559d.f87566b = point;
        com.tencent.mm.plugin.appbrand.pip.i0 i0Var = (com.tencent.mm.plugin.appbrand.pip.i0) this.f87560e;
        if (point == null) {
            com.tencent.mars.xlog.Log.i(i0Var.f87497a.f87518a, "onPipStablePosGot, point is null");
            return;
        }
        i0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.pip.h0(i0Var, point));
    }
}
