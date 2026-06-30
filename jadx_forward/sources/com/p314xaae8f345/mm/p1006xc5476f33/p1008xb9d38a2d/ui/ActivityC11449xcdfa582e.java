package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.account.ui.MMFBFriendUI */
/* loaded from: classes11.dex */
public class ActivityC11449xcdfa582e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, kv.e0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f154983o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f154984d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u8 f154985e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f154986f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f154987g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f154988h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154989i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154990m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f154991n;

    @Override // kv.e0
    public void U(java.lang.String str) {
        this.f154985e.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ach;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154984d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jmy);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfc);
        this.f154988h = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c8i);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c8g);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        c9Var.f291857i = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y8(this);
        m78489xd6d59aa8(true, c9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u8 u8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u8(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z8(this, textView2));
        this.f154985e = u8Var;
        u8Var.f155779q = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a9(this);
        this.f154984d.setAdapter((android.widget.ListAdapter) u8Var);
        this.f154986f = findViewById(com.p314xaae8f345.mm.R.id.jmz);
        this.f154984d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b9(this));
        c01.z1.u();
        if (c01.z1.u()) {
            this.f154984d.setVisibility(0);
            android.view.View view = this.f154986f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            if (java.lang.System.currentTimeMillis() - r17 > 86400000 && str.length() > 0) {
                com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
                this.f154991n = lVar;
                lVar.g(str);
                new v61.q0(this.f154991n, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.c9(this)).c();
            }
            r61.h1 h1Var = new r61.h1();
            h1Var.J();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d9(this, h1Var), false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(65829, null)) > 0) {
                gm0.j1.u().c().w(65829, 1);
                gm0.j1.d().g(h1Var);
            } else {
                b4Var.c(5000L, 5000L);
            }
            this.f154987g = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hoq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e9(this, b4Var, h1Var));
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfi), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f9(this));
        } else {
            this.f154984d.setVisibility(8);
            android.view.View view2 = this.f154986f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567478jn0)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ce7);
            this.f154986f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g9(this));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v8(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cfh);
        gm0.j1.d().a(32, this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(32, this);
        this.f154985e.c();
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154991n;
        if (lVar != null) {
            lVar.c(this);
        }
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
        this.f154985e.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookFriendUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() != 32) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f154987g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f154987g = null;
        }
        if (i17 == 4 && i18 == -68) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x8(this), null);
        } else if (i17 == 0 && i18 == 0) {
            this.f154985e.f();
        } else {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.gwd, 0).show();
        }
    }
}
