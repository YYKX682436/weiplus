package hr3;

/* loaded from: classes9.dex */
public class e7 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365046d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f365047e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365048f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f365049g = new java.util.HashMap();

    public e7(android.content.Context context) {
        this.f365047e = context;
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0("facebookapp");
    }

    public static void a(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f394148d).k(new hr3.d7(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), new hr3.c7(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.Q3(z3Var.d1()));
        c01.d9.b().p().a(this);
        this.f365048f = z3Var;
        this.f365046d = rVar;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576376p);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = h0Var.h("contact_info_header_helper");
        java.util.Map map = this.f365049g;
        if (h17 != null) {
            ((java.util.HashMap) map).put("contact_info_header_helper", h17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = h0Var.h("contact_info_facebookapp_listfriend");
        if (h18 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_listfriend", h18);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = h0Var.h("contact_info_facebookapp_account");
        if (h19 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_account", h19);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19 c21561x79ac8f19 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19) h0Var.h("contact_info_facebookapp_cat");
        if (c21561x79ac8f19 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_cat", c21561x79ac8f19);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h27 = h0Var.h("contact_info_facebookapp_addr");
        if (h27 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_addr", h27);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19 c21561x79ac8f192 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19) h0Var.h("contact_info_facebookapp_cat2");
        if (c21561x79ac8f192 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_cat2", c21561x79ac8f192);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h28 = h0Var.h("contact_info_facebookapp_install");
        if (h28 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_install", h28);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h29 = h0Var.h("contact_info_facebookapp_uninstall");
        if (h29 != null) {
            ((java.util.HashMap) map).put("contact_info_facebookapp_uninstall", h29);
        }
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_facebookapp_install");
        android.content.Context context = this.f365047e;
        if (equals) {
            a(context, true, null);
            return true;
        }
        if (str.equals("contact_info_facebookapp_uninstall")) {
            android.content.Context context2 = this.f365047e;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.b7(this), null);
            return true;
        }
        if (!str.equals("contact_info_facebookapp_listfriend")) {
            if (str.equals("contact_info_facebookapp_account")) {
                j45.l.j(context, "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
                return true;
            }
            if (str.equals("contact_info_facebookapp_addr")) {
                j45.l.j(context, "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetFacebookapp", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e.class);
        android.content.Context context3 = this.f365047e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetFacebookapp", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context3, "com/tencent/mm/plugin/profile/ui/ContactWidgetFacebookapp", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final void b() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).t();
        java.util.HashMap hashMap = (java.util.HashMap) this.f365049g;
        if (hashMap.containsKey("contact_info_header_helper")) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) hashMap.get("contact_info_header_helper");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d(c19708x15855336, -1);
            c19708x15855336.M(this.f365048f.d1(), this.f365048f.f2(), this.f365047e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdg));
            c19708x15855336.N((c01.z1.n() & 8192) == 0 ? 1 : 0);
        }
        if (hashMap.containsKey("contact_info_facebookapp_cat")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get("contact_info_facebookapp_cat"), -1);
        }
        if (!((c01.z1.n() & 8192) == 0)) {
            if (hashMap.containsKey("contact_info_facebookapp_install")) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get("contact_info_facebookapp_install"), -1);
                return;
            }
            return;
        }
        if (hashMap.containsKey("contact_info_facebookapp_account")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get("contact_info_facebookapp_account");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d(c21560x1fce98fb, -1);
            if (c01.z1.u()) {
                c21560x1fce98fb.G(com.p314xaae8f345.mm.R.C30867xcad56011.f574512ij3);
            } else {
                c21560x1fce98fb.G(com.p314xaae8f345.mm.R.C30867xcad56011.inp);
            }
        }
        if (c01.z1.u() && hashMap.containsKey("contact_info_facebookapp_addr")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get("contact_info_facebookapp_addr");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d(c21560x1fce98fb2, -1);
            c21560x1fce98fb2.H((java.lang.String) c01.d9.b().p().l(65826, null));
        }
        if (hashMap.containsKey("contact_info_facebookapp_cat2")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get("contact_info_facebookapp_cat2"), -1);
        }
        if (hashMap.containsKey("contact_info_facebookapp_uninstall")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365046d).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get("contact_info_facebookapp_uninstall"), -1);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 65825) {
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
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
