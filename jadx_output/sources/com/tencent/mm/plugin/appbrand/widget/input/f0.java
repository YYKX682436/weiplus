package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class f0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91439d;

    public f0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91439d = q0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var;
        if (z17) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91439d.f91610o.get();
            com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var2 = this.f91439d;
            java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
            com.tencent.mm.plugin.appbrand.widget.input.m.f91540a.e(v5Var, q0Var2);
        }
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var3 = this.f91439d;
        if (q0Var3.f91613r == null) {
            q0Var3.f91613r = q0Var3.n();
        }
        boolean z18 = false;
        if (z17) {
            q0Var3.B();
            if (q0Var3.f91609n.f356607u.booleanValue()) {
                com.tencent.mm.sdk.platformtools.u3.i(q0Var3.f91617v, 100L);
            }
        } else if (q0Var3.f91612q != null) {
            if (q0Var3.f91609n.T) {
                q0Var3.l(false);
                q0Var3.f91613r.e(q0Var3.f91612q);
                q0Var3.z(q0Var3.f91612q);
                q0Var3.f91612q.n();
                q0Var3.f91612q = null;
                ((java.util.HashSet) com.tencent.mm.plugin.appbrand.utils.s0.f90550a).remove(q0Var3);
            } else {
                if (q0Var3.f91608m == null) {
                    q0Var3.l(false);
                }
                q0Var3.f91612q.setFocusable(false);
                q0Var3.f91612q.setFocusableInTouchMode(false);
                q0Var3.f91613r.e(q0Var3.f91612q);
            }
        }
        if (z17 && (!this.f91439d.f91609n.T || com.tencent.mm.plugin.appbrand.ui.na.k(this.f91439d.f91612q))) {
            z18 = true;
        }
        if (!z18 || (e4Var = (q0Var = this.f91439d).f91612q) == null || q0Var.f91613r == null) {
            return;
        }
        e4Var.requestFocus();
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var4 = this.f91439d;
        q0Var4.f91613r.k(q0Var4.F);
        this.f91439d.f91613r.I();
    }
}
