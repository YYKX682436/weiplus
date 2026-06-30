package v74;

/* loaded from: classes4.dex */
public final class p {
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.jj4 a(java.util.Map values, java.lang.String prefix, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str = (java.lang.String) values.get(prefix.concat(".id"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        jj4Var.f459388d = "SlideFullCardAd_".concat(str);
        jj4Var.N = true;
        jj4Var.f459389e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".type")), 0);
        jj4Var.f459406v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".subtype")), 0);
        java.lang.String str2 = (java.lang.String) values.get(prefix.concat(".url"));
        if (str2 == null) {
            str2 = "";
        }
        jj4Var.f459391g = str2;
        jj4Var.f459392h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".url.$type")), 0);
        java.lang.String str3 = (java.lang.String) values.get(prefix.concat(".url.$md5"));
        if (str3 == null) {
            str3 = "";
        }
        jj4Var.f459411y = str3;
        java.lang.String str4 = (java.lang.String) values.get(prefix.concat(".thumb"));
        jj4Var.f459393i = str4 != null ? str4 : "";
        jj4Var.f459395m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".thumb.$type")), 0);
        jj4Var.R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) values.get(prefix.concat(".videoDuration")));
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f461054e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".size.$height")), 0);
        lj4Var.f461053d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".size.$width")), 0);
        lj4Var.f461055f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(prefix.concat(".size.$totalSize")), 0);
        jj4Var.f459398p = lj4Var;
        jj4Var.Y = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        return jj4Var;
    }
}
