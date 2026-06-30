package l44;

/* loaded from: classes4.dex */
public final class d3 {
    public d3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final l44.e3 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 adSnsInfo, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adSnsInfo, "adSnsInfo");
        int a17 = i64.z0.a(adSnsInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e67 = adSnsInfo.m70299x10413e67();
        java.lang.String str = m70299x10413e67 != null ? m70299x10413e67.aid : null;
        java.lang.String str2 = str == null ? "" : str;
        int i19 = adSnsInfo.f67597x480f98d1;
        java.lang.String t07 = ca4.z0.t0(adSnsInfo.f67610x29d1292e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e672 = adSnsInfo.m70299x10413e67();
        java.lang.String str3 = m70299x10413e672 != null ? m70299x10413e672.f38103xc060c120 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e673 = adSnsInfo.m70299x10413e67();
        java.lang.String str5 = m70299x10413e673 != null ? m70299x10413e673.f38104xce64ddf1 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        java.lang.String b17 = n74.d2.b(str5, 10);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        java.lang.String str6 = "getTid";
        l44.e3 e3Var = new l44.e3(i17, i18, str2, i19, a17, t07, str4, b17, adSnsInfo.m70314x1a72c1c2(), null, 512, null);
        if (adSnsInfo.m70314x1a72c1c2()) {
            java.util.Iterator it = ((java.util.ArrayList) adSnsInfo.m70300x74235b3e().f38234xd35781a.a()).iterator();
            while (it.hasNext()) {
                s34.v1 v1Var = (s34.v1) it.next();
                java.lang.String a18 = v1Var.a();
                java.lang.String str7 = str6;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str7, "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
                java.lang.String str8 = v1Var.f484327g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str7, "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
                s34.w1 w1Var = new s34.w1(a18, str8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSubAd", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
                e3Var.f397651j.add(w1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSubAd", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
                str6 = str7;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord$Companion");
        return e3Var;
    }
}
