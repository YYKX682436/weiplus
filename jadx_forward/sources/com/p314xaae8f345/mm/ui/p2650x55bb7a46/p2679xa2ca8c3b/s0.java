package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class s0 extends wl5.v {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 f287013a;

    public s0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var) {
        this.f287013a = q0Var;
    }

    @Override // wl5.v
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var = this.f287013a;
        rl5.r rVar = q0Var.f286825g;
        if (rVar == null || !rVar.a()) {
            return;
        }
        q0Var.f286825g = null;
    }

    @Override // wl5.v
    public void b() {
        yb5.d dVar = this.f287013a.f286822d;
        if (dVar != null) {
            dVar.P(false);
        }
    }

    @Override // wl5.v
    public void c(android.view.View view) {
        this.f287013a.onLongClick(view);
    }

    @Override // wl5.v
    public void d() {
        yb5.d dVar = this.f287013a.f286822d;
        if (dVar != null) {
            dVar.V(true);
        }
    }

    @Override // wl5.v
    public void e() {
        yb5.d dVar = this.f287013a.f286822d;
        if (dVar != null) {
            dVar.V(false);
        }
    }

    @Override // wl5.v
    public void f(android.view.View view) {
        this.f287013a.g(view);
    }
}
