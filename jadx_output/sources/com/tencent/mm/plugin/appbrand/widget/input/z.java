package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.plugin.appbrand.widget.input.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91729a;

    public z(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91729a = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.r3
    public void a(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var;
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91729a;
        if (i17 == 2) {
            q0Var.f91608m = com.tencent.mm.plugin.appbrand.widget.input.p0.PANEL_HIDDEN;
            com.tencent.mm.plugin.appbrand.widget.input.q0.j(q0Var);
            q0Var.f91608m = null;
            return;
        }
        if (i17 == 0 && (e4Var = q0Var.f91612q) != null) {
            e4Var.requestFocus();
        }
        q0Var.p();
        java.lang.ref.WeakReference weakReference = q0Var.f91610o;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) q0Var.f91610o.get();
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var2 = q0Var.f91612q;
        java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
        if (v5Var == null) {
            return;
        }
        ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.o1(v5Var, e4Var2));
    }
}
