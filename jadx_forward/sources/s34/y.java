package s34;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484362a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484363b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484364c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484365d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f484366e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f484367f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f484368g;

    public static s34.y a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        if (map == null || !map.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
            return null;
        }
        s34.y yVar = new s34.y();
        java.lang.String str2 = (java.lang.String) map.get(str + ".finderUsername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        yVar.f484362a = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".finderAvatar");
        if (str3 == null) {
            str3 = "";
        }
        yVar.f484363b = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".finderNickname");
        if (str4 == null) {
            str4 = "";
        }
        yVar.f484364c = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".finderDesc");
        if (str5 == null) {
            str5 = "";
        }
        yVar.f484365d = str5;
        java.lang.String str6 = (java.lang.String) map.get(str + ".finderFollowingBtnTitle");
        if (str6 == null) {
            str6 = "";
        }
        yVar.f484366e = str6;
        java.lang.String str7 = (java.lang.String) map.get(str + ".finderExportId");
        if (str7 == null) {
            str7 = "";
        }
        yVar.f484367f = str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".finderObjectNonceId");
        yVar.f484368g = str8 != null ? str8 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        return yVar;
    }
}
