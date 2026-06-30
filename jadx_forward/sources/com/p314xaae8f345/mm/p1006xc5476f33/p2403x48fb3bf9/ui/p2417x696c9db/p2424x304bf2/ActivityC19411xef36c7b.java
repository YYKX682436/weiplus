package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19411xef36c7b extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa implements sx4.z {
    public static final /* synthetic */ int S3 = 0;
    public kh0.h C3;
    public java.lang.String D3;
    public final java.util.Map E3;
    public java.lang.String F3;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19413xc8846f1c G3;
    public boolean H3;
    public boolean I3;
    public com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc J3;
    public long K3;
    public sx4.d0 L3;
    public android.view.ViewGroup M3;
    public boolean N3;
    public final java.lang.Object O3;
    public final sx4.q0 P3;
    public boolean Q3;
    public boolean R3;

    public ActivityC19411xef36c7b() {
        new java.util.HashMap();
        this.D3 = null;
        this.E3 = new java.util.HashMap();
        this.N3 = false;
        this.O3 = new java.lang.Object();
        this.P3 = new sx4.q0(this, null);
        this.Q3 = false;
        this.R3 = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void B8() {
        m53.i5 p17;
        int i17;
        super.B8();
        this.H3 = true;
        if ((this.Z1 == null && this.Y1 == 0) && (p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.p()) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.f405328d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.f405330f)) {
            try {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    this.Y1 = android.graphics.Color.parseColor(p17.f405330f);
                } else {
                    this.Y1 = android.graphics.Color.parseColor(p17.f405328d);
                }
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.GameWebViewUI", "parse color: " + e17.getMessage());
            }
            this.Z1 = p17.f405329e;
            if (!fp.h.c(21) || (i17 = this.Y1) == 0) {
                P8(S6());
            } else {
                mo64405x4dab7448(i17);
            }
            a8(true);
        }
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("game_check_float", false)) {
            int intExtra = intent.getIntExtra("game_sourceScene", 0);
            java.lang.String stringExtra = intent.getStringExtra("game_transparent_float_url");
            this.D3 = stringExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("game_check_float", true);
                intent2.putExtra("game_sourceScene", intExtra);
                j45.l.j(this, "game", ".ui.GameCenterUI", intent2, null);
                return;
            }
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("game_sourceScene", intExtra);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = this.K1;
                if (v0Var != null) {
                    v0Var.i(91, bundle);
                }
                if (this.A3 == null) {
                    this.A3 = new sx4.q(this, this.f265404y, this.D3);
                }
                sx4.q qVar = this.A3;
                java.lang.String str = this.D3;
                qVar.f495179j = str;
                ((vz4.x) qVar.f495177h).e(str, false, false);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = qVar.f495172c;
                if (c22633x83752a59 != null && c22633x83752a59.getParent() == null) {
                    qVar.f495173d.addView(c22633x83752a59, new android.view.ViewGroup.LayoutParams(-1, -1));
                }
                if (c22633x83752a59 != null && qVar.f495178i != null) {
                    c22633x83752a59.post(new sx4.i(qVar, str));
                }
                this.D3 = null;
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public synchronized com.p314xaae8f345.p3210x3857dc.s0 L7() {
        if (this.f265402x1 == null) {
            this.f265402x1 = new sx4.n0(this);
        }
        return this.f265402x1;
    }

    @Override // sx4.z
    public java.util.Map M1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(21, m9());
        hashMap.put(22, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put(23, java.lang.String.valueOf(y7.c.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        java.lang.String F7 = F7();
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            hashMap.put(24, fp.s0.b(F7 == null ? "" : F7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        hashMap.put(25, java.lang.Boolean.valueOf(((vz4.x) this.C3).d(F7)));
        hashMap.put(26, 0);
        hashMap.put(27, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = ((vz4.x) this.C3).f523291f;
        hashMap.put(28, c19543x781c5eda != null ? c19543x781c5eda.f269909f : "");
        ((vz4.x) this.C3).getClass();
        hashMap.put(29, vz4.b.a());
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void S7(android.os.Bundle bundle) {
        super.S7(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void X8() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f265382q2;
        if (c6Var.F) {
            c6Var.y();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19413xc8846f1c c19413xc8846f1c = this.G3;
        if (c19413xc8846f1c == null || !c19413xc8846f1c.f266299e) {
            super.X8();
            return;
        }
        tx4.l lVar = new tx4.l(mo55332x76847179());
        sx4.h0 h0Var = new sx4.h0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 c19414xef0feed6 = lVar.f504229h;
        if (c19414xef0feed6 != null) {
            c19414xef0feed6.m74483xa30ef135(h0Var);
        }
        lVar.f504227f = new sx4.i0(this);
        if (this.B) {
            lVar.f504234p = true;
            lVar.f504235q = true;
        } else {
            lVar.f504234p = false;
            lVar.f504235q = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad c19492xd515f0ad = this.H;
        if (c19492xd515f0ad == null || !c19492xd515f0ad.isShown()) {
            mo48674x36654fab();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sx4.k0(this, lVar), 100L);
        } else {
            this.H.a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sx4.j0(this, lVar), 100L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public int Y8() {
        return super.Y8();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void Z7() {
        super.Z7();
        java.lang.String stringExtra = getIntent().getStringExtra("game_hv_menu_appid");
        this.F3 = stringExtra;
        if (!this.B || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19489x7d57af1f c19489x7d57af1f = this.f265408z;
        if (c19489x7d57af1f != null) {
            c19489x7d57af1f.setVisibility(8);
        }
        this.G3.a(this.f265400x, new sx4.l0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void a8(boolean z17) {
        super.a8(z17);
        h7(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: addIconOptionMenu */
    public void mo74404x84f07bce(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (this.H3) {
            super.mo74404x84f07bce(i17, i18, onMenuItemClickListener);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e76 = super.e7();
        e76.E(this.P3);
        return e76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        this.J3.A = java.lang.System.currentTimeMillis();
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        new android.graphics.drawable.ColorDrawable(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560125bq));
        new android.graphics.drawable.ColorDrawable(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560125bq));
        this.J3.B = java.lang.System.currentTimeMillis();
        this.L3.f495117c = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean l7() {
        getIntent().putExtra("minimize_secene", 2);
        return true;
    }

    public java.lang.String m9() {
        return (hashCode() & Integer.MAX_VALUE) + "_" + (F7().hashCode() & Integer.MAX_VALUE);
    }

    public kh0.h n9() {
        return this.C3;
    }

    public void o9() {
        this.L3.f495122h = java.lang.System.currentTimeMillis();
        this.J3.f149715o = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("rawUrl");
        if (getIntent().getBooleanExtra("shouldCheckLimitedMode", true) && ((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
            stringExtra = ((qk.s6) gm0.j1.s(qk.s6.class)).Hg();
            getIntent().putExtra("rawUrl", stringExtra);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.lang.String queryParameter = android.net.Uri.parse(stringExtra).getQueryParameter("nav_color");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                try {
                    getIntent().putExtra("customize_status_bar_color", android.graphics.Color.parseColor("#" + queryParameter));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.GameWebViewUI", "rawUrl rid:%s, pkgId:%s", kh0.i.b(stringExtra), kh0.i.a(stringExtra));
        if (getIntent().getLongExtra("gamecenterui_createtime", 0L) > 0) {
            this.J3 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(stringExtra);
        } else {
            this.J3 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.a(stringExtra);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.J3;
        c10723x8ab106bc.f149707d = stringExtra;
        c10723x8ab106bc.f149708e = m9();
        this.J3.f149719s = getIntent().getLongExtra("gamecenterui_createtime", 0L);
        this.J3.f149720t = getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis());
        this.J3.f149718r = getIntent().getLongExtra("start_time", this.J3.f149720t);
        this.J3.f149725y = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc2 = this.J3;
        c10723x8ab106bc2.f149712i = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.GameWebViewUI", "onCreate, startTime: %d, gameCenterUICreate: %d, startWebUI: %d,webUICreate: %d", java.lang.Long.valueOf(c10723x8ab106bc2.f149718r), java.lang.Long.valueOf(this.J3.f149719s), java.lang.Long.valueOf(this.J3.f149720t), java.lang.Long.valueOf(this.J3.f149725y));
        sx4.d0 a17 = sx4.d0.a(stringExtra);
        this.L3 = a17;
        a17.f495116b = java.lang.System.currentTimeMillis();
        this.L3.f495124j = this.J3.f149718r;
        ((jh0.v) ((kh0.g) i95.n0.c(kh0.g.class))).getClass();
        this.C3 = new vz4.x();
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f265348f;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo120153xd15cf999().A(1);
        }
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("disable_progress_bar", false)) {
            this.f265367m.f278873m = false;
            android.widget.ProgressBar progressBar = this.f265376p;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
        ((vz4.x) this.C3).f523297l = new sx4.g0(this, stringExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("open_game_float", false);
        this.I3 = booleanExtra;
        if (((vz4.x) this.C3).e(stringExtra, !booleanExtra, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.GameWebViewUI", "current page use wepkg");
            android.widget.ProgressBar progressBar2 = this.f265376p;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        }
        this.G3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19413xc8846f1c(mo55332x76847179());
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.GameWebViewUI)).Rj(this, iy1.a.Game);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.L1;
        sx4.q0 q0Var = this.P3;
        e3Var.M0(q0Var);
        this.L1.K0(q0Var.f495186b);
        super.onDestroy();
        ((vz4.x) this.C3).g(this.I3);
        this.J3.f149706J = java.lang.System.currentTimeMillis();
        jj0.a.a().e(this.J3);
        sx4.y.b(m9(), this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.J3.I += java.lang.System.currentTimeMillis() - this.K3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.J3.f149726z == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.GameWebViewUI", "onResume: " + currentTimeMillis);
            this.J3.f149726z = currentTimeMillis;
        }
        this.K3 = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void p8(java.lang.String str, java.util.Map map, boolean z17) {
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.J3;
        if (c10723x8ab106bc.D == 0) {
            c10723x8ab106bc.D = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = ((vz4.x) this.C3).f523291f;
        if (c19543x781c5eda == null || !c19543x781c5eda.f269911h) {
            super.p8(str, map, false);
        } else {
            super.p8(str, map, z17);
        }
    }

    public void p9() {
        this.L3.f495123i = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        if (mo44431x663c095b() != -1) {
            setRequestedOrientation(mo44431x663c095b());
            return;
        }
        boolean z17 = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4).getBoolean("settings_landscape_mode", false);
        this.f39316x876ccafe = z17;
        if (z17) {
            setRequestedOrientation(2);
        } else {
            setRequestedOrientation(1);
        }
    }

    @Override // sx4.z
    public java.util.Map w5() {
        java.util.HashMap hashMap = new java.util.HashMap();
        sx4.d0 c17 = sx4.d0.c(F7());
        if (c17 != null) {
            hashMap.put(30, java.lang.Long.valueOf(c17.f495117c - c17.f495116b));
            hashMap.put(31, java.lang.Long.valueOf(c17.f495118d - c17.f495116b));
            hashMap.put(32, java.lang.Long.valueOf(c17.f495119e - c17.f495118d));
            hashMap.put(33, java.lang.Long.valueOf(c17.f495121g - c17.f495120f));
            hashMap.put(34, java.lang.Long.valueOf(c17.f495123i - c17.f495122h));
            hashMap.put(45, java.lang.Long.valueOf(c17.f495124j));
            hashMap.put(70, java.lang.Long.valueOf(c17.f495116b - c17.f495124j));
        }
        hashMap.put(49, 0);
        return hashMap;
    }
}
