package ld4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ld4.a f399638a = new ld4.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f399639b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f399640c;

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FEED_NEW_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
                if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_feed_improve_large_window, true)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                    return false;
                }
            }
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_feed_enable, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
            return fj6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        return z17;
    }
}
