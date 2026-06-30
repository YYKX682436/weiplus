package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.InviteMMFBFriendsUI */
/* loaded from: classes11.dex */
public class ActivityC11405x94a32f64 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f154820m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f154821d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b3 f154822e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f154823f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f154824g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154825h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f154826i;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ach;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154821d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jmy);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c8g);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        c9Var.f291857i = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o2(this);
        m78489xd6d59aa8(true, c9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b3 b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b3(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p2(this, textView));
        this.f154822e = b3Var;
        this.f154821d.setAdapter((android.widget.ListAdapter) b3Var);
        this.f154823f = findViewById(com.p314xaae8f345.mm.R.id.jmz);
        this.f154821d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q2(this));
        c01.z1.u();
        if (c01.z1.u()) {
            this.f154821d.setVisibility(0);
            android.view.View view = this.f154823f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            if (java.lang.System.currentTimeMillis() - r17 > 86400000 && str.length() > 0) {
                com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
                this.f154826i = lVar;
                lVar.g(str);
                new v61.q0(this.f154826i, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r2(this)).c();
            }
            r61.h1 h1Var = new r61.h1();
            h1Var.J();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s2(this, h1Var), false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(65829, null)) > 0) {
                gm0.j1.u().c().w(65829, 1);
                gm0.j1.d().g(h1Var);
            } else {
                b4Var.c(5000L, 5000L);
            }
            this.f154824g = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hoq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t2(this, b4Var, h1Var));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u2(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v2(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8k), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z2(this));
        mo74408xb0dfae51(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c8n);
        gm0.j1.d().a(32, this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(32, this);
        this.f154822e.c();
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154826i;
        if (lVar != null) {
            lVar.c(this);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InviteFacebookFriendsUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() != 32) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f154824g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f154824g = null;
        }
        if (i17 == 4 && i18 == -68) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n2(this), null);
        } else if (i17 == 0 && i18 == 0) {
            this.f154822e.f();
        } else {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.gwd, 0).show();
        }
    }
}
