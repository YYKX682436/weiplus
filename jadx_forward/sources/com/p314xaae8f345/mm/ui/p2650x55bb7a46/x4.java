package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class x4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 f287763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f287764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 f287765g;

    public x4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 b5Var, int i17) {
        this.f287765g = s4Var;
        this.f287762d = str;
        this.f287763e = b5Var;
        this.f287764f = i17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a5 J2;
        boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var = this.f287765g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.u(s4Var.f284192b, "view_exp", Ri);
        if (Ri) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(182, 217);
            g4Var.u(0, s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4g), false, true);
        } else {
            g4Var.f(0, s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4g));
        }
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.M(this.f287762d)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
            c6646xbe932a67.f139948d = 13L;
            c6646xbe932a67.k();
            java.lang.String string = s4Var.f284192b.f283178j.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4f);
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
                g4Var.f(1, (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_NAME_STRING_SYNC, string));
            } else {
                g4Var.f(1, string);
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 b5Var = this.f287763e;
        if (b5Var.f280019a && this.f287764f == 1 && (J2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.J(b5Var)) != null) {
            g4Var.p(2, J2.f279896a, J2.f279897b, 0);
        }
    }
}
