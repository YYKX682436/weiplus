package s34;

/* loaded from: classes4.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f484318a;

    /* renamed from: iconUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f76720x61ad9236;

    public static s34.u0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str + ".iconUrl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            java.util.List b17 = b(map, str + ".textList");
            if (!a84.b0.b(b17)) {
                s34.u0 u0Var = new s34.u0();
                u0Var.f76720x61ad9236 = str2;
                u0Var.f484318a = b17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
                return u0Var;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        return null;
    }

    public static java.util.List b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
            return arrayList;
        }
        java.lang.String str2 = str + ".text";
        int i17 = 0;
        java.lang.String str3 = str2;
        while (true) {
            if (i17 > 0) {
                str3 = str2 + i17;
            }
            if (!map.containsKey(str3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
                return arrayList;
            }
            java.lang.String str4 = (java.lang.String) map.get(str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                arrayList.add(str4);
            }
            i17++;
        }
    }
}
