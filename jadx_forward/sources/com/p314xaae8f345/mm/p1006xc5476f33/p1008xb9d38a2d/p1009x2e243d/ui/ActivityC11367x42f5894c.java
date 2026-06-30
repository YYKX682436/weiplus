package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI */
/* loaded from: classes5.dex */
public class ActivityC11367x42f5894c extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f154583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154584f;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f154586h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154587i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f154588m;

    /* renamed from: o, reason: collision with root package name */
    public int f154590o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f154591p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e f154592q;

    /* renamed from: r, reason: collision with root package name */
    public int f154593r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f154594s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f154595t;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f154585g = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f154589n = 15;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569737ke;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154584f = (java.lang.String) gm0.j1.u().c().l(4097, null);
        this.f154583e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.aid);
        this.f154586h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aic);
        this.f154587i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ai8);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aia);
        java.lang.String str = this.f154584f;
        if (str == null || str.equals("")) {
            this.f154584f = (java.lang.String) gm0.j1.u().c().l(6, null);
        }
        java.lang.String str2 = this.f154584f;
        if (str2 != null && str2.length() > 0) {
            this.f154586h.setVisibility(0);
            this.f154586h.setText(this.f154584f);
        }
        this.f154583e.setFilters(new android.text.InputFilter[]{new p61.r2(this)});
        this.f154588m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aif);
        button.setVisibility(8);
        this.f154587i.setText(getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571217v, this.f154589n.intValue(), this.f154589n));
        if (this.f154591p == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new p61.w2(this), true);
            this.f154591p = b4Var;
            b4Var.c(1000L, 1000L);
        }
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new p61.t2(this));
        mo54448x9c8c0d33(new p61.u2(this));
        this.f154588m.setVisibility(u11.c.b(this.f154584f) ? 0 : 8);
        this.f154588m.setOnClickListener(new p61.v2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(132, this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572252ah4);
        this.f154592q = (com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f154593r = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f154594s = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
        this.f154595t = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
        this.f154590o = getIntent().getIntExtra("bind_scene", 0);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(132, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobileVerifyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        r61.e1 e1Var = (r61.e1) m1Var;
        if (e1Var.I() != 2) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f154585g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f154585g = null;
        }
        boolean z17 = true;
        if (i17 != 0 || i18 != 0) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            if (!com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
                if (i18 == -214) {
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        b17.c(this, null, null);
                    }
                } else if (i18 == -43) {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572246ag4, 0).show();
                } else if (i18 != -41) {
                    switch (i18) {
                        case -36:
                            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.ag9, 0).show();
                            break;
                        case -35:
                            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572247ag5, 0).show();
                            break;
                        case -34:
                            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.ag7, 0).show();
                            break;
                        case -33:
                            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho, null);
                            break;
                        case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73894x389a6e4 /* -32 */:
                            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.ahj, com.p314xaae8f345.mm.R.C30867xcad56011.aho, null);
                            break;
                        default:
                            z17 = false;
                            break;
                    }
                } else {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.ag6, 0).show();
                }
            }
            if (z17) {
                return;
            }
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            if (com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
                return;
            }
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        if (e1Var.I() == 2) {
            int i19 = this.f154590o;
            if (i19 == 1) {
                if (!((c01.z1.o() & 16384) != 0)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab c6199x6e6a85ab = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab();
                    am.zz zzVar = c6199x6e6a85ab.f136453g;
                    zzVar.f90150a = true;
                    zzVar.f90151b = true;
                    c6199x6e6a85ab.e();
                }
                W6(1);
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
                j45.l.j(this, "account", ".security.ui.MySafeDeviceListUI", intent, null);
                return;
            }
            if (i19 == 6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685.Z6(this, !this.f154594s, !this.f154595t);
                U6(-1);
                return;
            }
            if (i19 == 0 || i19 == 3) {
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                x51.e.a(x51.e.f533523b);
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685.class);
            intent2.putExtra("kstyle_bind_wording", this.f154592q);
            intent2.putExtra("kstyle_bind_recommend_show", this.f154593r);
            intent2.putExtra("Kfind_friend_by_mobile_flag", this.f154594s);
            intent2.putExtra("Krecom_friends_by_mobile_flag", this.f154595t);
            intent2.putExtra("bind_scene", this.f154590o);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f154591p;
        if (b4Var != null && !b4Var.e()) {
            this.f154591p.d();
        }
        this.f154591p = null;
        super.onStop();
    }
}
