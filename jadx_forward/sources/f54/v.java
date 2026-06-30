package f54;

/* loaded from: classes4.dex */
public final class v extends ab4.d0 {
    public static final f54.s Q = new f54.s(null);
    public final f54.u F = new f54.u();
    public final f54.t G = new f54.t();
    public final java.util.List H = new java.util.ArrayList();
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public int f341288J;
    public int K;
    public java.lang.String L;
    public java.util.List M;
    public java.util.List N;
    public boolean P;

    public static final f54.v e(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        f54.s sVar = Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        f54.v vVar = new f54.v();
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        } else {
            if (str != null) {
                try {
                    f54.u b17 = vVar.b();
                    java.lang.String str6 = (java.lang.String) map.get(str.concat(".rotateAnimInfo.animationImg"));
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    b17.getClass();
                    str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion";
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b17.f341284a = str6;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        java.lang.String str7 = (java.lang.String) map.get(str.concat(".rotateAnimInfo.animationColor"));
                        if (str7 == null) {
                            str7 = "";
                        }
                        java.lang.String str8 = (java.lang.String) map.get(str.concat(".rotateAnimInfo.animationColorAlpha"));
                        if (str8 == null) {
                            str8 = "";
                        }
                        f54.u b18 = vVar.b();
                        java.lang.String q07 = ca4.m0.q0(str7, str8);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q07, "parseColor(...)");
                        b18.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b18.f341285b = q07;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        f54.u b19 = vVar.b();
                        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str.concat(".rotateAnimInfo.imgWidth")), 0);
                        b19.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImgWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b19.f341286c = D1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImgWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        f54.u b27 = vVar.b();
                        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str.concat(".rotateAnimInfo.imgHeight")), 0);
                        b27.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImgHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b27.f341287d = D12;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImgHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        f54.t d17 = vVar.d();
                        java.lang.String str9 = (java.lang.String) map.get(str.concat(".preAnimInfo.cardImg"));
                        if (str9 == null) {
                            str9 = "";
                        }
                        d17.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        d17.f341281a = str9;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        f54.t d18 = vVar.d();
                        java.lang.String str10 = (java.lang.String) map.get(str.concat(".preAnimInfo.title"));
                        if (str10 == null) {
                            str10 = "";
                        }
                        d18.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        d18.f341282b = str10;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        f54.t d19 = vVar.d();
                        java.lang.String str11 = (java.lang.String) map.get(str.concat(".preAnimInfo.subTitle"));
                        if (str11 == null) {
                            str11 = "";
                        }
                        d19.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSubTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        d19.f341283c = str11;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        str5 = (java.lang.String) map.get(str.concat(".backgroundImg"));
                        if (str5 == null) {
                            str5 = "";
                        }
                        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo";
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingHalfEggCardContainerInfo", "parseFromXml exp=" + e);
                        str4 = "parseFromXml";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
                        return vVar;
                    }
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundImgUrl", str3);
                        vVar.I = str5;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundImgUrl", str3);
                        int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str.concat(".backgroundImgWidth")), 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundImgW", str3);
                        vVar.f341288J = D13;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundImgW", str3);
                        int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str.concat(".backgroundImgHeight")), 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundImgH", str3);
                        vVar.K = D14;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundImgH", str3);
                        java.lang.String str12 = (java.lang.String) map.get(str.concat(".bulletCommentsTitle"));
                        if (str12 == null) {
                            str12 = "";
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBulletCommentsTitle", str3);
                        vVar.L = str12;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBulletCommentsTitle", str3);
                        java.util.List a17 = sVar.a(map, str.concat(".positiveBulletComments"));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPositiveBulletCommentList", str3);
                        vVar.M = a17;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPositiveBulletCommentList", str3);
                        java.util.List a18 = sVar.a(map, str.concat(".negativeBulletComments"));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNegativeBulletCommentList", str3);
                        vVar.N = a18;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNegativeBulletCommentList", str3);
                        int i28 = 0;
                        while (true) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str);
                            sb6.append(".items.item");
                            sb6.append(i28 == 0 ? "" : java.lang.Integer.valueOf(i28));
                            f54.r a19 = f54.r.f341268m.a(map, sb6.toString(), i17, i18, i19, i27);
                            if (a19 == null) {
                                break;
                            }
                            ((java.util.ArrayList) vVar.c()).add(a19);
                            if (a19.d()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSupportRepeatPick", str3);
                                vVar.P = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSupportRepeatPick", str3);
                            }
                            i28++;
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingHalfEggCardContainerInfo", "parseFromXml exp=" + e);
                        str4 = "parseFromXml";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
                        return vVar;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion";
                }
                str4 = "parseFromXml";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
                return vVar;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        }
        str4 = "parseFromXml";
        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str3);
        return vVar;
    }

    public final f54.u b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return this.F;
    }

    public final java.util.List c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardInfoList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        java.util.List list = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardInfoList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return list;
    }

    public final f54.t d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPreAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPreAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return this.G;
    }
}
