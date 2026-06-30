package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI */
/* loaded from: classes12.dex */
public class ActivityC13052x7242bfaf extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4, lu1.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e f176375d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176376e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f176377f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f176378g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f176379h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f176380i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f176381m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f176382n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f176383o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f176384p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda f176385q;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f176387s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f176389u;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f176394z;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f176386r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public boolean f176388t = false;

    /* renamed from: v, reason: collision with root package name */
    public int f176390v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f176391w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f176392x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f176393y = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b2(this), true);
    public int B = 0;

    @Override // lu1.b
    public void I1(java.lang.String str, java.lang.String str2) {
        boolean equals = str.equals(this.f176375d.f176185i);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f176386r;
        if (equals) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r1(this, str2));
        } else if (str.equals(this.f176375d.f176186m)) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s1(this, str2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", str);
        }
    }

    @Override // lu1.b
    public void J(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    public final void T6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
            setResult(0);
            finish();
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                this.f176380i.mo69327xab3268fe(str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", str);
            setResult(0);
            finish();
        }
    }

    public final void U6() {
        if (this.f176394z == null) {
            this.f176394z = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(mo55332x76847179());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176377f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftVideoUI", "videoPath is null");
        } else {
            this.f176394z.c((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f176380i, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.t1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v1(this));
        }
    }

    public void V6() {
        this.f176389u.e(this.f176391w, this.f176390v, this.f176392x, this.f176393y);
        this.f176389u.d(this.f176378g, this.f176379h, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a2(this), null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        V6();
        return true;
    }

    @Override // lu1.b
    public void g2(java.lang.String str, int i17, int i18) {
        if (str.equals(this.f176375d.f176185i)) {
            this.f176386r.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q1(this, i18, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569837pm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f176378g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.p0w);
        this.f176381m = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f569096p06);
        this.f176382n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.f176383o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyr);
        this.f176385q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) findViewById(com.p314xaae8f345.mm.R.id.f569091p01);
        this.f176384p = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.ozc);
        this.f176380i = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05(this, null);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f176380i.mo69318x764d819b(this.f176376e);
        this.f176380i.mo69326x360a109e(this);
        this.f176381m.addView((android.view.View) this.f176380i, layoutParams);
        this.f176379h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.f176378g.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.w1(this));
        ((android.view.View) this.f176380i).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x1(this));
        this.f176389u = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(this);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftVideoUI", "%d on completion", java.lang.Integer.valueOf(hashCode()));
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f176380i).b(0.0d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getExtras() != null) {
            getIntent().getExtras().setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        this.f176387s = bundle;
        getWindow().setFlags(1024, 1024);
        if (com.p314xaae8f345.mm.p642xad8b531f.b.d() != null) {
            com.p314xaae8f345.mm.p642xad8b531f.b.d().a();
        }
        this.f176375d = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e) getIntent().getParcelableExtra("key_gift_into");
        this.f176377f = getIntent().getStringExtra("key_video_path");
        this.f176376e = getIntent().getBooleanExtra("key_is_mute", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = this.f176375d;
        if (c13037x580b4d4e != null) {
            c13037x580b4d4e.m54441x9616526c();
        }
        mo43517x10010bd5();
        lu1.c.b(this);
        U6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e2 = this.f176375d;
        if (c13037x580b4d4e2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13037x580b4d4e2.f176185i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e3 = this.f176375d;
        lu1.c.a(c13037x580b4d4e3.f176186m, c13037x580b4d4e3.f176189p, c13037x580b4d4e3.f176201z, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e4 = this.f176375d;
        lu1.c.a(c13037x580b4d4e4.f176185i, c13037x580b4d4e4.f176188o, c13037x580b4d4e4.f176200y, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f176380i).mo69303x360802();
        this.A.d();
        lu1.c.c(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        setResult(0);
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f176380i).mo69303x360802();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f176380i).mo69313x65825f6();
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        setResult(-1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f176386r;
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c2(this, true));
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d2(this));
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) this.f176380i).mo69330x68ac462();
        this.B = this.f176380i.mo69286x51e8b0a() / 1000;
        this.A.c(500L, 500L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", java.lang.Integer.valueOf(this.B));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176377f)) {
            T6(this.f176377f);
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f176387s;
        if (!this.f176388t) {
            this.f176388t = true;
            this.f176390v = getIntent().getIntExtra("img_top", 0);
            this.f176391w = getIntent().getIntExtra("img_left", 0);
            this.f176392x = getIntent().getIntExtra("img_width", 0);
            int intExtra = getIntent().getIntExtra("img_height", 0);
            this.f176393y = intExtra;
            this.f176389u.e(this.f176391w, this.f176390v, this.f176392x, intExtra);
            if (bundle == null) {
                this.f176378g.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.y1(this));
            }
        }
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
