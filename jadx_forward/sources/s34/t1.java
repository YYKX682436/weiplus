package s34;

/* loaded from: classes4.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public int f484307a;

    /* renamed from: b, reason: collision with root package name */
    public int f484308b;

    /* renamed from: c, reason: collision with root package name */
    public int f484309c;

    /* renamed from: clickActionInfo */
    @za4.k1(m178630x415c6bfa = 5)
    private com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f76718xf7a0a3ac;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f484310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f484311e;

    /* renamed from: f, reason: collision with root package name */
    public s34.g1 f484312f;

    /* renamed from: g, reason: collision with root package name */
    public s34.g1 f484313g;

    /* renamed from: h, reason: collision with root package name */
    public s34.g1 f484314h;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f484306j = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(s34.t1.class, "brandImageUrl", "getBrandImageUrl()Ljava/lang/String;", 0))};

    /* renamed from: i, reason: collision with root package name */
    public static final s34.s1 f484305i = new s34.s1(null);

    public t1() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f484310d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
    }

    public static final s34.t1 b(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        f484305i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        s34.t1 t1Var = null;
        t1Var = null;
        t1Var = null;
        t1Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        } else if (a84.b0.c(map) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        } else if (map.containsKey(str)) {
            s34.t1 t1Var2 = new s34.t1();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".containerWidth"));
            t1Var2.f484307a = (str2 == null || (h19 = r26.h0.h(str2)) == null) ? 0 : h19.intValue();
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".containerHeight"));
            t1Var2.f484308b = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".bottomOffset"));
            t1Var2.f484309c = (str4 == null || (h17 = r26.h0.h(str4)) == null) ? 0 : h17.intValue();
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".brandImageUrl"));
            if (str5 == null) {
                str5 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) t1Var2.f484310d).b(t1Var2, f484306j[0], str5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".actionBtnTitle"));
            t1Var2.f484311e = str6 != null ? str6 : "";
            s34.f1 f1Var = s34.g1.f484179c;
            s34.g1 a17 = f1Var.a(map, str.concat(".productBarBackgroundColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProductBarBackgroundColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.f484312f = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProductBarBackgroundColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".actionBtnTitleColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionBtnTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.f484313g = a18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionBtnTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            s34.g1 a19 = f1Var.a(map, str.concat(".brandColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBrandColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.f484314h = a19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBrandColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.c(map.containsKey(str.concat(".clickActionInfo")) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str.concat(".clickActionInfo")) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
            t1Var = t1Var2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        return t1Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f76718xf7a0a3ac;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        return c17702x544f64e9;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        this.f76718xf7a0a3ac = c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
    }
}
