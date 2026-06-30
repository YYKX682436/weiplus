package rc4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static rc4.a f475674f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f475675g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f475676h;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f475679k;

    /* renamed from: a, reason: collision with root package name */
    public static final rc4.e f475669a = new rc4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f475670b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();

    /* renamed from: c, reason: collision with root package name */
    public static long f475671c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f475672d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f475673e = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f475677i = "";

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashSet f475678j = new java.util.HashSet();

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReasonData", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        f475673e.add(new rc4.a(f475672d, 0, 0, null, i17, null, null, 0, 238, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReasonData", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final long b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finderExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        long m75939xb282bd08 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).aj().m75939xb282bd08(9) * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "finderExposeInterval interval:" + m75939xb282bd08);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finderExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        return m75939xb282bd08;
    }

    public final int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReqPositionOffset", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int fj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).fj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "getReqPositionOffset offset:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReqPositionOffset", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        return fj6;
    }

    public final int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUpdateCountLimit", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        c61.h9 h9Var = (c61.h9) ((c50.w0) i95.n0.c(c50.w0.class));
        h9Var.getClass();
        int m75939xb282bd08 = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I1().r()).intValue() > 0 ? 1 : h9Var.aj().m75939xb282bd08(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "getUpdateCountLimit limit:" + m75939xb282bd08);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUpdateCountLimit", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        return m75939xb282bd08;
    }

    public final void e(java.lang.String reason) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeFinderTier", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        f475671c = -1L;
        f475672d = -1L;
        f(reason);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "removeFinderTierId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeFinderTier", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDebugDialog", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FINDER_TIER_DIALOG_INT_SYNC, 0) == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g("错误码：" + str);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq);
            u1Var.l(rc4.d.f475668a);
            u1Var.q(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDebugDialog", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerFetchSnsDeliveryBubbleSync", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        c50.w0 w0Var = (c50.w0) i95.n0.c(c50.w0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finderSyncTimeCheck", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f475670b;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - o4Var.q("MicroMsg.FinderTierManager", 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderSyncInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).getClass();
        long m75939xb282bd08 = (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I1().r()).intValue() > 0 ? 30 : r2.aj().m75939xb282bd08(1)) * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "getFinderSyncInterval interval:" + m75939xb282bd08);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderSyncInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        boolean z17 = currentTimeMillis >= m75939xb282bd08;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finderSyncTimeCheck", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "triggerFetchSnsDeliveryBubbleSync");
            o4Var.B("MicroMsg.FinderTierManager", java.lang.System.currentTimeMillis());
            c61.h9 h9Var = (c61.h9) w0Var;
            h9Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "[disposeSnsDeliveryRedDotCtrlInfo] ...");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("FinderSnsDeliveryEntrance");
            h9Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "[triggerFetchSnsDeliveryBubbleSync] doSync...");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(12288, 21);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderTierManager", "finder sync fail for time check");
            rc4.a aVar = f475674f;
            if (aVar != null) {
                aVar.b(7);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerFetchSnsDeliveryBubbleSync", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void h(java.util.LinkedList list, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("serverConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f475670b;
        int o17 = o4Var.o("FinderTierManager.SERVER_KEY", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "serverConfigEnable value:" + o17);
        boolean z17 = o17 == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("serverConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finderConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            c61.h9 h9Var = (c61.h9) ((c50.w0) i95.n0.c(c50.w0.class));
            h9Var.getClass();
            boolean z18 = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I1().r()).intValue() > 0 || h9Var.aj().m75939xb282bd08(0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "finderConfigEnable enable:" + z18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finderConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            if (z18) {
                if (list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderTierManager", "null list");
                    f475674f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 5, null, null, 0, 238, null);
                    e("5:拉到的新 feeds 小于 " + d() + " 值");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() - o4Var.q("FinderTierManager.EXPOSE_KEY", 0L);
                if (currentTimeMillis <= b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderTierManager", "expose interval disable:" + currentTimeMillis);
                    f475674f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 11, null, null, 0, 238, null);
                    e("11:曝光频控限制(" + currentTimeMillis + '<' + b() + ')');
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                    return;
                }
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) it.next()).Id == j17) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                int size = i17 >= 0 ? i17 : list.size();
                if (size < d()) {
                    long q17 = o4Var.q("FinderTierManager.UI_KEY", -1L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderTierManager", "new feed count limit:" + size + " uiKey:" + ca4.z0.t0(q17) + " indicator:" + ca4.z0.t0(j17));
                    if (q17 != -1 && j17 != q17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "do retry");
                        o4Var.B("FinderTierManager.UI_KEY", -1L);
                        h(list, q17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                        return;
                    }
                    f475674f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 5, null, null, 0, 238, null);
                    e("5:拉到的新 feeds 小于 " + d() + " 值");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                    return;
                }
                o4Var.A("FinderTierManager.SHOW_ID", 0);
                int c17 = i17 > 0 ? i17 - c() : (list.size() - c()) - 1;
                f475674f = new rc4.a(f475672d, 0, 0, null, 0, null, null, 0, 254, null);
                if (c17 <= 0 || list.isEmpty()) {
                    f475671c = -1L;
                    rc4.a aVar = f475674f;
                    if (aVar != null) {
                        aVar.b(2);
                    }
                    g();
                } else {
                    long j18 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) list.get(c17)).Id;
                    f475671c = j18;
                    if (j18 <= j17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderTierManager", "requestTierId:" + ca4.z0.t0(f475671c) + " <= finderTierId:" + ca4.z0.t0(f475672d));
                    }
                    if (f475678j.contains(java.lang.Long.valueOf(f475671c))) {
                        g();
                        rc4.a aVar2 = f475674f;
                        if (aVar2 != null) {
                            aVar2.b(2);
                        }
                    }
                }
                rc4.a aVar3 = f475674f;
                if (aVar3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                    aVar3.f475654a = j17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                }
                f475672d = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTierManager", "update count:" + size + " requestTierId:" + ca4.z0.t0(f475671c) + " finderTierId:" + ca4.z0.t0(f475672d));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderTierManager", "server disable");
        e("0:总开关 关闭");
        f475674f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 0, null, null, 0, 238, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void i() {
        rc4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateReportPageFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb cj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).cj();
        cl0.g bj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).bj(new c50.v0(0, null, cj6, null, 8, null));
        rc4.a aVar2 = f475674f;
        if (aVar2 != null) {
            java.lang.String mo15082x48bce8a4 = bj6.mo15082x48bce8a4("next_page_feedid");
            if (mo15082x48bce8a4 == null) {
                mo15082x48bce8a4 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNextPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar2.f475657d = mo15082x48bce8a4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNextPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        rc4.a aVar3 = f475674f;
        if (aVar3 != null) {
            java.lang.String mo15082x48bce8a42 = bj6.mo15082x48bce8a4("show_username");
            if (mo15082x48bce8a42 == null) {
                mo15082x48bce8a42 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShow_username", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar3.f475659f = mo15082x48bce8a42;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShow_username", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        rc4.a aVar4 = f475674f;
        boolean z17 = false;
        if (aVar4 != null) {
            int mo15080xc3ca103c = bj6.mo15080xc3ca103c("contenttype", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContent_type", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar4.f475661h = mo15080xc3ca103c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent_type", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        rc4.a aVar5 = f475674f;
        if (aVar5 != null) {
            java.lang.String mo15082x48bce8a43 = bj6.mo15082x48bce8a4("tips_uuid");
            java.lang.String str = mo15082x48bce8a43 != null ? mo15082x48bce8a43 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTips_uuid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar5.f475660g = str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTips_uuid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        if (cj6 == null) {
            rc4.a aVar6 = f475674f;
            if (aVar6 != null) {
                aVar6.b(9);
            }
        } else {
            rc4.a aVar7 = f475674f;
            if (aVar7 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                int i17 = aVar7.f475658e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                if (i17 == 6) {
                    z17 = true;
                }
            }
            if (z17 && (aVar = f475674f) != null) {
                aVar.b(2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateReportPageFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }
}
