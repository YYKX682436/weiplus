package s34;

/* loaded from: classes4.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484357a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484358b;

    /* renamed from: backBorderImage */
    @za4.k1(m178629x2fff6c = 4, m178630x415c6bfa = 2)
    public java.lang.String f76728xfdc65d28;

    /* renamed from: buttonInfo */
    @za4.k1
    public s34.d1 f76729x155a1700;

    /* renamed from: c, reason: collision with root package name */
    public float f484359c;

    /* renamed from: clickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f76730xf7a0a3ac;

    /* renamed from: d, reason: collision with root package name */
    public int f484360d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jj4 f484361e;

    /* renamed from: frontBorderImage */
    @za4.k1(m178629x2fff6c = 4, m178630x415c6bfa = 2)
    public java.lang.String f76731x5a9c86a6;

    public static s34.d1 b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseButtonInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        s34.d1 d1Var = new s34.d1();
        java.lang.String str2 = (java.lang.String) map.get(str + ".icon");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        d1Var.f484151a = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".title");
        d1Var.f484152b = str3 != null ? str3 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str + ".clickActionInfo");
        d1Var.f76704x75b1d9b0 = f17;
        f17.f244102a = 4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseButtonInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return d1Var;
    }

    public static r45.jj4 c(java.util.Map map, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str2 = (java.lang.String) map.get(str + ".id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        jj4Var.f459388d = "SlideFullCardAd_".concat(str2);
        jj4Var.N = true;
        jj4Var.f459389e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".type"), 0);
        jj4Var.f459406v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".subtype"), 0);
        java.lang.String str3 = (java.lang.String) map.get(str + ".url");
        if (str3 == null) {
            str3 = "";
        }
        jj4Var.f459391g = str3;
        jj4Var.f459392h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".url.$type"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".url.$md5");
        if (str4 == null) {
            str4 = "";
        }
        jj4Var.f459411y = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".thumb");
        jj4Var.f459393i = str5 != null ? str5 : "";
        jj4Var.f459395m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".thumb.$type"), 0);
        r45.lj4 lj4Var = new r45.lj4();
        jj4Var.f459398p = lj4Var;
        lj4Var.f461054e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".size.$height"), 0);
        jj4Var.f459398p.f461053d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".size.$width"), 0);
        jj4Var.f459398p.f461055f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".size.$totalSize"), 0);
        jj4Var.Y = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return jj4Var;
    }

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        boolean z17 = this.f484360d == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return z17;
    }
}
