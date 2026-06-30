package i64;

/* loaded from: classes4.dex */
public abstract class u1 {
    public static void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        b(i17, i18, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
    }

    public static void b(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        try {
            d(((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Zi(), i17, i18, i19, "");
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
    }

    public static void c(int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        try {
            d(((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Zi(), i17, i18, i19, str);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
    }

    public static void d(boolean z17, int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineAdTestReporter", "kv, isImproveUI=" + z17 + ", actionType=" + i17 + ", v1=" + i18 + ", v2=" + i19 + ", extra=" + str);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_ad_report_enable, false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(28552, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        }
    }
}
