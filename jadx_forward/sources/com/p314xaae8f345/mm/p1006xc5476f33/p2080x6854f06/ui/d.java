package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class d implements t25.a, l75.z0, c01.y8 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f243781d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f243782e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f243783f;

    public d(android.content.Context context) {
        this.f243782e = context;
    }

    public static void a(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.c(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.b(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.C4(z3Var.d1()));
        c01.d9.b().p().a(this);
        c01.d9.b().a(this);
        this.f243783f = z3Var;
        this.f243781d = rVar;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576389a0);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_shake_go_shake");
        android.content.Context context = this.f243782e;
        if (equals) {
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(context, new android.content.Intent(), true);
            ((android.app.Activity) context).finish();
            return true;
        }
        if (str.equals("contact_info_shake_install")) {
            a(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_shake_uninstall")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetShake", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context2 = this.f243782e;
        db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.a(this), null);
        return true;
    }

    @Override // c01.y8
    public void a0() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void b() {
        ?? r07 = (c01.z1.n() & 256) == 0 ? 1 : 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243781d).h("contact_info_header_helper");
        if (c19708x15855336 != 0) {
            c19708x15855336.M(this.f243783f.d1(), this.f243783f.g2(), this.f243782e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bha));
            c19708x15855336.N(r07);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243781d).m("contact_info_shake_install", r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243781d).m("contact_info_shake_go_shake", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243781d).m("contact_info_shake_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetShake", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 7 || o17 == 34) {
            b();
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        c01.d9.b().p().e(this);
        c01.d9.b().G(this);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
