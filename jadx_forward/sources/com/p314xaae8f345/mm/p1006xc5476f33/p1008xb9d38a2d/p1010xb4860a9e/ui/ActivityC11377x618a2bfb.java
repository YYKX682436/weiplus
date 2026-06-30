package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI */
/* loaded from: classes8.dex */
public class ActivityC11377x618a2bfb extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public int f154684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154685e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154686f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154687g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154688h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f154689i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f154690m;

    /* renamed from: n, reason: collision with root package name */
    public int f154691n;

    /* renamed from: o, reason: collision with root package name */
    public int f154692o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154693p = null;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb activityC11377x618a2bfb) {
        int i17 = activityC11377x618a2bfb.f154691n;
        if (i17 <= 0 || activityC11377x618a2bfb.f154692o <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10991, java.lang.Integer.valueOf(i17), 7, java.lang.Integer.valueOf(activityC11377x618a2bfb.f154692o));
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.String str2 = this.f154685e;
        if (str2 == null || str2.equals("")) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        long j17 = -1;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str)) {
            try {
                j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str.split("@")[0], -1L);
            } catch (java.lang.Exception unused) {
            }
        }
        if (j17 > 0) {
            if (this.f154685e.equals("" + j17) && this.f154684d == 0) {
                android.widget.ImageView imageView = this.f154689i;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                imageView.setImageBitmap(com.p314xaae8f345.mm.p943x351df9c2.g.a(str));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.graphics.Bitmap a17;
        android.graphics.Bitmap bitmap;
        this.f154689i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.heq);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hev);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hex);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hew);
        this.f154690m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.het);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hey);
        textView.setText(this.f154686f);
        textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1q, this.f154686f));
        android.graphics.Bitmap bitmap2 = null;
        if (this.f154684d == 1) {
            this.f154689i.setBackgroundDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.raw.f78938x377db618));
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571941u5) + this.f154685e);
            java.lang.String g17 = kk.k.g(this.f154685e.getBytes());
            if (gm0.j1.u().l()) {
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                r61.a i17 = m61.k.wi().i(g17);
                if (i17 != null) {
                    java.lang.String str = i17.f474320c;
                    if (str == null) {
                        str = "";
                    }
                    bitmap = o25.b.b(str, this, false);
                } else {
                    bitmap = null;
                }
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                bitmap = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            if (bitmap != null) {
                this.f154689i.setImageBitmap(bitmap);
            } else {
                this.f154689i.setImageDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.raw.f78938x377db618));
            }
        }
        if (this.f154684d == 0) {
            this.f154689i.setBackgroundDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.raw.f78943xdd4f3fda));
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.u_) + this.f154685e);
            long b17 = (long) kk.v.b(this.f154685e);
            if (b17 != 0) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                bitmap2 = com.p314xaae8f345.mm.p943x351df9c2.g.a(new kk.v(b17) + "@qqim");
            }
            if (bitmap2 == null) {
                this.f154689i.setImageDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.raw.f78943xdd4f3fda));
            } else {
                this.f154689i.setImageBitmap(bitmap2);
            }
            button.setVisibility(0);
        }
        if (this.f154684d == 2) {
            this.f154690m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fqy);
            this.f154689i.setBackgroundDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.C30861xcebc809e.bho));
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571930tu) + this.f154685e);
            if (gm0.j1.u().l()) {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = this.f154687g;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str2 + "@google");
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                a17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            if (a17 != null) {
                this.f154689i.setImageBitmap(a17);
            } else {
                this.f154689i.setImageDrawable(i65.a.i(this, com.p314xaae8f345.mm.R.C30861xcebc809e.bho));
            }
            if (android.text.TextUtils.isEmpty(this.f154686f)) {
                textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q1(this.f154685e));
                textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1q, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q1(this.f154685e)));
            }
        }
        if (this.f154684d == 3) {
            this.f154690m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g1p);
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            java.lang.String str3 = this.f154693p;
            ((x60.e) fVar).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v0(str3, str3, 0, 0));
            if (d17 != null) {
                this.f154689i.setImageBitmap(d17);
            } else {
                this.f154689i.setImageResource(com.p314xaae8f345.mm.R.raw.f78922x61de8d17);
            }
            button.setVisibility(8);
        }
        this.f154690m.setOnClickListener(new s61.i0(this));
        button.setOnClickListener(new s61.j0(this));
        mo54448x9c8c0d33(new s61.k0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g1s);
        android.content.Intent intent = getIntent();
        this.f154684d = intent.getIntExtra("friend_type", -1);
        this.f154686f = intent.getStringExtra("friend_nick");
        this.f154685e = intent.getStringExtra("friend_num");
        this.f154687g = intent.getStringExtra("friend_googleID");
        this.f154688h = intent.getStringExtra("friend_googleItemID");
        java.lang.String str = this.f154685e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.f154685e = str;
        intent.getStringExtra("friend_linkedInID");
        this.f154693p = intent.getStringExtra("friend_linkedInPicUrl");
        mo43517x10010bd5();
        this.f154691n = intent.getIntExtra("search_kvstat_scene", 0);
        this.f154692o = intent.getIntExtra("search_kvstat_position", 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.j(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.a(this, android.os.Looper.getMainLooper());
    }
}
