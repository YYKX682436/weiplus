package l44;

/* loaded from: classes4.dex */
public abstract class c0 {
    public static void a(ab4.z zVar, boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (zVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_sight_video_h265, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "isExptLandingPageSightVideoEnableH265, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            z18 = false;
        }
        zVar.F = j(zVar.F, z18 && !zVar.S);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "checkAdLandingPageSightForH265, expt=" + z18 + ", forbidCdn=" + zVar.S + ", isPreload=" + z17 + ", ret url=" + zVar.F);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70377x3172ed()) {
            c(i64.q.a(c17933xe8d1b226), jj4Var, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static void c(i64.q qVar, r45.jj4 jj4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (qVar == null || (c17903x3b438f4 = qVar.f370821b) == null || jj4Var == null || !jj4Var.N) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAdSupportH265, adDataModel==null?");
            sb6.append(qVar == null);
            sb6.append(", media==null?");
            sb6.append(jj4Var == null);
            sb6.append(", isAd=");
            sb6.append(jj4Var != null ? jj4Var.N : false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdH265Helper", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        boolean b17 = a84.p.b(150519, qVar.f370820a);
        if (c17903x3b438f4.m70141x35f5a38c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptFullCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptFullCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "fullcardAd enable h265";
        } else if (c17903x3b438f4.m70137xb10b9698()) {
            str2 = "dynamicAd enable h265";
        } else if (c17903x3b438f4.m70135xd6a8f11d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "cardAd enable h265";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptNormAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptNormAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "normalAd enable h265";
        }
        i(jj4Var, true, b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "checkAdSupportH265, " + str2 + ", snsId=" + str + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static java.lang.String d(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str;
            }
            if (!str.contains("svpuseh265flag")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str;
            }
            if (!z17 && !ca4.m0.p()) {
                java.net.URI uri = new java.net.URI(str);
                java.lang.String query = uri.getQuery();
                if (!android.text.TextUtils.isEmpty(query)) {
                    if (query.contains("svpuseh265flag=0")) {
                        query = query.replace("&svpuseh265flag=0", "").replace("svpuseh265flag=0", "");
                    }
                    if (query.contains("svpuseh265flag=1")) {
                        query = query.replace("&svpuseh265flag=1", "").replace("svpuseh265flag=1", "");
                    }
                    if (query.startsWith("&")) {
                        query = query.replaceFirst("&", "");
                    }
                }
                if (android.text.TextUtils.isEmpty(query)) {
                    query = null;
                }
                java.lang.String uri2 = new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment()).toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return uri2;
            }
            a84.x0 x0Var = a84.x0.f83910a;
            java.lang.String a17 = x0Var.a(x0Var.a(str, "svpuseh265flag=1"), "svpuseh265flag=0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return a17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdH265Helper", e17, "", new java.lang.Object[0]);
            ca4.q.a("AdH265Helper", "deleteUrlH265Flag error", 7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return str;
        }
    }

    public static boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDebug", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDebug", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return false;
    }

    public static void f(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        int i18 = i17 == 1 ? (z17 && z18) ? 13 : !z17 ? 14 : 15 : 0;
        if (i18 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "report, videoPlayerType = " + i17 + ", urlHasFlag = " + z17 + ", cdnHasFlag = " + z18 + ", key = " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static void g(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        int i17 = z17 ? (z18 && z19) ? 1 : !z18 ? 2 : 3 : (z18 && z19) ? 4 : !z18 ? 5 : 6;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "report, isOnline=" + z17 + ", urlHasFlag=" + z18 + ", cdnHasFlag=" + z19 + ", key=" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static java.lang.String h(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "setMediaIdForH265, exp=" + th6.toString());
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            if (z17) {
                if (!str.contains("_hvec")) {
                    str2 = str.concat("_hvec");
                }
            } else if (str.contains("_hvec")) {
                str2 = str.replace("_hvec", "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "setMediaIdForH265, mediaId==null");
        str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return str2;
    }

    public static void i(r45.jj4 jj4Var, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "setMediaInfoForH265, media==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        if (!jj4Var.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "setMediaInfoForH265, !media.isAd");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        jj4Var.f459391g = k(jj4Var.f459391g, z17, z18);
        jj4Var.f459388d = h(jj4Var.f459388d, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdH265Helper", "setMediaInfoForH265, media.hash=" + jj4Var.hashCode() + ", enableH265=" + z17 + ", meida.enc=" + jj4Var.D + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static java.lang.String j(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        java.lang.String k17 = k(str, z17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return k17;
    }

    public static java.lang.String k(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "setMediaUrlForH265, media.Url==null");
            } else {
                str = z17 ? !str.contains("svpuseh265flag") ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.a(str, z18, "svpuseh265flag=1") : str.replace("svpuseh265flag=0", "svpuseh265flag=1") : d(str, z18);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH265Helper", "setMediaUrlForH265, exp=" + th6.toString());
            ca4.q.a("AdH265Helper", "setMediaUrlForH265 error", 7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return str;
    }
}
