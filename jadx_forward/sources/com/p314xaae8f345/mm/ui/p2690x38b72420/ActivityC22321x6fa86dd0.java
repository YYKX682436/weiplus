package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI */
/* loaded from: classes10.dex */
public class ActivityC22321x6fa86dd0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2690x38b72420.l4, l75.z0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f288034u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f288035d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.j7 f288036e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f288037f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 f288038g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f288039h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f288040i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f288041m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f288042n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f288043o;

    /* renamed from: p, reason: collision with root package name */
    public final int f288044p = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);

    /* renamed from: q, reason: collision with root package name */
    public final int f288045q = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForClient", 30);

    /* renamed from: r, reason: collision with root package name */
    public int f288046r;

    /* renamed from: s, reason: collision with root package name */
    public int f288047s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 f288048t;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        return this.f288035d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return null;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        this.f288036e.s();
        int t17 = this.f288036e.t();
        this.f288038g.m80405x92401221(t17);
        this.f288037f.setVisibility(t17 == 0 ? 0 : 8);
        this.f288041m.setEnabled(t17 > 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c8j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList P1;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        if (i17 != 3) {
            if (i17 == 2) {
                java.util.ArrayList P12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("Select_Contact").split(","));
                if (P12 == null || P12.isEmpty()) {
                    return;
                }
                db5.e1.B(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571413eb), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571414ec), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2690x38b72420.t6(this, P12), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
                return;
            }
            if (i17 != 1 || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("Select_Contact").split(","))) == null || P1.isEmpty()) {
                return;
            }
            w11.h0 h0Var = new w11.h0(P1, 8388608, 1, this.f288044p);
            gm0.j1.n().f354821b.g(h0Var);
            this.f288048t.f136906e = P1.size();
            this.f288048t.f136909h = this.f288036e.t();
            this.f288048t.f136914m = java.lang.System.currentTimeMillis() - this.f288048t.f136914m;
            this.f288043o = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_), true, true, new com.p314xaae8f345.mm.ui.p2690x38b72420.u6(this, h0Var));
            return;
        }
        int intExtra = intent.getIntExtra("label_id", 0);
        java.util.ArrayList P13 = b93.r.wi().P1(intExtra + "");
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478.class);
        intent2.putExtra("list_type", 1);
        intent2.putExtra("filter_type", "@all.contact.android");
        java.lang.String[] strArr = new java.lang.String[0];
        if (P13 != null) {
            strArr = (java.lang.String[]) P13.toArray(strArr);
        }
        intent2.putExtra("already_select_contact", strArr);
        intent2.putExtra("max_limit_num", this.f288045q);
        startActivityForResult(intent2, 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c2201 = this.f288048t;
        c6336x745c2201.f136913l = c6336x745c2201.b("selecttagid", intExtra + "", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22012 = this.f288048t;
        c6336x745c22012.f136912k = c6336x745c22012.b("selecttagname", b93.r.wi().z1(intExtra + ""), true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571407e5);
        this.f288035d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f567413jf5);
        m78597x53c22598(new com.p314xaae8f345.mm.ui.p2690x38b72420.x6(this));
        this.f288037f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfx);
        this.f288036e = new com.p314xaae8f345.mm.ui.p2690x38b72420.j7(this, this);
        boolean booleanExtra = getIntent().getBooleanExtra("intent_status_mgr", false);
        if (booleanExtra) {
            this.f288036e.f288611f = true;
        }
        this.f288035d.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.y6(this));
        this.f288035d.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.b7(this));
        this.f288035d.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.c7(this));
        this.f288035d.setAdapter((android.widget.ListAdapter) this.f288036e);
        android.widget.ListView listView = this.f288035d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = new com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434(this);
        this.f288038g = c22293x1808c434;
        listView.addFooterView(c22293x1808c434, null, false);
        this.f288038g.m80405x92401221(this.f288036e.t());
        this.f288037f.setVisibility(this.f288036e.t() == 0 ? 0 : 8);
        ((com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0) findViewById(com.p314xaae8f345.mm.R.id.jft)).m79298x40d747ee(new com.p314xaae8f345.mm.ui.p2690x38b72420.d7(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.mjh);
        this.f288039h = c22621x7603e017;
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.f7(this));
        this.f288040i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564225lf);
        this.f288041m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566989hq1);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.crz);
        this.f288042n = button;
        button.setEnabled(false);
        this.f288040i.setVisibility(booleanExtra ? 8 : 0);
        this.f288041m.setVisibility(booleanExtra ? 8 : 0);
        this.f288042n.setVisibility(booleanExtra ? 0 : 8);
        this.f288041m.setEnabled(this.f288036e.t() > 0);
        this.f288040i.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.g7(this));
        this.f288041m.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.h7(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.i7(this));
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(3990, this);
        if (((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().z0()).size() == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4 c5620x496bfda4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4();
            c5620x496bfda4.f135946g.f89065a = 1;
            c5620x496bfda4.e();
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OnlyChatContactMgrUI)).Rj(this, iy1.a.ContactSocialBlackList);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(3990, this);
        this.f288036e.k();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String m150572x17ec12d2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlyChatContactMgrUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
        if (m1Var instanceof w11.h0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f288043o;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f288043o = null;
            }
            w11.h0 h0Var = (w11.h0) m1Var;
            int i19 = h0Var.f523574g;
            java.util.List list = h0Var.f523572e;
            if (i17 == 0 && i18 == 0) {
                android.widget.Toast.makeText(this, getString(i19 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571421ej : com.p314xaae8f345.mm.R.C30867xcad56011.f571424em), 0).show();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c2201 = this.f288048t;
                c6336x745c2201.f136907f = c6336x745c2201.f136906e;
                c6336x745c2201.f136908g = c6336x745c2201.b("modifiedsucfriendlist", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, "#"), true);
                if (h0Var.f523574g == 1) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22012 = this.f288048t;
                    c6336x745c22012.f136910i = c6336x745c22012.f136909h + ((java.util.LinkedList) list).size();
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22013 = this.f288048t;
                    c6336x745c22013.f136910i = c6336x745c22013.f136909h - ((java.util.LinkedList) list).size();
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22014 = this.f288048t;
                c6336x745c22014.f136911j = 1L;
                c6336x745c22014.f136915n = c6336x745c22014.b("sessionid", hashCode() + "", true);
                this.f288048t.k();
                return;
            }
            int i27 = com.p314xaae8f345.mm.R.C30867xcad56011.f571419eh;
            if (i18 == -3503) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                java.lang.String m150572x17ec12d22 = m1Var.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571419eh);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m150572x17ec12d22 == null) {
                    m150572x17ec12d22 = string;
                }
                u1Var.g(m150572x17ec12d22);
                u1Var.a(true);
                u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
                u1Var.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.v6(this));
                u1Var.q(false);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
            if (i18 == -3500) {
                m150572x17ec12d2 = getString(i19 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571420ei : com.p314xaae8f345.mm.R.C30867xcad56011.f571423el, java.lang.Integer.valueOf(h0Var.f523578n - ((java.util.LinkedList) list).size()));
            } else {
                m150572x17ec12d2 = m1Var.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m150572x17ec12d2)) {
                    if (i19 != 1) {
                        i27 = com.p314xaae8f345.mm.R.C30867xcad56011.f571422ek;
                    }
                    m150572x17ec12d2 = getString(i27);
                }
            }
            u1Var2.g(m150572x17ec12d2);
            u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
            u1Var2.l(new com.p314xaae8f345.mm.ui.p2690x38b72420.w6(this));
            u1Var2.q(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.f288036e.f288499r).contains(((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).f288352z);
    }
}
