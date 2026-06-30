package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI */
/* loaded from: classes9.dex */
public class ActivityC16331x46dfff95 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f226628g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f226629h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f226630i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f226631m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f226632n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f226633o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f226634p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f226635q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f226636r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f226637s;

    /* renamed from: t, reason: collision with root package name */
    public int f226638t;

    /* renamed from: u, reason: collision with root package name */
    public android.util.DisplayMetrics f226639u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f226640v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ValueAnimator f226641w;

    /* renamed from: x, reason: collision with root package name */
    public android.content.Intent f226642x;

    /* renamed from: y, reason: collision with root package name */
    public long f226643y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f226644z = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bug;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f226628g = findViewById(com.p314xaae8f345.mm.R.id.f567347j63);
        this.f226629h = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.j67);
        this.f226630i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j68);
        this.f226631m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6_);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j6f)).setOnClickListener(new ub3.v(this));
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f226632n = getIntent().getStringExtra("key_share_url");
        at4.g0.e(6);
        m66165x5406100e(new tb3.c(this.f226632n, null), true);
        this.f226639u = getResources().getDisplayMetrics();
        this.f226640v = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.f226641w = duration;
        duration.setStartDelay(1000L);
        this.f226640v.addUpdateListener(new ub3.w(this));
        this.f226640v.addListener(new ub3.x(this));
        this.f226641w.addListener(new ub3.y(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        m66163x14f40144(1997);
        if (this.f226644z) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FReceiveUI", "errType: %d,errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof tb3.c)) {
            return true;
        }
        tb3.c cVar = (tb3.c) m1Var;
        int i19 = cVar.f498522h;
        int i27 = cVar.f498524m;
        this.f226638t = cVar.f498526o;
        int i28 = cVar.f498528q;
        java.lang.String str2 = cVar.f498529r;
        java.lang.String str3 = cVar.f498530s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FReceiveUI", "hbStatus: %d, recvStatus:%d, errorType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(cVar.f498524m), java.lang.Integer.valueOf(cVar.f498523i));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.e(cVar.f498520f.f473768w)) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this).c(cVar.f498520f.f473768w, new ub3.z(this, cVar));
            return true;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = cVar.f498520f.f473770y;
        if (gVar != null && gVar.f273689a.length > 0) {
            java.lang.String i29 = gVar.i();
            if (this.f226643y != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuckyMoneyF2FReceiveUI", "last compliance usecase wast not stopped as expected!");
            }
            java.lang.Long a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a0.f262382a.a(i29, new ub3.a0(this, cVar.f498535x));
            this.f226643y = a17 != null ? a17.longValue() : 0L;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI", "recvStatus=%s, hbStatus=%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
        if (i27 != 2) {
            if (cVar.f498527p != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FReceiveUI", "need real name verify");
                r45.lj5 lj5Var = cVar.f498527p;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
                c19088xa4b300c1.d(java.lang.String.valueOf(lj5Var.f461056d), lj5Var.f461057e, lj5Var.f461058f, lj5Var.f461059g, lj5Var.f461060h, m1Var.mo808xfb85f7b0());
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".f2f.ui.LuckyMoneyF2FReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                if (c19088xa4b300c1.b(this, bundle, new ub3.c0(this, cVar), new ub3.d0(this), false)) {
                    this.f226644z = true;
                    return true;
                }
            }
            db5.e1.t(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkz) : str, "", new ub3.u(this));
            return true;
        }
        if (i19 == 5) {
            db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gku), "", new ub3.b0(this));
        } else {
            this.f226633o = cVar.f498521g;
            this.f226634p = cVar.f498525n;
            this.f226635q = cVar.f498533v;
            this.f226636r = cVar.f498534w;
            this.f226637s = cVar.f498531t;
            this.f226642x = new android.content.Intent();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226635q)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226634p) && !c01.e2.J(this.f226634p)) {
                    com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                    r0Var.f152062a = this.f226634p;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(this.f226629h, null, this.f226634p);
            } else {
                int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 48.0f);
                this.f226629h.m75394x3288e7c1(true);
                this.f226629h.b(this.f226635q, d17, d17, com.p314xaae8f345.mm.R.C30861xcebc809e.bhn);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1();
            e1Var.f226778q = this.f226638t;
            e1Var.f226774n = this.f226633o;
            e1Var.f226768e = i19;
            e1Var.A = i27;
            e1Var.E = str3;
            e1Var.D = i28;
            e1Var.Q = this.f226634p;
            e1Var.N = str2;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226636r)) {
                e1Var.f226772i = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.m(this.f226634p);
            } else {
                e1Var.f226772i = this.f226636r;
            }
            e1Var.L = this.f226637s;
            e1Var.f226767d = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FReceiveUI", "is most lucky %d", java.lang.Integer.valueOf(cVar.f498532u));
            if (cVar.f498532u > 0) {
                e1Var.f226770g = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gln);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226635q)) {
                e1Var.f226773m = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.j(this.f226634p);
            } else {
                e1Var.f226773m = this.f226635q;
            }
            try {
                this.f226642x.putExtra("key_detail_info", e1Var.mo14344x5f01b1f6());
                r45.lj5 lj5Var2 = cVar.f498527p;
                if (lj5Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c12 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
                    c19088xa4b300c12.d(java.lang.String.valueOf(lj5Var2.f461056d), lj5Var2.f461057e, lj5Var2.f461058f, lj5Var2.f461059g, lj5Var2.f461060h, m1Var.mo808xfb85f7b0());
                    this.f226642x.putExtra("key_realname_guide_helper", c19088xa4b300c12);
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuckyMoneyF2FReceiveUI", "lucky detail toBytes error: " + e17.getMessage());
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226636r)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(this, this.f226630i, this.f226636r);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.f226633o, this.f226634p)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(this, this.f226630i, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.m(this.f226634p));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(this, this.f226631m, this.f226637s);
            this.f226640v.start();
            android.view.View m78513xc2a54588 = m78513xc2a54588();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        m66169xf6ff5b27(1997);
    }
}
