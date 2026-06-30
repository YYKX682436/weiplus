package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI */
/* loaded from: classes9.dex */
public class ActivityC19125x69c29dd3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0 {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f261645f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f261646g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f261647h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261648i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 f261649m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f261650n;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f261653q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f261654r;

    /* renamed from: d, reason: collision with root package name */
    public final int f261643d = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f261644e = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f261651o = false;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9 f261652p = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f261655s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f261656t = true;

    /* renamed from: u, reason: collision with root package name */
    public at4.t f261657u = new at4.t();

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 f261658v = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t9(this);

    public void U6() {
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        java.lang.String string = m83105x7498fe14().getString("key_pwd1");
        java.lang.String m83183xfb85ada3 = this.f261644e.m83183xfb85ada3();
        this.f261648i = m83183xfb85ada3;
        at4.z0 z0Var = new at4.z0();
        z0Var.f95556b = string;
        z0Var.f95568n = this.f261647h;
        z0Var.f95557c = m83183xfb85ada3;
        java.lang.String string2 = m83105x7498fe14().getString("kreq_token");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string2 == null) {
            string2 = "";
        }
        z0Var.f95558d = string2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14.getParcelable("key_bankcard");
        if (c19091x9511676c != null) {
            z0Var.f95559e = c19091x9511676c.f69223x58802fcb;
            z0Var.f95560f = c19091x9511676c.f69225xed6d60f6;
            java.lang.String str = c19091x9511676c.f69215x54da57dd;
            z0Var.f95562h = str != null ? str : "";
        } else {
            java.lang.String string3 = m83105x7498fe14().getString("key_bank_type");
            z0Var.f95559e = string3;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                z0Var.f95559e = m83105x7498fe14().getString("key_bind_card_type", "");
            }
        }
        java.lang.String string4 = m83105x7498fe14.getString("key_bind_card_user_token", null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
            z0Var.f95569o = 1;
            z0Var.f95570p = string4;
        }
        java.util.Objects.toString(z0Var.f95568n);
        m83105x7498fe14.putString("key_verify_code", this.f261648i);
        com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "do verify result : " + m83106x57340563().d(this.f261648i, z0Var));
    }

    public java.lang.String V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        java.lang.String string = m83105x7498fe14().getString("key_mobile");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string == null) {
            string = "";
        }
        return (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || (c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard")) == null) ? string : c19091x9511676c.f69249x61dbf87;
    }

    public void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "get verify code!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f261647h;
        objArr[0] = java.lang.Integer.valueOf((c19760x34448d56 == null || c19760x34448d56.f273642e == 0) ? 2 : 1);
        objArr[1] = java.lang.Integer.valueOf(this.f261651o ? 2 : 1);
        g0Var.d(10706, objArr);
        this.f261651o = true;
        this.f261645f.setClickable(false);
        this.f261645f.setEnabled(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9 u9Var = this.f261652p;
        if (u9Var != null) {
            u9Var.cancel();
            this.f261652p = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9 u9Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9(this, this.f261643d, 1000L);
        this.f261652p = u9Var2;
        u9Var2.start();
        if (m83106x57340563().f(this.f261648i) || m83122xc84d8c3b(false)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) m83105x7498fe14().getParcelable("key_authen");
        this.f261649m = c19090x75920c71;
        if (c19090x75920c71 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletVertifyCodeUI", "error authen is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.e();
        }
    }

    public final void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard");
        java.lang.String V6 = V6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(V6) && c19091x9511676c != null) {
            V6 = c19091x9511676c.f69249x61dbf87;
            m83105x7498fe14().putString("key_mobile", V6);
        }
        this.f261654r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxb, V6));
        java.lang.CharSequence m83110xfb85bbae = m83110xfb85bbae(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(m83110xfb85bbae)) {
            this.f261653q.setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0m), V6));
        } else {
            this.f261653q.setText(m83110xfb85bbae);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "do finish: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: getCancelable */
    public boolean mo73849x5ed8aeca() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8l;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard");
        this.f261653q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aiq);
        this.f261654r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.air);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.aid);
        this.f261644e = viewOnFocusChangeListenerC22907xe18534c2;
        viewOnFocusChangeListenerC22907xe18534c2.m83211x749e7e77(this);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.gr6);
        this.f261645f = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k9(this, c19091x9511676c));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aia);
        this.f261646g = button2;
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l9(this));
        X6();
        this.f261645f.setClickable(false);
        this.f261645f.setEnabled(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9 u9Var = this.f261652p;
        if (u9Var != null) {
            u9Var.cancel();
            this.f261652p = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9 u9Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u9(this, this.f261643d, 1000L);
        this.f261652p = u9Var2;
        u9Var2.start();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aip);
        boolean z17 = m83105x7498fe14().getBoolean("key_is_changing_balance_phone_num");
        boolean z18 = m83105x7498fe14().getBoolean("key_need_show_switch_phone", false);
        if (!z17 || z18) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        int i17 = c19760x34448d56 != null ? c19760x34448d56.f273642e : 0;
        if (z18) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l0s);
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m9(this, c19091x9511676c));
        } else {
            if (g17 != null) {
                if ((g17.f295334c.getInt("key_pay_flag", 0) == 3) && i17 != 11 && i17 != 21) {
                    if (c19091x9511676c.v0() || c19091x9511676c.D0()) {
                        java.lang.String string = m83105x7498fe14().getString("key_verify_tail_wording", getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0s));
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0s);
                        }
                        textView.setText(string);
                        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p9(this, c19091x9511676c));
                    } else {
                        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o9(this, c19091x9511676c));
                    }
                }
            }
            textView.setText(c01.z1.I() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0p) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0o));
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q9(this));
        }
        this.f261644e.requestFocus();
        java.lang.String string2 = m83105x7498fe14().getString("key_QADNA_URL");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.C30861xcebc809e.chy, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r9(this, string2));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s9(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        boolean booleanExtra = getIntent().getBooleanExtra("key_need_confirm_finish", false);
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f261647h;
        if ((c19760x34448d56 == null || !c19760x34448d56.f273645h) && !booleanExtra) {
            return super.mo73847x7d641a7d();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "on create");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575159l11);
        this.f261647h = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        this.f261650n = m83105x7498fe14().getString("key_bank_phone");
        this.f261657u = new at4.t(m83105x7498fe14());
        boolean z17 = false;
        this.f261651o = false;
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f261647h;
        objArr[0] = java.lang.Integer.valueOf((c19760x34448d56 == null || c19760x34448d56.f273642e == 0) ? 2 : 1);
        objArr[1] = java.lang.Integer.valueOf(this.f261651o ? 2 : 1);
        g0Var.d(10706, objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.d(this, m83105x7498fe14(), 4);
        at4.t tVar = this.f261657u;
        if (tVar.f95496b != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f95497c)) {
            z17 = true;
        }
        if (z17) {
            g0Var.d(13731, 5);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261657u.f95499e.f295481a)) {
                mo54450xbf7c1df6(this.f261657u.f95499e.f295481a);
            }
            android.widget.TextView textView = this.f261653q;
            if (textView != null) {
                textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0t));
            }
            if (this.f261646g != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261657u.f95499e.f295482b)) {
                this.f261646g.setText(this.f261657u.f95499e.f295482b);
            }
        }
        this.f39904x9eeebfc.c(fe1.o.f69744x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f39904x9eeebfc.i(fe1.o.f69744x366c91de);
        super.onDestroy();
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        if (this.f261644e.c(null)) {
            this.f261646g.setEnabled(true);
            this.f261646g.setClickable(true);
        } else {
            this.f261646g.setEnabled(false);
            this.f261646g.setClickable(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        X6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onPreSceneEnd */
    public boolean mo73852x5df1e913(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "onPreSceneEnd %s %s", java.lang.Integer.valueOf(i18), m1Var);
        if ((m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0) && i18 == 0) {
            this.f261655s = true;
            db5.t7.m123882x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f575117ku2, 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "tag it isCertInstalled ok");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo48630x76e0bfae(int r9, int r10, java.lang.String r11, com.p314xaae8f345.mm.p944x882e457a.m1 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            if (r10 == 0) goto L1b
            com.tencent.mm.wallet_core.model.t0 r12 = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0) r12
            boolean r9 = r12.f295523f
            if (r9 == 0) goto L1b
            androidx.appcompat.app.AppCompatActivity r9 = r8.mo55332x76847179()
            com.tencent.mm.plugin.wallet_core.ui.i9 r10 = new com.tencent.mm.plugin.wallet_core.ui.i9
            r10.<init>(r8)
            db5.e1.G(r9, r11, r1, r2, r10)
        L1b:
            return r3
        L1c:
            if (r9 != 0) goto Ld4
            if (r10 != 0) goto Ld4
            com.tencent.mm.wallet_core.h r9 = com.p314xaae8f345.mm.p2802xd031a825.a.g(r8)
            boolean r10 = r12 instanceof ss4.e0
            java.lang.String r11 = "MicroMsg.WalletVertifyCodeUI"
            if (r10 == 0) goto L51
            android.os.Bundle r10 = r8.m83105x7498fe14()
            java.lang.String r0 = "intent_bind_end"
            r10.putBoolean(r0, r3)
            if (r9 == 0) goto L4b
            java.lang.String r10 = "realname_verify_process"
            java.lang.String r0 = r9.e()
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L4b
            r10 = 2131779145(0x7f105e49, float:1.9189839E38)
            java.lang.String r10 = r8.getString(r10)
            db5.e1.T(r8, r10)
        L4b:
            java.lang.String r10 = "query bound bank card resp!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r10)
            goto L6d
        L51:
            boolean r10 = r9.t(r8, r1)
            if (r10 == 0) goto L6d
            ss4.e0 r10 = new ss4.e0
            java.lang.String r0 = r8.m83107xcc3330f3()
            r1 = 13
            r10.<init>(r0, r1)
            r8.m83096xe7b1ccf7(r10)
            java.lang.String r10 = "to query bound bank card!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r10)
            r10 = r2
            goto L6e
        L6d:
            r10 = r3
        L6e:
            boolean r0 = r12 instanceof ss4.w
            if (r0 == 0) goto L91
            com.tencent.mm.plugin.report.service.g0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.f262386a
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4}
            r4 = 10707(0x29d3, float:1.5004E-41)
            r0.d(r4, r1)
        L91:
            com.tencent.mm.plugin.wallet_core.model.Authen r0 = r8.f261649m
            if (r0 == 0) goto Lae
            boolean r0 = r12 instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
            if (r0 == 0) goto Lae
            com.tencent.mm.wallet_core.tenpay.model.o r12 = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o) r12
            java.lang.String r12 = r12.mo8967x75346043()
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12)
            if (r0 != 0) goto Lae
            android.os.Bundle r0 = r8.m83105x7498fe14()
            java.lang.String r1 = "kreq_token"
            r0.putString(r1, r12)
        Lae:
            if (r10 == 0) goto Ld4
            java.lang.String r10 = "forwardProcess1 and finish!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r10)
            android.os.Bundle r10 = r8.m83105x7498fe14()
            com.p314xaae8f345.mm.p2802xd031a825.a.d(r8, r10)
            if (r9 == 0) goto Lcb
            java.lang.String r9 = r9.e()
            java.lang.String r10 = "PayProcess"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lcb
            goto Ld3
        Lcb:
            java.lang.String r9 = "finish self"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r9)
            r8.finish()
        Ld3:
            return r3
        Ld4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.mo48630x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }
}
