package nc4;

/* loaded from: classes4.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final nc4.f f417677d = new nc4.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_clip_page_finder_promotion_entrance, "", true);
        nc4.i iVar = new nc4.i(0, 0, 0, 0, 15, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                int i17 = jSONObject.getInt("enable");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f417687a = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                int i18 = jSONObject.getInt("max_count_no_user");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderEntranceMaxCountNoUser", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f417688b = i18;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderEntranceMaxCountNoUser", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                int i19 = jSONObject.getInt("max_count_no_feed");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderEntranceMaxCountNoFeed", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f417689c = i19;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderEntranceMaxCountNoFeed", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                int i27 = jSONObject.getInt("max_count_normal");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderEntranceMaxCountNormal", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f417690d = i27;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderEntranceMaxCountNormal", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Improve.ToolBarUIC", "parse SnsFinderEntranceConfig fail. %s", e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        return iVar;
    }
}
