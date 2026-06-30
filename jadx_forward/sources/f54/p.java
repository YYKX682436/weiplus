package f54;

/* loaded from: classes4.dex */
public class p extends ab4.d0 {
    public java.lang.String F;
    public ab4.g G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f341267J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public float P;
    public final f54.o[] Q = new f54.o[4];

    /* renamed from: hbImgUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f69692xf65ed046;

    /* renamed from: shareThumbUrl */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f69693x58a2a8b8;

    public static f54.p b(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        try {
            f54.p pVar = new f54.p();
            java.lang.String str2 = (java.lang.String) map.get(str + ".hbImgUrl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            pVar.f69692xf65ed046 = str2;
            ab4.d0 i28 = za4.z0.i(map, str + ".componentItem", i17, i18, i19, i27);
            if (i28 instanceof ab4.g) {
                i28.f84353g = 0.0f;
                i28.f84352f = 0.0f;
                i28.f84354h = 0.0f;
                i28.f84355i = 0.0f;
                pVar.G = (ab4.g) i28;
            }
            java.lang.String str3 = (java.lang.String) map.get(str + ".title");
            if (str3 == null) {
                str3 = "";
            }
            pVar.H = str3;
            java.lang.String str4 = (java.lang.String) map.get(str + ".shareTitle");
            if (str4 == null) {
                str4 = "";
            }
            pVar.L = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".shareThumbUrl");
            if (str5 == null) {
                str5 = "";
            }
            pVar.f69693x58a2a8b8 = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".jumpUrl");
            if (str6 == null) {
                str6 = "";
            }
            pVar.K = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".inviteLinkTxt");
            if (str7 == null) {
                str7 = "";
            }
            pVar.I = str7;
            java.lang.String str8 = (java.lang.String) map.get(str + ".inviteLinkTxtColor");
            if (str8 == null) {
                str8 = "";
            }
            java.lang.String str9 = (java.lang.String) map.get(str + ".inviteLinkTxtColorAlpha");
            if (str9 == null) {
                str9 = "";
            }
            pVar.f341267J = ca4.m0.q0(str8, str9);
            java.lang.String str10 = (java.lang.String) map.get(str + ".btnTxtColor");
            if (str10 == null) {
                str10 = "";
            }
            java.lang.String str11 = (java.lang.String) map.get(str + ".btnTxtColorAlpha");
            if (str11 == null) {
                str11 = "";
            }
            java.lang.String q07 = ca4.m0.q0(str10, str11);
            pVar.M = q07;
            if (android.text.TextUtils.isEmpty(q07)) {
                pVar.M = "#FFFFFF";
            }
            java.lang.String str12 = (java.lang.String) map.get(str + ".btnBgColor");
            if (str12 == null) {
                str12 = "";
            }
            java.lang.String str13 = (java.lang.String) map.get(str + ".btnBgColorAlpha");
            if (str13 == null) {
                str13 = "";
            }
            java.lang.String q08 = ca4.m0.q0(str12, str13);
            pVar.N = q08;
            if (android.text.TextUtils.isEmpty(q08)) {
                pVar.N = "#FA5151";
            }
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".btnCornerRadius"), 0);
            if (D1 <= 0) {
                D1 = 8;
            }
            pVar.P = za4.z0.o(D1, 1, i18, i19);
            int i29 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(".item");
                sb6.append(i29 == 0 ? "" : java.lang.Integer.valueOf(i29));
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
                    return pVar;
                }
                int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb7 + ".subType"), 0);
                if (D12 >= 1 && D12 <= 4) {
                    pVar.Q[D12 - 1] = c(map, sb7);
                }
                i29++;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "parse, exp=" + th6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "parse, null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            return null;
        }
    }

    public static f54.o c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        try {
            f54.o oVar = new f54.o();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".subType"), 0) != 3) {
                java.lang.String str2 = (java.lang.String) map.get(str + ".headline");
                if (str2 == null) {
                    str2 = "";
                }
                oVar.f341258a = str2;
                java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
                if (str3 == null) {
                    str3 = "";
                }
                oVar.f341259b = str3;
                java.lang.String str4 = (java.lang.String) map.get(str + ".decorationTitle");
                if (str4 == null) {
                    str4 = "";
                }
                oVar.f341260c = str4;
                java.lang.String str5 = (java.lang.String) map.get(str + ".btnTitle");
                if (str5 == null) {
                    str5 = "";
                }
                oVar.f341261d = str5;
                java.lang.String str6 = (java.lang.String) map.get(str + ".btnTitleExpired");
                if (str6 == null) {
                    str6 = "";
                }
                oVar.f341262e = str6;
                java.lang.String str7 = (java.lang.String) map.get(str + ".btnTitleGetByOther");
                if (str7 == null) {
                    str7 = "";
                }
                oVar.f341263f = str7;
                oVar.f341264g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".expireTime"), 0);
            }
            int i17 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(".item");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
                    return oVar;
                }
                int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb7 + ".subType"), 0);
                if (D1 == 1) {
                    oVar.f341265h = c(map, sb7);
                } else if (D1 == 2) {
                    oVar.f341266i = c(map, sb7);
                }
                i17++;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "parseHBCardInfo, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            return null;
        }
    }
}
