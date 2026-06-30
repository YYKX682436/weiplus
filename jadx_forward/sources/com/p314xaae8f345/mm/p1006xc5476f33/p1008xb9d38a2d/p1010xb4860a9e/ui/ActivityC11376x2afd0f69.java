package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI */
/* loaded from: classes15.dex */
public class ActivityC11376x2afd0f69 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f154667e;

    /* renamed from: f, reason: collision with root package name */
    public r61.n0 f154668f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f154670h;

    /* renamed from: t, reason: collision with root package name */
    public int f154679t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f154680u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f154681v;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f154669g = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154671i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f154672m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f154673n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f154674o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f154675p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f154676q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f154677r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f154678s = 2;

    /* renamed from: w, reason: collision with root package name */
    public boolean f154682w = true;

    /* renamed from: x, reason: collision with root package name */
    public final r61.l0 f154683x = new s61.s(this);

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69) {
        activityC11376x2afd0f69.mo48674x36654fab();
        if (activityC11376x2afd0f69.f154668f.c() != 0) {
            db5.e1.u(activityC11376x2afd0f69, activityC11376x2afd0f69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgf), "", new s61.a0(activityC11376x2afd0f69), new s61.n(activityC11376x2afd0f69));
            return;
        }
        n71.a.e(activityC11376x2afd0f69.f154681v);
        activityC11376x2afd0f69.mo48674x36654fab();
        activityC11376x2afd0f69.W6(1);
    }

    public final void a7() {
        this.f154669g = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwe), true, true, new s61.q(this));
        gm0.j1.e().g(new s61.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ad8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jmw)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.gwc);
        this.f154667e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jmy);
        int i17 = this.f154678s;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ad9, (android.view.ViewGroup) null);
            this.f154670h = inflate;
            this.f154671i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g5n);
            this.f154672m = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.g5q);
            this.f154673n = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.e57);
            this.f154675p = (android.widget.Button) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.f565934e56);
            this.f154672m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgl));
            this.f154673n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgi));
            this.f154675p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgg, 0));
            this.f154674o = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.jmr);
        } else if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ad_, (android.view.ViewGroup) null);
            this.f154670h = inflate2;
            this.f154671i = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.g5n);
            this.f154672m = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.g5q);
            this.f154673n = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.e57);
            this.f154675p = (android.widget.Button) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.f565934e56);
            this.f154672m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgi));
            this.f154673n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgi));
            this.f154675p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgh));
        } else {
            android.view.View inflate3 = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ad9, (android.view.ViewGroup) null);
            this.f154670h = inflate3;
            this.f154671i = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.g5n);
            this.f154672m = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.g5q);
            this.f154673n = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.e57);
            this.f154675p = (android.widget.Button) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.f565934e56);
            this.f154672m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgl));
            this.f154673n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgi));
            this.f154675p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgg, 0));
            this.f154674o = (android.widget.TextView) this.f154670h.findViewById(com.p314xaae8f345.mm.R.id.jmr);
        }
        this.f154668f = new r61.n0(this, this.f154683x, 2);
        this.f154675p.setOnClickListener(new s61.t(this));
        android.widget.TextView textView = this.f154674o;
        if (textView != null) {
            textView.setOnClickListener(new s61.u(this));
            this.f154674o.setVisibility(8);
        }
        this.f154667e.addHeaderView(this.f154670h);
        this.f154667e.setAdapter((android.widget.ListAdapter) this.f154668f);
        this.f154667e.setOnScrollListener(new bb5.a());
        this.f154667e.setOnTouchListener(new s61.v(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new s61.w(this));
        m78597x53c22598(new s61.x(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cgk);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.f154676q = getIntent().getStringExtra("regsetinfo_ticket");
        this.f154679t = getIntent().getIntExtra("login_type", 0);
        this.f154678s = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f154681v = n71.a.a();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        bb5.g gVar;
        if (this.f154677r != null) {
            gm0.j1.d().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e, this.f154677r);
            this.f154677r = null;
        }
        r61.n0 n0Var = this.f154668f;
        if (n0Var != null && (gVar = n0Var.f474450o) != null) {
            gVar.a();
            n0Var.f474450o = null;
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        gm0.j1.b().c();
        m61.k.Ai().getClass();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f154681v);
        mo48674x36654fab();
        W6(1);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f154679t == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_400_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_400_QQ"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb7.append(gm0.m.e());
        sb7.append(",");
        sb7.append(getClass().getName());
        sb7.append(",R300_400_phone,");
        gm0.j1.b();
        sb7.append(gm0.m.f("R300_400_phone"));
        sb7.append(",2");
        n71.a.c(10645, false, sb7.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] == 0) {
            a7();
        } else {
            this.f154682w = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new s61.o(this), new s61.p(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f154668f.notifyDataSetChanged();
        if (this.f154679t == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_400_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_400_QQ"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",R300_400_phone,");
            gm0.j1.b();
            sb7.append(gm0.m.f("R300_400_phone"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
        }
        if (this.f154682w) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMContactInviteUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (a17) {
                a7();
            }
        }
    }
}
