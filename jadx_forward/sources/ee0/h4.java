package ee0;

@j95.b
/* loaded from: classes8.dex */
public final class h4 extends i95.w implements fe0.d4 {
    public boolean Ai(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needCheckFinderValid", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean z17 = true;
        if (gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_COVER_FINDER_CHECK_INT_SYNC, -1) == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        } else {
            if (java.lang.System.currentTimeMillis() - j17 > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_cover_finder_check_interval, 3600) * 1000) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
                z17 = false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needCheckFinderValid", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return z17;
    }

    public boolean wi() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkErrorType", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkErrorType", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_error_code_check, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkErrorType", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkErrorType", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return fj6;
    }
}
