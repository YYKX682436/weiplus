package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass */
/* loaded from: classes14.dex */
public class ActivityC11418xe15aceb2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f154884t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f154885d;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154889h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154890i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f154891m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f154892n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154893o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154894p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f154895q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154896r;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f154886e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f154887f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f154888g = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f154897s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.LoginIndepPass.1
        {
            this.f39173x3fe91575 = -1399051904;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370) {
            am.gj gjVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x465423702 = c5690x46542370;
            if (c5690x465423702 == null || (gjVar = c5690x465423702.f136016g) == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginIndepPass", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginIndepPass$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public final void T6() {
        java.lang.String obj = this.f154885d.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154889h)) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k6d, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        if (obj.equals("")) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k67, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        mo48674x36654fab();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = new com.p314xaae8f345.mm.p957x53236a1b.v0(this.f154889h, obj, (java.lang.String) null, 1);
        gm0.j1.d().g(v0Var);
        this.f154886e = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i6(this, v0Var));
    }

    public boolean U6(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
            return true;
        }
        if (i17 == 4) {
            if (i18 != -2023) {
                if (i18 == -140) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154896r)) {
                        x51.i1.e(mo55332x76847179(), str, this.f154896r);
                    }
                    return true;
                }
                if (i18 != -100) {
                    if (i18 == -9) {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f573936gi0, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                        return true;
                    }
                    if (i18 == -1) {
                        if (gm0.j1.d().n() != 5) {
                            return false;
                        }
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.h7l, com.p314xaae8f345.mm.R.C30867xcad56011.h7k);
                        return true;
                    }
                    if (i18 == -4 || i18 == -3) {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.c1t, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                        return true;
                    }
                }
            }
            gm0.m.o();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f354768x)) {
                str2 = i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f354768x;
            }
            db5.e1.M(mo55332x768471792, str2, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x5(this));
            return true;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570764bt0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154885d = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f566872hc4);
        this.f154891m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ipe);
        m78501x43e00957(false);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi7), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y5(this));
        this.f154885d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z5(this));
        this.f154885d.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a6(this));
        this.f154885d.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b6(this));
        this.f154891m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi_));
        this.f154891m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f6(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g6(this));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f154893o = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h6(this), 500L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                stringExtra.length();
            }
            if (intExtra == -217) {
                T6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573941gi5);
        if (o45.wf.f424566k) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp) + j65.v.b(this);
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        mo54450xbf7c1df6(string);
        java.lang.String stringExtra = getIntent().getStringExtra("bindmcontact_mobile");
        this.f154890i = stringExtra;
        if (stringExtra != null) {
            this.f154889h = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(stringExtra);
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        n71.a.a();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f154897s.mo48814x2efc64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L200_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_200"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f154897s.mo48813x58998cd();
        super.onResume();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L200_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_200"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L200_200");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tm.a b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginIndepPass", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f154886e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f154886e = null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f154892n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f154892n = null;
        }
        boolean z17 = true;
        if (m1Var.mo808xfb85f7b0() != 252 && m1Var.mo808xfb85f7b0() != 701) {
            if (m1Var.mo808xfb85f7b0() != 145) {
                if (U6(i17, i18, str)) {
                    return;
                }
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                return;
            }
            gm0.j1.d().q(145, this);
            h11.e eVar = (h11.e) m1Var;
            java.lang.String str2 = ((h11.d) eVar.f359604d).f359602b.f424458a.f455055t;
            if (i18 == -41) {
                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                return;
            }
            if (i18 == -75) {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571530hz), "");
                return;
            }
            n71.a.e("L3");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",L3,");
            gm0.j1.b();
            sb6.append(gm0.m.f("L3"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bindmcontact_mobile", this.f154890i);
            intent.putExtra("bindmcontact_shortmobile", str2);
            intent.putExtra("mobile_verify_purpose", 1);
            intent.putExtra("mobileverify_countdownsec", eVar.I());
            intent.putExtra("mobileverify_fb", eVar.K());
            m78604xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.class, intent);
            return;
        }
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var;
        this.f154896r = v0Var.H();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        java.lang.String M = v0Var.M();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154888g;
        w6Var.f155822e = M;
        w6Var.f155824g = v0Var.K();
        w6Var.f155823f = v0Var.L();
        w6Var.f155825h = v0Var.N();
        w6Var.f155819b = this.f154889h;
        w6Var.f155820c = this.f154885d.getText().toString();
        if (i18 == -75) {
            x51.i1.d(mo55332x76847179());
            return;
        }
        if (i18 == -106) {
            x51.i1.c(this, str, 0);
            return;
        }
        if (i18 == -217) {
            x51.i1.f(this, x51.i.a(v0Var), i18);
            return;
        }
        if (i18 == -205) {
            this.f154893o = v0Var.I();
            this.f154894p = v0Var.R();
            this.f154895q = v0Var.J();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginIndepPass", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f154893o), this.f154895q);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.f155818i = w6Var;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("auth_ticket", this.f154893o);
            intent2.putExtra("binded_mobile", this.f154894p);
            intent2.putExtra("close_safe_device_style", this.f154895q);
            intent2.putExtra("from_source", 5);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.C(this, intent2);
            return;
        }
        if (i18 == -140) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154896r)) {
                return;
            }
            x51.i1.e(this, str, this.f154896r);
            return;
        }
        if (i17 == 4 && (i18 == -16 || i18 == -17)) {
            gm0.j1.d().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r5(this), null));
        } else {
            z17 = false;
        }
        if (i18 == -6 || i18 == -311 || i18 == -310) {
            gm0.j1.d().a(701, this);
            gm0.j1.d().a(252, this);
            if (this.f154887f == null) {
                this.f154887f = bb5.j.a(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.hxl, w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t5(this), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u5(this), w6Var);
                return;
            }
            int length = w6Var.f155824g.length;
            fp.k.c();
            this.f154887f.b(w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f);
            return;
        }
        if (!z17 && (i17 != 0 || i18 != 0)) {
            if (U6(i17, i18, str)) {
                return;
            }
            if ((m1Var.mo808xfb85f7b0() == 252 || m1Var.mo808xfb85f7b0() == 701) && (b17 = tm.a.b(str)) != null && b17.c(this, null, null)) {
                return;
            }
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        gm0.m.E();
        x51.i1.a(this, w6Var.f155819b);
        x51.i1.b(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v5(this), false, 2);
        if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b c6621xa57cb26b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b();
            c6621xa57cb26b.f139743d = 2L;
            c6621xa57cb26b.k();
        }
    }
}
