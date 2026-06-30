package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui;

/* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI */
/* loaded from: classes14.dex */
public class ActivityC11395xb9d37a9a extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f154766s = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f154767e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f154768f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154769g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f154770h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f154771i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154772m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f154773n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154774o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f154775p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f154776q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f154777r = false;

    public final boolean Z6(int i17, int i18, java.lang.String str) {
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
            return true;
        }
        if (i18 == -74) {
            db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f572245ag3, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            return true;
        }
        if (i18 != -57) {
            if (i18 == -41) {
                dp.a.m125853x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ag6, 0).show();
                return true;
            }
            if (i18 != -1) {
                switch (i18) {
                    case -34:
                        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.ag7, 0).show();
                        return true;
                    case -33:
                        db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho, null);
                        return true;
                    case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73894x389a6e4 /* -32 */:
                        db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ahj, com.p314xaae8f345.mm.R.C30867xcad56011.aho, null);
                        return true;
                    default:
                        return false;
                }
            }
        }
        dp.a.m125853x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, 0).show();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cj6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154772m = getIntent().getStringExtra("binded_mobile");
        this.f154773n = getIntent().getStringExtra("auth_ticket");
        this.f154777r = getIntent().getBooleanExtra("re_open_verify", false);
        this.f154767e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.aid);
        this.f154768f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jn_);
        this.f154769g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568181m03);
        this.f154771i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568180m02);
        this.f154767e.addTextChangedListener(new h71.g0(this));
        android.widget.TextView textView = this.f154768f;
        java.lang.String str = this.f154772m;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.startsWith("+")) {
            str = "";
        } else if (str.length() > 5) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(str.subSequence(0, 3));
            for (int i17 = 0; i17 < str.length() - 5; i17++) {
                char charAt = str.charAt(i17 + 3);
                if (charAt < '0' || charAt > '9') {
                    stringBuffer.append(charAt);
                } else {
                    stringBuffer.append('*');
                }
            }
            stringBuffer.append(str.charAt(str.length() - 2));
            stringBuffer.append(str.charAt(str.length() - 1));
            str = stringBuffer.toString();
        }
        textView.setText(str);
        this.f154769g.setTag(60);
        this.f154775p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new h71.h0(this), true);
        this.f154771i.setOnClickListener(new h71.j0(this));
        if (!this.f154777r) {
            android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.byy);
            this.f154770h = button;
            button.setVisibility(0);
            this.f154770h.setOnClickListener(new h71.k0(this));
        }
        mo54448x9c8c0d33(new h71.l0(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new h71.n0(this));
        m78501x43e00957(false);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i7t);
        this.f154775p.c(1000L, 1000L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        n71.a.a();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f154775p.d();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        W6(1);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(132, this);
        super.onPause();
        if (this.f154777r) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_200"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        super.onResume();
        if (this.f154777r) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_200"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L600_200");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f154776q;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f154776q.dismiss();
            this.f154776q = null;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 == 132) {
            if (i17 != 0 || i18 != 0) {
                if (Z6(i17, i18, str)) {
                    return;
                }
                o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
                if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
                    return;
                }
                dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574450i85, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                return;
            }
            e71.j.b(true, true);
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1.class);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            return;
        }
        if (mo808xfb85f7b0 != 145) {
            return;
        }
        h11.e eVar = (h11.e) m1Var;
        if (eVar.M() == 10) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityAccountVerifyUI", "resend verify code successfully");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SecurityAccountVerifyUI", "resend verify code fail, errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (Z6(i17, i18, str)) {
                return;
            }
            dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574446i81, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        if (eVar.M() != 11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SecurityAccountVerifyUI", "unknow bind mobile for reg op code %d, errType %d, errCode %d", java.lang.Integer.valueOf(eVar.M()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SecurityAccountVerifyUI", "verify verify-code fail, errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (Z6(i17, i18, str)) {
                return;
            }
            dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574450i85, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        this.f154773n = ((h11.d) eVar.f359604d).f359602b.f424458a.f455050o;
        int intExtra = getIntent().getIntExtra("from_source", 1);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("from_source", intExtra);
        intent2.putExtra("binded_mobile", this.f154772m);
        if (intExtra != 1 && intExtra != 2) {
            if (intExtra == 3) {
                intent2.addFlags(67108864);
                intent2.putExtra("auth_ticket", this.f154773n);
                java.lang.String stringExtra = getIntent().getStringExtra("WizardTransactionId");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.f278452d;
                android.content.Intent intent3 = (android.content.Intent) hashMap.get(stringExtra);
                hashMap.clear();
                if (intent3 != null) {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.s(this, intent2, intent3);
                } else {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.s(this, intent2, null);
                }
                finish();
                return;
            }
            if (intExtra != 5 && intExtra != 6) {
                W6(1);
                return;
            }
        }
        intent2.addFlags(67108864);
        intent2.putExtra("auth_ticket", this.f154773n);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.s(this, intent2, null);
        finish();
    }
}
