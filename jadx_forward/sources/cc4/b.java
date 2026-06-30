package cc4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cc4.b f122015a = new cc4.b();

    /* renamed from: b, reason: collision with root package name */
    public static int f122016b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static long f122017c;

    public final boolean a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrowseEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        if (d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            z17 = true;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarConfig", "getBrowseEntrance >> " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrowseEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }

    public final boolean b() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSettingEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        if (d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            z17 = true;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarConfig", "getSettingEntrance >> " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSettingEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStarEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        boolean z17 = b() || a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStarEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarServerEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f122017c >= 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarConfig", "getStarServerEnable is time to update");
            f122017c = currentTimeMillis;
            f122016b = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SERVER_STAR_ENABLE_INT, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarConfig", "getStarServerEnable >> " + f122016b);
        boolean z17 = f122016b == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarServerEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }
}
