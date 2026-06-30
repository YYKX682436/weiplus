package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsruntime.n {

    /* renamed from: f, reason: collision with root package name */
    public final cl.p f84030f;

    /* renamed from: g, reason: collision with root package name */
    public final cl.q0 f84031g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84032h;

    public q(cl.q0 q0Var, int i17) {
        this.f84030f = q0Var.f42724b;
        this.f84031g = q0Var;
        this.f84032h = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n
    public cl.p c0() {
        return this.f84030f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.r
    public boolean l() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n
    public cl.q0 n0() {
        return this.f84031g;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.r
    public int o() {
        return this.f84032h;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n, com.tencent.mm.plugin.appbrand.jsruntime.k0
    public void pause() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJ2V8SubContext", "AppBrandJ2V8SubContext can not pause");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n, com.tencent.mm.plugin.appbrand.jsruntime.k0
    public void resume() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJ2V8SubContext", "AppBrandJ2V8SubContext can not resume");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
        this.f84031g.g(this.f84032h, sVar);
    }
}
