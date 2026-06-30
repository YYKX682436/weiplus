package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f289822d;

    public z1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f289822d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f289822d;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = Di.p((java.lang.String) h0Var.f391656d);
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        java.lang.String z07 = p17 != null ? p17.z0() : null;
        if (z07 == null) {
            z07 = (java.lang.String) h0Var.f391656d;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = cj6.q5(z07);
        int d17 = p17 != null ? p17.d1() : 0;
        boolean z17 = d17 > 0;
        long I0 = q57 != null ? q57.I0() : 0L;
        java.lang.String y07 = p17 != null ? p17.y0() : null;
        if (y07 == null) {
            y07 = "";
        }
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        java.lang.String z08 = p17 != null ? p17.z0() : null;
        b00.a0 a0Var = (b00.a0) u3Var;
        if (I0 <= 0) {
            a0Var.getClass();
        } else {
            if (I0 == a0Var.f98170e) {
                return;
            }
            a0Var.f98170e = I0;
            a0Var.bj("ecs_kf_main_session_holder", "view_exp", a0Var.Bi(y07, d17, z17, z08));
        }
    }
}
