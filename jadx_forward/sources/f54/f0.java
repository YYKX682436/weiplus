package f54;

/* loaded from: classes4.dex */
public class f0 extends ab4.d0 {
    public java.lang.String F;

    public static f54.f0 b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
        try {
            f54.f0 f0Var = new f54.f0();
            java.lang.String str2 = "#F2F2F2";
            if (map.containsKey(str + ".bgColor")) {
                java.lang.String str3 = (java.lang.String) map.get(str + ".bgColor");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    str2 = str3;
                }
                f0Var.F = str2;
            } else {
                f0Var.F = "#F2F2F2";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
            return f0Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingSeparatorCompInfo", "parse, exp is " + th6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingSeparatorCompInfo", "parse, null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
            return null;
        }
    }
}
