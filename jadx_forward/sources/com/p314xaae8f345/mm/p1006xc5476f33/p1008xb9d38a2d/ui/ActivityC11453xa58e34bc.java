package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 129)
/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI */
/* loaded from: classes14.dex */
public class ActivityC11453xa58e34bc extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {
    public static final /* synthetic */ int W = 0;
    public java.lang.String F;
    public int H;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec I;

    /* renamed from: J, reason: collision with root package name */
    public d71.d f155011J;
    public d71.e K;
    public boolean M;
    public boolean N;
    public java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f155012d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f155013e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f155014f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f155015g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f155016h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f155017i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f155018m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155019n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f155020o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.CheckBox f155021p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f155022q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f155023r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f155024s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f155025t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f155026u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f155027v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f155028w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21398x34296d3b f155029x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f155030y = true;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f155031z = null;
    public java.lang.String A = null;
    public java.lang.String B = null;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.lang.String E = null;
    public int G = 0;
    public int[] L = new int[5];
    public java.lang.String Q = "";
    public java.lang.String R = "";
    public final java.util.Map S = new java.util.HashMap();
    public final java.lang.String T = "";
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d U = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.MobileInputUI.1
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MobileInputUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public final x51.c1 V = new x51.c1();

    public boolean U6() {
        if (this.f155014f.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155014f.getText().toString()) || !this.f155030y) {
            return false;
        }
        return (this.G == 2 && (this.f155012d.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155012d.getText().toString()))) ? false : true;
    }

    public final void V6() {
        if (!this.M) {
            this.I.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc.GoBack);
            n71.a.e(this.F);
            mo48674x36654fab();
            finish();
            return;
        }
        mo48674x36654fab();
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileInputUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    public final boolean W6() {
        int i17 = this.H;
        return i17 == 7 || i17 == 6;
    }

    public final boolean X6() {
        return this.G == 2;
    }

    public final void Y6(java.lang.String countryISOCode) {
        this.D = countryISOCode;
        d71.e eVar = this.K;
        if (eVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(countryISOCode, "countryISOCode");
            eVar.f308413f = countryISOCode;
            eVar.f308415h = "";
            eVar.f308414g = false;
            android.widget.EditText editText = this.f155014f;
            if (editText != null) {
                this.K.a(editText.getText());
            }
        }
    }

    public final void Z6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)) {
            this.f155018m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwa));
        } else {
            this.f155018m.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.b(this.C, this.D));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14262, java.lang.Integer.valueOf(this.L[0]), java.lang.Integer.valueOf(this.L[1]), java.lang.Integer.valueOf(this.L[2]), java.lang.Integer.valueOf(this.L[3]), java.lang.Integer.valueOf(this.L[4]));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c1z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.mnt);
        this.f155015g = c21490xb2dd0b6b;
        android.widget.EditText m78930xd454f3ba = c21490xb2dd0b6b.m78930xd454f3ba();
        this.f155012d = m78930xd454f3ba;
        ck5.f b17 = ck5.f.b(m78930xd454f3ba);
        b17.f124094f = 0;
        b17.f124093e = 16;
        b17.d(null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.jn9);
        this.f155013e = c21490xb2dd0b6b2;
        c21490xb2dd0b6b2.m78937xc17f97e2(3);
        android.widget.EditText m78930xd454f3ba2 = this.f155013e.m78930xd454f3ba();
        this.f155014f = m78930xd454f3ba2;
        this.K = new d71.e(m78930xd454f3ba2, this.f155011J, this.D);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905) findViewById(com.p314xaae8f345.mm.R.id.f568500n16);
        this.f155016h = c21493x36e72905;
        c21493x36e72905.m78962xc17f97e2(3);
        this.f155017i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cjz);
        this.f155018m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565488ck1);
        this.f155020o = findViewById(com.p314xaae8f345.mm.R.id.lrm);
        this.f155021p = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.lrt);
        this.f155022q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lrs);
        this.f155023r = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iol);
        this.f155024s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564313ns);
        this.f155025t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ls_);
        this.f155026u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ipf);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.f78277xe59a1298)).e(new al5.e0() { // from class: com.tencent.mm.plugin.account.ui.MobileInputUI$$a
            @Override // al5.e0
            public final void J2(boolean z17, int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.this;
                if (!z17) {
                    activityC11453xa58e34bc.I.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc.HideVkb);
                } else {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.W;
                    activityC11453xa58e34bc.getClass();
                }
            }
        });
        this.f155027v = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iov);
        this.f155028w = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iog);
        this.f155017i.setVisibility(8);
        this.f155015g.setVisibility(8);
        this.f155016h.setVisibility(8);
        this.f155013e.setVisibility(8);
        this.f155025t.setVisibility(8);
        this.f155026u.setVisibility(8);
        this.f155023r.setVisibility(8);
        android.view.View view = this.f155020o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155027v.setVisibility(8);
        com.p314xaae8f345.mm.ui.dl.i(this.f155027v.getPaint());
        boolean[] zArr = {true};
        this.f155014f.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xb(this, zArr));
        this.f155014f.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yb(this, zArr));
        this.f155012d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zb(this));
        this.f155014f.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ac(this));
        this.f155014f.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bc(this));
        boolean[] zArr2 = {false};
        this.f155023r.setEnabled(false);
        this.f155023r.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.cc(this, zArr2));
        this.f155023r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qb(this, zArr2));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)) {
            this.C = getString(com.p314xaae8f345.mm.R.C30867xcad56011.blk);
            Y6(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.blj)));
        } else {
            this.C = u11.b.c(this.D);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)) {
            java.lang.String simCountryIso = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
            this.E = simCountryIso;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(simCountryIso)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
            } else {
                u11.a a17 = u11.b.a(this.E);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
                } else {
                    Y6(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.g(a17.f505261b));
                    this.C = a17.f505262c;
                }
            }
        }
        Z6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            this.f155014f.setText(this.B);
        }
        this.f155017i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.rb(this));
        boolean c17 = com.p314xaae8f345.mm.ui.b4.c(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge isTargetSDKVersionOver35=%b", java.lang.Boolean.valueOf(c17));
        if (c17) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78278x5eba1220);
            final android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.t8r);
            if (scrollView == null || findViewById == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge scrollView not found");
            } else {
                final int paddingBottom = scrollView.getPaddingBottom();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge originalPaddingBottom=%d", java.lang.Integer.valueOf(paddingBottom));
                n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.account.ui.MobileInputUI$$b
                    @Override // n3.k0
                    public final n3.g3 a(android.view.View view2, n3.g3 g3Var) {
                        android.view.View view3 = findViewById;
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.W;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.this;
                        activityC11453xa58e34bc.getClass();
                        int i18 = g3Var.a(8).f328580d;
                        int i19 = g3Var.a(2).f328580d;
                        int max = java.lang.Math.max(i18, i19);
                        boolean z17 = max > 300 && gh5.d.b(activityC11453xa58e34bc);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputUI", "setupImeInsetsForEdgeToEdge onApplyWindowInsets imeVisible=%b, imeHeight=%d, navBarHeight=%d, imeOffset=%d originalPaddingBottom=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(java.lang.Math.max(max, 0)), java.lang.Integer.valueOf(paddingBottom));
                        if (z17) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/MobileInputUI", "lambda$setupImeInsetsForEdgeToEdge$1", "(ILandroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        return g3Var;
                    }
                };
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.u(scrollView, k0Var);
            }
        }
        if (o45.wf.f424566k) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp) + j65.v.b(this);
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            str = "";
        }
        mo54450xbf7c1df6(str);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            m78484x84f07bce(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572073xz), com.p314xaae8f345.mm.R.raw.f80303x5f0699f8, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sb(this));
        }
        this.f155029x = k71.l.b(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.tb(this), 2);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), 0, 0);
        layoutParams.gravity = 1;
        this.f155029x.setLayoutParams(layoutParams);
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f78277xe59a1298)).addView(this.f155029x);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        super.onActivityResult(i17, i18, intent);
        java.util.Objects.toString(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc dcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc.GoNext;
        if (i17 == 32047) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("agree_privacy")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 1L, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec ecVar = this.I;
                if (ecVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra) ecVar).f155698i = 1;
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 2L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec ecVar2 = this.I;
            if (ecVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra) ecVar2).f155698i = 0;
            }
            ecVar2.b(dcVar);
            return;
        }
        if (i17 == 32046) {
            android.os.Bundle bundleExtra2 = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 == -1 && bundleExtra2 != null && bundleExtra2.getString("go_next", "").equals("get_reg_verify_code")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec ecVar3 = this.I;
                if (ecVar3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra) ecVar3).f155698i = 2;
                }
                ecVar3.b(dcVar);
                return;
            }
            return;
        }
        if (i17 == 32045) {
            android.os.Bundle bundleExtra3 = intent != null ? intent.getBundleExtra("result_data") : null;
            java.util.Map map = bundleExtra3 != null ? (java.util.Map) bundleExtra3.getSerializable("next_params") : null;
            if (map != null && (str = (java.lang.String) map.get("next_step")) != null && str.equals("continue_with_password")) {
                this.P = (java.lang.String) map.get("spam_ctx");
                this.I.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc.GoToVerifyPwd);
                return;
            } else {
                if (i18 == -1 && bundleExtra3 != null && bundleExtra3.getString("go_next", "").equals("auth_again")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec ecVar4 = this.I;
                    if (ecVar4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa) {
                        ecVar4.b(dcVar);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (i17 == 32044) {
            android.os.Bundle bundleExtra4 = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 == -1 && bundleExtra4 != null && bundleExtra4.getString("go_next", "").equals("auth_again")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec ecVar5 = this.I;
                if (ecVar5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa) ecVar5).c(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f155031z + this.A));
                    return;
                }
                return;
            }
            return;
        }
        if (i18 == -1) {
            if (i17 != 1024 || intent == null) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                stringExtra.getClass();
            }
            if (intExtra == -217) {
                mo48674x36654fab();
                this.V.a(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ub(this));
                return;
            }
            return;
        }
        if (i18 != 100) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.C = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("couttry_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        Y6(stringExtra3);
        java.lang.String stringExtra4 = intent.getStringExtra("iso_code");
        this.E = stringExtra4 != null ? stringExtra4 : "";
        if (this.G != 2 || u11.c.e(this.D)) {
            Z6();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class);
        intent2.putExtra("couttry_code", this.D);
        intent2.putExtra("country_name", this.C);
        intent2.putExtra("iso_code", this.E);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileInputUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        this.I.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc.GoBack);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        super.setRequestedOrientation(1);
        getWindow().getDecorView().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a08));
        this.G = getIntent().getIntExtra("mobile_input_purpose", 0);
        this.H = getIntent().getIntExtra("mobile_auth_type", 0);
        this.M = getIntent().getBooleanExtra("can_finish", false);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.vb(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        d71.d dVar = new d71.d();
        this.f155011J = dVar;
        dVar.c(mo55332x76847179());
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jlt);
        if (findViewById != null) {
            com.p314xaae8f345.mm.ui.a4.f(findViewById);
        }
        int i17 = this.G;
        if (i17 == -1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).V6();
            this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa(this.f155011J);
        } else if (i17 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("auth_ticket"))) {
                int[] intArrayExtra = getIntent().getIntArrayExtra("kv_report_login_method_data");
                if (intArrayExtra != null) {
                    this.L = intArrayExtra;
                }
                this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la();
            } else {
                this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa(this.f155011J);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).V6();
        } else {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInputUI", "wrong purpose %s", java.lang.Integer.valueOf(i17));
                finish();
                return;
            }
            this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra();
        }
        java.lang.String stringExtra = getIntent().getStringExtra("couttry_code");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        Y6(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.g(stringExtra));
        java.lang.String stringExtra2 = getIntent().getStringExtra("country_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.C = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.E = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("bindmcontact_shortmobile");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.B = stringExtra4;
        this.f155031z = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.a(this.D);
        java.lang.String stringExtra5 = getIntent().getStringExtra("input_mobile_number");
        this.A = stringExtra5 != null ? stringExtra5 : "";
        this.F = n71.a.a();
        mo43517x10010bd5();
        if (getIntent().getBooleanExtra("from_deep_link", false) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155031z) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            this.f155013e.m78938x765074af(this.A);
        }
        this.I.a(this);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f514974a;
            v61.h0.a(this.f155028w, this);
            if (com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) {
                this.f155028w.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573940gi4));
            } else if (com.p314xaae8f345.mm.ui.bk.Q()) {
                this.f155028w.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fe_));
            } else {
                this.f155028w.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gh_));
            }
            this.f155028w.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wb(this));
        }
        this.N = getIntent().getBooleanExtra("from_switch_account", false);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.u0.a(this, 6);
        v61.d.e(2);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        boolean X6 = X6();
        fo3.s sVar = fo3.s.INSTANCE;
        if (X6) {
            sVar.E7("ie_reg_eu");
        }
        if (W6()) {
            sVar.E7("ie_login");
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905 = this.f155016h;
        if (c21493x36e72905 != null) {
            c21493x36e72905.b();
        }
        ((java.util.LinkedHashMap) this.f155011J.f308410a).clear();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.U.mo48814x2efc64();
        this.I.mo48692x360802();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.V.c(this, i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.U.mo48813x58998cd();
        super.onResume();
        this.I.mo48691x68ac462();
        v61.d.e(2);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class);
    }
}
