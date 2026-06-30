package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI */
/* loaded from: classes9.dex */
public class ViewOnLayoutChangeListenerC19048x56ebf0e9 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f260415u = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f260416d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260417e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260418f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260419g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f260420h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f260421i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f260422m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f260423n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup.MarginLayoutParams f260424o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup.MarginLayoutParams f260425p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f260426q;

    /* renamed from: r, reason: collision with root package name */
    public int f260427r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f260428s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f260429t = false;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveIdentityText：" + viewOnLayoutChangeListenerC19048x56ebf0e9.f260429t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveNameText：" + viewOnLayoutChangeListenerC19048x56ebf0e9.f260428s);
        if (viewOnLayoutChangeListenerC19048x56ebf0e9.f260429t && viewOnLayoutChangeListenerC19048x56ebf0e9.f260428s) {
            viewOnLayoutChangeListenerC19048x56ebf0e9.f260420h.setEnabled(true);
        } else {
            viewOnLayoutChangeListenerC19048x56ebf0e9.f260420h.setEnabled(false);
        }
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " setChangParams()");
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p0(this), 100L);
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "updateView");
        int i17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67042x8a2885a8;
        java.lang.String str = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67041x8a2570f9;
        this.f260416d.setHint(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kjl, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67066xeae73197)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletForgotPwdVerifyIdUI", "creName is null");
        } else {
            this.f260417e.setText(str);
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "no need tenpay keyboard");
        } else {
            qp5.p.e(this.f260419g);
            m83126x8f91b80(this.f260419g, 1, false, false, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        fs4.g gVar;
        super.finish();
        getIntent().putExtra("process_id", fs4.h.class.hashCode());
        fs4.h hVar = (fs4.h) com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        if (hVar == null || (gVar = hVar.f347874d) == null) {
            return;
        }
        gVar.run(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d6m;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "onCreate");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        m78577x7b07e1a8(8);
        this.f260426q = findViewById(com.p314xaae8f345.mm.R.id.m7o);
        this.f260427r = getWindowManager().getDefaultDisplay().getHeight() / 3;
        this.f260426q.addOnLayoutChangeListener(this);
        if (!m83105x7498fe14().getBoolean("key_is_force_bind", false)) {
            m83098x5406100e(new ss4.e0(null, 6));
            mo67598xf0aced2e(4);
        }
        this.f260416d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.k3m);
        this.f260417e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566837h84);
        this.f260419g = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f566836h83);
        this.f260420h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f260421i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ld8);
        this.f260422m = findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f260418f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f260423n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.k3o);
        this.f260419g.setEnabled(false);
        this.f260419g.setFocusable(false);
        this.f260420h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.n0(this));
        this.f260421i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o0(this));
        W6();
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.s0(this));
        this.f260416d.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t0(this));
        this.f260416d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q0(this));
        this.f260419g.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.r0(this));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i38 != 0 && i27 != 0 && i38 - i27 > this.f260427r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " up");
            V6();
        } else {
            if (i38 == 0 || i27 == 0 || i27 - i38 <= this.f260427r) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " down");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " errCode: %s errMsg: %s  scene: %s", java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.e0) {
                W6();
                mo67598xf0aced2e(0);
            } else if (m1Var instanceof gs4.w) {
                gs4.w wVar = (gs4.w) m1Var;
                m83105x7498fe14().putInt("key_is_support_face", wVar.f356674g);
                m83105x7498fe14().putInt("key_face_action_scene", wVar.f356675h);
                m83105x7498fe14().putString("key_face_action_package", wVar.f356676i);
                m83105x7498fe14().putString("key_face_action_package_sign", wVar.f356678n);
                if (wVar.f356677m == 1) {
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
                    if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().f(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "already install cert, go to next process");
                        m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "checkInstallCert, crt not installed");
                        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295514f;
                        m83096xe7b1ccf7(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0(wVar.f356671d, wVar.f356672e, wVar.f356673f, iVar));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "verify realname info finish, go to next process");
                    m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
                }
            } else if (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "install cert finish, go to next process");
                m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
            }
        }
        return false;
    }
}
