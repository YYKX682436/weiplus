package hr3;

/* loaded from: classes11.dex */
public class j7 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365206d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365207e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365208f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f365209g;

    /* renamed from: h, reason: collision with root package name */
    public int f365210h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f365211i;

    /* renamed from: m, reason: collision with root package name */
    public int f365212m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f365213n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f365214o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f365215p;

    public j7(android.content.Context context) {
        this.f365206d = context;
        this.f365215p = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3(context, 0);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        boolean z18;
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        this.f365207e = rVar;
        this.f365208f = z3Var;
        this.f365209g = z17;
        this.f365210h = i17;
        android.content.Context context = this.f365206d;
        android.app.Activity activity = (android.app.Activity) context;
        this.f365211i = activity.getIntent().getBooleanExtra("User_Verify", false);
        this.f365212m = activity.getIntent().getIntExtra("Kdel_from", -1);
        this.f365213n = z3Var.d1();
        this.f365214o = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).W0(this.f365213n);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365207e).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365207e).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(context, null), -1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f365215p;
        c19662x4f7a67f3.C("roominfo_contact_anchor");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365207e).d(c19662x4f7a67f3, -1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365207e).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19(context), -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668(context);
        c16861xdcf09668.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.a1y;
        c16861xdcf09668.C("contact_info_footer_normal");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365208f;
        boolean z27 = this.f365209g;
        boolean z28 = this.f365211i;
        int i18 = this.f365210h;
        int i19 = this.f365212m;
        hr3.va vaVar = c16861xdcf09668.f235265p0;
        if (vaVar != null) {
            vaVar.i();
        }
        l75.v0 v0Var = c16861xdcf09668.M1;
        synchronized (v0Var) {
            v0Var.f398504b.clear();
        }
        iz5.a.g(null, z3Var2 != null);
        java.lang.String d18 = z3Var2.d1();
        if (d18 == null) {
            d18 = "";
        }
        iz5.a.g(null, d18.length() > 0);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(c01.z1.r()).equals(z3Var2.d1())) {
            z18 = false;
        } else {
            c16861xdcf09668.L = z3Var2;
            c16861xdcf09668.U = "";
            c16861xdcf09668.M = z27;
            c16861xdcf09668.N = i18;
            c16861xdcf09668.P = i19;
            c16861xdcf09668.W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(java.lang.Boolean.valueOf(c01.e2.M(z3Var2.d1())), false);
            c16861xdcf09668.Q = false;
            c16861xdcf09668.R = false;
            c16861xdcf09668.S = 0L;
            c16861xdcf09668.T = "";
            c16861xdcf09668.V = z3Var2.F0() == 1;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16861xdcf09668.K1;
            c16861xdcf09668.I1 = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
            c16861xdcf09668.J1 = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("add_more_friend_search_scene", 0);
            c16861xdcf09668.Y = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("Contact_IsLbsChattingProfile", false);
            c16861xdcf09668.Z = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("Contact_IsLbsGotoChatting", false);
            c16861xdcf09668.L1 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("lbs_ticket");
            if (!c01.z1.J(z3Var2.d1())) {
                if (!((com.p314xaae8f345.mm.p2621x8fb0427b.ka) c01.d9.b().y()).s0(z3Var2.d1())) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(z3Var2.d1())) {
                        c16861xdcf09668.f235265p0 = new hr3.jb(c16861xdcf09668);
                    } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(z3Var2.d1())) {
                        c16861xdcf09668.f235265p0 = new hr3.fb(c16861xdcf09668);
                    } else if (c01.e2.M(z3Var2.d1())) {
                        c16861xdcf09668.f235265p0 = new hr3.ib(c16861xdcf09668);
                    } else {
                        java.lang.String d19 = z3Var2.d1();
                        if (d19 != null && d19.endsWith("@qr")) {
                            c16861xdcf09668.f235265p0 = new hr3.hb(c16861xdcf09668);
                        } else if (z3Var2.r2() && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(z3Var2.d1())) {
                            c16861xdcf09668.f235265p0 = new hr3.eb(c16861xdcf09668);
                        } else if (z28) {
                            c16861xdcf09668.f235265p0 = new hr3.rb(c16861xdcf09668);
                        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(z3Var2.d1())) {
                            c16861xdcf09668.f235265p0 = new hr3.ya(c16861xdcf09668);
                        } else {
                            c16861xdcf09668.f235265p0 = new hr3.eb(c16861xdcf09668);
                        }
                    }
                    c16861xdcf09668.O();
                    z18 = true;
                }
            }
            c16861xdcf09668.f235265p0 = new hr3.eb(c16861xdcf09668);
            c16861xdcf09668.O();
            z18 = true;
        }
        if (z18) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365207e).d(c16861xdcf09668, -1);
        }
        c19662x4f7a67f3.R(this.f365207e, c19662x4f7a67f3.f279313q);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.f365213n;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        c19662x4f7a67f3.T(false);
        c19662x4f7a67f3.V(false);
        c19662x4f7a67f3.O(this.f365213n, m17, true);
        c19662x4f7a67f3.Z(new hr3.i7(this));
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if (n17 != null && ((int) n17.E2) > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this.f365206d, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.class);
            intent.putExtra("Contact_User", n17.d1());
            android.content.Context context = this.f365206d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365207e).h("contact_info_footer_normal");
        if (c16861xdcf09668 == null) {
            return true;
        }
        hr3.va vaVar = c16861xdcf09668.f235265p0;
        if (vaVar != null) {
            vaVar.i();
        }
        l75.v0 v0Var = c16861xdcf09668.M1;
        synchronized (v0Var) {
            v0Var.f398504b.clear();
        }
        return true;
    }
}
