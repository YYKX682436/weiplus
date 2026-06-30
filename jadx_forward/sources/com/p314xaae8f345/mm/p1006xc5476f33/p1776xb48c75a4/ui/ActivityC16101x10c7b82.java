package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI */
/* loaded from: classes9.dex */
public class ActivityC16101x10c7b82 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {
    public r45.tw4 A;
    public java.lang.String B;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ScrollView f223849f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f223850g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f223851h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f223852i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f223853m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f223854n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f223855o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f223856p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f223857q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f223858r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f223859s;

    /* renamed from: t, reason: collision with root package name */
    public long f223860t = 100000;

    /* renamed from: u, reason: collision with root package name */
    public long f223861u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f223862v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f223863w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f223864x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f223865y;

    /* renamed from: z, reason: collision with root package name */
    public int f223866z;

    public static boolean V6(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16101x10c7b82.f223850g.m83183xfb85ada3())) {
            activityC16101x10c7b82.W6(false);
            activityC16101x10c7b82.X6(false);
            activityC16101x10c7b82.f223854n.setEnabled(false);
            return false;
        }
        int i07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(activityC16101x10c7b82.f223850g.m83183xfb85ada3(), "100");
        long j17 = i07;
        if (j17 < activityC16101x10c7b82.f223861u) {
            activityC16101x10c7b82.X6(true);
            activityC16101x10c7b82.f223854n.setEnabled(false);
            return false;
        }
        if (j17 > activityC16101x10c7b82.f223860t) {
            activityC16101x10c7b82.W6(true);
            activityC16101x10c7b82.f223854n.setEnabled(false);
            return false;
        }
        if (i07 == 0) {
            activityC16101x10c7b82.f223854n.setEnabled(false);
            return false;
        }
        activityC16101x10c7b82.W6(false);
        activityC16101x10c7b82.X6(false);
        activityC16101x10c7b82.f223854n.setEnabled(true);
        return true;
    }

    public final void W6(boolean z17) {
        if (!z17 || this.f223853m.isShown()) {
            if (z17 || !this.f223853m.isShown()) {
                return;
            }
            this.f223853m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
            this.f223853m.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + this.f223860t, "100", 2, java.math.RoundingMode.HALF_UP).toString());
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            this.f223853m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fx9, sb7));
        } else {
            this.f223853m.setText(this.B);
        }
        this.f223853m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8));
        this.f223853m.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) ((v73.k0) m80391xac8f1cfd(v73.k0.class)).mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h3v);
        textView.announceForAccessibility(textView.getText());
    }

    public final void X6(boolean z17) {
        if (!z17 || this.f223853m.isShown()) {
            if (z17 || !this.f223853m.isShown()) {
                return;
            }
            this.f223853m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
            this.f223853m.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + this.f223861u, "100", 2, java.math.RoundingMode.HALF_UP));
        this.f223853m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxc, sb6.toString()));
        this.f223853m.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8));
        this.f223853m.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) ((v73.k0) m80391xac8f1cfd(v73.k0.class)).mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h3v);
        textView.announceForAccessibility(textView.getText());
    }

    public final void Y6() {
        this.f223856p.setVisibility(0);
        this.f223858r.setVisibility(8);
        this.f223858r.setText(this.f223864x);
        this.f223858r.mo81549xf579a34a(this.f223864x.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxe);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.lang.String str = this.f223864x;
        float textSize = this.f223856p.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize);
        spannableStringBuilder.append((java.lang.CharSequence) j17);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(1, new v73.h0(this)), j17.length() + 1, spannableStringBuilder.length(), 34);
        this.f223856p.setText(spannableStringBuilder);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f223849f = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.h3u);
        this.f223850g = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.h3s);
        this.f223852i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h3n);
        this.f223853m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h3v);
        this.f223851h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h3l);
        this.f223854n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h3o);
        this.f223855o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h3p);
        this.f223856p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h3x);
        this.f223858r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.h3w);
        this.f223859s = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f223851h, this.f223863w, 0.06f);
        java.lang.String h17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h(this.f223863w, 10);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223862v)) {
            h17 = java.lang.String.format("%s(%s)", h17, this.f223862v);
        }
        android.widget.TextView textView = this.f223852i;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        float textSize = this.f223852i.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, h17, textSize));
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f223850g.f295694h;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.setPadding(0, 0, 0, 0);
        }
        this.f223850g.m83186xefe232c4().setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        this.f223850g.b(new v73.z(this));
        this.f223850g.setOnClickListener(new v73.a0(this));
        this.f223855o.setOnClickListener(new v73.b0(this));
        this.f223854n.setClickable(true);
        this.f223854n.setOnClickListener(new v73.c0(this));
        this.f223856p.setClickable(true);
        this.f223856p.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        this.f223858r.setOnEditorActionListener(new v73.d0(this));
        this.f223858r.setOnFocusChangeListener(new v73.e0(this));
        Y6();
        m83129xcfb55a41(new v73.f0(this));
        m83125x8f91b80(this.f223850g, 2, false);
        this.f223850g.postDelayed(new v73.g0(this), 100L);
        this.f223857q = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.h3t);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223865y)) {
            this.f223857q.setImageResource(u73.h.d(this.f223866z));
        } else {
            this.f223857q.b(this.f223865y, 0, 0, u73.h.d(this.f223866z));
        }
        this.f223859s.m83148xdedf72f8(this.A);
        this.f223859s.m83149xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        this.f223859s.m83150x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f223794e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560767tm;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        this.f223860t = getIntent().getLongExtra("key_max_credit_line", 0L);
        this.B = getIntent().getStringExtra("key_over_max_limit_warning");
        this.f223861u = getIntent().getLongExtra("key_min_credit_line", 0L);
        this.f223862v = getIntent().getStringExtra("key_true_name");
        this.f223863w = getIntent().getStringExtra("key_username");
        this.f223864x = getIntent().getStringExtra("key_wishing");
        this.f223865y = getIntent().getStringExtra("key_icon_url");
        this.f223866z = getIntent().getIntExtra("key_cardtype", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("key_notice_item");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
        java.lang.String str = this.f223793d;
        if (!K0) {
            try {
                r45.tw4 tw4Var = new r45.tw4();
                tw4Var.mo11468x92b714fd(android.util.Base64.decode(stringExtra, 2));
                this.A = tw4Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
            }
        }
        if (this.f223866z == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "error card type!!");
            finish();
        }
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fwz);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v73.k0.class);
    }
}
