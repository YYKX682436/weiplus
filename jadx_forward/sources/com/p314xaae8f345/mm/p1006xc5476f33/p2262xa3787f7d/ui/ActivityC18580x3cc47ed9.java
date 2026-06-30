package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@db5.a(m123858x6ac9171 = 128)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain */
/* loaded from: classes.dex */
public class ActivityC18580x3cc47ed9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int I = 0;
    public android.widget.TextView A;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public android.view.View G;
    public android.view.View H;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f254383d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f254384e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f254385f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f254386g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f254387h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f254388i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f254389m;

    /* renamed from: mStatusBarHeightCallback */
    private vj5.k f38482xb52fe880;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f254390n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f254391o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f254392p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f254393q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f254394r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f254395s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f254396t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.RelativeLayout f254397u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.RelativeLayout f254398v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f254399w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f254400x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f254401y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f254402z;

    public final void T6() {
        findViewById(com.p314xaae8f345.mm.R.id.gvh).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.t4(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gvi);
        if (df6 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(df6.g2());
            textView.setVisibility(0);
        }
    }

    public final void U6(boolean z17) {
        android.view.View view = this.H;
        if (view != null) {
            if (this.F) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f254400x != null) {
            int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
            if (z17) {
                this.B = G8;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMain", "[updateView] finder, rangeVal:$rangeVal finderOldVal:$finderOldVal");
            if (c01.e2.a0() && G8 == 1) {
                G8 = 0;
            }
            if (G8 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMain", "doSaveConfig: write teenMode range");
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, 2);
            } else if (G8 == 1) {
                this.f254400x.setText(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f.U6());
            } else if (G8 != 2) {
                this.f254400x.setText("");
            }
            this.f254400x.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        }
        if (this.f254401y != null) {
            int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
            if (z17) {
                this.C = h47;
            }
            if (h47 == 0) {
                this.f254401y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jss);
            } else if (h47 == 1) {
                this.f254401y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jsu);
            } else if (h47 != 2) {
                this.f254401y.setText("");
            } else {
                this.f254401y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jsy);
            }
        }
        if (this.f254402z != null) {
            int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            if (z17) {
                this.D = hd6;
            }
            if (hd6 == 0) {
                this.f254402z.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jry);
            } else if (hd6 == 1) {
                this.f254402z.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jsu);
            } else if (hd6 != 2) {
                this.f254402z.setText("");
            } else {
                this.f254402z.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jrx);
            }
        }
        if (this.A != null) {
            int ag6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag();
            if (z17) {
                this.E = ag6;
            }
            if (ag6 == 0) {
                this.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ls9);
            } else if (ag6 != 2) {
                this.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jsy);
            } else {
                this.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jsy);
            }
        }
        this.f254394r.setVisibility(0);
        this.f254395s.setVisibility(8);
        if (this.f254396t != null) {
            if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
                this.f254396t.setVisibility(0);
            } else {
                this.f254396t.setVisibility(8);
            }
        }
    }

    public final void V6() {
        if (this.f254389m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTeenModeMain", "payLL is null");
            return;
        }
        java.lang.String a17 = j62.e.g().a("clicfg_teenager_mode_pay_limit_open_android", "", false, false);
        if (!(!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, 0) != 0) ? false : c01.z1.G())) {
            this.f254389m.setVisibility(8);
        } else {
            this.f254389m.setVisibility(0);
            ((h45.q) i95.n0.c(h45.q.class)).mo24833x7028c0ce(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.C18582x9665f269(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cm8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMain", "ticket : %s", ((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h);
        this.f254389m = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.kqv);
        this.f254390n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o07);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.o0c);
        this.f254391o = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f254390n.setVisibility(8);
        this.f254389m.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.I;
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.this;
                activityC18580x3cc47ed9.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC18580x3cc47ed9, array);
                ((h45.q) i95.n0.c(h45.q.class)).mo24832x725d5279(activityC18580x3cc47ed9, activityC18580x3cc47ed9.f254392p, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u4(activityC18580x3cc47ed9));
                yj0.a.h(activityC18580x3cc47ed9, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            V6();
        } else {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).G5(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.v4(this));
        }
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vcw));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vcv);
        if (this.F) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        this.f254399w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vcu);
        if (c01.e2.a0()) {
            this.f254399w.setVisibility(0);
        } else {
            this.f254399w.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f564227li);
        this.f254385f = relativeLayout;
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.q3(this));
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.n9z);
        this.f254386g = relativeLayout2;
        relativeLayout2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.r3(this));
        this.f254400x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568771o00);
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.fro)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.s3(this));
        this.f254387h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f7n);
        this.f254388i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f7o);
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Bi()) {
            this.f254387h.setVisibility(8);
            this.f254388i.setVisibility(0);
        } else {
            this.f254387h.setVisibility(0);
            this.f254388i.setVisibility(8);
        }
        this.f254387h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.t3(this));
        this.f254388i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u3(this));
        this.f254401y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568775o04);
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jsb)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.v3(this));
        this.f254402z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nzx);
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f564697yb)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w3(this));
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.oge)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.x3(this));
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.d0p)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.y3(this));
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f566631gj0);
        this.f254393q = relativeLayout3;
        relativeLayout3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.z3(this));
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.k6c);
        this.f254394r = relativeLayout4;
        relativeLayout4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.b4(this));
        android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.k6d);
        this.f254395s = relativeLayout5;
        relativeLayout5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.c4(this));
        android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f568852r16);
        this.f254396t = relativeLayout6;
        relativeLayout6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d4(this));
        android.widget.RelativeLayout relativeLayout7 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.muw);
        this.f254397u = relativeLayout7;
        relativeLayout7.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.e4(this));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_teen_mode_remove_shopping, 0) == 1) {
            this.f254397u.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout8 = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.vpr);
        this.f254398v = relativeLayout8;
        relativeLayout8.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.f4(this));
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nzz);
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.deb)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.g4(this));
        ((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pkh)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.h4(this));
        if (c01.e2.a0()) {
            this.f254387h.setVisibility(8);
            this.f254393q.setVisibility(8);
            this.f254397u.setVisibility(8);
            this.f254398v.setVisibility(8);
        } else {
            this.f254385f.setVisibility(8);
            this.f254386g.setVisibility(8);
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.bzq);
        this.f254383d = findViewById2;
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.i4(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.j4(this));
        U6(true);
        T6();
        m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n4(this));
        if (!getIntent().getBooleanExtra("intent_from_sys_to_inner", false) || this.F) {
            return;
        }
        db5.t7.h(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.oky));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        m78497xc03943d(true);
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        this.G = findViewById;
        if (findViewById != null && vj5.n.f519251k) {
            this.H = findViewById.findViewById(com.p314xaae8f345.mm.R.id.coy);
            vj5.n b17 = vj5.n.b(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.o4 o4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.o4(this);
            this.f38482xb52fe880 = o4Var;
            b17.d(o4Var);
            getWindow().getDecorView().requestApplyInsets();
            vj5.o.e(getWindow());
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        m78554x41d7d42(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        this.F = getIntent().getBooleanExtra("intent_is_sys_teen", false);
        mo43517x10010bd5();
        if (getIntent().getBooleanExtra("intent_close_me", false)) {
            finish();
        }
        m78605xc85f0ffa();
        ((android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.cgf)).setOnScrollChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if ((((this.B != ((uh4.c0) i95.n0.c(uh4.c0.class)).G8()) || this.C != ((uh4.c0) i95.n0.c(uh4.c0.class)).h4()) || this.D != ((uh4.c0) i95.n0.c(uh4.c0.class)).hd()) || this.E != ((uh4.c0) i95.n0.c(uh4.c0.class)).ag()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).T(3);
        }
        int i17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() ? 1 : 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c01.e2.a0()) {
            arrayList.add("AddFriend:Block");
            arrayList.add("Moments:Block");
        }
        xh4.x xVar = xh4.x.f536176a;
        arrayList.add("Finder:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).G8())));
        if (java.util.Objects.equals(c01.e2.s(), "CN")) {
            arrayList.add("Live:Block");
        }
        arrayList.add("WCPay:Block");
        arrayList.add("OfficialAccounts:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).h4())));
        arrayList.add("WeApp:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).hd())));
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            arrayList.add("TingFind:Block");
        }
        arrayList.add("WeSee:Block");
        arrayList.add("WeSearch:Block");
        arrayList.add("PeopleNearBy:Block");
        arrayList.add("GameCenter:Block");
        if (java.util.Objects.equals(c01.e2.s(), "CN")) {
            arrayList.add("Store:Block");
            arrayList.add("WxShop:Block");
        }
        arrayList.add("Emoticon:".concat(xVar.h(((uh4.c0) i95.n0.c(uh4.c0.class)).ag())));
        arrayList.add("WeCoin:Block");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb6.append((java.lang.CharSequence) "#");
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20917, 50, 1, java.lang.Integer.valueOf(i17), "", "", "", sb7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMain", "cmingwang data report = %s", sb7);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6(false);
        T6();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).If();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setActionbarColor */
    public void mo64405x4dab7448(int i17) {
        super.mo64405x4dab7448(i17);
        android.view.View view = this.G;
        if (view != null) {
            view.setBackgroundColor(mo78523xb48e4618());
            vj5.o.e(getWindow());
        }
    }
}
