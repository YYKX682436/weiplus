package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 129)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI */
/* loaded from: classes14.dex */
public class ActivityC11438x77a05b9d extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int K = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f154936d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f154937e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f154938f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f154939g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154940h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154941i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154942m;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154947r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf f154948s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f154949t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f154950u;

    /* renamed from: v, reason: collision with root package name */
    public x51.f f154951v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f154952w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f154953x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21398x34296d3b f154954y;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f154943n = null;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f154944o = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154945p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f154946q = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Boolean f154955z = java.lang.Boolean.FALSE;
    public final java.util.Map A = new java.util.HashMap();
    public java.lang.String B = "";
    public java.lang.String C = "";
    public final android.text.TextWatcher D = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n7(this);
    public boolean E = false;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.LoginUI.2
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public final boolean[] G = {true};
    public java.lang.String H = "";
    public final x51.c1 I = new x51.c1();

    /* renamed from: J, reason: collision with root package name */
    public int f154935J = 0;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d) {
        activityC11438x77a05b9d.getClass();
        gm0.j1.i().l("");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        activityC11438x77a05b9d.finish();
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, activityC11438x77a05b9d);
    }

    public final void V6() {
        java.lang.String trim = this.f154936d.getText().toString().trim();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154944o;
        w6Var.f155819b = trim;
        w6Var.f155820c = this.f154937e.getText().toString();
        if (w6Var.f155819b.equals("")) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k6d, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        if (w6Var.f155820c.equals("")) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k67, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        mo48674x36654fab();
        java.lang.String str = w6Var.f155819b;
        if (str == null) {
            this.f154935J = 0;
        } else if (str.contains("@")) {
            this.f154935J = 4;
        } else if (w6Var.f155819b.trim().matches("^[1-9]\\d{4,}$")) {
            this.f154935J = 3;
        } else {
            this.f154935J = 2;
        }
        this.I.a(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p7(this));
    }

    public final void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        int[] iArr = new int[5];
        iArr[0] = 2;
        intent.putExtra("mobile_input_purpose", 1);
        intent.putExtra("kv_report_login_method_data", iArr);
        intent.putExtra("from_switch_account", this.f154953x);
        intent.putExtra("login_sessionid", this.B);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI", "jumpToMobileInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginUI", "jumpToMobileInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void X6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf c11389x36418bdf = this.f154948s;
        if (c11389x36418bdf == null || c11389x36418bdf.f154727x == z17) {
            return;
        }
        c11389x36418bdf.A(z17);
        com.p314xaae8f345.mm.ui.C21398x34296d3b c21398x34296d3b = this.f154954y;
        if (c21398x34296d3b != null) {
            c21398x34296d3b.m78618x19836403(!z17);
        }
        if (!z17) {
            this.f154948s.B(com.p314xaae8f345.mm.R.C30867xcad56011.gi7);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).P6();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f154937e;
            if (c21486x59d05a04 != null) {
                c21486x59d05a04.setEnabled(true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f154936d;
            if (c21486x59d05a042 != null) {
                c21486x59d05a042.setEnabled(true);
                return;
            }
            return;
        }
        this.f154948s.C(com.p314xaae8f345.mm.R.C30867xcad56011.p2r, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).O6();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a043 = this.f154937e;
        if (c21486x59d05a043 != null) {
            c21486x59d05a043.clearFocus();
            this.f154937e.setEnabled(false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a044 = this.f154936d;
        if (c21486x59d05a044 != null) {
            c21486x59d05a044.clearFocus();
            this.f154936d.setEnabled(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bst;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154938f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.iod);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ipf);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (yp5.a.f545942a.a()) {
            this.f154938f.m78934x764b0e09(com.p314xaae8f345.mm.R.C30867xcad56011.f573935gh5);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gho);
        } else {
            this.f154938f.m78934x764b0e09(com.p314xaae8f345.mm.R.C30867xcad56011.gh6);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ghp);
        }
        this.f154939g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.ip_);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.f78277xe59a1298);
        if (c22607x763d2049 != null) {
            c22607x763d2049.e(new al5.e0() { // from class: com.tencent.mm.plugin.account.ui.LoginUI$$a
                @Override // al5.e0
                public final void J2(boolean z17, int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.this;
                    if (z17) {
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.K;
                        activityC11438x77a05b9d.getClass();
                    } else if (activityC11438x77a05b9d.f154955z.booleanValue()) {
                        activityC11438x77a05b9d.f154955z = java.lang.Boolean.FALSE;
                        activityC11438x77a05b9d.W6();
                    }
                }
            });
        }
        this.f154936d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) this.f154938f.m78930xd454f3ba();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) this.f154939g.m78930xd454f3ba();
        this.f154937e = c21486x59d05a04;
        ck5.f b17 = ck5.f.b(c21486x59d05a04);
        b17.f124094f = 0;
        b17.f124093e = 16;
        b17.d(null);
        this.f154936d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q7(this));
        this.f154936d.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r7(this));
        this.f154937e.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s7(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf c11389x36418bdf = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf) findViewById(com.p314xaae8f345.mm.R.id.iol);
        this.f154948s = c11389x36418bdf;
        c11389x36418bdf.C(com.p314xaae8f345.mm.R.C30867xcad56011.gh7, true);
        this.f154948s.setEnabled(false);
        this.f154949t = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iov);
        this.f154950u = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iog);
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t7(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        boolean[] zArr = {false};
        this.f154948s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u7(this, zArr));
        this.f154948s.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v7(this, zArr));
        com.p314xaae8f345.mm.ui.dl.i(this.f154949t.getPaint());
        this.f154949t.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w7(this));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f154940h = stringExtra;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f154936d;
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.c();
            if (c17 == null) {
                c17 = "";
            }
            c21486x59d05a042.setText(c17);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a043 = this.f154937e;
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.d();
            c21486x59d05a043.setText(d17 != null ? d17 : "");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d7(this), 500L);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a044 = this.f154936d;
        android.text.TextWatcher textWatcher = this.D;
        c21486x59d05a044.addTextChangedListener(textWatcher);
        this.f154937e.addTextChangedListener(textWatcher);
        this.f154937e.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e7(this));
        this.f154937e.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f7(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.vb.j(this, null);
        }
        boolean c18 = com.p314xaae8f345.mm.ui.b4.c(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge isTargetSDKVersionOver35=%b", java.lang.Boolean.valueOf(c18));
        if (c18) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78278x5eba1220);
            if (scrollView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge scrollView not found");
            } else {
                final int paddingBottom = scrollView.getPaddingBottom();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge originalPaddingBottom=%d", java.lang.Integer.valueOf(paddingBottom));
                n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.account.ui.LoginUI$$e
                    @Override // n3.k0
                    public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.K;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.this;
                        activityC11438x77a05b9d.getClass();
                        int i18 = g3Var.a(8).f328580d;
                        int i19 = g3Var.a(2).f328580d;
                        int max = java.lang.Math.max(i18, i19);
                        boolean z17 = max > 300 && gh5.d.b(activityC11438x77a05b9d);
                        int max2 = java.lang.Math.max(max, 0);
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(max2);
                        int i27 = paddingBottom;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginUI", "setupImeInsetsForEdgeToEdge onApplyWindowInsets imeVisible=%b, imeHeight=%d, navBarHeight=%d, imeOffset=%d originalPaddingBottom=%d", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i27));
                        if (z17) {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27 + max2);
                        } else {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27);
                        }
                        return g3Var;
                    }
                };
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.u(scrollView, k0Var);
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("login_username");
        this.E = getIntent().getBooleanExtra("from_deep_link", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            this.f154936d.setText(stringExtra2);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f514974a;
            v61.h0.a(this.f154950u, this);
            if (com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) {
                this.f154950u.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573940gi4));
            } else if (com.p314xaae8f345.mm.ui.bk.Q()) {
                this.f154950u.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fe_));
            } else {
                this.f154950u.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gh_));
            }
            this.f154950u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g7(this));
        }
        this.f154954y = k71.l.b(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h7(this), 3);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), 0, 0);
        layoutParams.gravity = 1;
        this.f154954y.setLayoutParams(layoutParams);
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f78277xe59a1298)).addView(this.f154954y);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            if (i17 != 1024 || intent == null) {
                if (i17 != 32644 || intent == null || (bundleExtra = intent.getBundleExtra("result_data")) == null || !bundleExtra.getString("go_next", "").equals("auth_again")) {
                    return;
                }
                V6();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                stringExtra.length();
            }
            if (intExtra == -217) {
                this.f154944o.f155820c = stringExtra;
                V6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a08));
        if (o45.wf.f424566k) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp) + j65.v.b(this);
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            str = "";
        }
        this.f154946q = getIntent().getIntExtra("login_type", 0);
        mo54450xbf7c1df6(str);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jlt);
        if (findViewById != null) {
            com.p314xaae8f345.mm.ui.a4.f(findViewById);
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.f154947r = n71.a.a();
        mo43517x10010bd5();
        this.f154951v = new x51.f();
        this.f154953x = getIntent().getBooleanExtra("from_switch_account", false);
        this.f154952w = c01.b9.f118602c.a("login_weixin_username", "");
        int[] intArrayExtra = getIntent().getIntArrayExtra("kv_report_login_method_data");
        if (intArrayExtra != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14262, java.lang.Integer.valueOf(intArrayExtra[0]), java.lang.Integer.valueOf(intArrayExtra[1]), java.lang.Integer.valueOf(intArrayExtra[2]), java.lang.Integer.valueOf(intArrayExtra[3]), java.lang.Integer.valueOf(intArrayExtra[4]));
        }
        java.lang.String k17 = wo.w0.k();
        this.C = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String stringExtra = getIntent().getStringExtra("login_sessionid");
        this.B = stringExtra;
        if (stringExtra == null) {
            this.B = k17 + "_" + this.C;
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.A;
        hashMap.put("login_sessionid", this.B);
        hashMap.put("page_sessionid", this.C);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, k17);
        hashMap.put("login_page_oa_type", 3);
        hashMap.put("login_page_sessionid", this.B);
        if (this.f154953x) {
            hashMap.put("login_page_type", 1);
        } else {
            hashMap.put("login_page_type", 3);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f154948s, "login_account");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f154948s, new ly1.a() { // from class: com.tencent.mm.plugin.account.ui.LoginUI$$d
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str3) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.K;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.this;
                activityC11438x77a05b9d.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap(activityC11438x77a05b9d.A);
                hashMap2.put("login_method", java.lang.Integer.valueOf(activityC11438x77a05b9d.f154935J));
                return hashMap2;
            }
        });
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f154948s, 8, 34575);
        v61.d.e(3);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.u0.a(this, 6);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).V6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        x51.f fVar = this.f154951v;
        if (fVar != null) {
            fVar.a();
        }
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        fo3.s.INSTANCE.E7("ie_login_id");
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        mo48674x36654fab();
        n71.a.e(this.f154947r);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270693h = null;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270694i = -1L;
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        mo48674x36654fab();
        this.F.mo48814x2efc64();
        int i17 = this.f154946q;
        if (i17 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",L100_100_logout,");
            gm0.j1.b();
            sb6.append(gm0.m.f("L100_100_logout"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
        } else if (i17 == 1) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",L400_100_login,");
            gm0.j1.b();
            sb7.append(gm0.m.f("L400_100_login"));
            sb7.append(",2");
            n71.a.c(10645, false, sb7.toString());
        }
        v61.d.f(3);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.I.c(this, i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.F.mo48813x58998cd();
        super.onResume();
        int i17 = this.f154946q;
        if (i17 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",L100_100_logout,");
            gm0.j1.b();
            sb6.append(gm0.m.f("L100_100_logout"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("L100_100_logout");
        } else if (i17 == 1) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",L400_100_login,");
            gm0.j1.b();
            sb7.append(gm0.m.f("L400_100_login"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
            n71.a.d("L400_100_login");
        }
        v61.d.e(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r19 != (-310)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p944x882e457a.m1 r21) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class);
    }
}
