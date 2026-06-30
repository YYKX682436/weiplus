package hr3;

/* loaded from: classes9.dex */
public class r8 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365476d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f365477e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365478f;

    public r8(android.content.Context context) {
        this.f365477e = context;
    }

    public static void a(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f394148d).k(new hr3.q8(db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), new hr3.p8(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        boolean z18 = false;
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        if (d17 != null && d17.equalsIgnoreCase("voiceinputapp")) {
            z18 = true;
        }
        iz5.a.g(null, z18);
        c01.d9.b().p().a(this);
        this.f365478f = z3Var;
        this.f365476d = rVar;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576392a3);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_voiceinput_install");
        android.content.Context context = this.f365477e;
        if (equals) {
            a(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_voiceinput_uninstall")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetVoiceInput", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context2 = this.f365477e;
        db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.o8(this), null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void b() {
        ?? r07 = (c01.z1.n() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) == 0 ? 1 : 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365476d).h("contact_info_header_helper");
        c19708x15855336.M(this.f365478f.d1(), this.f365478f.g2(), this.f365477e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bje));
        c19708x15855336.N(r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365476d).m("contact_info_voiceinput_install", r07);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365476d).m("contact_info_voiceinput_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
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
        c01.d9.b().p().e(this);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
