package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView */
/* loaded from: classes8.dex */
public class ActivityC19066x54c41420 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.ref.WeakReference f260681v = new java.lang.ref.WeakReference(null);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f260682d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f260683e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260684f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f260685g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f260686h;

    /* renamed from: i, reason: collision with root package name */
    public ms4.n f260687i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f260688m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f260689n;

    /* renamed from: p, reason: collision with root package name */
    public int f260691p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f260692q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f260693r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f260694s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f260695t;

    /* renamed from: o, reason: collision with root package name */
    public final int f260690o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f260696u = new ns4.s0(this);

    public final void V6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "check enable: %s", java.lang.Boolean.valueOf(z17));
        if (z17 && this.f260689n) {
            this.f39912xe2ad5320.e(true);
        } else {
            this.f39912xe2ad5320.e(false);
        }
    }

    public final void W6(r45.qb7 qb7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "startCheckPwdUI, params " + qb7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 93);
        if (qb7Var == null) {
            ms4.n nVar = this.f260687i;
            if (nVar != null) {
                nVar.N6("", null, 0, this);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", qb7Var.f465345d);
        intent.putExtra("timeStamp", qb7Var.f465348g);
        intent.putExtra("nonceStr", qb7Var.f465350i);
        intent.putExtra("packageExt", qb7Var.f465346e);
        intent.putExtra("signtype", qb7Var.f465347f);
        intent.putExtra("paySignature", qb7Var.f465349h);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        j45.l.o(this, "wallet_core", ".ui.WalletCheckPwdUI", intent, 3001, false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569482cc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView m82977x310592d0;
        mo54448x9c8c0d33(new ns4.a1(this));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hdp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f260684f = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dg_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f260682d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.j8i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f260683e = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ohf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f260685g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ixe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f260686h = (android.widget.ScrollView) findViewById5;
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c2.m83186xefe232c4().setText("¥");
        android.widget.TextView textView = this.f260685g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView.setText("");
        android.widget.TextView textView2 = this.f260685g;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView2.setClickable(true);
        android.widget.TextView textView3 = this.f260685g;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView3.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iu9)).getPaint(), 0.8f);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575023kf5);
        this.f260691p = 1;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.cpq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById6;
        this.f260692q = viewGroup;
        viewGroup.setOnClickListener(new ns4.b1(this));
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.cpr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f260693r = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.cps);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f260694s = (android.widget.TextView) findViewById8;
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) findViewById(com.p314xaae8f345.mm.R.id.pok);
        this.f39912xe2ad5320 = c22894x55bf3223;
        android.view.ViewGroup.LayoutParams layoutParams = c22894x55bf3223.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(12);
        this.f39912xe2ad5320.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = this.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        m83130x21cc23c2(viewOnFocusChangeListenerC22907xe18534c22.m83169xe7297452(), false, false);
        ms4.n nVar = this.f260687i;
        if (nVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        java.lang.String str = nVar.f412604h;
        java.lang.String str2 = (str == null || str.length() == 0) ^ true ? str : null;
        if (str2 != null && (m82977x310592d0 = this.f39912xe2ad5320.m82977x310592d0()) != null) {
            m82977x310592d0.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).qj(this, str2, 14, false, 1, null));
            m82977x310592d0.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            m82977x310592d0.setTypeface(null, 0);
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32232 = this.f39912xe2ad5320;
            c22894x55bf32232.f295349t.setVisibility(0);
            c22894x55bf32232.s();
        }
        this.f39912xe2ad5320.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575023kf5));
        if (fp.h.b(27)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c23 = this.f260684f;
            if (viewOnFocusChangeListenerC22907xe18534c23 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
                throw null;
            }
            viewOnFocusChangeListenerC22907xe18534c23.p();
        }
        android.view.ViewGroup viewGroup2 = this.f260683e;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContent");
            throw null;
        }
        viewGroup2.setOnTouchListener(new ns4.z0(this));
        V6(false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c24 = this.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c24 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c24.b(new ns4.d1(this));
        m83129xcfb55a41(new ns4.e1(this));
        ns4.g1 g1Var = new ns4.g1(this);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c25 = this.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c25.m83169xe7297452().setOnEditorActionListener(new ns4.f1(g1Var));
        long longExtra = getIntent().getLongExtra("wecoin_income_balance", 0L);
        if (longExtra > 0) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9m, java.lang.Double.valueOf(os4.h.c(longExtra + "", "100", 2)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int length = string.length();
            android.text.SpannableString spannableString = new android.text.SpannableString(string + ' ' + getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9n));
            spannableString.setSpan(new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new ns4.l1(this, longExtra), true), length, spannableString.length(), 18);
            this.f260688m = spannableString;
            android.widget.TextView textView4 = this.f260685g;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView4.setText(spannableString);
        }
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.f569215pf5);
        if (findViewById9 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById9, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.bek);
        if (findViewById10 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById10, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById10.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById10, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        this.f39912xe2ad5320.o();
        return this.f39912xe2ad5320.o();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "onActivityResult() requestCode:%s, resultCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onActivityResult(i17, i18, intent);
        if (i17 == 3001) {
            if (i18 != -1) {
                if (i18 == 0) {
                    ms4.n nVar = this.f260687i;
                    if (nVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                        throw null;
                    }
                    nVar.P6(5);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 94);
                    return;
                }
                return;
            }
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("token") : null;
            this.f260695t = stringExtra;
            if (stringExtra == null || stringExtra.length() == 0) {
                ms4.n nVar2 = this.f260687i;
                if (nVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                    throw null;
                }
                nVar2.P6(5);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 94);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 95);
            java.lang.String str = this.f260695t;
            if (str != null) {
                ms4.n nVar3 = this.f260687i;
                if (nVar3 != null) {
                    nVar3.N6(str, null, 0, this);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                    throw null;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(this, new ms4.o(getIntent().getByteArrayExtra("WECOIN_TAX_CUT_ENTRANCE_INFO"), getIntent().getIntExtra("WECOIN_BUSINESS_ID", 1))).a(ms4.n.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ms4.n nVar = (ms4.n) a17;
        nVar.f412605i = this;
        this.f260687i = nVar;
        nVar.f412601e = getIntent().getIntExtra("WECOIN_ENCASH_SCENE", 0);
        ms4.n nVar2 = this.f260687i;
        if (nVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar2.f412602f = getIntent().getIntExtra("WECOIN_ENCASH_BIZ_TYPE", 0);
        ms4.n nVar3 = this.f260687i;
        if (nVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar3.f412603g = getIntent().getStringExtra("WECOIN_ENCASH_BIZ_ACCT_ID");
        ms4.n nVar4 = this.f260687i;
        if (nVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar4.f412604h = getIntent().getStringExtra("WECOIN_ENCASH_KEYBOARD_TIPS");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initModel encashScene:");
        ms4.n nVar5 = this.f260687i;
        if (nVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar5.f412601e);
        sb6.append(", biz_type:");
        ms4.n nVar6 = this.f260687i;
        if (nVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar6.f412602f);
        sb6.append(", biz_acct_id:");
        ms4.n nVar7 = this.f260687i;
        if (nVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar7.f412603g);
        sb6.append(", keyboardTips:");
        ms4.n nVar8 = this.f260687i;
        if (nVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        sb6.append(nVar8.f412604h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", sb6.toString());
        mo43517x10010bd5();
        ms4.n nVar9 = this.f260687i;
        if (nVar9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar9.f412614u.mo7806x9d92d11c(this, new ns4.t0(this));
        ms4.n nVar10 = this.f260687i;
        if (nVar10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar10.f412606m.mo7806x9d92d11c(this, new ns4.u0(this));
        ms4.n nVar11 = this.f260687i;
        if (nVar11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar11.f412607n.mo7806x9d92d11c(this, new ns4.v0(this));
        ms4.n nVar12 = this.f260687i;
        if (nVar12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar12.f412608o.mo7806x9d92d11c(this, new ns4.w0(this));
        ms4.n nVar13 = this.f260687i;
        if (nVar13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar13.f412609p.mo7806x9d92d11c(this, new ns4.x0(this));
        ms4.n nVar14 = this.f260687i;
        if (nVar14 != null) {
            nVar14.f412613t = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630) getIntent().getParcelableExtra("wecoin_enter_encash_business_kv_data");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f260696u);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "onDialogDismiss()");
        if (this.f260691p == 2 && mo48628x7c5cc589()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f260696u, 300L);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 == null || !c22894x55bf3223.onKeyUp(i17, event)) {
            return super.onKeyUp(i17, event);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "onPause()");
        if (this.f39912xe2ad5320.p()) {
            return;
        }
        this.f260691p = 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "onResume()");
        if (this.f260691p == 3 && mo48628x7c5cc589()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f260696u, 300L);
        }
        this.f260691p = 2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }
}
