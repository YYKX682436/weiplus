package l44;

/* loaded from: classes4.dex */
public abstract class r3 {
    public static void a(int i17, ab4.n0 n0Var, long j17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
        long j18 = i18;
        if (j18 <= j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
            return;
        }
        try {
            if (j17 < 0) {
                if (i17 == 61) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 14);
                } else if (i17 == 62) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 17);
                } else if (i17 == 142) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 11);
                }
            } else if (j17 == 0) {
                if (i17 == 61) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 15);
                } else if (i17 == 62) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 18);
                } else if (i17 == 142) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 12);
                }
            } else if (j18 - j17 <= 10) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
                return;
            } else if (i17 == 61) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 16);
            } else if (i17 == 62) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 19);
            } else if (i17 == 142) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 13);
            }
            java.lang.String str2 = "";
            if (n0Var != null) {
                str2 = n0Var.l() + "|" + n0Var.o();
            }
            if (i17 == 61) {
                ca4.e0.a("landing_page_video_comp_play_exposure_time_diff", "1", i18, (int) j17, str2);
            } else if (i17 == 62) {
                ca4.e0.a("landing_page_video_comp_play_exposure_time_diff", "2", i18, (int) j17, str2);
            } else if (i17 == 142) {
                ca4.e0.a("landing_page_video_comp_play_exposure_time_diff", "0", i18, (int) j17, str2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "playTimeInterval more than compStayTime, videoComp type is " + i17 + ", playTimeInterval is " + i18 + ", compStayTime is " + j17 + ", extra is " + str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
    }
}
