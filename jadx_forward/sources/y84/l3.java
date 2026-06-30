package y84;

/* loaded from: classes4.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public int f541667a;

    /* renamed from: b, reason: collision with root package name */
    public int f541668b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f541669c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f541670d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f541671e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f541672f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f541673g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f541674h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f541675i;

    /* renamed from: j, reason: collision with root package name */
    public s34.g1 f541676j;

    /* renamed from: k, reason: collision with root package name */
    public s34.g1 f541677k;

    /* renamed from: l, reason: collision with root package name */
    public mb4.e f541678l;

    /* renamed from: m, reason: collision with root package name */
    public y84.o3 f541679m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f541680n;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f541666p = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(y84.l3.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final y84.k3 f541665o = new y84.k3(null);

    public l3() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f541680n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0();
    }

    public static final y84.l3 b(java.util.Map values, java.lang.String keyPref) {
        java.lang.String str;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        f541665o.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyPref, "keyPref");
        y84.l3 l3Var = new y84.l3();
        java.lang.String str2 = (java.lang.String) values.get(keyPref.concat(".containerWidth"));
        l3Var.f541667a = (str2 == null || (h18 = r26.h0.h(str2)) == null) ? 0 : h18.intValue();
        java.lang.String str3 = (java.lang.String) values.get(keyPref.concat(".containerHeight"));
        l3Var.f541668b = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
        java.lang.String str4 = (java.lang.String) values.get(keyPref.concat(".title"));
        if (str4 == null) {
            str4 = "";
        }
        l3Var.f541669c = str4;
        java.lang.String str5 = (java.lang.String) values.get(keyPref.concat(".introduceTitle"));
        if (str5 == null) {
            str5 = "";
        }
        l3Var.f541670d = str5;
        java.lang.String str6 = (java.lang.String) values.get(keyPref.concat(".selectedTitlePrefix"));
        if (str6 == null) {
            str6 = "";
        }
        l3Var.f541671e = str6;
        java.lang.String str7 = (java.lang.String) values.get(keyPref.concat(".selectedTitleSuffix"));
        if (str7 == null) {
            str7 = "";
        }
        l3Var.f541672f = str7;
        java.lang.String str8 = (java.lang.String) values.get(keyPref.concat(".doneTitle"));
        if (str8 == null) {
            str8 = "";
        }
        l3Var.f541673g = str8;
        java.lang.String str9 = (java.lang.String) values.get(keyPref.concat(".numberDefaultTitle"));
        if (str9 == null) {
            str9 = "";
        }
        l3Var.f541674h = str9;
        java.lang.String str10 = (java.lang.String) values.get(keyPref.concat(".numberRequestParams"));
        if (str10 == null) {
            str10 = "";
        }
        l3Var.f541675i = str10;
        s34.f1 f1Var = s34.g1.f484179c;
        l3Var.f541676j = f1Var.a(values, keyPref.concat(".titleColor"));
        l3Var.f541677k = f1Var.a(values, keyPref.concat(".descColor"));
        l3Var.f541678l = mb4.e.f406928f.a(values, keyPref.concat(".allDonePagInfo"));
        y84.m3 m3Var = y84.o3.f541703o;
        java.lang.String kePref = keyPref.concat(".cardsInfo");
        m3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kePref, "kePref");
        y84.o3 o3Var = new y84.o3();
        java.lang.String str11 = (java.lang.String) values.get(kePref.concat(".pedestalImageUrl"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str11 == null) {
            str11 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f541705a = str11;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str12 = o3Var.f541705a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str12);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str13 = o3Var.f541705a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str14 = o3Var.f541705a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h19 = m21.y.h(a17, 2, str13, str14, 1, 1, "");
        h19.N = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPedestalImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = o3Var.f541707c;
        f06.v[] vVarArr = y84.o3.f541704p;
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) h1Var).b(o3Var, vVarArr[0], h19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPedestalImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str15 = (java.lang.String) values.get(kePref.concat(".pedestalImageUrlDark"));
        if (str15 == null) {
            str15 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPedestalImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f541706b = str15;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPedestalImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String b17 = o3Var.b();
        if (b17 == null || b17.length() == 0) {
            str = "";
        } else {
            r45.jj4 h27 = m21.y.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(o3Var.b()), 2, o3Var.b(), o3Var.b(), 1, 1, "");
            h27.N = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPedestalImageMediaDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
            str = "";
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) o3Var.f541708d).b(o3Var, vVarArr[1], h27);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPedestalImageMediaDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        }
        java.lang.String str16 = (java.lang.String) values.get(kePref.concat(".backgroundImageUrl"));
        if (str16 == null) {
            str16 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f541709e = str16;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str17 = o3Var.f541709e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str18 = o3Var.f541709e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str19 = o3Var.f541709e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h28 = m21.y.h(a18, 2, str18, str19, 1, 1, "");
        h28.N = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) o3Var.f541710f).b(o3Var, vVarArr[2], h28);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str20 = (java.lang.String) values.get(kePref.concat(".starImageUrl"));
        if (str20 == null) {
            str20 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f541711g = str20;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str21 = o3Var.f541711g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str21);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str22 = o3Var.f541711g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str23 = o3Var.f541711g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h29 = m21.y.h(a19, 2, str22, str23, 1, 1, "");
        h29.N = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) o3Var.f541712h).b(o3Var, vVarArr[3], h29);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str24 = (java.lang.String) values.get(kePref.concat(".starDropImageUrl"));
        if (str24 == null) {
            str24 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f541713i = str24;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str25 = o3Var.f541713i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str25);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str26 = o3Var.f541713i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str27 = o3Var.f541713i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h37 = m21.y.h(a27, 2, str26, str27, 1, 1, "");
        h37.N = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarDropImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) o3Var.f541714j).b(o3Var, vVarArr[4], h37);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarDropImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f541715k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(kePref.concat(".gap")), 0);
        o3Var.f541716l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(kePref.concat(".distance")), 0);
        o3Var.f541717m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) values.get(kePref.concat(".itemScaleRatio")));
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(kePref);
            sb6.append(".cardItems.cardItem");
            sb6.append(i17 == 0 ? str : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!values.containsKey(sb7)) {
                break;
            }
            y84.n3 n3Var = new y84.n3();
            java.lang.String str28 = (java.lang.String) values.get(sb7 + ".imageUrl");
            if (str28 == null) {
                str28 = str;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            n3Var.f541692a = str28;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String str29 = n3Var.f541692a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String a28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str29);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String str30 = n3Var.f541692a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String str31 = kePref;
            java.lang.String str32 = n3Var.f541692a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            r45.jj4 h38 = m21.y.h(a28, 2, str30, str32, 1, 1, "");
            h38.N = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            int i18 = i17;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z) n3Var.f541693b).b(n3Var, y84.n3.f541691f[0], h38);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            n3Var.f541694c = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(sb7 + ".cardWidth"), 0) * o3Var.f541717m);
            n3Var.f541695d = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(sb7 + ".cardHeight"), 0) * o3Var.f541717m);
            java.lang.String str33 = (java.lang.String) values.get(sb7 + ".cardId");
            if (str33 == null) {
                str33 = str;
            }
            n3Var.f541696e = str33;
            boolean z18 = str33.length() == 0;
            java.util.List list = o3Var.f541718n;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomSelectCardInfo", "cardId is null");
            } else {
                ((java.util.ArrayList) list).add(n3Var);
            }
            if (((java.util.ArrayList) list).size() >= 5) {
                break;
            }
            i17 = i18 + 1;
            kePref = str31;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$Companion");
        l3Var.f541679m = o3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = values.containsKey(keyPref.concat(".clickActionInfo")) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(values, keyPref.concat(".clickActionInfo")) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) l3Var.f541680n).b(l3Var, f541666p[0], f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        y84.o3 o3Var2 = l3Var.f541679m;
        java.util.List list2 = o3Var2 != null ? o3Var2.f541718n : null;
        if (list2 == null || list2.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo$Companion");
            l3Var = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        return l3Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) this.f541680n).a(this, f541666p[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        return c17702x544f64e9;
    }
}
