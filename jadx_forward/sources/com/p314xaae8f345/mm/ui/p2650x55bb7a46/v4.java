package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class v4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f284325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f284326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 f284327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 f284328g;

    public v4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var, boolean z17, boolean z18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 b5Var) {
        this.f284328g = s4Var;
        this.f284325d = z17;
        this.f284326e = z18;
        this.f284327f = b5Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a5 J2;
        boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var = this.f284328g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.u(s4Var.f284192b, "view_exp", Ri);
        if (Ri) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(182, 217);
            g4Var.u(0, s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4g), false, true);
        } else {
            g4Var.f(0, s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4g));
        }
        if (this.f284325d) {
            g4Var.p(1, s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4e), s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4d), 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22385, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        if (!this.f284326e || (J2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.J(this.f284327f)) == null) {
            return;
        }
        g4Var.p(2, J2.f279896a, J2.f279897b, 0);
    }
}
