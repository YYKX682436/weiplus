package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class o2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public static final p3325xe03a0797.p3326xc267989b.r0 G;
    public final android.content.Context B;
    public final f54.z C;
    public p3325xe03a0797.p3326xc267989b.y0 D;
    public boolean E;
    public boolean F;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g2(null);
        G = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.k2(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    public o2(android.content.Context context, f54.z zVar, android.view.ViewGroup viewGroup) {
        super(context, zVar, viewGroup);
        this.B = context;
        this.C = zVar;
        this.D = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        f54.x b17;
        f54.y b18;
        java.lang.String a17;
        f54.x b19;
        f54.w a18;
        java.lang.String a19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        super.K();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHfScreenCombineFollowComp", "viewWillAppear() called");
        if (this.D == null) {
            this.D = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        if (!h0()) {
            f54.z zVar = this.C;
            if (zVar == null || (b17 = zVar.b()) == null || (b18 = b17.b()) == null || (a17 = b18.a()) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                return;
            }
            if (zVar == null || (b19 = zVar.b()) == null || (a18 = b19.a()) == null || (a19 = a18.a()) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                return;
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.D;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, G, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.n2(this, a17, a19, null), 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f247392v == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnUIDisable, btn is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else if (this.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnUIDisable, has already set!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else {
            this.A = true;
            try {
                int A1 = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1("0.6") * 255.0d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().f84430x0)) {
                    X().I = X().f84430x0;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().I)) {
                    X().I = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), X().I.substring(1));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().f84427l1)) {
                    X().N = X().f84427l1;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().N)) {
                    X().N = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), X().N.substring(1));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().f84432y0)) {
                    X().M = X().f84432y0;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X().M)) {
                    X().M = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), X().M.substring(1));
                }
                b0();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnUIDisable, exp is " + th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        super.L();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.D;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.D = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void Y() {
        f54.x b17;
        java.lang.String str;
        android.view.View view;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j2 j2Var;
        boolean z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.h2 h2Var;
        java.lang.String str4;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        f54.z zVar = this.C;
        if (zVar == null || (b17 = zVar.b()) == null) {
            P();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            return;
        }
        if (this.D == null) {
            this.D = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        ib4.h hVar = this.f246919t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        java.lang.String str7 = b17.f341292a;
        hVar.b("headTitle", str7 == null ? "" : str7);
        ib4.h hVar2 = this.f246919t;
        java.lang.String a17 = b17.a().a();
        if (a17 == null) {
            a17 = "";
        }
        hVar2.b("brandUsername", a17);
        ib4.h hVar3 = this.f246919t;
        java.lang.String a18 = b17.b().a();
        if (a18 == null) {
            a18 = "";
        }
        hVar3.b("finderUsername", a18);
        if (h0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingHfScreenCombineFollowComp", "canNotJumpAddBrand!");
            P();
            str6 = "onBtnClick";
            str5 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
        } else {
            boolean z28 = this.E;
            android.content.Context context = this.B;
            if (z28 && this.F) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllFollowedJumpType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllFollowedJumpType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJUMP_TYPE_TO_BRAND", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getJUMP_TYPE_TO_BRAND$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getJUMP_TYPE_TO_BRAND$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJUMP_TYPE_TO_BRAND", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
                if (b17.f341294c == 0) {
                    int l17 = u().l();
                    java.lang.String a19 = b17.a().a();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpBrandUI$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                    i0(context, l17, a19, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpBrandUI$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                } else {
                    java.lang.String a27 = b17.b().a();
                    ab4.n0 u17 = u();
                    java.lang.String o17 = u17 != null ? u17.o() : null;
                    if (o17 == null) {
                        o17 = "";
                    }
                    ab4.n0 u18 = u();
                    java.lang.String k17 = u18 != null ? u18.k() : null;
                    l0(context, a27, o17, k17 != null ? k17 : "");
                }
            } else {
                p3325xe03a0797.p3326xc267989b.r0 r0Var = l44.y.f397953a;
                p3325xe03a0797.p3326xc267989b.y0 y0Var = this.D;
                boolean z29 = this.F;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.h2 h2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.h2(z28, z29);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j2 j2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.j2(this, b17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showHfScreen", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
                if (context == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showHfScreen", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0);
                    z2Var2.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
                    android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571017cp0, (android.view.ViewGroup) null);
                    android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.n3z) : null;
                    if (inflate != null) {
                        view = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568523n40);
                        str = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper";
                    } else {
                        str = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper";
                        view = null;
                    }
                    android.widget.CheckBox checkBox = findViewById != null ? (android.widget.CheckBox) findViewById.findViewById(com.p314xaae8f345.mm.R.id.n5e) : null;
                    android.widget.CheckBox checkBox2 = view != null ? (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.n5e) : null;
                    if (y0Var != null) {
                        str2 = "onBtnClick";
                        j2Var = j2Var2;
                        z17 = z29;
                        h2Var = h2Var2;
                        str4 = "showHfScreen";
                        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
                        z2Var = z2Var2;
                        p3325xe03a0797.p3326xc267989b.l.d(y0Var, l44.y.f397953a, null, new l44.m(inflate, b17, context, null), 2, null);
                    } else {
                        str2 = "onBtnClick";
                        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
                        j2Var = j2Var2;
                        z17 = z29;
                        z2Var = z2Var2;
                        h2Var = h2Var2;
                        str4 = "showHfScreen";
                    }
                    android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n3y) : null;
                    if (textView != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                        textView.setText(str7);
                    }
                    android.widget.TextView textView2 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.n5h) : null;
                    if (textView2 != null) {
                        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7f));
                    }
                    android.widget.TextView textView3 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.n5f) : null;
                    if (textView3 != null) {
                        f54.w a28 = b17.a();
                        a28.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
                        java.lang.String str8 = a28.f341290b;
                        if (str8 == null) {
                            str8 = "";
                        }
                        textView3.setText(str8);
                    }
                    android.widget.TextView textView4 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n5h) : null;
                    if (textView4 != null) {
                        textView4.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7h));
                    }
                    android.widget.TextView textView5 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n5f) : null;
                    if (textView5 != null) {
                        f54.y b18 = b17.b();
                        b18.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
                        java.lang.String str9 = b18.f341299b;
                        if (str9 == null) {
                            str9 = "";
                        }
                        textView5.setText(str9);
                    }
                    android.widget.CheckBox checkBox3 = checkBox;
                    if (checkBox3 == null) {
                        z18 = true;
                    } else {
                        z18 = true;
                        checkBox3.setChecked(true);
                    }
                    if (checkBox2 != null) {
                        checkBox2.setChecked(z18);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    if (z17) {
                        android.widget.TextView textView6 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.n5g) : null;
                        if (textView6 == null) {
                            z27 = false;
                        } else {
                            z27 = false;
                            textView6.setVisibility(0);
                        }
                        if (checkBox3 != null) {
                            checkBox3.setEnabled(z27);
                        }
                    } else if (findViewById != null) {
                        findViewById.setOnClickListener(new l44.n(checkBox3));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    if (z28) {
                        android.widget.TextView textView7 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n5g) : null;
                        if (textView7 == null) {
                            z19 = false;
                        } else {
                            z19 = false;
                            textView7.setVisibility(0);
                        }
                        if (checkBox2 != null) {
                            checkBox2.setEnabled(z19);
                        }
                    } else if (view != null) {
                        view.setOnClickListener(new l44.o(checkBox2));
                    }
                    if (checkBox3 != null) {
                        checkBox3.setOnCheckedChangeListener(new l44.p(checkBox3, h2Var, checkBox2, z2Var));
                    }
                    if (checkBox2 != null) {
                        checkBox2.setOnCheckedChangeListener(new l44.q(checkBox3, h2Var, checkBox2, z2Var));
                    }
                    z2Var.o(0);
                    l44.r rVar = new l44.r(z2Var);
                    l44.w wVar = new l44.w(context, z2Var, y0Var, j2Var, checkBox3, h2Var, b17, checkBox2);
                    z2Var.D = rVar;
                    z2Var.E = wVar;
                    z2Var.j(inflate);
                    z2Var.C();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str);
                    P();
                    str5 = str3;
                    str6 = str2;
                }
            }
            str2 = "onBtnClick";
            str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
            P();
            str5 = str3;
            str6 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str5);
    }

    public final boolean h0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        int l17 = u().l();
        int g17 = u().g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHfScreenCombineFollowComp", "canNotJumpAddBrand, source=" + l17 + ", originSource=" + g17);
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.Q7(l17) || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.Q7(g17) || l17 == 27 || g17 == 27 || l17 == 7 || g17 == 7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(android.content.Context r20, int r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o2.i0(android.content.Context, int, java.lang.String, int):void");
    }

    public final void j0(java.lang.String str, int i17, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad();
        c11137xb05b06ad.f153002g = 101;
        intent.putExtra("KSnsAdTag", c11137xb05b06ad);
        intent.putExtra("Contact_Scene", 181);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i17 == 0 ? 6 : 1);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }

    public final void l0(android.content.Context context, java.lang.String finderUserName, java.lang.String uxInfo, java.lang.String snsId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpFinderUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69818x1e004a23(context, finderUserName, uxInfo, snsId, 5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpFinderUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }
}
