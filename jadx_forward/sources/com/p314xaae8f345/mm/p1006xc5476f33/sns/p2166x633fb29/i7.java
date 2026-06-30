package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class i7 implements t21.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f245842b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f245843c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f245844d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f245845e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f245846f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f245847g = 6;

    /* renamed from: h, reason: collision with root package name */
    public boolean f245848h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245849i = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 f245841a = null;

    public i7() {
        this.f245842b = null;
        this.f245843c = null;
        this.f245844d = null;
        this.f245842b = new java.util.LinkedList();
        this.f245843c = new java.util.concurrent.ConcurrentHashMap();
        this.f245844d = new java.util.LinkedList();
    }

    public static /* synthetic */ java.util.LinkedList b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.LinkedList linkedList = i7Var.f245845e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    public static /* synthetic */ java.util.LinkedList c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.LinkedList linkedList = i7Var.f245842b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (i7Var.f245845e) {
            try {
                boolean d17 = n74.l0.d();
                java.util.Iterator it = i7Var.f245845e.iterator();
                while (it.hasNext()) {
                    t21.v0 v0Var = (t21.v0) it.next();
                    if (v0Var.f496526q != 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(v0Var.f496513d);
                        if (k17 != null) {
                            java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(k17.m70363x51f8f990(), (r45.jj4) k17.m70371x485d7().f39014x86965dde.f451373h.get(0));
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_RESUME resume preload sns:[%s]", v0Var.f496513d);
                                if (v0Var.b(i7Var) < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]", java.lang.Integer.valueOf(i7Var.hashCode()));
                                    it.remove();
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_RESUME sns:[%s] , video[%s] already download finish, do nothing.", k17.m70363x51f8f990(), i17);
                                it.remove();
                            }
                        }
                    } else if (!d17) {
                        r45.jj4 p17 = i7Var.p(v0Var);
                        if (p17 == null) {
                            it.remove();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload, findMediaFromMultiVideoAd is null");
                        } else {
                            java.lang.String str = v0Var.f496513d;
                            java.lang.String i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(str, p17);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
                                java.lang.Object[] objArr = new java.lang.Object[3];
                                objArr[0] = str;
                                objArr[1] = v0Var.f496514e;
                                dn.o oVar = v0Var.f496517h;
                                objArr[2] = oVar != null ? oVar.f323347b2 : "";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload resume preload sns fakeLocalId: [%s], cdnMediaId: [%s], mediaId: [%s]", objArr);
                                if (v0Var.b(i7Var) < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload current preload task do scene error. hash: [%d]", java.lang.Integer.valueOf(i7Var.hashCode()));
                                    it.remove();
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload sns fakeLocalId: [%s], video [%s] already download finish, do nothing.", str, i18);
                                it.remove();
                            }
                        }
                    }
                }
                for (int size = i7Var.f245845e.size(); size < i7Var.f245846f; size++) {
                    i7Var.v();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public static boolean e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z17 = false;
        c19762x487075a.f38859x6ac9171 = false;
        c19762x487075a2.f38859x6ac9171 = false;
        synchronized (i7Var.f245844d) {
            try {
                if (a84.b0.b(i7Var.f245844d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    java.util.Iterator it = i7Var.f245844d.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                        if (q74.t0.f(c17933xe8d1b226)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "checkPreloadListHasSlideCardAd: preloadList has slideFullCardAd");
                            z17 = true;
                        } else if (c17933xe8d1b226 != null && c17933xe8d1b226.m70401x59316745()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "checkPreloadListHasSlideCardAd: preloadList has lookbookAd");
                            c19762x487075a.f38859x6ac9171 = true;
                        } else if (c17933xe8d1b226 != null && c17933xe8d1b226.m70395x9b8322ea()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "checkPreloadListHasSlideCardAd: preloadList has flipCardAd");
                            c19762x487075a2.f38859x6ac9171 = true;
                        }
                        if (z17 && c19762x487075a.f38859x6ac9171 && c19762x487075a2.f38859x6ac9171) {
                            break;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z17;
    }

    public static /* synthetic */ java.util.LinkedList f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.LinkedList linkedList = i7Var.f245844d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    public static boolean g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z17 = true;
        if (c17933xe8d1b226 != null) {
            if (c17933xe8d1b226.m70377x3172ed()) {
                c19762x487075a.f38859x6ac9171 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (t21.o2.Ni().d(false)) {
                c19762x487075a.f38859x6ac9171 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b226);
                if (f17.f38993xee7ff79 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                    c19762x487075a.f38859x6ac9171 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    int i17 = ma4.a.f406756g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    if (i17 <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", java.lang.Integer.valueOf(i7Var.hashCode()));
                        c19762x487075a.f38859x6ac9171 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    } else {
                        c19772x1c2cd081.f38869x6ac9171 = ca4.z0.t0(f17.Id);
                        c19767x257d7f.f38864x6ac9171 = i17;
                        if (ma4.a.a()) {
                            c19762x487075a.f38859x6ac9171 = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD enableTimelinePreload [false]");
                            c19762x487075a.f38859x6ac9171 = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return z17;
        }
        c19762x487075a.f38859x6ac9171 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z17;
    }

    public static boolean h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z17 = true;
        if (c17933xe8d1b226 != null) {
            if (c17933xe8d1b226.m70377x3172ed()) {
                c19762x487075a.f38859x6ac9171 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(c17933xe8d1b226.m70357x3fdd41df()) >= 86400) {
                c19762x487075a.f38859x6ac9171 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (t21.o2.Ni().d(false)) {
                c19762x487075a.f38859x6ac9171 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b226);
                if (f17.f38993xee7ff79 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                    c19762x487075a.f38859x6ac9171 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "%d check sns video[%s] preload [%d %d %s]", java.lang.Integer.valueOf(i7Var.hashCode()), c17933xe8d1b226.m70363x51f8f990(), java.lang.Integer.valueOf(f17.f38993xee7ff79.f460108d), java.lang.Integer.valueOf(f17.f38993xee7ff79.f460109e), f17.f38993xee7ff79.f460110f);
                    if (f17.f38993xee7ff79.f460108d <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", java.lang.Integer.valueOf(i7Var.hashCode()));
                        c19762x487075a.f38859x6ac9171 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    } else {
                        c19772x1c2cd081.f38869x6ac9171 = ca4.z0.t0(f17.Id);
                        r45.kb5 kb5Var = f17.f38993xee7ff79;
                        c19767x257d7f.f38864x6ac9171 = kb5Var.f460108d;
                        if (d11.b.a(kb5Var.f460110f)) {
                            c19762x487075a.f38859x6ac9171 = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        } else {
                            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                i17 = f17.f38993xee7ff79.f460109e & 1;
                            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                i17 = f17.f38993xee7ff79.f460109e & 2;
                            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                i17 = f17.f38993xee7ff79.f460109e & 4;
                            } else {
                                c19762x487075a.f38859x6ac9171 = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            }
                            if (i17 > 0) {
                                c19762x487075a.f38859x6ac9171 = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            } else {
                                c19762x487075a.f38859x6ac9171 = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return z17;
        }
        c19762x487075a.f38859x6ac9171 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dn.o i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 r28, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r29, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.i(com.tencent.mm.plugin.sns.model.i7, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.pointers.PInt, java.lang.String):dn.o");
    }

    /* JADX WARN: Finally extract failed */
    public static void j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var, java.lang.String str, java.util.List list, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadAdVideos", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        for (int i17 = 0; i17 < list.size(); i17++) {
            dn.o oVar = (dn.o) list.get(i17);
            if (oVar != null) {
                java.lang.String e17 = ca4.m0.e(str, oVar.f323347b2 + "_");
                t21.v0 v0Var = new t21.v0(oVar, e17);
                v0Var.f496524o = i7Var.f245849i;
                v0Var.f496526q = 1;
                if (v0Var.b(i7Var) < 0) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i7Var.hashCode());
                    dn.o oVar2 = v0Var.f496517h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload, curr preload task do scene error. hash: [%d], localId: [%s], fakeLocalId: [%s], mediaId: [%s], cdnMediaId: [%s]", valueOf, str, e17, oVar2 != null ? oVar2.f323347b2 : "", v0Var.f496514e);
                } else {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171);
                    dn.o oVar3 = v0Var.f496517h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload, sns:[%s] start to preload, pPreloadPercent: %d, localId: [%s], fakeLocalId: [%s], mediaId: [%s], cdnMediaId: [%s] [success to preload]", e17, valueOf2, str, e17, oVar3 != null ? oVar3.f323347b2 : "", v0Var.f496514e);
                    v0Var.f496523n = java.lang.System.currentTimeMillis();
                    synchronized (i7Var.f245845e) {
                        try {
                            i7Var.f245845e.add(i17, v0Var);
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdVideos", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            throw th6;
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdVideos", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public static byte[] q(r45.jj4 jj4Var) {
        r45.g96 g96Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (jj4Var == null || (g96Var = jj4Var.H1) == null || android.text.TextUtils.isEmpty(g96Var.f456561e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        try {
            r45.t76 t76Var = new r45.t76();
            t76Var.f467735d = jj4Var.H1.f456561e;
            byte[] mo14344x5f01b1f6 = t76Var.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return mo14344x5f01b1f6;
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoService", "set getSnsVideoCtxBuffer error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
    }

    public static java.lang.String r(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "mediaObj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return "";
        }
        java.util.LinkedList linkedList = jj4Var.T;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.jz6 jz6Var = (r45.jz6) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "rule type:%s value:%s", jz6Var.f459767d, jz6Var.f459768e);
        }
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return "";
        }
        r45.jz6 jz6Var2 = (r45.jz6) linkedList.get(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "select rule type:%s value:%s", jz6Var2.f459767d, jz6Var2.f459768e);
        java.lang.String str = jz6Var2.f459768e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return str;
    }

    @Override // t21.u0
    public void a(t21.v0 v0Var, boolean z17, int i17, int i18) {
        t21.v2 v2Var;
        t21.v0 v0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (v0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoService", "%d on preload finish but scene is null?", java.lang.Integer.valueOf(hashCode()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        synchronized (this.f245845e) {
            try {
                java.util.Iterator it = this.f245845e.iterator();
                while (true) {
                    v2Var = null;
                    if (!it.hasNext()) {
                        v0Var2 = null;
                        break;
                    } else if (v0Var == ((t21.v0) it.next())) {
                        v0Var2 = v0Var;
                        break;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        if (v0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoService", "%d on preload finish, but scene callback not same object.", java.lang.Integer.valueOf(hashCode()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        java.lang.String str = v0Var.f496517h.X1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "onPreloadFinish snsLocalId:%s media id:%s videoFlag:%s", v0Var.f496513d, v0Var.f496514e, str);
        java.lang.String str2 = v0Var.f496513d;
        java.lang.String str3 = v0Var.f496514e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.f246306a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        } else if (android.text.TextUtils.isEmpty(str)) {
            v2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.j(str2, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        } else {
            java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.f(str2, str3, str, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            t21.v2 h17 = t21.d3.h(f17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            v2Var = h17;
        }
        if (v2Var != null) {
            v2Var.f496541f = i18;
            t21.d3.Q(v2Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_DONE  preload video[%s] finish success[%b] range[%d, %d]  hash:[%d]", v0Var.c(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hashCode()));
        cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d7(this, v0Var2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public boolean k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD null snsInfo . [fail in queue]");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineMaxParallelInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i17 = ma4.a.f406751b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineMaxParallelInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        this.f245846f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineMaxPreloadInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i18 = ma4.a.f406750a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineMaxPreloadInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        this.f245847g = i18;
        synchronized (this.f245844d) {
            try {
                if (this.f245844d.size() >= this.f245847g && !c17933xe8d1b226.m70377x3172ed()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD sns:[%s] full stack .[fail in queue], and the sns info is not ad.", c17933xe8d1b226.m70363x51f8f990());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    return false;
                }
                this.f245844d.add(c17933xe8d1b226);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD hash(%d) sns:[%s] add preload video  [success in queue]", java.lang.Integer.valueOf(hashCode()), c17933xe8d1b226.m70363x51f8f990());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                return true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r2 == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.l(com.tencent.mm.plugin.sns.storage.SnsInfo, boolean):void");
    }

    public boolean m(r45.jj4 jj4Var, int i17, java.lang.String str, boolean z17, boolean z18, int i18, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsVideoService", "addSnsVideoTask snsLocalId:%s mediaId:%s", str, str2);
        if (jj4Var.f459392h == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_timeline_jump_downloading_task, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var = this.f245841a;
        if (fj6 && z7Var != null && !android.text.TextUtils.isEmpty(z7Var.f246346b) && !android.text.TextUtils.isEmpty(z7Var.f246350f) && z7Var.f246350f.equals(str) && z7Var.f246346b.equals(str2) && z17 == z7Var.f246347c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoService", "[%s]task is downloading now.", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7();
        z7Var2.f246346b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.c(i17, jj4Var);
        z7Var2.f246348d = jj4Var;
        z7Var2.f246349e = i17;
        z7Var2.f246350f = str;
        z7Var2.f246347c = z17 ? 1 : 0;
        z7Var2.f246351g = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("offerQueue", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f7(this, z7Var2, z18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("offerQueue", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (z18) {
            w();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    public void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        this.f245841a = null;
        synchronized (this.f245845e) {
            try {
                this.f245845e.clear();
            } finally {
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f245843c).clear();
        this.f245842b.clear();
        synchronized (this.f245844d) {
            try {
                this.f245844d.clear();
            } finally {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (this.f245844d) {
            try {
                this.f245844d.clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public final r45.jj4 p(t21.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        r45.jj4 jj4Var = null;
        if (v0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, current is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        dn.o oVar = v0Var.f496517h;
        java.lang.String str = oVar != null ? oVar.f323347b2 : "";
        java.lang.String str2 = v0Var.f496513d;
        java.lang.String k17 = ca4.m0.k(str2, str + "_");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, localId is " + k17 + ", current resume preload fakeLocalId is " + str2 + ", current resume preload mediaId is " + str + ", cdnMediaId is " + v0Var.f496514e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(k17);
        if (k18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, snsInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        if (q74.t0.f(k18) && k18.m70354x74235b3e().f38210x95847c91 != null) {
            java.util.List<s34.x0> list = k18.m70354x74235b3e().f38210x95847c91.f76695x5800ff2c;
            if (a84.b0.b(list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, adSlideFullCardItemInfoList is null or empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                return null;
            }
            java.util.Iterator<s34.x0> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s34.x0 next = it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, next.f484361e.f459388d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, next.f484361e.f459388d)) {
                    jj4Var = next.f484361e;
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return jj4Var;
        }
        if (k18.m70401x59316745()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, getLookbookAdMediaById, mediaId=" + str);
            r45.jj4 f17 = n74.m0.f(k18, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return f17;
        }
        if (!k18.m70395x9b8322ea()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, getFlipCardMediaById, mediaId=" + str);
        r45.jj4 e17 = n74.m0.e(k18, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return e17;
    }

    public boolean s(r45.jj4 jj4Var, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var = this.f245841a;
        if (z7Var != null && !android.text.TextUtils.isEmpty(z7Var.f246350f) && z7Var.f246350f.equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return true;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.c(i17, jj4Var);
        if (android.text.TextUtils.isEmpty(c17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        boolean containsKey = ((java.util.concurrent.ConcurrentHashMap) this.f245843c).containsKey(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return containsKey;
    }

    public void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        v();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public boolean u(java.lang.String str, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e7(this, str, objArr));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    public final synchronized void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD preload size:%d  queue size:%d", java.lang.Integer.valueOf(this.f245845e.size()), java.lang.Integer.valueOf(this.f245844d.size()));
        cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c7(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryStart", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g7(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryStart", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }
}
