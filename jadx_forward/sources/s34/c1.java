package s34;

/* loaded from: classes4.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484132a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484133b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f484134c;

    /* renamed from: clickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    private final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f76701xf7a0a3ac;

    /* renamed from: clickIcon */
    @za4.k1(m178630x415c6bfa = 2)
    private final java.lang.String f76702x8ada7221;

    /* renamed from: clickIconDark */
    @za4.k1(m178630x415c6bfa = 2)
    private final java.lang.String f76703xd642dd37;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484135d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f484136e;

    public c1(java.lang.String str, java.lang.String descText, java.lang.String clickText, java.lang.String clickTextColor, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descText, "descText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickText, "clickText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTextColor, "clickTextColor");
        this.f484132a = str;
        this.f484133b = descText;
        this.f484134c = clickText;
        this.f484135d = clickTextColor;
        this.f484136e = str2;
        this.f76701xf7a0a3ac = c17702x544f64e9;
        this.f76702x8ada7221 = str3;
        this.f76703xd642dd37 = str4;
    }

    public static final s34.c1 d(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        s34.c1 c1Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = map.containsKey(str.concat(".clickActionInfo")) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str.concat(".clickActionInfo")) : null;
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".icon"));
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".descText"));
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".clickText"));
            java.lang.String str7 = str6 == null ? "" : str6;
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".clickTextColor"));
            java.lang.String str9 = str8 == null ? "" : str8;
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".clickTextColorDark"));
            java.lang.String str11 = str10 == null ? "" : str10;
            java.lang.String str12 = (java.lang.String) map.get(str.concat(".clickIconLight"));
            java.lang.String str13 = str12 == null ? "" : str12;
            java.lang.String str14 = (java.lang.String) map.get(str.concat(".clickIconDark"));
            if (str14 == null) {
                str14 = "";
            }
            s34.c1 c1Var2 = new s34.c1(str3, str5, str7, str9, str11, f17, str13, str14);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDescText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDescText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
            if (!r26.n0.N(c1Var2.f484133b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                if (!r26.n0.N(c1Var2.f484134c)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    if (!r26.n0.N(c1Var2.f484135d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
                        c1Var = c1Var2;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return c1Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f76701xf7a0a3ac;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return c17702x544f64e9;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        java.lang.String str = this.f76702x8ada7221;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return str;
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickIconDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        java.lang.String str = this.f76703xd642dd37;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickIconDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return str;
    }
}
