package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class z2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 {
    public boolean A;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f247391u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f247392v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f247393w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f247394x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f247395y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f247396z;

    public z2(android.content.Context context, ab4.u uVar, android.view.ViewGroup viewGroup) {
        super(context, uVar, viewGroup);
        this.f247396z = false;
        this.A = false;
    }

    public void U() {
        int i17;
        long j17;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        ab4.u X = X();
        android.content.Context context = this.f246582d;
        boolean z17 = context instanceof android.app.Activity;
        if (z17) {
            android.app.Activity activity = (android.app.Activity) context;
            long n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(activity.getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
            int intExtra = activity.getIntent().getIntExtra("sns_landig_pages_from_source", 0);
            activity.getIntent().getIntExtra("sns_landing_pages_adType", 0);
            j17 = n17;
            i17 = intExtra;
        } else {
            i17 = 0;
            j17 = 0;
        }
        int i18 = X.f84359p;
        if (i18 == 4) {
            ab4.h hVar = (ab4.h) X;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_card_id", hVar.f84372z1);
            ab4.n0 u17 = u();
            java.lang.String str3 = hVar.f84372z1;
            u17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            java.lang.String str4 = (java.lang.String) ((java.util.HashMap) u17.f84412v).get(str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                ab4.n0 u18 = u();
                java.lang.String str5 = hVar.f84372z1;
                u18.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                java.lang.String str6 = (java.lang.String) ((java.util.HashMap) u18.f84412v).get(str5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                hVar.A1 = str6;
            }
            intent.putExtra("key_card_ext", hVar.A1);
            intent.putExtra("key_from_scene", 21);
            intent.putExtra("key_stastic_scene", 15);
            j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
            Z();
            this.f246919t.b("cardTpId", hVar.f84372z1);
            this.f246919t.b("cardExt", hVar.A1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 8) {
            if (X() instanceof ab4.o) {
                if (z17 && u().d() == 2) {
                    android.app.Activity activity2 = (android.app.Activity) context;
                    java.lang.String stringExtra = activity2.getIntent().getStringExtra("sns_landing_pages_sessionId");
                    str2 = activity2.getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                    str = stringExtra;
                } else {
                    str = "";
                    str2 = str;
                }
                java.lang.String format = java.lang.String.format("%s:%s:%s:%s:%d:%s:%s:%d", str, str2, ((ab4.o) X()).f84350d, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000), java.lang.Integer.valueOf(u().d()), u().o(), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                ab4.o oVar = (ab4.o) X();
                java.lang.String d17 = ca4.m0.d(oVar.A1, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69920x262c9d2(u().k(), i17));
                oVar.A1 = d17;
                if (oVar.f84431x1) {
                    ca4.z0.p0(this.f246582d, oVar.f84417z1, d17, "", u().c(), u().m(), format, u().o(), 1200);
                } else {
                    ca4.z0.q0(this.f246582d, oVar.f84417z1, d17, "", u().c(), u().m(), format, u().o(), 1084);
                }
                this.f246919t.b("weappUserName", oVar.f84417z1);
                this.f246919t.b("weappPath", oVar.A1);
                if (oVar.f84431x1) {
                    this.f246919t.a("isJumpInHalfScreenStyle", 1L);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 9) {
            ab4.k kVar = (ab4.k) X;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("map_view_type", 1);
            intent2.putExtra("kwebmap_slat", kVar.f84382z1.f84376a);
            ab4.j jVar = kVar.f84382z1;
            intent2.putExtra("kwebmap_lng", jVar.f84377b);
            intent2.putExtra("kwebmap_scale", jVar.f84378c);
            java.lang.String str7 = jVar.f84380e;
            intent2.putExtra("kPoiName", str7);
            intent2.putExtra("Kwebmap_locaion", jVar.f84379d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "locatint to slat " + jVar.f84376a + ", slong " + jVar.f84377b + ", " + str7);
            j45.l.n(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent2, 2002);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 10) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.q qVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.p.f272806a;
            if (qVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return;
            }
            ab4.n nVar = (ab4.n) X;
            int size = nVar.f84390z1.size();
            java.util.List list = nVar.f84390z1;
            if (size > 1) {
                ((ez.z0) qVar).wi(context, list, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t2(this));
                this.f246919t.b("phonenumber", (java.lang.String) list.get(0));
            } else if (list.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69787x3c09f1a8((android.app.Activity) context, (java.lang.String) list.get(0));
                this.f246919t.b("phonenumber", (java.lang.String) list.get(0));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 11) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context).w8(X.X, X.U, X.V, X.W, X.S == 1, X.T == 1, X().R == 1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 != 12) {
            if (i18 != 16) {
                java.lang.String str8 = X.G;
                this.f246919t.b("btnJumpUrl", str8);
                if (X.f84431x1) {
                    this.f246919t.a("isJumpInHalfScreenStyle", 1L);
                }
                if (X.f84431x1) {
                    a84.a0.c(this.f246582d, str8, u(), i17, j17);
                } else {
                    a84.a0.a(this.f246582d, str8, u(), i17, j17, X().f84350d);
                }
                Z();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return;
            }
            ab4.i0 i0Var = (ab4.i0) X;
            if (i0Var.f84375z1 != null) {
                java.lang.String n18 = u().n();
                if (android.text.TextUtils.isEmpty(n18)) {
                    n18 = u().o();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "jumpScanUI, use old uxInfo=" + n18);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "jumpScanUI, use new uxInfo=" + n18);
                }
                l44.o5.a(context, i0Var.f84375z1, n18, 8);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "scanJumpInfo == null");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        ab4.r rVar = (ab4.r) X;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "openServiceChat:" + rVar);
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "openServiceChat exp:" + e17.toString());
        }
        if (!android.text.TextUtils.isEmpty(rVar.B1)) {
            if (android.text.TextUtils.isEmpty(rVar.f84423z1)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.po3();
                lVar.f152198b = new r45.qo3();
                lVar.f152199c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
                lVar.f152200d = 1303;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                r45.po3 po3Var = (r45.po3) a17.f152243a.f152217a;
                po3Var.f464784d = rVar.f84423z1;
                po3Var.f464785e = rVar.B1;
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.w2(this, rVar));
            } else {
                db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.j8c, 0).show();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            }
            this.f246919t.b("weappid", rVar.A1);
            this.f246919t.b("weappUserName", rVar.f84423z1);
            this.f246919t.b("businessId", rVar.B1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        }
        V(rVar, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        this.f246919t.b("weappid", rVar.A1);
        this.f246919t.b("weappUserName", rVar.f84423z1);
        this.f246919t.b("businessId", rVar.B1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public final void V(ab4.r rVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doEnterChatting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e c17904x74018d8e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e();
            java.lang.String str2 = rVar.f84423z1;
            if (str2 == null) {
                str2 = "";
            }
            k91.z5 z5Var = new k91.z5();
            z5Var.f387396a = rVar.A1;
            z5Var.f387399d = str2;
            z5Var.f387400e = "";
            z5Var.f387401f = "";
            z5Var.f387403h = 0;
            z5Var.f387402g = 0;
            z5Var.f387404i = "";
            z5Var.f387405j = 14;
            z5Var.f387406k = "";
            z5Var.f387407l = "";
            if (android.text.TextUtils.isEmpty(str)) {
                str = str2;
            }
            c17904x74018d8e.f246539g = str;
            c17904x74018d8e.f246540h = "";
            c17904x74018d8e.f246538f = rVar.C1;
            c17904x74018d8e.f246541i = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y2(this, c17904x74018d8e, z5Var, rVar);
            c17904x74018d8e.d();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "doEnterChatting exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEnterChatting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public android.widget.Button W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        android.widget.Button button = this.f247392v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return button;
    }

    public ab4.u X() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        ab4.u uVar = (ab4.u) this.f246583e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return uVar;
    }

    public void Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        try {
            U();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "doBtnClick exp=" + e17.toString());
        }
        P();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public void Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("overridePendingTransition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        boolean z17 = this.f247395y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (z17) {
            android.content.Context context = this.f246582d;
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("overridePendingTransition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public void a0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f247392v == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "refreshBtnDisableUI, btn is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        try {
            g0(X().f84430x0);
            android.graphics.drawable.Drawable background = this.f247392v.getBackground();
            android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            boolean d07 = d0(gradientDrawable, X().f84427l1);
            boolean e07 = e0(gradientDrawable, X().Y);
            boolean c07 = c0(gradientDrawable, X().f84432y0);
            if (d07 || e07 || c07) {
                this.f247392v.setBackgroundDrawable(gradientDrawable);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "refreshBtnDisableUI, exp is " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public void b0() {
        boolean z17;
        boolean z18;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        float f17 = X().f84356m;
        int i19 = this.f246591p;
        if (f17 > 0.0f && X().f84356m <= i19) {
            i19 = ((int) X().f84355i) + ((int) X().f84356m) + ((int) X().f84354h);
        }
        this.f247391u.setBackgroundColor(this.f246584f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().P)) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().N) || X().K <= 0.0f) {
                z17 = false;
            } else {
                try {
                    i18 = android.graphics.Color.parseColor(X().N);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    i18 = 0;
                }
                gradientDrawable.setStroke((int) X().K, i18);
                if (X().Y > 0.0f) {
                    gradientDrawable.setCornerRadius(X().Y);
                }
                z17 = true;
            }
            z18 = z17;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().M)) {
                try {
                    i17 = android.graphics.Color.parseColor(X().M);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "parseColor exp=" + e18.toString());
                    i17 = 0;
                }
                gradientDrawable.setColor(i17);
                z17 = true;
            }
            if (z17) {
                this.f247392v.setBackgroundDrawable(gradientDrawable);
            }
        } else {
            za4.t0.b("adId", X().P, false, 0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2(this));
            z18 = false;
        }
        this.f247392v.setText(X().F);
        if (X().L == 1) {
            this.f247392v.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        } else if (X().L == 2) {
            this.f247392v.setTypeface(android.graphics.Typeface.defaultFromStyle(2));
        }
        android.widget.Button button = this.f247392v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (X().f84426J > 0.0f) {
            this.f247392v.setTextSize(0, X().f84426J);
        }
        if (X().I != null && X().I.length() > 0) {
            try {
                this.f247392v.setTextColor(android.graphics.Color.parseColor(X().I));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "invalid color! %s", X().I);
            }
        }
        try {
            this.f247392v.setTextAlignment(4);
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
        }
        if (X().f84363t > 0.0f) {
            this.f247392v.setLayoutParams(new android.widget.FrameLayout.LayoutParams((i19 - ((int) X().f84354h)) - ((int) X().f84355i), (int) X().f84363t));
        } else {
            this.f247392v.setLayoutParams(new android.widget.FrameLayout.LayoutParams((i19 - ((int) X().f84354h)) - ((int) X().f84355i), this.f247392v.getLayoutParams().height));
        }
        if (X().Q == 1) {
            this.f247393w.setLayoutParams(new android.widget.FrameLayout.LayoutParams((i19 - ((int) X().f84354h)) - ((int) X().f84355i), this.f247393w.getLayoutParams().height));
            android.view.View view = this.f247393w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f247393w.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q2(this));
            this.f247393w.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r2(this));
        } else {
            android.view.View view2 = this.f247393w;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z18) {
            this.f247391u.m81437x205ac394(X().Y);
            float f18 = X().Y;
            if (f18 > 0.0f && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().P)) {
                android.graphics.drawable.Drawable background = this.f247392v.getBackground();
                android.graphics.drawable.GradientDrawable gradientDrawable2 = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setShape(0);
                if (e0(gradientDrawable2, f18)) {
                    this.f247392v.setBackgroundDrawable(gradientDrawable2);
                }
            }
        }
        l44.f4.e(this.f246582d, X(), this.f247392v);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public final boolean c0(android.graphics.drawable.GradientDrawable gradientDrawable, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i17 = 0;
        if (gradientDrawable == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBackgroundColor, drawable is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        try {
            i17 = android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBackgroundColor, parseColor exp=" + e17.toString() + " , backgroundColor is " + str);
        }
        gradientDrawable.setColor(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return true;
    }

    public final boolean d0(android.graphics.drawable.GradientDrawable gradientDrawable, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i17 = 0;
        if (gradientDrawable == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBorderColor, drawable is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || X().K <= 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        try {
            i17 = android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBorderColor, parseColor exp=" + e17.toString() + " , borderColor is " + str);
        }
        gradientDrawable.setStroke((int) X().K, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return true;
    }

    public final boolean e0(android.graphics.drawable.GradientDrawable gradientDrawable, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (f17 > 0.0f) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f247391u;
            if (c22646x1e9ca55 != null) {
                c22646x1e9ca55.m81437x205ac394(f17);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(f17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return false;
    }

    public void g0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f247392v == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnFontColor, btn is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                this.f247392v.setTextColor(android.graphics.Color.parseColor(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnFontColor, parseColor exp=" + e17.toString() + " , fontColor is " + str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        android.view.View view = this.f246589n;
        this.f247391u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.n4o);
        this.f247392v = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.n4n);
        this.f247393w = view.findViewById(com.p314xaae8f345.mm.R.id.n4p);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        S(0);
        b0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f247396z) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpd;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpc;
    }
}
