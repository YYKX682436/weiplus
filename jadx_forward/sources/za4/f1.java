package za4;

/* loaded from: classes4.dex */
public abstract class f1 {
    public static void a(java.util.LinkedList linkedList, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (linkedList == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            b((r45.g5) linkedList.get(i17), z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }

    public static void b(r45.g5 g5Var, boolean z17) {
        r45.f76 f76Var;
        r45.du5 du5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (g5Var == null || (f76Var = g5Var.f456418d) == null || (du5Var = f76Var.f455610e) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        java.lang.String g17 = x51.j1.g(du5Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            ((ku5.t0) ku5.t0.f394148d).g(new za4.a1(g5Var, g17, z17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }

    public static void c(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (linkedList == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList.get(i17);
            if (c19806x4c372b7 != null && (W0 = Fj.W0(c19806x4c372b7.Id)) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = W0.m70371x485d7();
                java.lang.String str = m70371x485d7 == null ? "" : m70371x485d7.f39021x5732e226;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((ku5.t0) ku5.t0.f394148d).g(new za4.b1(str, W0.m70367x7525eefd()));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }
}
