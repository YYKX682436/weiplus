package ka4;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ka4.o f387682a = new ka4.o();

    /* renamed from: b, reason: collision with root package name */
    public static int f387683b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static long f387684c;

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        boolean b17 = b();
        int c17 = c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getOptionEnable >> " + f387683b + ", " + c17);
        boolean z17 = b17 && c17 != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return z17;
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getServerOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f387684c >= 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getOptionEnable is time to update");
            f387684c = currentTimeMillis;
            f387683b = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_BIT_RATE_MODE_INT, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getServerOptionEnable >> " + f387683b);
        boolean z17 = f387683b == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getServerOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return z17;
    }

    public final int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoOptionLocalConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_VDIEO_DOWNLOAD_INT_SYNC, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getVideoOptionLocalConfig >> " + r17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoOptionLocalConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        if (r17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            return r17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_switch_video_enable_v2, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getVideoOptionConfig >> " + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return Ni;
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_small_win_video_enable_v2, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return fj6;
    }
}
