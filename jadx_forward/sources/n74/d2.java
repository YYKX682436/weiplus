package n74;

/* loaded from: classes4.dex */
public abstract class d2 {
    public static java.lang.String a(java.lang.String str, int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UxInfoHelper", "checkDecodeUxInfoInAdInfoXml, exp=" + e17 + ", src=" + i17 + ", xml=" + str);
        }
        if (!c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "ADInfo", null);
        if (d17 != null && d17.size() != 0) {
            java.lang.String str2 = (java.lang.String) d17.get(".ADInfo.uxInfo");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
                return str;
            }
            java.lang.String e18 = e(str2);
            if (str2.equals(e18)) {
                z17 = false;
            } else {
                str = str.replaceAll("(?s)<uxInfo[^>]*>.*?</uxInfo>", "").replace("<ADInfo>", "<ADInfo><uxInfo>" + e18 + "</uxInfo>");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UxInfoHelper", "srcUxInfo=".concat(str2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UxInfoHelper", "decodedUxInfo=" + e18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UxInfoHelper", "adInfoXml=" + str);
                z17 = true;
            }
            d(z17, i17);
            if (e18 != null && e18.contains("%")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 137);
            }
            if (z17) {
                ca4.e0.b("ad_uxinfo_encode", e18, i17, 0, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        return str;
    }

    public static java.lang.String b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (android.text.TextUtils.isEmpty(str) || i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split != null && split.length > i17) {
                java.lang.String str2 = split[i17];
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str3 = str2 != null ? str2 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
                return str3;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UxInfoHelper", e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        return "";
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpDecodeUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_url_decode_uxinfo, 1) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpDecodeUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UxInfoHelper", "isExptFullCardAdEnableH265, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpDecodeUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return true;
        }
    }

    public static void d(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportUxInfoDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (i17 == 13) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, z17 ? 130 : 129);
        } else if (i17 == 24) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, z17 ? 126 : 125);
        } else if (i17 == 30) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, z17 ? 128 : 127);
        } else if (i17 == 27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, z17 ? 132 : 131);
        } else if (i17 != 28) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, z17 ? 136 : 135);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, z17 ? 134 : 133);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportUxInfoDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        try {
            if (!str.contains("|") && !str.contains("+") && str.contains("%")) {
                java.lang.String decode = java.net.URLDecoder.decode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
                return decode;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UxInfoHelper", "safeUrlDecode, exp=" + e17 + ", src=" + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        return str;
    }
}
