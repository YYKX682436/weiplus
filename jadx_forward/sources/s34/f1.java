package s34;

/* loaded from: classes4.dex */
public final class f1 {
    public f1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final s34.g1 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            return null;
        }
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".color"));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str.concat(".colorDark"));
        s34.g1 g1Var = new s34.g1(str2, str3 != null ? str3 : "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
        return g1Var;
    }
}
