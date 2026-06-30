package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI */
/* loaded from: classes9.dex */
public class ActivityC13135x13db66fd extends com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.AbstractActivityC13133x11a8215 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f177760J = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f177762e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f177763f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f177764g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f177765h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f177766i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f177767m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f177768n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f177769o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f177770p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f177771q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f177772r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f177773s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f177774t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ScrollView f177775u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f177776v;

    /* renamed from: w, reason: collision with root package name */
    public r45.tw4 f177777w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f177779y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f177780z;

    /* renamed from: d, reason: collision with root package name */
    public final int f177761d = i65.a.b(mo55332x76847179(), 200);

    /* renamed from: x, reason: collision with root package name */
    public boolean f177778x = false;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd, boolean z17) {
        activityC13135x13db66fd.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "goto set money");
        android.content.Intent intent = new android.content.Intent(activityC13135x13db66fd.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82.class);
        intent.putExtra("key_first_flag", z17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13135x13db66fd.B)) {
            intent.putExtra("key_desc_word", activityC13135x13db66fd.B);
        }
        r45.tw4 tw4Var = activityC13135x13db66fd.f177777w;
        if (tw4Var != null) {
            try {
                intent.putExtra("key_notice_item", android.util.Base64.encodeToString(tw4Var.mo14344x5f01b1f6(), 2));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QrRewardMainUI", e17, "", new java.lang.Object[0]);
            }
        }
        activityC13135x13db66fd.startActivityForResult(intent, 1);
    }

    public final boolean V6() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A);
    }

    public final void W6(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = this.f177779y;
        boolean z18 = str3 != null && str3.equals(str);
        boolean d17 = yw1.c.c().d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(d17));
        if (!z17 && z18 && d17) {
            return;
        }
        yw1.c c17 = yw1.c.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.p(this);
        c17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", str);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(yw1.c.b());
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_QrRewardCdnDownloadHelper";
        mVar.f323319e = false;
        mVar.f323320f = c17;
        mVar.f69595x6d25b0d9 = yw1.c.b() + c17.a();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("QrRewardImg", java.lang.System.currentTimeMillis(), c01.z1.g().d1(), "");
        mVar.f69601xaca5bdda = b17 != null ? b17 : "";
        mVar.f69591xf9dbbe9c = str;
        mVar.f69575xf11df5f5 = str2;
        mVar.f69592xf1ebe47b = 5;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 0;
        mVar.f69584x89a4c0cf = 0;
        if (c17.f548136d == null) {
            c17.f548136d = new java.util.HashMap();
        }
        ((java.util.HashMap) c17.f548136d).put(mVar.f69601xaca5bdda, pVar);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", str);
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "do set photo word");
        xw1.j jVar = new xw1.j(this.A);
        jVar.f539193g = new java.lang.ref.WeakReference(this);
        m83099x5406100e(jVar, true);
    }

    public final void Y6() {
        int round = java.lang.Math.round(this.f177761d * ((this.F * 1.0f) / this.E));
        if (round <= 0) {
            round = 248;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f177769o.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = round;
        this.f177769o.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f177768n.getLayoutParams();
        layoutParams2.width = round;
        layoutParams2.height = round;
        this.f177768n.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f177770p.getLayoutParams();
        int i17 = round - 30;
        layoutParams3.width = i17;
        layoutParams3.height = i17;
        this.f177770p.setLayoutParams(layoutParams3);
        this.f177770p.setTextSize(0, (round * 2) / 3);
        this.f177765h.requestLayout();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            this.f177771q.setText("");
        } else {
            android.widget.TextView textView = this.f177771q;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hpj, this.B);
            float textSize = this.f177771q.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string, textSize));
        }
        a7(V6());
    }

    public final void Z6() {
        if (V6()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f177770p;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.lang.String str = this.A;
        float textSize = this.f177770p.getTextSize();
        ((ke0.e) xVar).getClass();
        c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
        this.f177770p.mo81549xf579a34a(this.A.length());
    }

    public final void a7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "switch mode: %s", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            this.f177768n.setVisibility(4);
            this.f177770p.setVisibility(0);
            return;
        }
        this.f177768n.setVisibility(0);
        this.f177770p.setVisibility(4);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = this.f177768n;
        java.lang.String str = this.I;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, 0.03f, true);
    }

    public final void b7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            this.f177773s.setVisibility(8);
            return;
        }
        this.f177773s.setClickable(true);
        this.f177773s.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.q(this));
        android.text.SpannableString spannableString = new android.text.SpannableString(this.C);
        spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
        this.f177773s.setText(spannableString);
        this.f177773s.setVisibility(0);
    }

    public final void c7() {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177780z);
        int i17 = this.f177761d;
        if (!K0) {
            this.f177767m.b(this.f177780z, i17, i17, -1);
            this.f177766i.setVisibility(0);
            return;
        }
        if (!yw1.c.c().d()) {
            this.f177766i.setVisibility(4);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f177767m;
        yw1.c c17 = yw1.c.c();
        c17.getClass();
        c19659x677e0913.b(yw1.c.b() + c17.a(), i17, i17, -1);
        this.f177766i.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177762e = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.m7q);
        this.f177763f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.lg6);
        this.f177764g = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f568035lg5);
        this.f177765h = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f568034lg4);
        this.f177767m = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.lfz);
        this.f177771q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568033lg3);
        this.f177768n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.lfy);
        this.f177769o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.lfx);
        this.f177766i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f568030lg0);
        this.f177770p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.f568031lg1);
        this.f177772r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lg8);
        this.f177774t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lga);
        this.f177773s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lfw);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f177776v = c22905xef04d72d;
        c22905xef04d72d.a();
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = this.f177768n;
        java.lang.String str = this.I;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, 0.03f, true);
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f177770p;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.lang.String str2 = this.A;
            float textSize = this.f177770p.getTextSize();
            ((ke0.e) xVar).getClass();
            c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str2, textSize));
            this.f177770p.mo81549xf579a34a(this.A.length());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QrRewardMainUI", e17, "", new java.lang.Object[0]);
        }
        this.f177770p.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.u(this));
        this.f177770p.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.v(this));
        this.f177769o.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hov));
        this.f177769o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.w(this));
        this.f177772r.setClickable(true);
        this.f177772r.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.z(this));
        android.text.SpannableString spannableString = new android.text.SpannableString(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hp8));
        spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
        this.f177772r.setText(spannableString);
        this.f177774t.setClickable(true);
        this.f177774t.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.a0(this));
        android.text.SpannableString spannableString2 = new android.text.SpannableString(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hph));
        spannableString2.setSpan(d7Var2, 0, spannableString2.length(), 18);
        this.f177774t.setText(spannableString2);
        c7();
        Y6();
        Z6();
        b7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needExecuteBackListener */
    public boolean mo48644xb863f65a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 == -1) {
            this.B = intent.getStringExtra("key_desc");
            this.E = intent.getIntExtra("key_photo_width", 900);
            this.F = intent.getIntExtra("key_icon_width", uc1.t1.f76916x366c91de);
            boolean booleanExtra = intent.getBooleanExtra("key_return_from_first", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "return from first: %s", java.lang.Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                this.f177765h.setVisibility(0);
                this.f177764g.setVisibility(8);
            }
            this.H = true;
            Y6();
            java.lang.String stringExtra = intent.getStringExtra("key_photo_url");
            java.lang.String stringExtra2 = intent.getStringExtra("key_photo_aeskey");
            java.lang.String stringExtra3 = intent.getStringExtra("key_photo_url_v2");
            this.f177780z = stringExtra3;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                W6(stringExtra, stringExtra2, true);
            } else {
                c7();
            }
            this.f177779y = stringExtra;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.AbstractActivityC13133x11a8215, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        m83090x14f40144(1323);
        m83090x14f40144(1649);
        this.E = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, 900)).intValue();
        this.F = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, java.lang.Integer.valueOf(uc1.t1.f76916x366c91de))).intValue();
        this.B = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, "");
        this.A = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
        this.C = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_STR_STRING_SYNC, "");
        this.D = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_URL_STRING_SYNC, "");
        this.f177779y = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, "");
        this.f177780z = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_V2_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, ""))) {
            this.H = true;
        }
        this.I = c01.z1.r();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574277hp3);
        mo43517x10010bd5();
        boolean z17 = yw1.c.c().d() && this.H;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "do get code: %s", java.lang.Boolean.valueOf(z17));
        xw1.d dVar = new xw1.d(z17);
        dVar.f539193g = new java.lang.ref.WeakReference(this);
        if (z17) {
            m83099x5406100e(dVar, false);
        } else {
            m83099x5406100e(dVar, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1323);
        m83121xf6ff5b27(1649);
        yw1.c c17 = yw1.c.c();
        java.util.Map map = c17.f548136d;
        if (map != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", java.lang.Integer.valueOf(((java.util.HashMap) map).size()));
            ((java.util.HashMap) c17.f548136d).clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onKeyboardStateChanged */
    public void mo54561x62d1e2e9() {
        super.mo54561x62d1e2e9();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "key board changed: %s", java.lang.Integer.valueOf(mo70705x8200b8ea()));
        if (mo70705x8200b8ea() == 2) {
            this.A = this.f177770p.getText().toString();
            X6();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
                a7(true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof xw1.d) {
            xw1.d dVar = (xw1.d) m1Var;
            dVar.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.d0(this, dVar));
            dVar.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.c0(this, dVar));
            if (dVar.f539194h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardMainUI", "net error: %s", dVar);
                if (!dVar.f539199p) {
                    U6(this, false);
                }
            }
            return true;
        }
        if (m1Var instanceof xw1.j) {
            xw1.j jVar = (xw1.j) m1Var;
            jVar.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.l(this, jVar));
            jVar.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.k(this, jVar));
            if (jVar.f539194h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardMainUI", "net error: %s", jVar);
                this.A = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
                a7(V6());
                this.f177770p.setText("");
                Z6();
            }
            this.f177770p.clearFocus();
            this.f177770p.setCursorVisible(false);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "onScreenShot");
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_qr_reward_page", null, 0);
    }
}
