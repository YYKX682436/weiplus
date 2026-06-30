package u34;

/* loaded from: classes4.dex */
public final class b implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u34.d f505940a;

    public b(u34.d dVar) {
        this.f505940a = dVar;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPagUpdateListener$1");
        u34.d dVar = this.f505940a;
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        long j17 = dVar.f505950i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (j17 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            dVar.f505950i = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i17 = dVar.f505949h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        dVar.f505949h = i17 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i18 = dVar.f505949h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (i18 >= 30) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            long j18 = dVar.f505950i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            long j19 = currentTimeMillis2 - j18;
            if (j19 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                int i19 = dVar.f505949h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                float f17 = (i19 * 1000.0f) / ((float) j19);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                int i27 = dVar.f505951j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                if (f17 < i27) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                    dVar.f505951j = (int) f17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            dVar.f505949h = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            dVar.f505950i = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPagUpdateListener$1");
    }
}
