package com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui;

@db5.a(m123858x6ac9171 = 131)
/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI */
/* loaded from: classes5.dex */
public class ActivityC16488xbf7e6679 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f230072v = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f230073d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f230074e;

    /* renamed from: f, reason: collision with root package name */
    public int f230075f;

    /* renamed from: g, reason: collision with root package name */
    public int f230076g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f230077h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f230078i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f230079m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f230080n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f230081o;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f230085s;

    /* renamed from: t, reason: collision with root package name */
    public kf3.u f230086t;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f230082p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f230083q = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f230084r = false;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u f230087u = new kf3.b2(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679) {
        activityC16488xbf7e6679.getClass();
        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
        java.lang.String title = activityC16488xbf7e6679.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m67, java.lang.Integer.valueOf(((java.util.ArrayList) activityC16488xbf7e6679.f230073d).size()));
        java.util.List memberList = activityC16488xbf7e6679.f230073d;
        ((qd0.u0) g1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberList, "memberList");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", title);
        intent.putExtra("custom_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(memberList, ","));
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        pf5.j0.a(intent, cj5.b.class);
        pf5.j0.a(intent, cj5.o0.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = activityC16488xbf7e6679;
        cVar.f(false);
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.g();
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679, java.lang.String str, int i17) {
        activityC16488xbf7e6679.getClass();
        if3.y yVar = new if3.y();
        yVar.f372750m = activityC16488xbf7e6679.f230074e;
        yVar.f372751n = ((java.util.ArrayList) activityC16488xbf7e6679.f230073d).size();
        yVar.f372748h = str;
        yVar.f372753p = i17;
        yVar.f372758u = 2;
        yVar.f372752o = 43;
        if3.g0 g0Var = new if3.g0(yVar, activityC16488xbf7e6679.f230084r, 0);
        c01.d9.e().g(g0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16488xbf7e6679.f230082p;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        activityC16488xbf7e6679.f230082p.setOnCancelListener(new kf3.v1(activityC16488xbf7e6679, g0Var));
    }

    public final void V6(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            return;
        }
        boolean a17 = c01.z1.a(stringExtra, null, intent.getBooleanExtra("CropImage_Compress_Img", true));
        if3.y m07 = if3.k0.Ai().m0(stringExtra, this.f230074e, ((java.util.ArrayList) this.f230073d).size(), a17 ? 1 : 0);
        if (m07 == null) {
            return;
        }
        if3.g0 g0Var = new if3.g0(m07, this.f230084r, a17 ? 1 : 0);
        c01.d9.e().g(g0Var);
        this.f230082p = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new kf3.e2(this, g0Var));
    }

    public final void W6(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("VideoRecorder_FileName");
        int intExtra = intent.getIntExtra("VideoRecorder_VideoLength", 0);
        if3.y yVar = new if3.y();
        yVar.f372750m = this.f230074e;
        yVar.f372751n = ((java.util.ArrayList) this.f230073d).size();
        yVar.f372748h = stringExtra;
        yVar.f372753p = intExtra;
        yVar.f372752o = 43;
        if3.g0 g0Var = new if3.g0(yVar, this.f230084r, 0);
        c01.d9.e().g(g0Var);
        this.f230082p = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new kf3.d2(this, g0Var));
    }

    public final android.text.SpannableString X6(int i17) {
        if (this.f230073d == null) {
            return new android.text.SpannableString("");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f230073d).size(); i18++) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f230073d).get(i18);
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (i18 == ((java.util.ArrayList) this.f230073d).size() - 1) {
                sb6.append(e17);
            } else {
                sb6.append(e17 + ",  ");
            }
        }
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, sb6.toString(), i17);
    }

    public final void Y6(boolean z17, java.lang.String str) {
        int i17;
        int i18;
        int i19;
        if (z17) {
            i17 = 246;
            i18 = 247;
            i19 = 255;
        } else {
            i17 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
            i18 = 234;
            i19 = 242;
        }
        int k17 = (int) (com.p314xaae8f345.mm.vfs.w6.k(str) / 1024);
        int[] iArr = {512, 1024, 2048, 5120, 8192, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 15360, 20480};
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(k17, iArr, i18, i19));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(106L, q17, 1L, false);
        g0Var2.mo68477x336bdfd8(106L, i17, 1L, false);
    }

    public final void Z6(android.content.Intent intent) {
        t21.l0 l0Var = new t21.l0();
        this.f230082p = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new kf3.p1(this, l0Var));
        l0Var.a(this, intent, this.f230074e, false, new kf3.u1(this));
    }

    public final void a7(java.lang.String str, int i17) {
        this.f230082p = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new kf3.i1(this, new t21.l0()));
        s75.d.b(new kf3.m1(this, str, i17), "MassSend_Remux");
    }

    public final void b7(android.content.Intent intent) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(this)) {
            Z6(intent);
        } else {
            db5.e1.n(this, com.p314xaae8f345.mm.R.C30867xcad56011.k77, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new kf3.n1(this, intent), new kf3.o1(this));
        }
    }

    public void c7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 1, 0, false);
        z2Var.m(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya));
        kf3.d1 d1Var = new kf3.d1(this, z2Var);
        kf3.e1 e1Var = new kf3.e1(this, z2Var, p3Var);
        z2Var.D = d1Var;
        z2Var.E = e1Var;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dnc, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.r3y);
        textView.setText(X6((int) textView.getTextSize()));
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.r3x);
        if (((java.util.ArrayList) this.f230073d).size() > 1) {
            textView2.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574019m65, java.lang.Integer.valueOf(((java.util.ArrayList) this.f230073d).size())));
        } else {
            textView2.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m66));
        }
        com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        inflate.findViewById(com.p314xaae8f345.mm.R.id.r2c).setOnClickListener(new kf3.f1(this));
        z2Var.k(inflate, 0, 0);
        z2Var.C();
    }

    public final void d7() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String m17 = lp0.b.m();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        ((ub0.r) oVar).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(this, m17, str, 2)) {
            return;
        }
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.r3z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570797bx4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gtc);
        this.f230079m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jcu);
        this.f230080n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jct);
        android.widget.TextView textView = this.f230079m;
        textView.setText(X6((int) textView.getTextSize()));
        this.f230080n.setText(getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571216u, ((java.util.ArrayList) this.f230073d).size(), java.lang.Integer.valueOf(((java.util.ArrayList) this.f230073d).size())));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jlt);
        if (findViewById != null) {
            com.p314xaae8f345.mm.ui.a4.f(findViewById);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33) findViewById(com.p314xaae8f345.mm.R.id.f567625k52);
        this.f230077h = c19666xfd6e2f33;
        c19666xfd6e2f33.m75476x13de9191(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16487x2da47f06 c16487x2da47f06 = (com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16487x2da47f06) findViewById(com.p314xaae8f345.mm.R.id.jcy);
        c16487x2da47f06.m66588x5383cac2(this.f230077h.m75460x74f5b04e());
        c16487x2da47f06.m66587xa3015915(this.f230077h);
        this.f230086t = new kf3.u(this, this.f230077h, this.f230074e, this.f230073d, this.f230084r);
        this.f230077h.m75513x3d7b245d(false);
        this.f230077h.m75488x19c2abd1(this.f230086t);
        this.f230077h.m75511x85ac27b6(new kf3.q2(this.f230086t));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = this.f230077h;
        int intValue = ((java.lang.Integer) c01.d9.b().p().l(18, -1)).intValue();
        if (intValue == -1) {
            intValue = 1;
        }
        c19666xfd6e2f332.m75502x764d6925(intValue);
        this.f230077h.m75517x66ad9b78("masssendapp");
        this.f230077h.f271526h.x();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = this.f230077h.f271526h;
        c19664x489a3083.C.f271700y.f272299a = false;
        c19664x489a3083.o();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a30832 = this.f230077h.f271526h;
        c19664x489a30832.C.f271701z.f272299a = false;
        c19664x489a30832.o();
        this.f230077h.O();
        this.f230077h.m75443xe6828c7b().mo75348x625a7311(false);
        if (((java.lang.Boolean) c01.d9.b().p().l(66832, java.lang.Boolean.FALSE)).booleanValue()) {
            this.f230077h.f0();
            this.f230077h.l0();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f333 = this.f230077h;
        kf3.a2 a2Var = new kf3.a2(this);
        c19666xfd6e2f333.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.g5 g5Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.g5(c19666xfd6e2f333, a2Var);
        c19666xfd6e2f333.f271530h5 = g5Var;
        c19666xfd6e2f333.f271554m.mo81552xeb238c3a(g5Var);
        this.f230077h.P();
        this.f230077h.Q();
        this.f230077h.S();
        this.f230077h.c0(true, true);
        this.f230077h.X(true);
        this.f230077h.M(true);
        this.f230077h.m75477x9496deb9(this.f230087u);
        this.f230077h.a0(u11.c.g());
        this.f230077h.J();
        this.f230077h.L();
        this.f230077h.N();
        this.f230077h.K();
        this.f230077h.R();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mass_send_emoji, false)) {
            this.f230077h.v0();
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mass_send_finder, false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a30833 = this.f230077h.f271526h;
        c19664x489a30833.C.E.f272299a = !(!fj6);
        c19664x489a30833.o();
        boolean z17 = c19664x489a30833.C.E.f272299a;
        mo54448x9c8c0d33(new kf3.q1(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jcd)).setOnClickListener(new kf3.x1(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.r3z);
        this.f230081o = findViewById2;
        findViewById2.setOnTouchListener(new kf3.y1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:" + i17);
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            return;
        }
        if (i17 > 0 && i17 <= 10) {
            c7(new kf3.f2(this, i17, intent));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] split;
        super.onCreate(bundle);
        c01.d9.e().a(193, this);
        this.f230084r = getIntent().getBooleanExtra("mass_send_again", false);
        this.f230074e = getIntent().getStringExtra("mass_send_contact_list");
        this.f230075f = getIntent().getIntExtra("mass_send_contact_chatroom", 0);
        this.f230076g = getIntent().getIntExtra("mass_send_contact_label", 0);
        java.lang.String str = this.f230074e;
        this.f230073d = new java.util.ArrayList();
        if (str != null && !str.equals("") && (split = str.split(";")) != null && split.length > 0) {
            this.f230073d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(split);
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(193, this);
        super.onDestroy();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f230077h;
        if (c19666xfd6e2f33 != null) {
            c19666xfd6e2f33.G();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || !this.f230077h.K0()) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f230077h.m75483x4f8b3b49(8);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        this.f230077h.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.Pause);
        this.f230077h.Q0();
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] == 0) {
            d7();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new kf3.c2(this), null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f230077h;
        if (c19666xfd6e2f33 != null) {
            c19666xfd6e2f33.m75500x1f95af65(this.f230083q);
            this.f230077h.R0(mo55332x76847179(), this);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f230082p;
        if (u3Var2 != null) {
            u3Var2.dismiss();
            this.f230082p = null;
        }
        kf3.u uVar = this.f230086t;
        if (uVar != null && (u3Var = uVar.f388974f) != null) {
            u3Var.dismiss();
            uVar.f388974f = null;
        }
        if (i17 != 0 || i18 != 0) {
            if (i17 == 4 && i18 == -24) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.gt8, 0).show();
                return;
            }
            if (i17 == 2 || i17 == 1 || i17 == 3) {
                this.f230077h.m75500x1f95af65(this.f230083q);
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
            com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4);
            if (i18 != -71) {
                if (i18 != -34) {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.iil, 0).show();
                    return;
                } else {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.gt7, 0).show();
                    return;
                }
            }
            int c17 = if3.k0.Bi().c();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
            u1Var.u(getString(com.p314xaae8f345.mm.R.C30867xcad56011.m69, java.lang.Integer.valueOf(c17)));
            u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.l(new kf3.w1(this));
            u1Var.q(false);
            return;
        }
        r45.si4 si4Var = (r45.si4) ((if3.g0) m1Var).f372704e.f152244b.f152233a;
        java.util.LinkedList linkedList = si4Var.f467298i;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "[dealInsertTipSysMsg] Fail: resp.NewMsgIdForNewXmlList null");
        } else if (linkedList.size() != si4Var.f467297h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "[dealInsertTipSysMsg] Fail: resp.NewMsgIdForNewXmlList.size()[%s] != resp.NewMsgIdForNewXmlCount[%s]", java.lang.Integer.valueOf(si4Var.f467298i.size()), java.lang.Integer.valueOf(si4Var.f467297h));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            long j17 = si4Var.f467296g;
            java.util.Iterator it = si4Var.f467298i.iterator();
            while (it.hasNext()) {
                r45.vv4 vv4Var = (r45.vv4) it.next();
                hashMap.put(vv4Var.f470139d, java.lang.Long.valueOf(vv4Var.f470140e));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSysTipHelper", "insertSysTip talkerMap:" + hashMap + ", masMsgId:" + j17);
            ((ku5.t0) ku5.t0.f394148d).g(new if3.d0(hashMap, j17));
        }
        if3.y s07 = if3.k0.Ai().s0(java.lang.Long.toString(si4Var.f467296g));
        int i19 = s07 != null ? s07.f372752o : 0;
        int size = ((java.util.ArrayList) this.f230073d).size();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("mass_send_msg_type", java.lang.Integer.valueOf(i19));
        hashMap2.put("mass_send_users_from_contact", java.lang.Integer.valueOf((size - this.f230075f) - this.f230076g));
        hashMap2.put("mass_send_users_from_room", java.lang.Integer.valueOf(this.f230075f));
        hashMap2.put("mass_send_users_from_tags", java.lang.Integer.valueOf(this.f230076g));
        hashMap2.put("mass_send_to_list_count", java.lang.Integer.valueOf(size));
        hashMap2.put("mass_send_source", java.lang.Integer.valueOf(this.f230084r ? 2 : 1));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("mass_send_success", hashMap2, 31081);
        this.f230083q = "";
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc.class);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
