package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI */
/* loaded from: classes11.dex */
public class ActivityC17486x3b418ac7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final java.lang.String B = new java.lang.String(java.lang.Character.toChars(123));

    /* renamed from: d, reason: collision with root package name */
    public boolean f242299d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f242300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242301f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f242302g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f242303h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f242304i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f242305m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f242306n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f242307o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f242308p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp f242309q;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dq f242314v;

    /* renamed from: y, reason: collision with root package name */
    public k14.x0 f242317y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f242318z;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f242310r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f242311s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f242312t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f242313u = new java.util.HashSet();

    /* renamed from: w, reason: collision with root package name */
    public int f242315w = -1;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashSet f242316x = new java.util.HashSet();
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 A = null;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7, boolean z17) {
        activityC17486x3b418ac7.getClass();
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(activityC17486x3b418ac7, com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gp(activityC17486x3b418ac7));
            activityC17486x3b418ac7.f242304i.startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(activityC17486x3b418ac7, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            loadAnimation2.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wp(activityC17486x3b418ac7));
            activityC17486x3b418ac7.f242304i.startAnimation(loadAnimation2);
        }
        activityC17486x3b418ac7.f242318z = z17;
        if (z17) {
            activityC17486x3b418ac7.mo60878xf6b21fea(1, activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2k));
        } else {
            activityC17486x3b418ac7.mo60878xf6b21fea(1, activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2q));
            ((android.widget.CheckBox) activityC17486x3b418ac7.f242307o.findViewById(com.p314xaae8f345.mm.R.id.btf)).setChecked(false);
        }
    }

    public final void U6(java.util.List list) {
        java.util.HashMap hashMap = this.f242310r;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f242311s;
        hashMap2.clear();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        java.lang.String str = null;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp ypVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp) it.next();
            if (B.equalsIgnoreCase(ypVar.f243331a)) {
                ypVar.f243331a = "#";
            }
            java.lang.String str2 = ypVar.f243331a;
            if (!str2.equalsIgnoreCase(str)) {
                hashMap.put(str2.toUpperCase(), java.lang.Integer.valueOf(i17));
                hashMap2.put(java.lang.Integer.valueOf(i17), str2.toUpperCase());
            }
            i17++;
            str = str2;
        }
    }

    public final void V6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.A = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2n), true, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.A;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.A.dismiss();
        this.A = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cme;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j0i);
        mo78491xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2q), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kp(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lp(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mpp);
        int i17 = this.f242299d ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.mpr);
        int i18 = this.f242301f ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.mpq);
        int i19 = this.f242300e ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f242302g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f569029os3);
        this.f242304i = findViewById(com.p314xaae8f345.mm.R.id.atj);
        this.f242303h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jf6);
        this.f242314v = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dq(this, this.f242313u, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mp(this));
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f569026os0);
        this.f242305m = findViewById4;
        findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.op(this));
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f569027os1);
        this.f242306n = findViewById5;
        findViewById5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rp(this));
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f569028os2);
        this.f242307o = findViewById6;
        findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tp(this));
        this.f242308p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_q);
        this.f242302g.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp(this);
        this.f242309q = xpVar;
        this.f242302g.mo7960x6cab2c8d(xpVar);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21529x4f373eb5) findViewById(com.p314xaae8f345.mm.R.id.f569030os4)).m79298x40d747ee(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.up(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(291, this);
        this.f242299d = getIntent().getBooleanExtra("half_year_not_chat", false);
        this.f242300e = getIntent().getBooleanExtra("half_year_not_response", false);
        this.f242301f = getIntent().getBooleanExtra("has_not_same_chatroom", false);
        mo43517x10010bd5();
        k14.x0 x0Var = new k14.x0(this.f242299d, this.f242300e, this.f242301f, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp(this));
        this.f242317y = x0Var;
        x0Var.f384947m = java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vp) x0Var.f384946l).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eq.NORMAL);
        x0Var.f384939e.m77784x795fa299(new k14.o0(x0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i17 = (this.f242299d ? 1 : 0) | (this.f242301f ? 2 : 0) | (this.f242300e ? 4 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14434, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242580b), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242579a), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242584f), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242581c), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242583e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242582d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "[%s:%s:%s:%s:%s:%s:%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242580b), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242579a), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242584f), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242581c), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242583e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242582d));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242579a = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242580b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242581c = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242582d = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242583e = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242584f = 0;
        gm0.j1.d().q(291, this);
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x.f34658x366c91de, this.f242314v);
        k14.x0 x0Var = this.f242317y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[onDestroy] [%s:%s:%s]", java.lang.Boolean.valueOf(x0Var.f384936b), java.lang.Boolean.valueOf(x0Var.f384935a), java.lang.Boolean.valueOf(x0Var.f384937c));
        k14.w0 w0Var = x0Var.f384945k;
        if (w0Var != null) {
            gm0.j1.d().q(292, w0Var);
        }
        wu5.b bVar = x0Var.f384948n;
        if (bVar != null) {
            bVar.b();
        }
        x0Var.f384939e.mo50299x35224f();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = this.f242315w;
        if (-1 != i17) {
            boolean z17 = false;
            if (-1 != i17) {
                java.util.ArrayList arrayList = this.f242312t;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp ypVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp) arrayList.get(i17);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ypVar.f243333c;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
                if (n17.r2() || !z3Var.r2()) {
                    ypVar.f243333c = n17;
                } else {
                    arrayList.remove(this.f242315w);
                    z17 = true;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242580b++;
            }
            this.f242315w = -1;
        }
        this.f242316x.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = this.f242309q;
        if (xpVar != null) {
            xpVar.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
        if (i17 != 0 || i18 != 0) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2s), 1).show();
        }
        if (m1Var.mo808xfb85f7b0() == 291) {
            V6(false);
            this.f242316x.clear();
            this.f242309q.m8146xced61ae5();
        }
    }
}
