package hr3;

/* loaded from: classes9.dex */
public class u7 implements t25.a, l75.z0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f365579g;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365580d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f365581e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365582f;

    public u7(android.content.Context context) {
        this.f365581e = context;
    }

    public static void a(android.content.Context context) {
        f365579g = false;
        c01.w9.h("medianote", new hr3.t7(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.s7())));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I("medianote", 15);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("medianote");
    }

    public static void b(boolean z17) {
        int p17 = c01.z1.p();
        c01.d9.b().p().w(7, java.lang.Integer.valueOf(z17 ? p17 | 16384 : p17 & (-16385)));
        ((e21.z0) c01.d9.b().w()).c(new e21.o(13, z17 ? 1 : 2));
    }

    public static void c(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f394148d).k(new hr3.r7(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), new hr3.q7(z17, context, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.e4(z3Var.d1()));
        c01.d9.b().p().a(this);
        this.f365582f = z3Var;
        this.f365580d = rVar;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576382v);
        d();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_medianote_view");
        android.content.Context context = this.f365581e;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", "medianote");
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, context);
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            return true;
        }
        if (str.equals("contact_info_medianote_sync_to_qqmail")) {
            if (c01.z1.s()) {
                b(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).h(str)).N());
            } else {
                db5.e1.n(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572505bf0, com.p314xaae8f345.mm.R.C30867xcad56011.bez, new hr3.n7(this), null);
                d();
            }
            return true;
        }
        if (str.equals("contact_info_medianote_clear_data")) {
            android.content.Context context2 = this.f365581e;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.o7(this), null);
            return true;
        }
        if (str.equals("contact_info_medianote_install")) {
            c(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_medianote_uninstall")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context3 = this.f365581e;
        db5.e1.A(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.p7(this), null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void d() {
        boolean z17;
        boolean z18;
        ?? r07 = (c01.z1.n() & 16) == 0 ? 1 : 0;
        int p17 = c01.z1.p();
        if (c01.z1.s()) {
            if ((p17 & 16384) != 0) {
                z17 = true;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).h("contact_info_header_helper");
                c19708x15855336.M(this.f365582f.d1(), this.f365582f.g2(), this.f365581e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572506bf1));
                c19708x15855336.N(r07);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_install", r07);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_view", r07 ^ 1);
                if (r07 != 0 || c01.z1.s()) {
                    z18 = r07;
                } else {
                    z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) == 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetMediaNote", "summerqq BindQQSwitch off");
                }
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_sync_to_qqmail", !z18);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_clear_data", r07 ^ 1);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_uninstall", r07 ^ 1);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).h("contact_info_medianote_sync_to_qqmail")).O(z17);
            }
        } else if ((p17 & 16384) != 0) {
            c01.d9.b().p().w(7, java.lang.Integer.valueOf(p17 & (-16385)));
        }
        z17 = false;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x158553362 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).h("contact_info_header_helper");
        c19708x158553362.M(this.f365582f.d1(), this.f365582f.g2(), this.f365581e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572506bf1));
        c19708x158553362.N(r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_install", r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_view", r07 ^ 1);
        if (r07 != 0) {
        }
        z18 = r07;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_sync_to_qqmail", !z18);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_clear_data", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).m("contact_info_medianote_uninstall", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365580d).h("contact_info_medianote_sync_to_qqmail")).O(z17);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            d();
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
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
