package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI */
/* loaded from: classes8.dex */
public class ViewOnCreateContextMenuListenerC16941x4db497e1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnCreateContextMenuListener {
    public static java.lang.String N = "var mail_css = document.createElement(\"style\");";
    public static java.lang.String P = "";
    public static java.lang.String Q = "";
    public static float R;
    public static int S;
    public boolean A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String G;

    /* renamed from: J, reason: collision with root package name */
    public android.content.SharedPreferences f236457J;
    public java.lang.String K;
    public int L;

    /* renamed from: f, reason: collision with root package name */
    public ks3.b0 f236460f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f236461g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f236462h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f236463i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f236464m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f236465n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f236466o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f236467p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f236468q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f236469r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f236470s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f236471t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f236472u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16937x774df189 f236473v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f236474w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f236475x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f236476y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f236477z;

    /* renamed from: d, reason: collision with root package name */
    public long f236458d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f236459e = "";
    public long E = -1;
    public int F = 0;
    public int H = 0;
    public int I = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 M = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new os3.c4(this), true);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1, int i17, int i18) {
        viewOnCreateContextMenuListenerC16941x4db497e1.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("kv_report_key", i17);
        bundle.putInt("kv_report_value", i18);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, js3.i.class, null);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        viewOnCreateContextMenuListenerC16941x4db497e1.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("download_url", viewOnCreateContextMenuListenerC16941x4db497e1.C);
        bundle.putString("download_md5", viewOnCreateContextMenuListenerC16941x4db497e1.D);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, js3.b.class, new os3.t3(viewOnCreateContextMenuListenerC16941x4db497e1));
    }

    public final void V6() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, null, js3.e.class, new os3.v3(this));
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, null, js3.g.class, new os3.x3(this));
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(this, "com.tencent.androidqqmail")) {
            this.I = 3;
            W6();
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("QQMAIL", 4);
        this.f236457J = sharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        long j17 = sharedPreferences.getLong("qqmail_downloadid", -1L);
        this.E = j17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(j17), js3.d.class, new os3.z3(this));
    }

    public final void W6() {
        int i17 = this.I;
        if (i17 == 0) {
            this.f236476y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hrv);
            return;
        }
        if (i17 == 1) {
            this.f236476y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hrt);
            return;
        }
        if (i17 == 2) {
            this.f236476y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hru);
            return;
        }
        if (i17 != 3) {
            return;
        }
        int i18 = this.L;
        java.lang.String num = i18 > 99 ? "99+" : i18 > 0 ? java.lang.Integer.toString(i18) : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(num)) {
            this.f236476y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hrw);
        } else {
            this.f236476y.setText(java.lang.String.format(i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.hrx), num));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cca;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f236464m = (com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed) findViewById(com.p314xaae8f345.mm.R.id.lei);
        this.f236466o = (com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed) findViewById(com.p314xaae8f345.mm.R.id.lej);
        this.f236465n = (com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed) findViewById(com.p314xaae8f345.mm.R.id.leh);
        this.f236467p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568063lk3);
        this.f236468q = findViewById(com.p314xaae8f345.mm.R.id.f568065lk5);
        this.f236469r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lk8);
        this.f236470s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lk9);
        this.f236471t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lk7);
        this.f236472u = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f568061lk1);
        this.f236473v = (com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16937x774df189) findViewById(com.p314xaae8f345.mm.R.id.f568060lk0);
        this.f236462h = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.f568064lk4);
        this.f236463i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.lk6);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        ((yg0.c3) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c2.f268656a).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262 c19488x4bf6d262 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262(this, null, 0);
        this.f236461g = c19488x4bf6d262;
        c19488x4bf6d262.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        ((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.ljt)).addView(this.f236461g);
        this.f236477z = findViewById(com.p314xaae8f345.mm.R.id.j8a);
        this.f236474w = findViewById(com.p314xaae8f345.mm.R.id.f567365j85);
        this.f236476y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j88);
        this.f236475x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j87);
        this.f236474w.setOnClickListener(new os3.k4(this));
        this.f236467p.setOnClickListener(new os3.m4(this));
        this.f236463i.setOnClickListener(new os3.n4(this));
        this.f236471t.setOnClickListener(new os3.o4(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new os3.u4(this));
        mo54448x9c8c0d33(new os3.v4(this));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        R = displayMetrics.widthPixels / displayMetrics.scaledDensity;
        S = displayMetrics.heightPixels;
        this.f236461g.mo120153xd15cf999().w(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        this.f236461g.mo120153xd15cf999().N(false);
        this.f236461g.mo120153xd15cf999().r(false);
        this.f236461g.mo120153xd15cf999().y(false);
        this.f236461g.mo120153xd15cf999().H(false);
        this.f236461g.mo120153xd15cf999().P(true);
        this.f236461g.G0();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2) this.f236461g).mo74812x7b53e229(this.f236477z);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2) this.f236461g).mo74811xefc28a3c(this.f236474w);
        android.content.Intent intent = mo55332x76847179().getIntent();
        byte[] bArr = new byte[112];
        bArr[25] = 1;
        bArr[16] = 1;
        bArr[57] = 1;
        bArr[63] = 1;
        bArr[61] = 1;
        bArr[70] = 1;
        bArr[68] = 1;
        bArr[82] = 1;
        bArr[111] = 1;
        intent.putExtra("hardcode_jspermission", new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(bArr));
        mo55332x76847179().setIntent(intent);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f236461g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w1 w1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.v1.f269112a;
        os3.y4 y4Var = new os3.y4(this);
        ((yg0.w2) w1Var).getClass();
        c22633x83752a59.mo74800x23d27c02(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w3(c22633x83752a59, true, y4Var, null));
        if (P.equals("")) {
            try {
                P += com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(getAssets().open("mail/lib.js"));
                Q += com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(getAssets().open("mail/readmail.js"));
                N += "mail_css.innerHTML=`" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(getAssets().open("mail/qmail_webview.css")) + "`; document.head.appendChild(mail_css);";
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReadMailUI", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMailUI", "evaluateJavascript error " + e17.getMessage());
            }
        }
        registerForContextMenu(this.f236461g);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this).c(this.f236461g, this, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f236458d = getIntent().getLongExtra("msgid", -1L);
        this.f236459e = getIntent().getStringExtra("talker");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadMailUI", "onCreate msgId %d, talker: %s", java.lang.Long.valueOf(this.f236458d), this.f236459e);
        mo43517x10010bd5();
        V6();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("talker", this.f236459e);
        bundle2.putLong("msgid", this.f236458d);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle2, js3.f.class, new os3.g4(this));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i17;
        if ((view instanceof com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) && ((i17 = ((com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) view).mo120147x1d5dd38c().f301772a) == 5 || i17 == 8)) {
            return;
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f236461g.setVisibility(8);
        this.f236461g.mo52095x5cd39ffa();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A) {
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f236461g.mo120194xc77ccada();
    }
}
