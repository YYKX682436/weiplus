package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI */
/* loaded from: classes9.dex */
public class ActivityC17105xa1fb9be7 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce {
    public static final /* synthetic */ int R = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f238046J;
    public java.lang.String K;
    public int M;
    public int N;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e P;
    public r45.e77 Q;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f238048f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f238049g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f238050h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f238051i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f238052m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f238053n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f238054o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f238055p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f238056q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f238057r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f238058s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f238059t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f238060u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f238061v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f238062w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f238063x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04 f238064y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f238065z;

    /* renamed from: e, reason: collision with root package name */
    public final int f238047e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 270);
    public java.lang.String G = "";
    public int L = 0;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        activityC17105xa1fb9be7.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "do start pay");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273647m = str;
        c19760x34448d56.f273642e = 49;
        c19760x34448d56.f273644g = tw3.b.f504012a;
        android.os.Bundle bundle = new android.os.Bundle();
        c19760x34448d56.f273655u = bundle;
        if (activityC17105xa1fb9be7.f39902xe856ec83) {
            bundle.putString("key_transfer_bill_id", activityC17105xa1fb9be7.f238046J);
            bundle.putString("extinfo_key_2", str2);
            bundle.putString("extinfo_key_3", str3);
            bundle.putString("extinfo_key_4", str4);
            ((h45.q) i95.n0.c(h45.q.class)).mo24830x8e9ecb12(activityC17105xa1fb9be7, c19760x34448d56);
            return;
        }
        bundle.putString("extinfo_key_1", activityC17105xa1fb9be7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aev, str3, str4) + str2);
        h45.a0.f(activityC17105xa1fb9be7, c19760x34448d56, 1);
    }

    public static void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7) {
        int round = (int) java.lang.Math.round(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(activityC17105xa1fb9be7.f238052m.m83183xfb85ada3(), 0.0d) * 100.0d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "do request order, money: %s, fee: %s, desc: %s, input: %s, timeScene: %s", java.lang.Integer.valueOf(round), java.lang.Long.valueOf(activityC17105xa1fb9be7.I), activityC17105xa1fb9be7.G, java.lang.Integer.valueOf(activityC17105xa1fb9be7.F), java.lang.Integer.valueOf(activityC17105xa1fb9be7.E));
        java.lang.String str = activityC17105xa1fb9be7.A;
        java.lang.String str2 = activityC17105xa1fb9be7.B;
        java.lang.String str3 = activityC17105xa1fb9be7.D;
        int i17 = activityC17105xa1fb9be7.E;
        java.lang.String str4 = activityC17105xa1fb9be7.G;
        int i18 = (int) activityC17105xa1fb9be7.I;
        int i19 = activityC17105xa1fb9be7.F;
        java.lang.String str5 = activityC17105xa1fb9be7.C;
        java.lang.String str6 = activityC17105xa1fb9be7.K;
        ow3.m mVar = new ow3.m(str, str2, str3, i17, round, str4, i18, i19, str5, str6 == null ? "" : str6, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(("" + activityC17105xa1fb9be7.f238046J).getBytes()), activityC17105xa1fb9be7.L);
        mVar.K(activityC17105xa1fb9be7);
        if (!activityC17105xa1fb9be7.f39902xe856ec83) {
            activityC17105xa1fb9be7.m83098x5406100e(mVar);
        } else {
            activityC17105xa1fb9be7.mo73913x2b33b77f();
            activityC17105xa1fb9be7.m83099x5406100e(mVar, false);
        }
    }

    public static boolean a7(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7, ow3.m mVar) {
        activityC17105xa1fb9be7.getClass();
        r45.h7 h7Var = mVar.f430960s.f464004n;
        if (h7Var == null || h7Var.f457425d != 1) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "show alert item");
        db5.e1.C(activityC17105xa1fb9be7, h7Var.f457426e, "", h7Var.f457428g, h7Var.f457427f, false, new qw3.b1(activityC17105xa1fb9be7, h7Var, mVar), new qw3.c1(activityC17105xa1fb9be7));
        return true;
    }

    public final void c7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f238052m.m83183xfb85ada3(), 0.0d) > 0.0d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            this.f238058s.setEnabled(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "disable btn: money: %s, seqNo: %s, tail: %s, bankType: %s, encrypt: %s", this.f238052m.m83183xfb85ada3(), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)));
            this.f238058s.setEnabled(false);
        }
    }

    public final void d7() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
            spannableStringBuilder.append((java.lang.CharSequence) getString(com.p314xaae8f345.mm.R.C30867xcad56011.aeq));
            spannableStringBuilder.setSpan(this.H, 0, spannableStringBuilder.length(), 18);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.lang.String str = this.G;
            ((ke0.e) xVar).getClass();
            spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, str));
            spannableStringBuilder.append((java.lang.CharSequence) (" " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.aep)));
            spannableStringBuilder.setSpan(this.H, this.G.length(), spannableStringBuilder.length(), 34);
        }
        this.f238057r.setText(spannableStringBuilder);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569716jt;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        r45.f77 f77Var;
        this.f238051i = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        this.f238048f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.aya);
        this.f238049g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ayc);
        this.f238050h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ayh);
        this.f238052m = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.ayb);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ayd);
        this.f238053n = linearLayout;
        this.f238054o = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.aye);
        this.f238055p = (android.widget.TextView) this.f238053n.findViewById(com.p314xaae8f345.mm.R.id.ayf);
        this.f238056q = (android.widget.TextView) this.f238053n.findViewById(com.p314xaae8f345.mm.R.id.ayj);
        this.f238057r = (android.widget.TextView) this.f238053n.findViewById(com.p314xaae8f345.mm.R.id.ayi);
        this.f238058s = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ayg);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.lwf);
        this.f238059t = viewGroup;
        this.f238060u = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lx9);
        this.f238061v = (android.widget.TextView) this.f238059t.findViewById(com.p314xaae8f345.mm.R.id.lxb);
        this.f238062w = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) this.f238059t.findViewById(com.p314xaae8f345.mm.R.id.lx_);
        this.f238063x = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) this.f238059t.findViewById(com.p314xaae8f345.mm.R.id.lxa);
        this.f238054o.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ae9, this.f238064y.f237996p));
        this.f238048f.m75396xca029dad(this.f238064y.f237989f);
        this.f238049g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.aev, this.f238064y.f237988e, this.B));
        this.f238050h.setText(this.f238065z);
        this.f238052m.m83214xdc742163(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        m83125x8f91b80(this.f238052m, 2, false);
        this.f238052m.m83217x59dfe8de(true);
        this.f238052m.b(new qw3.v0(this));
        this.f238057r.setClickable(true);
        this.f238057r.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new qw3.a1(this, getIntent().getIntExtra("key_reason_len", 10)));
        d7();
        this.f238058s.setOnClickListener(new qw3.w0(this));
        c7();
        r45.e77 e77Var = this.Q;
        if (e77Var == null || e77Var.f454617d != 1 || (f77Var = e77Var.f454618e) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f77Var.f455614d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "  do not show WarningView");
            this.f238059t.setVisibility(8);
        } else {
            r45.e77 e77Var2 = this.Q;
            r45.f77 f77Var2 = e77Var2.f454618e;
            this.f238059t.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "warning textInfo.wording:%s", f77Var2.f455614d);
            this.f238061v.setText(f77Var2.f455614d);
            if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454620g)) {
                this.f238061v.setTextColor(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.l0(e77Var2.f454619f));
            } else {
                this.f238061v.setTextColor(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.l0(e77Var2.f454620g));
            }
            int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 20.0f);
            int d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 8.0f);
            int d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 16.0f);
            if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454622i)) {
                this.f238062w.b(e77Var2.f454621h, d17, d17, -1);
            } else {
                this.f238062w.b(e77Var2.f454622i, d17, d17, -1);
            }
            if (com.p314xaae8f345.mm.ui.bk.C() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454624n)) {
                this.f238063x.b(e77Var2.f454624n, d18, d19, -1);
            } else if (com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454623m)) {
                this.f238063x.setVisibility(8);
            } else {
                this.f238063x.b(e77Var2.f454623m, d18, d19, -1);
            }
            this.f238059t.postDelayed(new qw3.t0(this), 10L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28871, 3, 1);
            this.f238060u.setClickable(true);
            this.f238060u.setOnClickListener(new qw3.u0(this, f77Var2));
        }
        m83129xcfb55a41(new qw3.x0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ow3.l lVar;
        if (i17 != 1) {
            if (i17 != 2) {
                super.onActivityResult(i17, i18, intent);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            j45.l.j(mo55332x76847179(), "offline", ".ui.WalletOfflineCoinPurseUI", intent2, null);
            return;
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "goto detail");
            android.content.Intent intent3 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e.class);
            intent3.putExtra("key_transfer_bill_id", this.f238046J);
            intent3.putExtra("key_enter_scene", 0);
            startActivityForResult(intent3, 2);
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_trans_id") : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", this.f238046J, stringExtra);
            m83099x5406100e(new ow3.c(this.f238046J, stringExtra), false);
            this.L = 1;
            lVar = new ow3.l(this.f238046J, this.K, 1);
        } else if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.b(intent)) {
            finish();
            return;
        } else {
            if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.c(intent)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "pay failed: %d", java.lang.Integer.valueOf(i18));
            this.L = intent.getIntExtra("key_pay_reslut_type", 0);
            lVar = new ow3.l(this.f238046J, this.K, this.L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "onActivityResult() requestCode == REQ_PAY resultCode != RESULT_OK  mUnpayType:%s", java.lang.Integer.valueOf(this.L));
        }
        m83099x5406100e(lVar, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78530x8b45058f();
        m83090x14f40144(1380);
        m83090x14f40144(2739);
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_MIN_POUNDAGE_INT_SYNC, 10)).intValue();
        this.M = intValue >= 0 ? intValue : 10;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_MAX_TRANSFER_AMOUNT_INT_SYNC;
        int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1998x3d67feb.f6000xf7b4e5a6;
        int intValue2 = ((java.lang.Integer) c17.m(u3Var, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1998x3d67feb.f6000xf7b4e5a6))).intValue();
        if (intValue2 > 0) {
            i17 = intValue2;
        }
        this.N = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "minFee: %s, maxAmount: %s", java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(this.N));
        this.K = getIntent().getStringExtra("key_unique_id");
        this.f238064y = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04) getIntent().getParcelableExtra("key_bank_card_elem_parcel");
        this.f238065z = getIntent().getStringExtra("key_payee_name");
        this.A = getIntent().getStringExtra("key_bank_card_seqno");
        this.B = getIntent().getStringExtra("key_bank_card_tailno");
        this.C = getIntent().getStringExtra("key_encrypt_data");
        this.E = getIntent().getIntExtra("key_enter_time_scene", 0);
        this.F = getIntent().getIntExtra("key_input_type", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_notice_item");
        if (byteArrayExtra != null) {
            r45.e77 e77Var = new r45.e77();
            try {
                e77Var.mo11468x92b714fd(byteArrayExtra);
                this.Q = e77Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankRemitMoneyInputUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (this.f238064y == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitMoneyInputUI", "bankcard elem is null");
            this.f238064y = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04();
        }
        this.D = this.f238064y.f237987d;
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572236af0);
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        this.f39902xe856ec83 = true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1380);
        m83121xf6ff5b27(2739);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ow3.m)) {
            return false;
        }
        ow3.m mVar = (ow3.m) m1Var;
        mVar.O(new qw3.y0(this, mVar));
        if (mVar.f295565m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitMoneyInputUI", "request order error: %s, %s", java.lang.Integer.valueOf(mVar.f430960s.f463997d), mVar.f430960s.f463998e);
            a7(this, mVar);
            if (this.f39902xe856ec83) {
                mo48627xce38d9a();
            }
        }
        if (!mVar.f295564i) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitMoneyInputUI", "net error: %s", mVar);
        if (!this.f39902xe856ec83) {
            return false;
        }
        mo48627xce38d9a();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: shouldEnsureSoterConnection */
    public boolean mo48648xabe27cf2() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(qw3.e1.class);
    }
}
