package f54;

/* loaded from: classes4.dex */
public class a0 extends ab4.d0 {
    public java.lang.String F = "";
    public java.lang.String G = "";
    public int H = 0;

    public static f54.a0 b(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMBInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingMBInfo", "create a mb info from xml");
        f54.a0 a0Var = new f54.a0();
        java.lang.String str2 = (java.lang.String) map.get(str + ".dsl");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        a0Var.G = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".frameSetName");
        a0Var.F = str3 != null ? str3 : "";
        a0Var.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".fullScreen"), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMBInfo");
        return a0Var;
    }
}
