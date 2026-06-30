package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI */
/* loaded from: classes15.dex */
public class ActivityC11375x7be2c669 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f154649e;

    /* renamed from: f, reason: collision with root package name */
    public r61.n0 f154650f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f154652h;

    /* renamed from: u, reason: collision with root package name */
    public int f154662u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f154663v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f154664w;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f154651g = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154653i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f154654m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f154655n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f154656o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f154657p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f154658q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f154659r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f154660s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f154661t = 2;

    /* renamed from: x, reason: collision with root package name */
    public boolean f154665x = true;

    /* renamed from: y, reason: collision with root package name */
    public final r61.l0 f154666y = new s61.g(this);

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669) {
        activityC11375x7be2c669.mo48674x36654fab();
        if (activityC11375x7be2c669.f154650f.c() == 0) {
            db5.e1.A(activityC11375x7be2c669, activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgt), "", activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg6), activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg7), new s61.l(activityC11375x7be2c669), new s61.m(activityC11375x7be2c669));
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        s61.a aVar = new s61.a(activityC11375x7be2c669);
        activityC11375x7be2c669.f154659r = aVar;
        d17.a(30, aVar);
        activityC11375x7be2c669.f154651g = db5.e1.Q(activityC11375x7be2c669.mo55332x76847179(), activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11375x7be2c669.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgj), true, true, new s61.b(activityC11375x7be2c669));
        r61.n0 n0Var = activityC11375x7be2c669.f154650f;
        n0Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList3 = n0Var.f474443e;
            if (i17 >= linkedList3.size()) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
                new r35.e4(n0Var.f474442d, null).g(linkedList, linkedList2);
                return;
            } else {
                if (n0Var.f474447i[i17] == 1) {
                    linkedList.add(((r45.g74) linkedList3.get(i17)).f456477e);
                    linkedList2.add(52);
                }
                i17++;
            }
        }
    }

    public final void a7() {
        n71.a.e(this.f154664w);
        mo48674x36654fab();
        W6(1);
    }

    public final void b7() {
        this.f154651g = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwe), true, true, new s61.e(this));
        gm0.j1.e().g(new s61.f(this));
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
        this.f154649e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jmy);
        int i17 = this.f154661t;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ad9, (android.view.ViewGroup) null);
            this.f154652h = inflate;
            this.f154653i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g5n);
            this.f154654m = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.g5q);
            this.f154655n = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.e57);
            this.f154657p = (android.widget.Button) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.f565934e56);
            this.f154654m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572776ch4));
            this.f154655n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572777ch5));
            this.f154657p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg8, 0));
            this.f154656o = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.jmr);
        } else if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ad_, (android.view.ViewGroup) null);
            this.f154652h = inflate2;
            this.f154653i = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.g5n);
            this.f154654m = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.g5q);
            this.f154655n = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.e57);
            this.f154657p = (android.widget.Button) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.f565934e56);
            this.f154654m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572776ch4));
            this.f154655n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572777ch5));
            this.f154657p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg9));
        } else {
            android.view.View inflate3 = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ad9, (android.view.ViewGroup) null);
            this.f154652h = inflate3;
            this.f154653i = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.g5n);
            this.f154654m = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.g5q);
            this.f154655n = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.e57);
            this.f154657p = (android.widget.Button) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.f565934e56);
            this.f154654m.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572776ch4));
            this.f154655n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572777ch5));
            this.f154657p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cg8, 0));
            this.f154656o = (android.widget.TextView) this.f154652h.findViewById(com.p314xaae8f345.mm.R.id.jmr);
        }
        this.f154650f = new r61.n0(this, this.f154666y, 1);
        this.f154657p.setOnClickListener(new s61.h(this));
        android.widget.TextView textView = this.f154656o;
        if (textView != null) {
            textView.setOnClickListener(new s61.i(this));
            this.f154656o.setVisibility(8);
        }
        this.f154649e.addHeaderView(this.f154652h);
        this.f154649e.setAdapter((android.widget.ListAdapter) this.f154650f);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new s61.j(this));
        m78597x53c22598(new s61.k(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cgc);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.f154658q = getIntent().getStringExtra("regsetinfo_ticket");
        this.f154660s = getIntent().getStringExtra("regsetinfo_NextStep");
        this.f154661t = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f154662u = getIntent().getIntExtra("login_type", 0);
        this.f154664w = n71.a.a();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f154659r != null) {
            gm0.j1.d().q(30, this.f154659r);
            this.f154659r = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f154662u == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_300_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_300_QQ"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb7.append(gm0.m.e());
        sb7.append(",");
        sb7.append(getClass().getName());
        sb7.append(",R300_300_phone,");
        gm0.j1.b();
        sb7.append(gm0.m.f("R300_300_phone"));
        sb7.append(",2");
        n71.a.c(10645, false, sb7.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] == 0) {
            b7();
        } else {
            this.f154665x = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new s61.c(this), new s61.d(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f154650f.notifyDataSetChanged();
        if (this.f154662u == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_300_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_300_QQ"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("R300_300_QQ");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",R300_300_phone,");
            gm0.j1.b();
            sb7.append(gm0.m.f("R300_300_phone"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
            n71.a.d("R300_300_phone");
        }
        if (this.f154665x) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMContactAddUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (a17) {
                b7();
            }
        }
    }
}
