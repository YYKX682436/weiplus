package s34;

/* loaded from: classes4.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484106a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484107b;

    /* renamed from: bgImageUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76696xfc43bd79;

    /* renamed from: bgImageUrlDark */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76697x90e6bc8f;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484108c;

    /* renamed from: clickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f76698xf7a0a3ac;

    /* renamed from: d, reason: collision with root package name */
    public float f484109d;

    /* renamed from: e, reason: collision with root package name */
    public float f484110e;

    /* renamed from: f, reason: collision with root package name */
    public float f484111f;

    /* renamed from: g, reason: collision with root package name */
    public int f484112g;

    /* renamed from: h, reason: collision with root package name */
    public int f484113h;

    /* renamed from: i, reason: collision with root package name */
    public int f484114i;

    /* renamed from: iconUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76699x61ad9236;

    /* renamed from: iconUrlDark */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76700xcfadeacc;

    /* renamed from: j, reason: collision with root package name */
    public int f484115j;

    /* renamed from: k, reason: collision with root package name */
    public int f484116k;

    /* renamed from: l, reason: collision with root package name */
    public int f484117l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f484118m = true;

    public static s34.b1 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo");
        s34.b1 b1Var = new s34.b1();
        java.lang.String str2 = (java.lang.String) map.get(str + ".bgImageUrl");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        b1Var.f76696xfc43bd79 = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".bgImageUrlDark");
        if (str3 == null) {
            str3 = "";
        }
        b1Var.f76697x90e6bc8f = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".iconUrl");
        if (str4 == null) {
            str4 = "";
        }
        b1Var.f76699x61ad9236 = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".iconUrlDark");
        if (str5 == null) {
            str5 = "";
        }
        b1Var.f76700xcfadeacc = str5;
        java.lang.String str6 = (java.lang.String) map.get(str + ".title");
        if (str6 == null) {
            str6 = "";
        }
        b1Var.f484106a = str6;
        if (android.text.TextUtils.isEmpty(b1Var.f76697x90e6bc8f) && !android.text.TextUtils.isEmpty(b1Var.f76696xfc43bd79)) {
            b1Var.f76697x90e6bc8f = b1Var.f76696xfc43bd79;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdTagButtonInfo", "bgImageUrlDark is empty");
        }
        if (android.text.TextUtils.isEmpty(b1Var.f76696xfc43bd79) && !android.text.TextUtils.isEmpty(b1Var.f76697x90e6bc8f)) {
            b1Var.f76696xfc43bd79 = b1Var.f76697x90e6bc8f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdTagButtonInfo", "bgImageUrl is empty");
        }
        if (android.text.TextUtils.isEmpty(b1Var.f76700xcfadeacc) && !android.text.TextUtils.isEmpty(b1Var.f76699x61ad9236)) {
            b1Var.f76700xcfadeacc = b1Var.f76699x61ad9236;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdTagButtonInfo", "iconUrlDark is empty");
        }
        if (android.text.TextUtils.isEmpty(b1Var.f76699x61ad9236) && !android.text.TextUtils.isEmpty(b1Var.f76700xcfadeacc)) {
            b1Var.f76699x61ad9236 = b1Var.f76700xcfadeacc;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdTagButtonInfo", "iconUrl is empty");
        }
        java.lang.String str7 = (java.lang.String) map.get(str + ".titleColor");
        if (str7 == null) {
            str7 = "";
        }
        b1Var.f484107b = str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".titleColorDark");
        b1Var.f484108c = str8 != null ? str8 : "";
        b1Var.f484109d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".titleColorAlpha"));
        b1Var.f484110e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".titleColorAlphaDark"));
        b1Var.f484112g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".basicRootFontSize"), 0);
        b1Var.f484113h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".basicRemWidth"), 0);
        b1Var.f484114i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".layoutWidth"), 0);
        b1Var.f484115j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".layoutHeight"), 0);
        b1Var.f484116k = (int) za4.z0.o((double) b1Var.f484114i, 1, b1Var.f484113h, b1Var.f484112g);
        b1Var.f484117l = (int) za4.z0.o((double) b1Var.f484115j, 1, b1Var.f484113h, b1Var.f484112g);
        b1Var.f484111f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".cornerRadius"), 0));
        if (!map.containsKey(str + ".clickActionInfo")) {
            b1Var.f484118m = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str + ".clickActionInfo");
        b1Var.f76698xf7a0a3ac = f17;
        f17.f244102a = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo");
        return b1Var;
    }
}
