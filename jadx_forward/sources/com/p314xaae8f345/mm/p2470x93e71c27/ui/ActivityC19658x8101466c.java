package com.p314xaae8f345.mm.p2470x93e71c27.ui;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.uc.f34908x366c91de)
/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI */
/* loaded from: classes15.dex */
public class ActivityC19658x8101466c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f271403x = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f271404d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f271405e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 f271406f;

    /* renamed from: g, reason: collision with root package name */
    public int f271407g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f271408h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f271409i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f271410m;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f271416s;

    /* renamed from: n, reason: collision with root package name */
    public long f271411n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f271412o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f271413p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f271414q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f271415r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnTouchListener f271417t = new com.p314xaae8f345.mm.p2470x93e71c27.ui.e4(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.n3 f271418u = new com.p314xaae8f345.mm.p2470x93e71c27.ui.f4(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f271419v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f271420w = false;

    public void T6(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoiceInputUI", "voiceinputui finish type: %d, call stack: %s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        this.f271419v = true;
        if (i17 == 8) {
            V6(7);
        } else {
            V6(i17);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385 c6218x5d218385 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6218x5d218385();
        am.n00 n00Var = c6218x5d218385.f136467g;
        if (i17 == 7) {
            n00Var.f88918a = 1;
        } else if (i17 == 8) {
            n00Var.f88918a = 4;
        } else {
            n00Var.f88918a = 2;
        }
        if (this.f271414q) {
            n00Var.f88919b = 1;
        } else {
            n00Var.f88919b = 2;
        }
        n00Var.f88920c = this.f271404d.getText().toString();
        n00Var.f88921d = this.f271410m;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = this.f271406f;
        if (c19652xe1933193 != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c19652xe1933193.f271375o;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.l();
                c19652xe1933193.f271375o.a();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = c19652xe1933193.f271376p;
            if (ibVar != null) {
                ibVar.f();
            }
        }
        c6218x5d218385.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f271404d);
        if (this.f271420w) {
            super.finish();
        }
    }

    public final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoiceInputUI", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(c17189xc14104a.f37845xae7a2e7a), java.lang.Integer.valueOf(c17189xc14104a.f37856x35cf88), java.lang.Integer.valueOf(c17189xc14104a.f37849x5a5c588), java.lang.Integer.valueOf(c17189xc14104a.f37854x614bc6c), java.lang.Long.valueOf(c17189xc14104a.f37855x3b706d59), java.lang.Integer.valueOf(c17189xc14104a.f37865xc099c45b), java.lang.Integer.valueOf(c17189xc14104a.f37862x1d166fd2), java.lang.Long.valueOf(c17189xc14104a.f37864x7cd6cfaa), java.lang.Integer.valueOf(c17189xc14104a.f37863x9ec2f6cd), java.lang.Long.valueOf(c17189xc14104a.f37867x8182a0a5), java.lang.Integer.valueOf(c17189xc14104a.f37850x2fd71e), java.lang.Integer.valueOf(c17189xc14104a.f37848x5a5b64d), java.lang.Integer.valueOf(c17189xc14104a.f37861x80c0d267), java.lang.Integer.valueOf(c17189xc14104a.f37866xc755f37d), java.lang.Integer.valueOf(c17189xc14104a.f37851xe1880c15), java.lang.Long.valueOf(c17189xc14104a.f37852x87f1c082));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1 c17191x850a0de1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1();
        c17191x850a0de1.f37886x6afc6eb = c17189xc14104a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.I(13905, c17191x850a0de1, false, false);
    }

    public final void V6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
        c17189xc14104a.f37862x1d166fd2 = this.f271412o;
        c17189xc14104a.f37863x9ec2f6cd = i17;
        long j17 = this.f271411n;
        if (j17 != 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c17189xc14104a.f37864x7cd6cfaa = android.os.SystemClock.elapsedRealtime() - j17;
            this.f271411n = 0L;
        }
        U6(c17189xc14104a);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d4d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.f271408h = intent.getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
            this.f271407g = intent.getIntExtra("offset", -1);
            this.f271409i = intent.getStringExtra("punctuation");
            this.f271410m = intent.getStringExtra("userCode");
            this.f271415r = intent.getBooleanExtra("isFromWeNote", false);
        }
        getWindow().setSoftInputMode(32);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f271411n = android.os.SystemClock.elapsedRealtime();
        this.f271412o = 0;
        this.f271414q = false;
        this.f271413p = true;
        this.f271404d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.p5k);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.p5j);
        this.f271405e = button;
        if (this.f271415r) {
            button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.lx6));
        }
        this.f271404d.addTextChangedListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.g4(this));
        this.f271405e.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.h4(this));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9e));
        m78501x43e00957(true);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p2470x93e71c27.ui.d4(this));
        this.f271404d.setOnTouchListener(this.f271417t);
        this.f271404d.n(this.f271408h);
        int i17 = this.f271407g;
        if (i17 != -1) {
            this.f271404d.mo81549xf579a34a(i17);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193) findViewById(com.p314xaae8f345.mm.R.id.m9x);
        this.f271406f = c19652xe1933193;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f271404d;
        java.lang.String str = this.f271409i;
        java.lang.String str2 = this.f271410m;
        c19652xe1933193.f271377q = c22621x7603e017;
        c22621x7603e017.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.h3(c19652xe1933193));
        c22621x7603e017.setOnEditorActionListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.i3(c19652xe1933193));
        if (c19652xe1933193.f271376p == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib(c19652xe1933193.getContext(), true, c19652xe1933193.f271377q);
            c19652xe1933193.f271376p = ibVar;
            ibVar.m75547x6c4ebec7(new com.p314xaae8f345.mm.p2470x93e71c27.ui.m3(c19652xe1933193));
            c19652xe1933193.f271376p.m75551x4b076692(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(c19652xe1933193.getContext()));
        }
        c19652xe1933193.f271376p.h();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar2 = c19652xe1933193.f271376p;
        if (ibVar2.f271942l1) {
            ibVar2.f271942l1 = false;
            android.view.View findViewById = ibVar2.findViewById(com.p314xaae8f345.mm.R.id.p5q);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i18 = ibVar2.f271958y0;
            if (layoutParams == null) {
                layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i18);
            }
            layoutParams.height = i18;
            findViewById.setLayoutParams(layoutParams);
            ibVar2.o();
            ibVar2.requestLayout();
        }
        c19652xe1933193.f271376p.setVisibility(8);
        c19652xe1933193.f271376p.m75552x24830fe8(str2);
        c19652xe1933193.f271376p.m75549x24259b27(str);
        c19652xe1933193.f271380t.addView(c19652xe1933193.f271376p, -1, 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = c19652xe1933193.f271376p.getLayoutParams();
        layoutParams2.height = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(c19652xe1933193.getContext());
        c19652xe1933193.f271376p.setLayoutParams(layoutParams2);
        this.f271406f.m75382x8f404dc9(this.f271418u);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.f271416s = f5Var;
        f5Var.f291933e = this;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.jlt);
        if (findViewById2 != null) {
            com.p314xaae8f345.mm.ui.a4.f(findViewById2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            T6(2);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f271416s.d();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f271404d.requestFocus();
        this.f271404d.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.j4(this));
        this.f271416s.f();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        T6(3);
        super.mo2295x59cfc822();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            this.f271416s.f();
        } else {
            this.f271416s.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        if (i17 <= 0) {
            this.f271420w = true;
            if (this.f271419v) {
                super.finish();
            }
        } else {
            this.f271420w = false;
        }
        float f17 = -i17;
        this.f271406f.setTranslationY(f17);
        this.f271405e.setTranslationY(f17);
    }
}
