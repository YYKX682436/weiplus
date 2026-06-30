package p44;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f433368a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433369b;

    /* renamed from: c, reason: collision with root package name */
    public int f433370c;

    /* renamed from: cardInfo */
    @za4.k1
    public p44.u f76385xff7d4bde;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433371d;

    /* renamed from: e, reason: collision with root package name */
    public int f433372e;

    /* renamed from: f, reason: collision with root package name */
    public int f433373f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f433374g;

    /* renamed from: h, reason: collision with root package name */
    public int f433375h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f433376i;

    /* renamed from: j, reason: collision with root package name */
    public int f433377j;

    /* renamed from: k, reason: collision with root package name */
    public int f433378k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f433379l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433380m = "";

    /* renamed from: titleIconUrl */
    @za4.k1(m178629x2fff6c = 4, m178630x415c6bfa = 2)
    public java.lang.String f76386x8d2f34be;

    public static final p44.r c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
        p44.r rVar = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
        } else {
            p44.r rVar2 = new p44.r();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".title"));
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433368a = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".introduceTitle"));
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433369b = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".titleIconUrl"));
            if (str4 == null) {
                str4 = "";
            }
            rVar2.f76386x8d2f34be = str4;
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".titleColor"));
            if (str5 == null) {
                str5 = "";
            }
            int e17 = ca4.n0.e(str5, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433370c = e17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".desc"));
            if (str6 == null) {
                str6 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433371d = str6;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str7 = (java.lang.String) map.get(str.concat(".descColor"));
            if (str7 == null) {
                str7 = "";
            }
            int e18 = ca4.n0.e(str7, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433372e = e18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".descColorDark"));
            if (str8 == null) {
                str8 = "";
            }
            int e19 = ca4.n0.e(str8, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433373f = e19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".doneTitle"));
            if (str9 == null) {
                str9 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDoneTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433374g = str9;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDoneTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".doneTitleColor"));
            if (str10 == null) {
                str10 = "";
            }
            int e27 = ca4.n0.e(str10, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDoneTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433375h = e27;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDoneTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str11 = (java.lang.String) map.get(str.concat(".doneDesc"));
            if (str11 == null) {
                str11 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433376i = str11;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str12 = (java.lang.String) map.get(str.concat(".doneDescColor"));
            if (str12 == null) {
                str12 = "";
            }
            int e28 = ca4.n0.e(str12, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDoneDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433377j = e28;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDoneDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str13 = (java.lang.String) map.get(str.concat(".doneDescColorDark"));
            if (str13 == null) {
                str13 = "";
            }
            int e29 = ca4.n0.e(str13, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDoneDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433378k = e29;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDoneDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str14 = (java.lang.String) map.get(str.concat(".numberRequestParams"));
            java.lang.String str15 = str14 != null ? str14 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f433379l = str15;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            p44.u a17 = p44.u.f433386e.a(map, str.concat(".cardsInfo"));
            rVar2.f76385xff7d4bde = a17;
            java.util.List<p44.s> list = a17 != null ? a17.f76389x61d0ad81 : null;
            if (list == null || list.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
                rVar = rVar2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        return rVar;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        java.lang.String str = this.f433371d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        return str;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        java.lang.String str = this.f433369b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        return str;
    }

    public final void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f433380m = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
    }
}
