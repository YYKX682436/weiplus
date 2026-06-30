package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI */
/* loaded from: classes15.dex */
public class ActivityC13042x42c001 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 implements tt1.l, l75.q0 {
    public static final /* synthetic */ int T = 0;
    public java.lang.String A = null;
    public boolean B = true;
    public boolean C = false;
    public boolean D = true;
    public boolean E = true;
    public boolean F = false;
    public java.lang.String G = "";
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f176253J = false;
    public int K = 0;
    public boolean L = false;
    public long M = 0;
    public long N = 0;
    public boolean P = false;
    public long Q = 0;
    public boolean R = false;
    public boolean S = false;

    /* renamed from: w, reason: collision with root package name */
    public gu1.n f176254w;

    /* renamed from: x, reason: collision with root package name */
    public gu1.m f176255x;

    /* renamed from: y, reason: collision with root package name */
    public gu1.s f176256y;

    /* renamed from: z, reason: collision with root package name */
    public eu1.f f176257z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public android.widget.BaseAdapter T6() {
        return new gu1.k(mo55332x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void V6() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572338av3);
        eu1.f fVar = new eu1.f(this);
        this.f176257z = fVar;
        fVar.j();
        this.K = eu1.f.b() ? 1 : eu1.f.c() ? eu1.f.f338285c ? 3 : 4 : 0;
        if (this.f176256y == null) {
            gu1.s sVar = new gu1.s(this, m78513xc2a54588());
            this.f176256y = sVar;
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569891r4, null);
            sVar.f357447b = inflate;
            sVar.f357448c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565108ba4);
            sVar.f357449d = (android.widget.TextView) sVar.f357447b.findViewById(com.p314xaae8f345.mm.R.id.ba_);
            sVar.a();
        }
        if (this.f176254w == null) {
            android.view.View m78513xc2a54588 = m78513xc2a54588();
            gu1.n nVar = new gu1.n(this, m78513xc2a54588);
            this.f176254w = nVar;
            nVar.f357439c = (android.widget.ImageView) m78513xc2a54588.findViewById(com.p314xaae8f345.mm.R.id.kbw);
            nVar.f357441e = (android.widget.TextView) m78513xc2a54588.findViewById(com.p314xaae8f345.mm.R.id.kby);
            nVar.f357440d = (android.widget.TextView) m78513xc2a54588.findViewById(com.p314xaae8f345.mm.R.id.kbz);
            this.f176254w.getClass();
        }
        if (this.f176255x == null) {
            gu1.m mVar = new gu1.m(this, m78513xc2a54588());
            this.f176255x = mVar;
            mVar.f357432b = this.f176257z;
            if (mVar.f357431a == null) {
                android.view.View inflate2 = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569880qt, null);
                mVar.f357431a = inflate2;
                mVar.f357433c = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564414qn);
                mVar.f357436f = (android.widget.TextView) mVar.f357431a.findViewById(com.p314xaae8f345.mm.R.id.mvo);
                mVar.f357434d = (android.widget.LinearLayout) mVar.f357431a.findViewById(com.p314xaae8f345.mm.R.id.im9);
                mVar.f357435e = (android.widget.LinearLayout) mVar.f357431a.findViewById(com.p314xaae8f345.mm.R.id.f567213im1);
                mVar.f357434d.setVisibility(8);
                mVar.f357435e.setVisibility(8);
                android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                mVar.f357433c.startAnimation(rotateAnimation);
            }
            mVar.a();
            gu1.m mVar2 = this.f176255x;
            gu1.p pVar = new gu1.p(this);
            android.view.View view = mVar2.f357431a;
            if (view != null) {
                view.setOnClickListener(pVar);
            }
        }
        android.widget.LinearLayout linearLayout = this.f176168h;
        if (linearLayout != null) {
            linearLayout.addView(this.f176256y.f357447b);
        }
        android.widget.LinearLayout linearLayout2 = this.f176169i;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.f176255x.f357431a);
        }
        this.f176164d.setVisibility(0);
        this.f176164d.setOnScrollListener(new gu1.q(this));
        if (getIntent() == null || !getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_IS_SHOW_SHARE_CARD_ENTRANCE_TIP_INT_SYNC;
            java.lang.Integer num = (java.lang.Integer) c17.m(u3Var, 0);
            if (num != null && num.intValue() != 1) {
                gm0.j1.u().c().x(u3Var, 1);
            }
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_IS_SHOW_SHARE_CARD_ENTRANCE_TIP_INT_SYNC;
            java.lang.Integer num2 = (java.lang.Integer) c18.m(u3Var2, 0);
            if (num2 == null || num2.intValue() != 1) {
                gm0.j1.u().c().x(u3Var2, 1);
                lu1.r.f(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.ra, com.p314xaae8f345.mm.R.C30867xcad56011.avc, "");
            }
        }
        this.A = getIntent().getStringExtra("KEY_CARD_TP_ID");
        java.lang.String stringExtra = getIntent().getStringExtra("key_layout_buff");
        this.G = stringExtra;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.B = false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            return;
        }
        this.C = true;
    }

    @Override // tt1.l
    public void W0() {
        this.f176257z.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_category_info_list");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_category_info_list");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fu1.f fVar = (fu1.f) arrayList.get(i17);
            xt1.t0.nj().b1(fVar.f348371a, 10, fVar.f348372b);
        }
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            fu1.f fVar2 = (fu1.f) arrayList2.get(i18);
            xt1.t0.nj().b1(fVar2.f348371a, 0, fVar2.f348372b);
        }
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.B = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(this.f176171n), java.lang.Boolean.valueOf(this.f176253J));
        if (this.C && this.f176171n && this.f176253J) {
            n7(false);
        } else {
            p7();
        }
        this.C = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public boolean X6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void b7(tt1.j jVar, int i17) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "card tp id:" + jVar.f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "card id:" + jVar.g());
        intent.putExtra("key_card_id", xt1.t0.nj().J0(jVar.f()));
        intent.putExtra("key_card_tp_id", jVar.f());
        intent.putExtra("key_is_share_card", true);
        intent.putExtra("key_from_scene", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.String f17 = jVar.f();
        if (android.text.TextUtils.isEmpty(f17)) {
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_top_info_list");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            fu1.n nVar = (fu1.n) arrayList2.get(i18);
            if (nVar != null && f17.equals(nVar.f348395a) && nVar.f348396b == 1) {
                arrayList2.set(i18, nVar);
                xt1.t0.Di().b("key_share_card_other_city_top_info_list", arrayList2);
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void d7(tt1.j jVar, int i17) {
        if (jVar != null) {
            eu1.f.r(jVar.f());
        }
        super.d7(jVar, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void e7(tt1.j jVar) {
        super.e7(jVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void f7() {
        if (this.I || this.H) {
            i7();
            return;
        }
        this.I = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "onLocationFail()");
        l7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void g7() {
        this.f176253J = true;
        if (!this.H) {
            this.H = true;
            l7();
            i7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
            if (this.L) {
                i7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void h7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.L);
        if (this.L) {
            return;
        }
        this.L = true;
        ((ku5.t0) ku5.t0.f394148d).h(new gu1.o(this), "MicroMsg.ShareCardListUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
        this.L = Di;
        if (!Di) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
            l7();
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new gu1.o(this), "MicroMsg.ShareCardListUI");
        }
    }

    public final void l7() {
        if (this.f176257z.k() && this.f176257z.l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
            this.E = true;
            return;
        }
        if (!this.f176257z.k() || !this.f176257z.l()) {
            this.D = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
        m7();
        xt1.t0.ij().a("", "", 4);
    }

    public final void m7() {
        if (this.F) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G) && !eu1.f.b() && !eu1.f.c() && !eu1.f.b() && !eu1.f.c()) {
            gu1.m mVar = this.f176255x;
            mVar.f357434d.setVisibility(0);
            mVar.f357435e.setVisibility(8);
            this.f176164d.setEmptyView(null);
            this.f176164d.invalidate();
            this.S = true;
        }
        if (this.D && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
            this.G = "";
        }
        this.F = true;
        gm0.j1.n().f354821b.g(new fu1.b(xt1.t0.ij().f530813d, xt1.t0.ij().f530814e, this.G));
    }

    public final void n7(boolean z17) {
        i11.e eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(z17));
        if (this.B) {
            this.B = false;
            this.H = false;
            this.D = true;
            this.G = "";
            if (!z17) {
                m7();
            } else if (this.L && this.P && (eVar = this.f176174q) != null) {
                ((i11.h) eVar).k(this.f176178u, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
            }
        }
        p7();
    }

    public final void o7() {
        int intExtra = getIntent().getIntExtra("key_from_scene", 22);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(262152, 266256);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262152, 266256);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f17 = bk0.a.g().f(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f18 = bk0.a.g().f(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 2, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 1, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && !f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 3, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 4, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else if (f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 5, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardListUI", 0, "", "", 0, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.M = currentTimeMillis;
        this.N = currentTimeMillis;
        mo43517x10010bd5();
        this.f176254w.getClass();
        this.f176255x.getClass();
        this.f176256y.getClass();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de, this);
        xt1.t0.mj().c(this);
        o7();
        xt1.t0.nj().add(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.L) {
            i7();
        }
        this.f176254w.getClass();
        this.f176255x.f357432b = null;
        this.f176256y.getClass();
        this.f176257z.getClass();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de, this);
        xt1.t0.mj().d(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
        s75.d.b(new eu1.e(), "delelteAllIllegalStatusCard");
        xt1.t0.nj().mo49775xc84af884(this);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.N;
        if (android.text.TextUtils.isEmpty(this.A)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "ShareCardListUI", 1, "", "", java.lang.Long.valueOf(currentTimeMillis));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "ShareCardListUI", 0, "", "", java.lang.Long.valueOf(currentTimeMillis));
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        o7();
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_CARD_TP_ID");
            this.A = stringExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            this.C = true;
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        this.B = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.B = false;
        this.C = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        n7(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.M;
        if (j17 != 0) {
            int i17 = (int) (currentTimeMillis - j17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(281);
            c4582x424c344.m40331x936762bd(56);
            c4582x424c344.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(281);
            c4582x424c3442.m40331x936762bd(57);
            c4582x424c3442.m40332x57b2b64f(i17);
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
            this.M = 0L;
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.b) {
                if (this.S) {
                    this.S = false;
                    this.f176255x.f357434d.setVisibility(8);
                    this.f176164d.setEmptyView(this.f176166f);
                    this.f176164d.invalidate();
                }
                this.F = false;
                this.E = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (m1Var instanceof fu1.b) {
            fu1.b bVar = (fu1.b) m1Var;
            this.F = false;
            this.G = bVar.f348353g;
            this.f176257z.q(bVar.f348352f, this.D);
            if (!this.f176257z.k() || !this.f176257z.l()) {
                this.D = false;
            }
            this.E = this.f176257z.k() && this.f176257z.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
            p7();
        }
    }

    public final void p7() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.Q;
        if (!this.R || currentTimeMillis >= 1000) {
            this.R = true;
            if (currentTimeMillis < 500) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gu1.r(this), 500L);
                return;
            }
            int i17 = this.K;
            if (i17 == 0 || i17 == 4 || ((i17 == 2 && (!eu1.f.b() || !eu1.f.c())) || ((this.K == 1 && (!eu1.f.b() || eu1.f.c())) || (this.K == 3 && (!eu1.f.c() || eu1.f.b()))))) {
                this.K = eu1.f.b() ? 1 : eu1.f.c() ? eu1.f.f338285c ? 3 : 4 : 0;
            }
            xt1.t0.Di().b("key_share_card_show_type", java.lang.Integer.valueOf(this.K));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", java.lang.Integer.valueOf(this.K), java.lang.Boolean.valueOf(eu1.f.b()), java.lang.Boolean.valueOf(eu1.f.c()));
            gu1.n nVar = this.f176254w;
            nVar.f357440d.setVisibility(0);
            android.widget.ImageView imageView = nVar.f357439c;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = nVar.f357438b;
            imageView.setImageDrawable(abstractActivityC21394xb3d2c0cf.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.byq));
            nVar.f357440d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.auy);
            nVar.f357441e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.auw);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) nVar.f357439c.getLayoutParams();
            layoutParams.topMargin = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561730r3);
            nVar.f357439c.setLayoutParams(layoutParams);
            nVar.f357439c.invalidate();
            if (eu1.f.b() || eu1.f.c()) {
                this.f176255x.a();
                this.f176256y.a();
                if (this.K == 4 && this.f176164d.getEmptyView() != null) {
                    this.f176164d.setEmptyView(null);
                    this.f176164d.invalidate();
                }
            } else {
                gu1.m mVar = this.f176255x;
                mVar.f357434d.setVisibility(8);
                mVar.f357435e.setVisibility(8);
                mVar.f357436f.setVisibility(8);
                android.view.View view = this.f176256y.f357447b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "hideItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "hideItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View emptyView = this.f176164d.getEmptyView();
                android.widget.RelativeLayout relativeLayout = this.f176166f;
                if (emptyView != relativeLayout) {
                    this.f176164d.setEmptyView(relativeLayout);
                    this.f176164d.invalidate();
                }
            }
            android.widget.BaseAdapter baseAdapter = this.f176165e;
            if (baseAdapter instanceof gu1.k) {
                gu1.k kVar = (gu1.k) baseAdapter;
                kVar.f357427q = this.K;
                kVar.f();
            }
            this.Q = java.lang.System.currentTimeMillis();
            this.R = false;
        }
    }
}
