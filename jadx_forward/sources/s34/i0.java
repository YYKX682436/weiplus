package s34;

/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484192a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484193b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484194c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484195d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f484196e;

    /* renamed from: f, reason: collision with root package name */
    public float f484197f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f484198g;

    /* renamed from: h, reason: collision with root package name */
    public int f484199h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jj4 f484200i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f484201j;

    public static s34.i0 b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".media.id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
        try {
            s34.i0 i0Var = new s34.i0();
            java.lang.String str4 = (java.lang.String) map.get(str + ".avatar");
            if (str4 == null) {
                str4 = "";
            }
            i0Var.f484192a = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".nickname");
            if (str5 == null) {
                str5 = "";
            }
            i0Var.f484193b = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".tag");
            if (str6 == null) {
                str6 = "";
            }
            i0Var.f484194c = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".desc");
            if (str7 == null) {
                str7 = "";
            }
            i0Var.f484195d = str7;
            java.lang.String str8 = (java.lang.String) map.get(str + ".barBgColor");
            if (str8 == null) {
                str8 = "";
            }
            i0Var.f484196e = str8;
            i0Var.f484197f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".barBgAlpha"));
            java.lang.String str9 = (java.lang.String) map.get(str + ".duration");
            if (str9 == null) {
                str9 = "";
            }
            i0Var.f484198g = str9;
            r45.jj4 c17 = c(map, str + ".media");
            i0Var.f484200i = c17;
            i0Var.f484199h = c17.f459389e == 6 ? 1 : 0;
            java.lang.String str10 = (java.lang.String) map.get(str + ".finderType");
            if (str10 != null) {
                str3 = str10;
            }
            i0Var.f484201j = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return i0Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFinderTopicResInfo", "parse AdFinderTopicResInfo error " + th6.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
    }

    public static r45.jj4 c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str2 = (java.lang.String) map.get(str + ".id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        jj4Var.f459388d = str2;
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        return jj4Var;
    }

    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        boolean z17 = this.f484199h == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        return z17;
    }
}
