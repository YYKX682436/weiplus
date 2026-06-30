package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI */
/* loaded from: classes9.dex */
public class ActivityC16103x79357e65 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f223880w = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f223881f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f223882g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f223883h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f223884i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f223885m;

    /* renamed from: n, reason: collision with root package name */
    public long f223886n;

    /* renamed from: o, reason: collision with root package name */
    public long f223887o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f223888p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f223889q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f223890r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f223891s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f223892t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f223893u;

    /* renamed from: v, reason: collision with root package name */
    public r45.an6 f223894v;

    public static boolean V6(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16103x79357e65 activityC16103x79357e65) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16103x79357e65.f223881f.m83183xfb85ada3())) {
            activityC16103x79357e65.X6(false);
            activityC16103x79357e65.Y6(false);
            activityC16103x79357e65.f223882g.setEnabled(false);
            return false;
        }
        int i07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(activityC16103x79357e65.f223881f.m83183xfb85ada3(), "100");
        long j17 = i07;
        if (j17 < activityC16103x79357e65.f223887o) {
            activityC16103x79357e65.Y6(true);
            activityC16103x79357e65.f223882g.setEnabled(false);
            return false;
        }
        if (j17 > activityC16103x79357e65.f223886n) {
            activityC16103x79357e65.X6(true);
            activityC16103x79357e65.f223882g.setEnabled(false);
            return false;
        }
        if (i07 == 0) {
            activityC16103x79357e65.f223882g.setEnabled(false);
            return false;
        }
        activityC16103x79357e65.X6(false);
        activityC16103x79357e65.Y6(false);
        activityC16103x79357e65.f223882g.setEnabled(true);
        return true;
    }

    public final void W6() {
        java.lang.String str = this.f223793d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "go to check pwd ui");
        long j07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(this.f223881f.m83183xfb85ada3(), "100");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6.class);
        intent.putExtra("key_scene", 2);
        intent.putExtra("key_credit_line", j07);
        intent.putExtra("key_card_no", this.f223888p);
        intent.putExtra("key_take_message", this.f223889q);
        try {
            intent.putExtra("key_toke_mess", this.f223894v.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
        }
        startActivityForResult(intent, 1);
    }

    public final void X6(boolean z17) {
        if (!z17 || this.f223883h.isShown()) {
            if (z17 || !this.f223883h.isShown()) {
                return;
            }
            this.f223883h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
            this.f223883h.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + this.f223886n, "100", 2, java.math.RoundingMode.HALF_UP));
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223892t)) {
            this.f223883h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fx9, sb7));
        } else {
            this.f223883h.setText(this.f223892t);
        }
        this.f223883h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8));
        this.f223883h.setVisibility(0);
    }

    public final void Y6(boolean z17) {
        if (!z17 || this.f223883h.isShown()) {
            if (z17 || !this.f223883h.isShown()) {
                return;
            }
            this.f223883h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
            this.f223883h.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + this.f223887o, "100", 2, java.math.RoundingMode.HALF_UP).toString());
        this.f223883h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxc, sb6.toString()));
        this.f223883h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8));
        this.f223883h.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjt;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f223881f = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f566801h40);
        this.f223882g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.h3y);
        this.f223883h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566804h43);
        this.f223884i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566803h42);
        this.f223885m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h3z);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223891s)) {
            this.f223884i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573820fx4);
        } else {
            this.f223884i.setText(this.f223891s);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223893u)) {
            this.f223885m.setText(this.f223893u);
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f223881f.f295694h;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.setPadding(0, 0, 0, 0);
        }
        this.f223881f.m83186xefe232c4().setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        m83125x8f91b80(this.f223881f, 2, false);
        this.f223881f.b(new v73.w0(this));
        this.f223882g.setOnClickListener(new v73.x0(this));
        this.f223881f.postDelayed(new v73.y0(this), 100L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1 && intent.getBooleanExtra("key_modify_create_line_succ", false)) {
            setResult(-1, intent);
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f223886n = getIntent().getLongExtra("key_max_credit_line", 0L);
        this.f223887o = getIntent().getLongExtra("key_min_credit_line", 0L);
        this.f223888p = getIntent().getStringExtra("key_card_no");
        this.f223889q = getIntent().getStringExtra("key_take_message");
        this.f223890r = getIntent().getStringExtra("key_title");
        this.f223891s = getIntent().getStringExtra("key_subtitle");
        this.f223892t = getIntent().getStringExtra("key_over_quota_tips");
        this.f223893u = getIntent().getStringExtra("key_bottom_tips");
        mo43517x10010bd5();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223890r)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fxd);
        } else {
            mo54450xbf7c1df6(this.f223890r);
        }
        m83090x14f40144(2815);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2815);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof r73.g)) {
            return false;
        }
        m83114xe5d7a18f();
        r45.fi3 fi3Var = ((r73.g) m1Var).f474703r;
        this.f223889q = fi3Var.f455914g;
        this.f223894v = fi3Var.f455911d;
        r45.di4 di4Var = fi3Var.f455915h;
        if (di4Var == null) {
            W6();
            return false;
        }
        db5.e1.C(this, di4Var.f454041d, "", di4Var.f454043f, di4Var.f454042e, false, new v73.z0(this), null);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v73.a1.class);
    }
}
