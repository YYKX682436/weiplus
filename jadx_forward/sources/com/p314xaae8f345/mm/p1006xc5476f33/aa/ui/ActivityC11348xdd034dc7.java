package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI */
/* loaded from: classes9.dex */
public class ActivityC11348xdd034dc7 extends com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 {
    public static final /* synthetic */ int C = 0;
    public int A;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f154015h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154016i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f154017m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f154018n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f154019o;

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashMap f154022r;

    /* renamed from: t, reason: collision with root package name */
    public double f154024t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f154027w;

    /* renamed from: y, reason: collision with root package name */
    public int f154029y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f154030z;

    /* renamed from: g, reason: collision with root package name */
    public final k61.g f154014g = (k61.g) this.f154007e.b(this, k61.g.class);

    /* renamed from: p, reason: collision with root package name */
    public boolean f154020p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f154021q = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 f154023s = null;

    /* renamed from: u, reason: collision with root package name */
    public long f154025u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f154026v = -1;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f154028x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public final java.lang.Runnable B = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f2(this);

    public static boolean f7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var) {
        activityC11348xdd034dc7.getClass();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(w2Var.f154403a)) {
            return true;
        }
        if (activityC11348xdd034dc7.i7() && c01.z1.r().equals(w2Var.f154403a)) {
            return true;
        }
        return activityC11348xdd034dc7.i7() && !h61.o.o(activityC11348xdd034dc7.f154030z, w2Var.f154403a);
    }

    public static void g7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7) {
        activityC11348xdd034dc7.m7();
        activityC11348xdd034dc7.l7();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.HashMap hashMap = (java.util.HashMap) activityC11348xdd034dc7.f154021q;
        for (java.lang.String str : hashMap.keySet()) {
            if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0((java.lang.String) hashMap.get(str), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() <= activityC11348xdd034dc7.f154025u) {
                arrayList.add(str + "," + ((java.lang.String) hashMap.get(str)));
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("selectUI", arrayList);
        activityC11348xdd034dc7.setResult(-1, intent);
        activityC11348xdd034dc7.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bni;
    }

    public void h7() {
        if (this.f154019o.isShown()) {
            this.f154019o.setText("");
            this.f154019o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
            this.f154019o.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f154015h.getLayoutParams();
            layoutParams.topMargin = i65.a.b(mo55332x76847179(), 0);
            this.f154015h.setLayoutParams(layoutParams);
        }
    }

    public final boolean i7() {
        return this.A == 1;
    }

    public final void j7() {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f154016i.setTextColor(android.graphics.Color.parseColor("#4c7D90A9"));
        } else {
            this.f154016i.setTextColor(android.graphics.Color.parseColor("#4c576B95"));
        }
    }

    public void k7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f154019o.setText(str);
        if (this.f154019o.isShown()) {
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q2(this));
        this.f154019o.startAnimation(loadAnimation);
        this.f154019o.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f154015h.getLayoutParams();
        layoutParams.topMargin = i65.a.b(mo55332x76847179(), 55);
        this.f154015h.setLayoutParams(layoutParams);
    }

    public final void l7() {
        if (this.f154024t > 0.0d) {
            this.f154020p = true;
            this.f154016i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        } else {
            this.f154020p = false;
            j7();
        }
    }

    public final void m7() {
        try {
            this.f154024t = 0.0d;
            this.f154027w = false;
            java.util.Map map = this.f154021q;
            if (map != null) {
                java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
                while (it.hasNext()) {
                    double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) it.next(), 0.0d);
                    this.f154024t += F;
                    long j17 = this.f154025u;
                    if (j17 > 0 && F * 100.0d > j17) {
                        this.f154027w = true;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 v2Var = this.f154023s;
                if (v2Var != null) {
                    v2Var.a(map);
                }
            }
            this.f154017m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_k, java.lang.Double.valueOf(this.f154024t)));
            if (map == null || ((java.util.HashMap) map).size() <= 0) {
                mo60878xf6b21fea(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            } else {
                mo60878xf6b21fea(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571259z, java.lang.Integer.valueOf(((java.util.HashMap) map).size())));
            }
            if (this.f154027w) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 7);
                m78500x43e00957(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, false);
                k7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gae, java.lang.Float.valueOf(((float) this.f154025u) / 100.0f)));
            } else {
                if (map == null || ((java.util.HashMap) map).size() <= 0) {
                    m78500x43e00957(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, false);
                } else {
                    m78500x43e00957(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, true);
                }
                h7();
            }
            if (this.f154016i.getRight() > this.f154017m.getLeft()) {
                android.widget.TextView textView = this.f154017m;
                textView.setMaxEms(textView.length() / 2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "updateTotalAmount error: %s", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g_l);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i2(this));
        m78494xd9193382(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j2(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        this.f154015h = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564493sy);
        this.f154016i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.bxl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564494sz);
        this.f154017m = textView;
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_k, java.lang.Float.valueOf(0.0f)));
        this.f154018n = findViewById(com.p314xaae8f345.mm.R.id.nse);
        this.f154019o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564465s6);
        this.f154006d = this.f154015h;
        android.view.View view = this.f154018n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.bk.r0(this.f154016i.getPaint(), 0.8f);
        this.f154016i.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l2(this));
        this.f154016i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o2(this));
        this.f154020p = true;
        this.f154015h.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.p2(this));
        this.f154029y = getIntent().getIntExtra("enter_scene", 1);
        this.f154030z = getIntent().getStringExtra("chatroom");
        this.f154025u = getIntent().getLongExtra("maxPerAmount", -1L);
        this.f154026v = getIntent().getIntExtra("maxUserNumber", -1);
        this.A = getIntent().getIntExtra("group_solitatire_flag", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate, chatroom: %s, maxPerAmount: %s, ", this.f154030z, java.lang.Long.valueOf(this.f154025u));
        k61.g gVar = this.f154014g;
        gVar.a();
        gVar.f336754h.m82265x414ef28f(k61.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k2(this);
        java.util.HashMap hashMap = (java.util.HashMap) gVar.f336756m;
        fm5.a aVar = (fm5.d) hashMap.get(k61.f.class);
        if (aVar == null) {
            aVar = new em5.c(gVar, lm5.d.f401133a);
            hashMap.put(k61.f.class, aVar);
        }
        fm5.b bVar = new fm5.b(k2Var, aVar);
        synchronized (aVar) {
            aVar.f345714d.add(bVar);
        }
        java.lang.Object m82260x34715b = gVar.f336754h.m82260x34715b(k61.f.class);
        if (m82260x34715b != null) {
            k2Var.a(m82260x34715b);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.Map map = this.f154021q;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
    }
}
