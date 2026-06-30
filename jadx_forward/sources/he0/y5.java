package he0;

/* loaded from: classes4.dex */
public class y5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h6 oj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.oj();
        oj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        if (oj6.a()) {
            java.util.Date date = new java.util.Date();
            int hours = (date.getHours() * 60) + date.getMinutes();
            java.util.LinkedList linkedList = oj6.f245774d;
            if (ca4.z0.k(linkedList, hours)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  %d in %s", java.lang.Integer.valueOf(hours), linkedList.toArray());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                return false;
            }
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsImgPreLoadingSmallImage", 1);
        int b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsImgPreLoadingBigImage", 1);
        int c17 = ma4.a.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLineOutPreloadInterval", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_out_preload_interval, 1200);
        ma4.a.f406757h = Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLineOutPreloadInterval", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", " preloadingSamllImage %d preloadingBigImage %d preloadingVideo %d preloadingInterval %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(Ni));
        if (b17 > 0 || b18 > 0 || c17 > 0) {
            int i17 = Ni > 0 ? Ni : 1200;
            if (oj6.f245772b || oj6.f245773c || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(oj6.f245771a) < i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  isInChatting:%b, isInSnsTimeline:%b", java.lang.Boolean.valueOf(oj6.f245772b), java.lang.Boolean.valueOf(oj6.f245773c));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.H("@__weixintimtline")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: doing timeline");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else if (gi.d.h(82) && gi.i0.f353588b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: on doze mode");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.L("@__weixintimtline");
                jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 82, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else {
                gm0.j1.i();
                if (!gm0.j1.n().f354821b.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v2(), 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync triggered");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.L("@__weixintimtline");
                }
                oj6.f245771a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        return false;
    }
}
