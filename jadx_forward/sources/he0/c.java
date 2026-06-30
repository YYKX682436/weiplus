package he0;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5152x8a652eb8 c5152x8a652eb8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5152x8a652eb8) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        if (gm0.j1.a()) {
            java.lang.String str = c5152x8a652eb8.f135501g.f88334a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                } else {
                    ((ku5.t0) ku5.t0.f394148d).g(new za4.c1(str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdLandingPagesDownloadEventListener", "AdLandingPagesDownloadEventEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        return false;
    }
}
