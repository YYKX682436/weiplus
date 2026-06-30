package s34;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f484333a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484334b;

    /* renamed from: cardImageUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76721xe8683144;

    public static s34.w a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
        if (!map.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
            return null;
        }
        s34.w wVar = new s34.w();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".clockwise");
        wVar.f484333a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
        java.lang.String str2 = (java.lang.String) map.get(str + ".transitionImg");
        if (str2 == null) {
            str2 = "";
        }
        wVar.f76721xe8683144 = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".transitionColor");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".transitionColorAlpha");
        wVar.f484334b = ca4.m0.q0(str3, str4 != null ? str4 : "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
        return wVar;
    }
}
