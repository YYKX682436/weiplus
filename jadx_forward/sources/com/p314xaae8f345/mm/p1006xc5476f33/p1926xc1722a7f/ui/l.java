package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class l implements t25.a, l75.z0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f233688n = true;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f233689d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f233690e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f233691f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f233692g;

    /* renamed from: h, reason: collision with root package name */
    public an3.f f233693h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f233694i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f233695m = null;

    public l(android.content.Context context) {
        this.f233690e = context;
        this.f233694i = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpr, null);
        gm0.j1.d().a(148, this);
    }

    public static void a(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        java.lang.String string = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww);
        f233688n = z17;
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.j(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), string, true, true, null), new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.i(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.c4(z3Var.d1()));
        gm0.j1.u().c().a(this);
        this.f233691f = z3Var;
        this.f233689d = rVar;
        f233688n = true;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576379s);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_lbs_go_lbs");
        android.content.Context context = this.f233690e;
        if (!equals) {
            if (str.equals("contact_info_lbs_install")) {
                a(context, true, null);
                return true;
            }
            if (str.equals("contact_info_lbs_clear_info")) {
                db5.e1.n(context, com.p314xaae8f345.mm.R.C30867xcad56011.h5w, com.p314xaae8f345.mm.R.C30867xcad56011.h5v, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.g(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.h(this));
                return true;
            }
            if (str.equals("contact_info_lbs_uninstall")) {
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.c(this), null);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetLBS", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        java.lang.Boolean bool = (java.lang.Boolean) gm0.j1.u().c().l(4103, null);
        if (bool == null || !bool.booleanValue()) {
            j45.l.h(context, "nearby", ".ui.NearbyFriendsIntroUI");
        } else {
            c01.fb b17 = c01.fb.b();
            if (b17 == null) {
                j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
            } else {
                java.lang.String d17 = b17.d();
                if (d17 == null) {
                    d17 = "";
                }
                java.lang.String c17 = b17.c();
                if (c17 == null) {
                    c17 = "";
                }
                int i17 = b17.f118721b;
                if (d17.equals("") || c17.equals("") || i17 == 0) {
                    j45.l.h(context, "nearby", ".ui.NearbyPersonalInfoUI");
                } else {
                    java.lang.Boolean bool2 = (java.lang.Boolean) gm0.j1.u().c().l(4104, null);
                    if (bool2 == null || !bool2.booleanValue()) {
                        m25.a.a(context, new android.content.Intent());
                        ((android.app.Activity) context).finish();
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f233695m;
                        if (j0Var == null) {
                            this.f233695m = db5.e1.x(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), null, this.f233694i, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.d(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.e(this));
                        } else {
                            j0Var.show();
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void b() {
        ?? r07 = (c01.z1.n() & 512) == 0 ? 1 : 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f233689d).h("contact_info_header_helper");
        c19708x15855336.M(this.f233691f.d1(), this.f233691f.g2(), this.f233690e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bea));
        c19708x15855336.N(r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f233689d).m("contact_info_lbs_install", r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f233689d).m("contact_info_lbs_go_lbs", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f233689d).m("contact_info_lbs_clear_info", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f233689d).m("contact_info_lbs_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetLBS", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
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
        gm0.j1.u().c().e(this);
        gm0.j1.d().q(148, this);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        if (this.f233693h == null && ((an3.f) m1Var).I() == 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetLBS", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() != 148) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f233692g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f233692g = null;
        }
        if (i17 == 0 && i18 == 0) {
            gm0.j1.u().c().w(4104, java.lang.Boolean.TRUE);
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.h5y;
        } else {
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.h5x;
        }
        if (((an3.f) m1Var).I() == 2 && f233688n) {
            db5.e1.m(this.f233690e, i19, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.k(this));
            this.f233693h = null;
        }
    }
}
