package hr3;

/* loaded from: classes9.dex */
public class m7 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365326d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f365327e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365328f;

    /* renamed from: g, reason: collision with root package name */
    public final hr3.i9 f365329g;

    public m7(android.content.Context context) {
        this.f365327e = context;
        this.f365329g = new hr3.k9(context);
    }

    public static void a(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new hr3.l7(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), z17, z9Var), false).c(1500L, 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        boolean z18 = false;
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        if (d17 != null && d17.equalsIgnoreCase("linkedinplugin")) {
            z18 = true;
        }
        iz5.a.g(null, z18);
        c01.d9.b().p().a(this);
        this.f365328f = z3Var;
        this.f365326d = rVar;
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_linkedin_install");
        android.content.Context context = this.f365327e;
        if (equals) {
            a(context, true, null);
            return true;
        }
        if (str.equals("contact_info_linkedin_uninstall")) {
            android.content.Context context2 = this.f365327e;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.k7(this), null);
            return true;
        }
        if (str.equals("contact_info_linkedin_account")) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f.class);
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetLinkedIn", "handleEvent", "(Ljava/lang/String;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetLinkedIn", "handleEvent : unExpected key = ".concat(str));
        return false;
    }

    public final void b() {
        boolean z17 = (c01.z1.n() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).g(com.p314xaae8f345.mm.R.xml.f576380t);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).h("contact_info_header_helper")).N(this.f365328f, this.f365329g);
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).m("contact_info_linkedin_account", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).w("contact_info_linkedin_install");
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).m("contact_info_linkedin_account", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).w("contact_info_linkedin_uninstall");
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            boolean z17 = obj instanceof java.lang.String;
            return;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        if (intValue == 40 || intValue == 34) {
            b();
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            b();
        }
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        hr3.i9 i9Var;
        c01.d9.b().p().e(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336 c16856x15855336 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365326d).h("contact_info_header_helper");
        if (c16856x15855336 != null && (i9Var = c16856x15855336.R) != null) {
            i9Var.mo133943x3f5eee52();
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
