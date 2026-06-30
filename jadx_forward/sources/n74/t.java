package n74;

/* loaded from: classes4.dex */
public abstract class t {
    public static int a(java.lang.String str) {
        java.lang.String[] split;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        try {
            if (!android.text.TextUtils.isEmpty(str) && (split = str.split("-")) != null && split.length > 0) {
                int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
                return D1;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdImgDownloadReporter", "getRawRequestType, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        return 0;
    }

    public static void b(int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdPicDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdImgDownloadReporter", "reportAdPicDownload, result=" + i17 + ", scene=" + i18 + ", downloader=" + i19 + ", imgUrl=" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdImgDownloadReporter", "reportAdPicDownload, url is empty");
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(21534, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                if (i18 == 0) {
                    if (i17 == 0) {
                        g0Var.A(2044, 21);
                    } else {
                        g0Var.A(2044, 22);
                    }
                } else if (i18 == 1) {
                    if (i17 == 0) {
                        g0Var.A(2044, 23);
                    } else {
                        g0Var.A(2044, 24);
                    }
                }
                if (i19 == 1) {
                    if (i17 == 0) {
                        g0Var.A(2044, 25);
                    } else {
                        g0Var.A(2044, 26);
                    }
                } else if (i19 == 0) {
                    if (i17 == 0) {
                        g0Var.A(2044, 27);
                    } else {
                        g0Var.A(2044, 28);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdImgDownloadReporter", "reportAdPicDownload, exp=" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdPicDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
    }

    public static void c(la4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAvif", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        if (aVar == null || aVar.f399075a == null || android.text.TextUtils.isEmpty(aVar.d())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAvif", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
            return;
        }
        r45.jj4 jj4Var = aVar.f399075a;
        m44.d.d("ThumbCdnDownload", jj4Var.f459393i, aVar.d() + ca4.z0.U(jj4Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAvif", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
    }
}
