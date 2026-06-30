package kf3;

/* loaded from: classes9.dex */
public class e implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f388867d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f388868e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f388869f;

    public e(android.content.Context context) {
        new java.util.HashMap();
        this.f388868e = context;
    }

    public static void a() {
        if3.z Ai = if3.k0.Ai();
        if (Ai.f372765d.A("massendinfo", "delete from massendinfo")) {
            Ai.m145262xf35bbb4();
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("masssendapp");
    }

    public static void b(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f394148d).k(new kf3.d(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), new kf3.c(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.d4(z3Var.d1()));
        c01.d9.b().p().a(this);
        this.f388869f = z3Var;
        this.f388867d = rVar;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576381u);
        c();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_masssend_view");
        android.content.Context context = this.f388868e;
        if (equals) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc.class);
            android.content.Context context2 = this.f388868e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/ContactWidgetMassSend", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/masssend/ui/ContactWidgetMassSend", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("contact_info_masssend_clear_data")) {
            android.content.Context context3 = this.f388868e;
            db5.e1.A(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new kf3.a(this), null);
            return true;
        }
        if (str.equals("contact_info_masssend_install")) {
            b(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_masssend_uninstall")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetMassSend", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context4 = this.f388868e;
        db5.e1.A(context4, context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new kf3.b(this), null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void c() {
        ?? r07 = (c01.z1.n() & 65536) == 0 ? 1 : 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f388867d).h("contact_info_masssend_header_helper");
        c19708x15855336.M(this.f388869f.d1(), this.f388869f.g2(), this.f388868e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bex));
        c19708x15855336.N(r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f388867d).m("contact_info_masssend_install", r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f388867d).m("contact_info_masssend_view", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f388867d).m("contact_info_masssend_clear_data", r07 ^ 1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f388867d).m("contact_info_masssend_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetMassSend", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            c();
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
