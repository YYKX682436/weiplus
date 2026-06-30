package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardIndexUI */
/* loaded from: classes15.dex */
public class ActivityC13054xf92a7996 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 {
    public android.widget.ImageView A;
    public android.widget.LinearLayout B;
    public long C = 0;
    public int D = -1;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f176400w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f176401x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f176402y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f176403z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public android.widget.BaseAdapter T6() {
        return 3 == this.D ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.j4(this, U6()) : new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k(this, U6());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public xt1.r U6() {
        int i17 = this.D;
        return 1 == i17 ? xt1.r.MEMBER_CARD_TYPE : 3 == i17 ? ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue() ? xt1.r.GENERAL_WITHOUT_INVOICE_TYPE : xt1.r.GENERAL_TYPE : xt1.r.NORMAL_TYPE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void V6() {
        int i17 = this.D;
        if (1 == i17) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572331au2);
        } else if (3 == i17) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572344aw3);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aub);
        }
        this.f176402y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kby);
        this.f176403z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kbz);
        this.A = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kbw);
        this.f176400w = findViewById(com.p314xaae8f345.mm.R.id.b9v);
        this.f176401x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b9w);
        this.B = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.kbx);
        android.view.View view = this.f176400w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardIndexUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardIndexUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176403z.setVisibility(0);
        this.f176402y.setVisibility(0);
        this.A.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.topMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 100.0f);
        this.B.setLayoutParams(layoutParams);
        int i18 = this.D;
        if (1 == i18) {
            this.f176403z.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.atp));
            this.f176402y.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ato));
        } else if (3 == i18) {
            this.f176403z.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.atw));
            this.f176402y.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.atv));
        } else {
            this.f176403z.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.auq));
            this.f176402y.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572337av2));
        }
        if (this.D == 3) {
            this.f176164d.setEmptyView(null);
            this.f176166f.setVisibility(8);
        }
        this.f176401x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o2(this));
        if (this.D == 3 && ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardIndexUI", "has load new entrance");
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_SECOND_ENTRANCE_STRING_SYNC, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            try {
                r45.ay5 ay5Var = new r45.ay5();
                ay5Var.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
                l7(ay5Var.f451904d);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardIndexUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (getIntent() != null) {
            this.D = getIntent().getIntExtra("key_card_type", -1);
        }
        super.mo43517x10010bd5();
    }

    public final void l7(java.util.List list) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.zx5 zx5Var = (r45.zx5) it.next();
                if (zx5Var.f473992d == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardIndexUI", "should update new invoice");
                    java.util.LinkedList<r45.mu> linkedList = zx5Var.f473993e;
                    this.f176168h.removeAllViews();
                    this.f176168h.setPadding(0, 0, 0, 0);
                    if (linkedList != null && !linkedList.isEmpty()) {
                        int i17 = 0;
                        for (r45.mu muVar : linkedList) {
                            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569865qe, null);
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.byp);
                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.byr);
                            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.byo);
                            c19659x677e0913.m75396xca029dad(muVar.f462359e);
                            textView.setText(muVar.f462358d);
                            textView2.setText(muVar.f462360f);
                            if (muVar.f462361g > 0) {
                                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p2(this, muVar));
                            }
                            this.f176168h.addView(inflate);
                            if (i17 == 0) {
                                this.f176168h.setPadding(0, i65.a.b(this, 13), 0, 0);
                            } else {
                                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.topMargin = i65.a.b(this, 6);
                                    inflate.setLayoutParams(layoutParams);
                                }
                            }
                            i17++;
                        }
                    }
                }
            }
        }
        if (this.f176168h.getChildCount() == 0 && this.f176165e.getCount() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardIndexUI", "show empty view");
            this.f176166f.setVisibility(0);
            this.f176164d.setVisibility(8);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardIndexUI", "hide empty view");
            this.f176166f.setVisibility(8);
            this.f176164d.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardIndexUI", "oncreate");
        this.C = java.lang.System.currentTimeMillis();
        mo43517x10010bd5();
        gm0.j1.n().f354821b.a(1054, this);
        xt1.t0.wi().a(1);
        int i17 = xt1.t0.Ui().f530801c;
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().e(262152, 266256) || i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardPackageListView", 0, "", "", 1, 0, "", 0, "");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardPackageListView", 0, "", "", 0, 0, "", 0, "");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(1054, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "CardPackageListView", 0, "", "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.C));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ay5 ay5Var;
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof xt1.k0)) {
            xt1.k0 k0Var = (xt1.k0) m1Var;
            if (k0Var.f538046f) {
                android.widget.BaseAdapter baseAdapter = this.f176165e;
                if (baseAdapter instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) baseAdapter).r(false);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) this.f176165e).r(true);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) this.f176165e).q();
                }
            }
            if (!((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue() || (ay5Var = k0Var.f538048h) == null) {
                return;
            }
            l7(ay5Var.f451904d);
            android.widget.BaseAdapter baseAdapter2 = this.f176165e;
            if (baseAdapter2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) baseAdapter2).r(false);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) this.f176165e).r(true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) this.f176165e).q();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
