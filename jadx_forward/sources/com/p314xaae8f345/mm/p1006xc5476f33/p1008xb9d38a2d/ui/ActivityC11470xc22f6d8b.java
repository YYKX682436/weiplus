package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI */
/* loaded from: classes14.dex */
public class ActivityC11470xc22f6d8b extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16714x3034a8ab implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f155193v = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f155194e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f155195f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f155196g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f155197h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21398x34296d3b f155198i;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155202p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155203q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf f155204r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155205s;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f155199m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f155200n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155201o = "";

    /* renamed from: t, reason: collision with root package name */
    public final android.text.TextWatcher f155206t = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ni(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f155207u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.SimpleLoginUI.2
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleLoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/SimpleLoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public final void Z6() {
        java.lang.String trim = this.f155196g.getText().toString().trim();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f155200n;
        w6Var.f155819b = trim;
        w6Var.f155820c = this.f155197h.getText().toString();
        if (w6Var.f155819b.equals("")) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k6d, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        if (w6Var.f155820c.equals("")) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k67, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        mo48674x36654fab();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).U6();
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.v0(w6Var.f155819b, w6Var.f155820c, this.f155202p, 0));
        a7(true);
    }

    public final void a7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf c11389x36418bdf = this.f155204r;
        if (c11389x36418bdf == null || c11389x36418bdf.f154727x == z17) {
            return;
        }
        c11389x36418bdf.A(z17);
        com.p314xaae8f345.mm.ui.C21398x34296d3b c21398x34296d3b = this.f155198i;
        if (c21398x34296d3b != null) {
            c21398x34296d3b.m78618x19836403(!z17);
        }
        if (!z17) {
            this.f155204r.B(com.p314xaae8f345.mm.R.C30867xcad56011.gi7);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f155197h;
            if (c21486x59d05a04 != null) {
                c21486x59d05a04.setEnabled(true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f155196g;
            if (c21486x59d05a042 != null) {
                c21486x59d05a042.setEnabled(true);
                return;
            }
            return;
        }
        this.f155204r.C(com.p314xaae8f345.mm.R.C30867xcad56011.p2r, false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a043 = this.f155197h;
        if (c21486x59d05a043 != null) {
            c21486x59d05a043.clearFocus();
            this.f155197h.setEnabled(false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a044 = this.f155196g;
        if (c21486x59d05a044 != null) {
            c21486x59d05a044.clearFocus();
            this.f155196g.setEnabled(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bst;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f155194e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.iod);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ipf);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (yp5.a.f545942a.a()) {
            this.f155194e.m78934x764b0e09(com.p314xaae8f345.mm.R.C30867xcad56011.f573935gh5);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gho);
        } else {
            this.f155194e.m78934x764b0e09(com.p314xaae8f345.mm.R.C30867xcad56011.gh6);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ghp);
        }
        this.f155195f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.ip_);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) this.f155194e.m78930xd454f3ba();
        this.f155196g = c21486x59d05a04;
        c21486x59d05a04.setFocusableInTouchMode(false);
        this.f155196g.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pi(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) this.f155195f.m78930xd454f3ba();
        this.f155197h = c21486x59d05a042;
        c21486x59d05a042.setFocusableInTouchMode(false);
        this.f155197h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qi(this));
        ck5.f b17 = ck5.f.b(this.f155197h);
        b17.f124094f = 0;
        b17.f124093e = 16;
        b17.d(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf c11389x36418bdf = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf) findViewById(com.p314xaae8f345.mm.R.id.iol);
        this.f155204r = c11389x36418bdf;
        c11389x36418bdf.C(com.p314xaae8f345.mm.R.C30867xcad56011.gh7, true);
        this.f155204r.setEnabled(false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a043 = this.f155196g;
        android.text.TextWatcher textWatcher = this.f155206t;
        c21486x59d05a043.addTextChangedListener(textWatcher);
        this.f155197h.addTextChangedListener(textWatcher);
        this.f155197h.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ri(this));
        this.f155197h.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.si(this));
        this.f155196g.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ti(this));
        this.f155197h.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ui(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.iov);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/SimpleLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/account/ui/SimpleLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gik);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ci(this));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f155202p = stringExtra;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a044 = this.f155196g;
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.c();
            if (c17 == null) {
                c17 = "";
            }
            c21486x59d05a044.setText(c17);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a045 = this.f155197h;
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.d();
            c21486x59d05a045.setText(d17 != null ? d17 : "");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.di(this), 500L);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.vb.j(this, null);
        }
        this.f155204r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ei(this));
        this.f155198i = k71.l.b(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fi(this), -1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), 0, 0);
        layoutParams.gravity = 1;
        this.f155198i.setLayoutParams(layoutParams);
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f78277xe59a1298)).addView(this.f155198i);
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
                Z6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.l()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.t();
            com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.m83866x8d670feb();
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        mo43517x10010bd5();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        mo48674x36654fab();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
        if (!booleanExtra) {
            T6();
        }
        W6(1);
        if (booleanExtra) {
            U6(1);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f155202p = intent.getStringExtra("auth_ticket");
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f155202p = extras.getString("auth_ticket");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155202p)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f155196g;
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.c();
        if (c17 == null) {
            c17 = "";
        }
        c21486x59d05a04.setText(c17);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = this.f155197h;
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.d();
        c21486x59d05a042.setText(d17 != null ? d17 : "");
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.oi(this), 500L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        a7(false);
        super.onPause();
        this.f155207u.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f155207u.mo48813x58998cd();
        super.onResume();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r23, int r24, java.lang.String r25, com.p314xaae8f345.mm.p944x882e457a.m1 r26) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16714x3034a8ab, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class);
    }
}
