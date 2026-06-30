package s34;

/* loaded from: classes4.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public long f484299a;

    /* renamed from: b, reason: collision with root package name */
    public long f484300b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484301c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f484303e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f484304f;

    public static s34.t0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".endTime");
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str2);
        if (android.text.TextUtils.isEmpty(str2) || E1 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
            return null;
        }
        s34.t0 t0Var = new s34.t0();
        t0Var.f484300b = E1 * 1000;
        t0Var.f484299a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str + ".startTime")) * 1000;
        java.lang.String str3 = (java.lang.String) map.get(str + ".barBgColor");
        if (str3 == null) {
            str3 = "";
        }
        t0Var.f484301c = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".barBgAlpha");
        if (str4 == null) {
            str4 = "";
        }
        t0Var.f484302d = str4;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str + ".leftTitleType"));
        java.lang.String str5 = (java.lang.String) map.get(str + ".leftTitle");
        if (str5 == null) {
            str5 = "";
        }
        t0Var.f484303e = str5;
        java.lang.String str6 = (java.lang.String) map.get(str + ".rightTitle");
        t0Var.f484304f = str6 != null ? str6 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
        return t0Var;
    }
}
