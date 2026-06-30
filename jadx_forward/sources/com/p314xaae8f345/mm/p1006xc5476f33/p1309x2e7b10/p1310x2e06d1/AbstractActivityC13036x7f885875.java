package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1;

/* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC13036x7f885875 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.da {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f176163v = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f176168h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f176169i;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe f176173p;

    /* renamed from: q, reason: collision with root package name */
    public i11.e f176174q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f176164d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.BaseAdapter f176165e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f176166f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176167g = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f176170m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f176171n = true;

    /* renamed from: o, reason: collision with root package name */
    public tt1.i f176172o = null;

    /* renamed from: r, reason: collision with root package name */
    public float f176175r = -85.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f176176s = -1000.0f;

    /* renamed from: t, reason: collision with root package name */
    public boolean f176177t = false;

    /* renamed from: u, reason: collision with root package name */
    public final i11.c f176178u = new tt1.g(this);

    public android.widget.BaseAdapter T6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k(this, U6());
    }

    public xt1.r U6() {
        return xt1.r.NORMAL_TYPE;
    }

    public abstract void V6();

    public void W6() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f176174q = i11.h.e();
    }

    public boolean X6() {
        return true;
    }

    public boolean Y6() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001);
    }

    public void Z6() {
    }

    public void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe) {
        this.f176173p = c13038x357affe;
        lu1.d.a(this, 0, this);
    }

    public void b7(tt1.j jVar, int i17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", jVar.g());
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/base/CardBaseUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/base/CardBaseUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (U6() == xt1.r.HOME_MEMBER_CARD_TYPE) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(11324, "ClickMemberCard", 0, "", "", 0, 0, "", 0, 0);
            g0Var.d(15767, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_CARD_NUM_INT_SYNC, 3)).intValue()), java.lang.Integer.valueOf(i17 + 1));
        } else if (U6() == xt1.r.MEMBER_CARD_TYPE) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ClickMemberCard", 0, "", "", 0, 1, "", 0, 0);
        }
    }

    public void c7() {
    }

    public void d7(tt1.j jVar, int i17) {
        if (!X6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "isItemClickable return false");
            return;
        }
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "onListItemClick  item == null");
            return;
        }
        if (jVar.g().equals("PRIVATE_TICKET_TITLE") || jVar.g().equals("PRIVATE_INVOICE_TITLE")) {
            return;
        }
        if (jVar.c()) {
            b7(jVar, i17);
        } else {
            if (android.text.TextUtils.isEmpty(jVar.s0().A)) {
                return;
            }
            lu1.d.j(this, jVar.s0().A, 0);
        }
    }

    public void e7(tt1.j jVar) {
        if (!Y6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "isItemClickable return false");
            return;
        }
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "onListItemLongClick  item == null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jVar.u()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.s0().f470105z1)) {
                arrayList.add(jVar.s0().f470105z1);
            } else if (jVar.m0()) {
                arrayList.add(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.au_));
            } else {
                arrayList.add(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.au9));
            }
        }
        arrayList.add(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
        db5.e1.e(this, jVar.s0().f470101y, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), null, new tt1.e(this, jVar, jVar.g()));
    }

    public void f7() {
    }

    public void g7() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569861qa;
    }

    public void h7() {
    }

    public void i7() {
        i11.e eVar = this.f176174q;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f176178u);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new tt1.a(this));
        this.f176164d = (android.widget.ListView) findViewById(android.R.id.list);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.cho);
        this.f176166f = relativeLayout;
        if (relativeLayout != null) {
            this.f176164d.setEmptyView(relativeLayout);
        }
        this.f176168h = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569870qj, null);
        this.f176169i = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569867qg, null);
        this.f176164d.addHeaderView(this.f176168h);
        this.f176164d.addFooterView(this.f176169i);
        android.widget.BaseAdapter T6 = T6();
        this.f176165e = T6;
        boolean z17 = T6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r4;
        this.f176164d.setAdapter((android.widget.ListAdapter) T6);
        this.f176164d.setOnItemClickListener(new tt1.b(this));
        this.f176164d.setOnItemLongClickListener(new tt1.c(this));
        gm0.j1.n().f354821b.a(mc1.l.f72830x366c91de, this);
        gm0.j1.n().f354821b.a(1046, this);
        android.widget.BaseAdapter baseAdapter = this.f176165e;
        tt1.i lVar = baseAdapter instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) baseAdapter) : baseAdapter instanceof gu1.k ? new gu1.l((gu1.k) baseAdapter) : new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.t2((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2) baseAdapter);
        this.f176172o = lVar;
        lVar.mo54456x3e5a77bb();
        V6();
    }

    public void j7(boolean z17) {
        if (z17) {
            this.f176167g = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176167g;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f176167g.dismiss();
        this.f176167g = null;
    }

    public void k7(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = this.f176173p;
        if (c13038x357affe == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo == null");
            return;
        }
        if (c13038x357affe.s0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 == 0) {
            if (android.text.TextUtils.isEmpty(this.f176173p.Y().f459113d) || this.f176173p.m0()) {
                sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdx));
            } else {
                sb6.append(this.f176173p.Y().f459113d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f176173p.s0().f470083i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe2 = this.f176173p;
            g0Var.d(11582, "OperGift", 2, valueOf, c13038x357affe2.f67737xf4648834, c13038x357affe2.f67736x95970a65, str);
        } else if (i17 == 1) {
            sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.asi, this.f176173p.s0().f470101y));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f176173p.s0().f470083i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe3 = this.f176173p;
            g0Var2.d(11582, "OperGift", 3, valueOf2, c13038x357affe3.f67737xf4648834, c13038x357affe3.f67736x95970a65, str);
        }
        java.lang.String str2 = this.f176173p.s0().f470086n + "\n" + this.f176173p.s0().f470085m;
        r35.u3 u3Var = r35.t3.f450796a;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = mo78514x143f1b92();
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.f176173p.s0().f470079e;
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        tt1.f fVar = new tt1.f(this, str, z17);
        ((ez.z0) u3Var).getClass();
        r35.j1.j(mo78514x143f1b92, sb7, str3, str2, null, false, string, fVar);
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 0 && i18 == -1) {
            k7(intent.getStringExtra("Select_Conv_User"), 0, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(mc1.l.f72830x366c91de, this);
        gm0.j1.n().f354821b.q(1046, this);
        tt1.i iVar = this.f176172o;
        if (iVar != null) {
            iVar.mo54457xac79a11b();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f176171n = false;
        gm0.j1.n().f354821b.q(1045, this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 69) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new tt1.h(this), null);
        } else {
            h7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f176171n = true;
        gm0.j1.n().f354821b.a(1045, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            j7(false);
            if (m1Var instanceof xt1.m0) {
                xt1.m0 m0Var = (xt1.m0) m1Var;
                int i19 = m0Var.f538060h;
                java.lang.String str2 = m0Var.f538059g;
                if (i19 == 10000) {
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.asj);
                    }
                    str = str2;
                }
            }
            if ((m1Var instanceof xt1.k0) || (m1Var instanceof fu1.b) || !this.f176171n) {
                return;
            }
            lu1.r.d(this, str, i18);
            return;
        }
        if (m1Var instanceof xt1.z) {
            j7(false);
            db5.e1.T(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.as6));
            xt1.t0.wi().a(4);
            this.f176172o.mo54458x50fc6e08();
            Z6();
            return;
        }
        if (m1Var instanceof xt1.m0) {
            j7(false);
            xt1.m0 m0Var2 = (xt1.m0) m1Var;
            int i27 = m0Var2.f538060h;
            java.lang.String str3 = m0Var2.f538059g;
            if (i27 == 10000) {
                if (android.text.TextUtils.isEmpty(str3)) {
                    str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.asj);
                }
                lu1.r.d(this, str3, i27);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = this.f176173p;
            if (c13038x357affe != null) {
                r45.rt i07 = c13038x357affe.i0();
                i07.f466714d = 3;
                this.f176173p.G(i07);
                if (!xt1.t0.cj().mo9952xce0038c9(this.f176173p, new java.lang.String[0])) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseUI", "update newSerial fail, cardId = %s", this.f176173p.f67736x95970a65);
                }
            }
            this.f176172o.mo54458x50fc6e08();
            Z6();
        }
    }
}
