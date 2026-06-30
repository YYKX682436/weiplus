package com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI */
/* loaded from: classes15.dex */
public class ActivityC16925x87b5f55d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f236283y0 = 0;
    public fs3.y A;
    public android.view.View B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22629x662d2b8 D;
    public android.view.View E;
    public android.view.View F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16926xe775fb17 G;
    public android.app.ProgressDialog H;
    public android.widget.TextView I;
    public boolean K;
    public java.lang.Runnable L;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 M;
    public es3.a Q;
    public es3.a R;
    public int S;
    public android.view.animation.Animation T;
    public android.view.animation.AnimationSet U;
    public android.view.animation.Animation V;

    /* renamed from: d, reason: collision with root package name */
    public i11.e f236285d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236288g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236289h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 f236290i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f236291m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092 f236292n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f236293o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f236294p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f236296q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc f236297r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f236298s;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f236302w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236286e = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236299t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236300u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236301v = false;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f236303x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashMap f236305y = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f236306z = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public boolean f236284J = false;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 N = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fs3.k(this), false);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 P = new fs3.l(this);
    public final android.view.MenuItem.OnMenuItemClickListener W = new fs3.m(this);
    public final gs3.e X = new fs3.n(this);
    public final android.view.View.OnClickListener Y = new fs3.o(this);
    public final gs3.d Z = new fs3.p(this);

    /* renamed from: p0, reason: collision with root package name */
    public final i11.c f236295p0 = new fs3.r(this);

    /* renamed from: x0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f236304x0 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fs3.s(this), false);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d, int i17) {
        activityC16925x87b5f55d.H = db5.e1.Q(activityC16925x87b5f55d, activityC16925x87b5f55d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16925x87b5f55d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new fs3.f(activityC16925x87b5f55d));
        activityC16925x87b5f55d.Y6();
        java.lang.String str = activityC16925x87b5f55d.f236291m;
        java.lang.String str2 = activityC16925x87b5f55d.f236302w;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5 = activityC16925x87b5f55d.f236290i;
        c01.d9.e().g(new es3.a(i17, str, str2, c19621x752a03d5.f270899d, c19621x752a03d5.f270900e, c19621x752a03d5.f270901f, c19621x752a03d5.f270902g, c19621x752a03d5.f270903h, c19621x752a03d5.f270904i));
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC16925x87b5f55d.f236304x0;
        if (b4Var != null) {
            b4Var.d();
        }
        boolean z17 = activityC16925x87b5f55d.f236288g;
        fs3.u uVar = fs3.u.Loading;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "tryGetChatRoomUser location is no ready.");
            activityC16925x87b5f55d.Z6(uVar);
            if (b4Var != null) {
                b4Var.c(15000L, 15000L);
                return;
            }
            return;
        }
        if (activityC16925x87b5f55d.f236287f) {
            activityC16925x87b5f55d.Z6(uVar);
        }
        if (activityC16925x87b5f55d.f236288g && activityC16925x87b5f55d.f236287f && !activityC16925x87b5f55d.f236289h) {
            activityC16925x87b5f55d.f236289h = true;
            activityC16925x87b5f55d.f236287f = false;
            java.lang.String str = activityC16925x87b5f55d.f236291m;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5 = activityC16925x87b5f55d.f236290i;
            activityC16925x87b5f55d.R = new es3.a(0, str, "", c19621x752a03d5.f270899d, c19621x752a03d5.f270900e, c19621x752a03d5.f270901f, c19621x752a03d5.f270902g, c19621x752a03d5.f270903h, c19621x752a03d5.f270904i);
            c01.d9.e().g(activityC16925x87b5f55d.R);
        }
    }

    public final void V6() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f236285d = i11.h.e();
        c01.d9.e().a(vd1.j.f77288x366c91de, this);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(3, 10);
    }

    public final void W6() {
        i11.e eVar;
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308694i, new fs3.c(this)) || (eVar = this.f236285d) == null) {
            return;
        }
        ((i11.h) eVar).k(this.f236295p0, true);
    }

    public final void X6() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
        loadAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        loadAnimation.setAnimationListener(new fs3.i(this, loadAnimation2));
        loadAnimation2.setAnimationListener(new fs3.j(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092 c16928x94d2c092 = this.f236292n;
        if (c16928x94d2c092 != null) {
            c16928x94d2c092.startAnimation(loadAnimation);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc viewOnClickListenerC16927x3ad0e4cc = this.f236297r;
        if (viewOnClickListenerC16927x3ad0e4cc != null) {
            viewOnClickListenerC16927x3ad0e4cc.m67749xbfd5992c(false);
        }
    }

    public final void Y6() {
        this.f236301v = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.N;
        if (b4Var != null) {
            b4Var.d();
        }
        c01.d9.e().d(this.Q);
    }

    public final void Z6(fs3.u uVar) {
        if (this.f236296q != null) {
            int ordinal = uVar.ordinal();
            if (ordinal == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc viewOnClickListenerC16927x3ad0e4cc = this.f236297r;
                if (viewOnClickListenerC16927x3ad0e4cc != null) {
                    viewOnClickListenerC16927x3ad0e4cc.m67749xbfd5992c(true);
                }
                this.f236286e = false;
                this.f236294p.setVisibility(8);
                this.f236296q.setVisibility(8);
                return;
            }
            if (ordinal == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc viewOnClickListenerC16927x3ad0e4cc2 = this.f236297r;
                if (viewOnClickListenerC16927x3ad0e4cc2 != null) {
                    viewOnClickListenerC16927x3ad0e4cc2.m67749xbfd5992c(false);
                }
                this.f236296q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hqu);
                this.f236294p.setVisibility(0);
                this.f236296q.setVisibility(8);
                return;
            }
            if (ordinal == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc viewOnClickListenerC16927x3ad0e4cc3 = this.f236297r;
                if (viewOnClickListenerC16927x3ad0e4cc3 != null) {
                    viewOnClickListenerC16927x3ad0e4cc3.m67749xbfd5992c(true);
                }
                this.f236294p.setVisibility(8);
                this.f236296q.setVisibility(0);
                this.f236296q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hqr);
                X6();
                return;
            }
            if (ordinal != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "unknow statue tip");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc viewOnClickListenerC16927x3ad0e4cc4 = this.f236297r;
            if (viewOnClickListenerC16927x3ad0e4cc4 != null) {
                viewOnClickListenerC16927x3ad0e4cc4.m67749xbfd5992c(true);
            }
            this.f236294p.setVisibility(8);
            this.f236296q.setVisibility(0);
            this.f236296q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hqt);
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aaq;
    }

    /* renamed from: hideLoading */
    public void m67747xce38d9a() {
        android.app.ProgressDialog progressDialog = this.H;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.H.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(ir3.b.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cfx);
        mo54448x9c8c0d33(this.W);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561009a20));
        this.f236293o = findViewById(com.p314xaae8f345.mm.R.id.dpd);
        this.f236294p = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.dpc);
        this.f236296q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dpe);
        this.f236297r = (com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.ViewOnClickListenerC16927x3ad0e4cc) findViewById(com.p314xaae8f345.mm.R.id.dpb);
        this.f236298s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dpa);
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092 c16928x94d2c092 = (com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092) findViewById(com.p314xaae8f345.mm.R.id.dp9);
        this.f236292n = c16928x94d2c092;
        c16928x94d2c092.m67753xa1eddd2a(this.X);
        this.f236292n.requestFocus();
        this.f236297r.m67750xa96d6a48(this.Z);
        Z6(fs3.u.Normal);
        this.B = findViewById(com.p314xaae8f345.mm.R.id.f565823dp2);
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565825dp4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22629x662d2b8 c22629x662d2b8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22629x662d2b8) findViewById(com.p314xaae8f345.mm.R.id.f565824dp3);
        this.D = c22629x662d2b8;
        c22629x662d2b8.setVisibility(4);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565826dp5)).setOnClickListener(this.Y);
        this.E = findViewById(com.p314xaae8f345.mm.R.id.dp6);
        this.F = findViewById(com.p314xaae8f345.mm.R.id.dp7);
        this.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572713c92);
        this.G = (com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16926xe775fb17) findViewById(com.p314xaae8f345.mm.R.id.dpf);
        this.I = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dp_);
        this.G.m67748x3bd2d002(new fs3.d(this));
        fs3.y yVar = new fs3.y(this);
        this.A = yVar;
        this.D.setAdapter((android.widget.ListAdapter) yVar);
        this.A.a(this.f236303x);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30764) {
            if (intent == null) {
                finish();
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                finish();
                return;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78497xc03943d(true);
        super.onCreate(bundle);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.ACCESS_FINE_LOCATION", true)) {
                if (!((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                    c71.b.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()), 30764, true);
                    return;
                } else {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                    return;
                }
            }
        } else {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572716c95);
            fs3.t tVar = new fs3.t(this);
            ((sb0.f) jVar).getClass();
            boolean b17 = j35.u.b(this, "android.permission.ACCESS_FINE_LOCATION", 64, null, string, tVar, java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "summerper checkPermission checkCamera[%b]", java.lang.Boolean.valueOf(b17));
            if (!b17) {
                return;
            }
        }
        V6();
        if (com.p314xaae8f345.mm.ui.b4.c(this)) {
            mo78514x143f1b92().H0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561009a20));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.lang.Runnable runnable;
        c01.d9.e().q(vd1.j.f77288x366c91de, this);
        i11.e eVar = this.f236285d;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f236295p0);
        }
        if (!this.f236300u) {
            c01.d9.e().c(vd1.j.f77288x366c91de);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5 = this.f236290i;
            if (c19621x752a03d5 != null) {
                this.R = new es3.a(2, this.f236291m, "", c19621x752a03d5.f270899d, c19621x752a03d5.f270900e, c19621x752a03d5.f270901f, c19621x752a03d5.f270902g, c19621x752a03d5.f270903h, c19621x752a03d5.f270904i);
                c01.d9.e().g(this.R);
            }
        }
        if (this.f236284J) {
            Y6();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.M;
        if (n3Var != null && (runnable = this.L) != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        i11.e eVar = this.f236285d;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f236295p0);
        }
        if (this.f236284J) {
            Y6();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new fs3.a(this), new fs3.b(this));
        } else {
            V6();
            W6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        W6();
        if (this.f236284J) {
            this.f236301v = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.N;
            if (b4Var != null) {
                b4Var.c(0L, 0L);
            }
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 653) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd] unknow scene type");
            return;
        }
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(this, i17, i18, str)) {
            return;
        }
        es3.a aVar = (es3.a) m1Var;
        fs3.u uVar = fs3.u.ToSimple;
        fs3.u uVar2 = fs3.u.Unknow;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.N;
        int i19 = aVar.f337957f;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = aVar.f337956e;
        if (i19 != 0) {
            if (i19 == 3) {
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                if (i18 != -431) {
                    Z6(uVar2);
                    return;
                } else {
                    Z6(uVar);
                    this.f236286e = true;
                    return;
                }
            }
            if (i19 != 1) {
                m67747xce38d9a();
                return;
            }
            if (i17 == 0 && i18 == 0) {
                m67747xce38d9a();
                java.lang.String str2 = ((r45.xo0) oVar.f152244b.f152233a).f471824g;
                this.f236300u = true;
                finish();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", str2);
                intent.putExtra("enter_room_from_uri_jump", true);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, this);
                return;
            }
            if (i18 == -432 && !this.f236299t) {
                this.f236299t = true;
                this.P.mo50307xb9e94560(10002, 3000L);
                return;
            }
            if (i18 == -23) {
                m67747xce38d9a();
                db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572715c94), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new fs3.g(this));
                if (b4Var != null) {
                    b4Var.c(3000L, 3000L);
                    return;
                }
                return;
            }
            m67747xce38d9a();
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(mo55332x76847179(), null, null);
            } else {
                db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqt), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new fs3.g(this));
            }
            if (b4Var != null) {
                b4Var.c(3000L, 3000L);
                return;
            }
            return;
        }
        this.f236289h = false;
        if (this.f236284J) {
            if (b4Var != null) {
                b4Var.c(3000L, 3000L);
            }
            if (i17 == 0 && i18 == 0) {
                java.util.LinkedList linkedList = ((r45.xo0) oVar.f152244b.f152233a).f471823f;
                if (this.M == null) {
                    this.M = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FacingCreateChatRoomAllInOneUI");
                }
                java.lang.Runnable runnable = this.L;
                if (runnable != null) {
                    this.M.mo50300x3fa464aa(runnable);
                }
                fs3.h hVar = new fs3.h(this, linkedList);
                this.L = hVar;
                this.M.mo50293x3498a0(hVar);
                this.f236302w = ((r45.xo0) oVar.f152244b.f152233a).f471821d;
                return;
            }
            return;
        }
        if (i17 != 0 || i18 != 0) {
            if (i18 == -431) {
                this.f236286e = true;
                Z6(uVar);
                return;
            } else {
                this.f236286e = true;
                Z6(uVar2);
                return;
            }
        }
        Z6(fs3.u.Normal);
        this.S = this.f236298s.getHeight();
        this.T = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559312b8);
        this.V = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559302ay);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        this.U = animationSet;
        animationSet.addAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559402dt));
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, -this.S);
        translateAnimation.setDuration(300L);
        this.U.addAnimation(translateAnimation);
        this.T.setDuration(200L);
        this.U.setDuration(300L);
        this.V.setDuration(300L);
        this.T.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.U.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.V.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.U.setFillAfter(true);
        translateAnimation.setFillAfter(true);
        this.U.setAnimationListener(new fs3.e(this));
        this.f236292n.setVisibility(4);
        this.f236292n.setAnimation(translateAnimation);
        this.f236297r.startAnimation(this.T);
        this.f236293o.startAnimation(this.T);
        this.f236298s.startAnimation(this.T);
        this.E.startAnimation(this.V);
        this.B.startAnimation(this.U);
        android.view.View view = this.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI", "switchToDetailUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI", "switchToDetailUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236297r.setVisibility(8);
        this.f236298s.setVisibility(8);
        this.f236284J = true;
        this.f236301v = false;
        if (b4Var != null) {
            b4Var.c(0L, 0L);
        }
    }
}
