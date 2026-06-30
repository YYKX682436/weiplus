package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class e1 implements com.tencent.mm.plugin.appbrand.jsapi.v, com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f91406d;

    public e1(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f91406d = new java.lang.ref.WeakReference(v5Var);
        v5Var.R(this);
        v5Var.w(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91406d.get();
        if (v5Var != null) {
            com.tencent.mm.plugin.appbrand.widget.input.r1.d(v5Var, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91406d.get();
        if (v5Var != null) {
            if (v5Var.getF147807d() instanceof com.tencent.mm.plugin.appbrand.widget.input.x4) {
                ((com.tencent.mm.plugin.appbrand.widget.input.x4) v5Var.getF147807d()).hideVKB();
            }
            com.tencent.mm.plugin.appbrand.widget.input.r1.d(v5Var, null);
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.p1(v5Var));
            com.tencent.mm.plugin.appbrand.widget.input.m.f91540a.g(v5Var);
            v5Var.O(this);
            v5Var.K(this);
            if (v5Var.a2() != null) {
                com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.a(v5Var.a2());
            }
        }
    }
}
