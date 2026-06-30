package f54;

/* loaded from: classes4.dex */
public final class c extends ab4.u {
    public final java.lang.String A1;
    public final java.lang.String B1;
    public final java.lang.String C1;
    public final java.lang.String D1;
    public final java.lang.String E1;
    public final int F1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.String f341234z1;

    public c(java.lang.String pkg, java.lang.String appPageUrlAndroid, java.lang.String appid, java.lang.String doubleLinkH5Url, java.lang.String weAppUserName, java.lang.String weAppPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appPageUrlAndroid, "appPageUrlAndroid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doubleLinkH5Url, "doubleLinkH5Url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppUserName, "weAppUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppPath, "weAppPath");
        this.f341234z1 = pkg;
        this.A1 = appPageUrlAndroid;
        this.B1 = appid;
        this.C1 = doubleLinkH5Url;
        this.D1 = weAppUserName;
        this.E1 = weAppPath;
        this.F1 = i17;
    }

    public static final f54.c b(java.util.Map values, java.lang.String adLandingComponentsStr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adLandingComponentsStr, "adLandingComponentsStr");
        java.lang.String str = (java.lang.String) values.get(adLandingComponentsStr.concat(".pkg"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = (java.lang.String) values.get(adLandingComponentsStr.concat(".appPageUrlAndroid"));
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = (java.lang.String) values.get(adLandingComponentsStr.concat(".appid"));
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = (java.lang.String) values.get(adLandingComponentsStr.concat(".doubleLinkH5Url"));
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = (java.lang.String) values.get(adLandingComponentsStr.concat(".weappUserName"));
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = (java.lang.String) values.get(adLandingComponentsStr.concat(".weappPath"));
        f54.c cVar = new f54.c(str2, str4, str6, str8, str10, str11 == null ? "" : str11, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(adLandingComponentsStr.concat(".miniProgramType")), 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
        return cVar;
    }
}
