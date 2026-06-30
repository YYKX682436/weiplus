package hr3;

/* loaded from: classes9.dex */
public class l8 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365283d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365284e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365285f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f365286g;

    public l8(android.content.Context context) {
        this.f365283d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        c01.d9.b().p().a(this);
        this.f365284e = rVar;
        this.f365285f = z3Var;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576386y);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = "contact_info_go_to_sync".equals(str);
        android.content.Context context = this.f365283d;
        if (equals) {
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(context, "com.tencent.qqpim")) {
                android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.qqpim");
                launchIntentForPackage.addFlags(268435456);
                android.content.Context context2 = this.f365283d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(launchIntentForPackage);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync", "goToSync", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync", "goToSync", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                db5.e1.j(this.f365283d, com.p314xaae8f345.mm.R.C30867xcad56011.f572516bg5, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.f571908t8, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new hr3.i8(this), null);
            }
            return true;
        }
        if ("contact_info_remind_me_syncing".equals(str)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365284e).h("contact_info_remind_me_syncing");
            c01.d9.b().p().w(65792, java.lang.Boolean.valueOf(c21541x1c1b08fe.N()));
            c01.sc.b(6, c21541x1c1b08fe.N() ? "1" : "2");
            return true;
        }
        if (str.equals("contact_info_qqsync_install")) {
            a(context, true);
            return true;
        }
        if (!str.equals("contact_info_qqsync_uninstall")) {
            return false;
        }
        android.content.Context context3 = this.f365283d;
        db5.e1.A(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.h8(this), null);
        return true;
    }

    public final void a(android.content.Context context, boolean z17) {
        gm0.j1.e().j(new hr3.k8(this, z17, db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null)));
    }

    public final void b() {
        this.f365286g = (c01.z1.n() & 128) == 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365284e).h("contact_info_header_helper");
        c19708x15855336.M(this.f365285f.d1(), this.f365285f.g2(), this.f365283d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bg6));
        c19708x15855336.N(this.f365286g ? 1 : 0);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365284e).m("contact_info_go_to_sync", !this.f365286g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365284e).m("contact_info_remind_me_syncing_tip", !this.f365286g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365284e).m("contact_info_qqsync_install", this.f365286g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365284e).m("contact_info_qqsync_uninstall", true ^ this.f365286g);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (this.f365286g != ((c01.z1.n() & 128) == 0)) {
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
        return true;
    }
}
