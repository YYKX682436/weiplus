package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI */
/* loaded from: classes5.dex */
public class ActivityC17388xa7b1222e extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final java.lang.String C = fp.m.b().toString() + "/Pictures/Screenshots/";

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f241717p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f241718q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f241719r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f241720s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f241721t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f241722u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f241723v;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x2 f241725x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f241726y;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f241708d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f241709e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f241710f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f241711g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f241712h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f241713i = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f241714m = false;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f241715n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f241716o = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f241724w = false;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Set f241727z = new java.util.HashSet();
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.q2(this), true);
    public final l75.q0 B = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.r2(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e) {
        db5.e1.K(activityC17388xa7b1222e, true, activityC17388xa7b1222e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2g), activityC17388xa7b1222e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2h), activityC17388xa7b1222e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2i), activityC17388xa7b1222e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h2(activityC17388xa7b1222e), null);
    }

    public final void V6(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        int q17 = this.f241714m ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null)) : 0;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f241713i)) {
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String str = this.f241713i;
            ((za0.i) yVar).getClass();
            m1Var = new l41.w(str);
            gm0.j1.d().g(m1Var);
        } else {
            kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
            java.lang.String str2 = this.f241713i;
            ((jd0.q2) x2Var).getClass();
            g21.a aVar = new g21.a(str2, q17, i17);
            gm0.j1.d().g(aVar);
            m1Var = aVar;
        }
        this.f241708d = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574500ih3), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e2(this, m1Var));
    }

    public final void W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w2 w2Var) {
        o25.s1 a17 = f14.g.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 7)) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        byte[] b17 = w2Var.b();
        this.f241715n = b17;
        this.f241716o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(b17);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f241713i)) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str2 = this.f241713i;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str2)) {
                if (this.f241714m) {
                    java.lang.String c17 = w2Var.c();
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568860oa4);
                    android.view.View view = (android.view.View) textView.getParent();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        textView.setText(c17);
                        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l2(this));
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f241709e.setImageBitmap(this.f241716o);
            }
        }
        m78501x43e00957(true);
        java.lang.String a18 = w2Var.a();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lfl)).setText(a18);
        }
        this.f241709e.setImageBitmap(this.f241716o);
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, selfCode = %s", java.lang.Boolean.valueOf(this.f241724w));
        if (this.f241724w) {
            xg3.y Ri = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
            if (Ri instanceof com.p314xaae8f345.mm.p2621x8fb0427b.o7) {
                com.p314xaae8f345.mm.p2621x8fb0427b.o7 o7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.o7) Ri;
                try {
                    int b17 = o7Var.b1();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "initView, newCount = %s", java.lang.Integer.valueOf(b17));
                    if (b17 > 0) {
                        this.f241718q.setVisibility(0);
                        android.view.View view = this.f241719r;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f241717p.setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.azc));
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k2(this, 2L));
                        this.f241720s.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574501ih4, java.lang.Integer.valueOf(b17)));
                        this.f241718q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.s2(this));
                        java.util.List d17 = o7Var.d1(3);
                        this.f241726y = d17;
                        if (((java.util.ArrayList) d17).size() >= 3) {
                            Y6((com.p314xaae8f345.mm.p2621x8fb0427b.m7) ((java.util.ArrayList) this.f241726y).get(2), (com.p314xaae8f345.mm.p2621x8fb0427b.m7) ((java.util.ArrayList) this.f241726y).get(1), (com.p314xaae8f345.mm.p2621x8fb0427b.m7) ((java.util.ArrayList) this.f241726y).get(0));
                        } else if (((java.util.ArrayList) this.f241726y).size() >= 2) {
                            Y6((com.p314xaae8f345.mm.p2621x8fb0427b.m7) ((java.util.ArrayList) this.f241726y).get(1), (com.p314xaae8f345.mm.p2621x8fb0427b.m7) ((java.util.ArrayList) this.f241726y).get(0), null);
                        } else if (((java.util.ArrayList) this.f241726y).size() >= 1) {
                            Y6((com.p314xaae8f345.mm.p2621x8fb0427b.m7) ((java.util.ArrayList) this.f241726y).get(0), null, null);
                        } else {
                            Y6(null, null, null);
                        }
                    } else {
                        this.f241718q.setVisibility(4);
                        android.view.View view2 = this.f241719r;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f241717p.setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.az8));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, e = %s", e17);
                }
            }
        }
    }

    public final void Y6(com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var2, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var3) {
        java.util.Set set = this.f241727z;
        if (m7Var != null) {
            this.f241721t.setVisibility(0);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f241721t, m7Var.f66376x114ef53e, null);
            ((java.util.HashSet) set).add(m7Var.f66376x114ef53e);
        } else {
            this.f241721t.setVisibility(8);
        }
        if (m7Var2 != null) {
            this.f241722u.setVisibility(0);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f241722u, m7Var2.f66376x114ef53e, null);
            ((java.util.HashSet) set).add(m7Var2.f66376x114ef53e);
        } else {
            this.f241722u.setVisibility(8);
        }
        if (m7Var3 == null) {
            this.f241723v.setVisibility(8);
            return;
        }
        this.f241723v.setVisibility(0);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f241723v, m7Var3.f66376x114ef53e, null);
        ((java.util.HashSet) set).add(m7Var3.f66376x114ef53e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String stringExtra = getIntent().getStringExtra("from_userName");
        this.f241713i = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f241713i = c01.z1.r();
        }
        if (c01.z1.r().equals(this.f241713i)) {
            this.f241714m = true;
        }
        java.lang.String str = "";
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f241713i)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ixw);
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lfl)).setText("");
            m78501x43e00957(false);
        } else {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str2 = this.f241713i;
            ((qv.o) u2Var).getClass();
            if (r01.z.j(str2)) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c1i);
                ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lfl)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1j);
                m78501x43e00957(false);
            } else {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ix7);
                this.f241724w = true;
            }
        }
        this.f241718q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.mkx);
        this.f241719r = findViewById(com.p314xaae8f345.mm.R.id.mky);
        this.f241720s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_9);
        this.f241721t = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mkz);
        this.f241722u = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568364ml0);
        this.f241723v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568365ml1);
        this.f241717p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.lew);
        this.f241709e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568374ml4);
        this.f241710f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gyk);
        this.f241711g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kb_);
        this.f241712h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d0r);
        this.f241717p.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n2(this));
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f241713i)) {
            rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str3 = this.f241713i;
            ((qv.o) u2Var2).getClass();
            if (!r01.z.j(str3)) {
                java.lang.String str4 = (java.lang.String) gm0.j1.u().c().l(42, null);
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571953uh);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(2, null);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(string);
                    sb6.append(str5);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3.y3(str5);
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(string);
                    sb7.append(str4);
                }
                android.graphics.Bitmap bitmap = this.f241716o;
                if (bitmap == null) {
                    V6(1);
                } else {
                    this.f241709e.setImageBitmap(bitmap);
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f241710f, c01.z1.r(), null);
                this.f241711g.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, (java.lang.String) gm0.j1.u().c().l(4, null), i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2)));
                c01.fb a17 = c01.fb.a();
                java.lang.String d17 = a17.d();
                if (d17 == null) {
                    d17 = "";
                }
                java.lang.String c17 = a17.c();
                if (c17 == null) {
                    c17 = "";
                }
                this.f241712h.setText(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + " " + c17);
                int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
                if (j17 == 1) {
                    this.f241711g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(this, com.p314xaae8f345.mm.R.raw.f79507xeac913cb), (android.graphics.drawable.Drawable) null);
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1n);
                } else if (j17 == 2) {
                    this.f241711g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(this, com.p314xaae8f345.mm.R.raw.f79506x511a318a), (android.graphics.drawable.Drawable) null);
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1m);
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((n14.a) pf5.z.f435481a.a(activity).a(n14.a.class)).m42291x53d8522f("sex_key", str);
                mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o2(this));
                mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2(this));
            }
        }
        V6(1);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f241710f, this.f241713i, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f241713i, true);
        this.f241711g.setSingleLine(false);
        this.f241711g.setMaxLines(3);
        if (c01.e2.R(this.f241713i)) {
            this.f241711g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb), (android.graphics.drawable.Drawable) null);
        } else {
            this.f241711g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (n17 != null) {
            java.lang.String P0 = n17.P0();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P0)) {
                P0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f241713i).f69094xd1f9ba88;
            }
            android.widget.TextView textView = this.f241711g;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = this.f241711g.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, P0, textSize));
        } else {
            this.f241711g.setVisibility(8);
        }
        this.f241712h.setVisibility(8);
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o2(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: isLayoutInDecorView */
    public boolean mo68955xfd09f471() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78530x8b45058f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x2(this, this);
        this.f241725x = x2Var;
        x2Var.startWatching();
        gm0.j1.d().a(be1.r0.f4232x366c91de, this);
        gm0.j1.d().a(uc1.o1.f76898x366c91de, this);
        mo43517x10010bd5();
        this.f241709e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m2(this));
        r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ni(this, 1, 3, r45.t54.class);
        if (t54Var != null && "launch_type_my_qrcode".equals(t54Var.f467690d)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc c7043xd67274fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc();
            c7043xd67274fc.f143597d = 3L;
            c7043xd67274fc.f143598e = 1L;
            c7043xd67274fc.k();
            c7043xd67274fc.o();
        }
        if (this.f241724w) {
            xg3.y Ri = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
            if (Ri instanceof com.p314xaae8f345.mm.p2621x8fb0427b.o7) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.o7) Ri).add(this.B);
            }
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(be1.r0.f4232x366c91de, this);
        gm0.j1.d().q(uc1.o1.f76898x366c91de, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x2 x2Var = this.f241725x;
        if (x2Var != null) {
            x2Var.stopWatching();
        }
        android.graphics.Bitmap bitmap = this.f241716o;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "bitmap recycle %s", this.f241716o.toString());
            this.f241716o.recycle();
        }
        if (this.f241724w) {
            java.util.List list = this.f241726y;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                xg3.y Ri = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
                if (!(Ri instanceof com.p314xaae8f345.mm.p2621x8fb0427b.o7)) {
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.o7 o7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.o7) Ri;
                java.util.Iterator it = ((java.util.HashSet) this.f241727z).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "onDestroy, unsetNew item.field_talker = %s,", str);
                        o7Var.f1(str);
                    }
                }
            }
            gm0.j1.i();
            if (gm0.j1.a()) {
                xg3.y Ri2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
                if (Ri2 instanceof com.p314xaae8f345.mm.p2621x8fb0427b.o7) {
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.o7) Ri2).mo49775xc84af884(this.B);
                }
            }
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f241713i)) {
            return;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = this.f241713i;
        ((qv.o) u2Var).getClass();
        if (r01.z.j(str)) {
            return;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ml7);
        if ((c01.z1.j() & 2) == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f241709e.setAlpha(1.0f);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f241709e.setAlpha(0.1f);
        findViewById(com.p314xaae8f345.mm.R.id.ml6).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.t2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f241708d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f241708d = null;
        }
        if (m1Var instanceof kd0.j2) {
            W6(i17, i18, str, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i2(this, (kd0.j2) m1Var));
        } else if (m1Var instanceof ab0.t) {
            r45.ak3 ak3Var = (r45.ak3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
            W6(i17, i18, str, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.j2(this, ak3Var.f451598d.f273689a, ak3Var.f451599e));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(n14.a.class);
    }
}
