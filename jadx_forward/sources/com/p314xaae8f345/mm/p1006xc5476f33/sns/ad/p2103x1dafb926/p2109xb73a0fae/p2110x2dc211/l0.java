package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePagFileHelper", "downloadPagFile, url=" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return;
        }
        dn.j jVar = new dn.j();
        jVar.f323318d = "task_SnsAdFileDownloader";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        java.lang.String m17 = za4.t0.m("adId", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.p314xaae8f345.mm.vfs.w6.h(m17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        boolean z17 = false;
        try {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePagFileHelper", "attachTaskInfo, mediaId=" + b17 + ", fileUrl=" + str);
            java.lang.String host = new java.net.URL(str).getHost();
            int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, new java.util.ArrayList());
            int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, new java.util.ArrayList());
            jVar.f69601xaca5bdda = b17;
            jVar.D1 = str;
            jVar.E1 = host;
            jVar.G1 = m17;
            jVar.J1 = f17;
            jVar.K1 = f18;
            jVar.L1 = false;
            jVar.M1 = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.c();
            jVar.N1 = "";
            jVar.P1 = 150;
            jVar.Q1 = 20201;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagePagFileHelper", "attachTaskInfo, exp=" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        }
        if (z17) {
            jVar.f323320f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.k0();
            if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePagFileHelper", "downloadPagFile, addRecvTask suc");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagePagFileHelper", "downloadPagFile, addRecvTask failed");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagePagFileHelper", "downloadPagFile, attachTaskInfo failed");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagePagFileHelper", "findLocalPagFile, url empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                return "";
            }
            java.lang.String m17 = za4.t0.m("adId", str);
            if (com.p314xaae8f345.mm.vfs.w6.j(m17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                boolean z17 = false;
                if (com.p314xaae8f345.mm.vfs.w6.j(m17)) {
                    if (android.text.TextUtils.isEmpty(str2)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    } else if (str2.equals(com.p314xaae8f345.mm.vfs.w6.p(m17))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    }
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePagFileHelper", "findLocalPagFile, succ, url=" + str + ", path=" + m17 + ", md5=" + str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    return m17;
                }
                com.p314xaae8f345.mm.vfs.w6.h(m17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagePagFileHelper", "findLocalPagFile, check md5 failed, url=" + str + ", path=" + m17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagePagFileHelper", "findLocalPagFile, not exists, url=".concat(str));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return "";
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagePagFileHelper", "findLocalPagFile, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return "";
        }
    }

    public static org.p3363xbe4143f1.C29690xfae77312 c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getValidPAGFile, pagUrl is " + str2 + ", pagMd5 is " + str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return null;
        }
        java.lang.String b17 = b(str2, str3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            org.p3363xbe4143f1.C29690xfae77312 m154717x243906 = org.p3363xbe4143f1.C29690xfae77312.m154717x243906(e(b17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return m154717x243906;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getValidPAGFile, pagFilePath is isNullOrEmpty, so we download this pag");
        a(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return null;
    }

    public static com.p314xaae8f345.mm.rfx.C20942x379cf5ee d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getValidPAGFile, pagUrl is " + str2 + ", pagMd5 is " + str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return null;
        }
        java.lang.String b17 = b(str2, str3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77392x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77392x243906(e(b17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return m77392x243906;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getValidPAGFile, pagFilePath is isNullOrEmpty, so we download this pag");
        a(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return null;
    }

    public static byte[] e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return N;
    }
}
