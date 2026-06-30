package pc4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final pc4.e f434959a = new pc4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f434960b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();

    /* renamed from: c, reason: collision with root package name */
    public static int f434961c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f434962d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f434963e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f434964f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f434965g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f434966h;

    /* renamed from: i, reason: collision with root package name */
    public static long f434967i;

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enablePublishLivePhoto", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f434967i >= 600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoConfig", "checkUpdateConfig is time to update");
            f434967i = currentTimeMillis;
            f434961c = f434960b.o("SnsLivePhoto.ServerPublishConfig", 0);
            f434962d = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2539x3d0e40c6.C20351xa9ccabfe()) == 1;
            f434965g = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2539x3d0e40c6.C20353x50fd9041()) == 1;
            boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2539x3d0e40c6.C20352xa1a56e19()) == 1;
            f434963e = z17;
            if (z17 && !f434966h) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
                boolean z18 = f434961c == 0 && f434962d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
                if (z18) {
                    f434966h = true;
                    ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                    f434964f = qp.b.f447211e;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoConfig", "checkUpdateConfig >> snsLivePhotoPublishServerClose: " + f434961c + "  snsLivePhotoPublishExptConfig: " + f434962d + " snsLivePhotoCanSaveLivePhoto: " + f434965g + " snsLivePhotoCheckSysConfigExptConfig: " + f434963e + " snsLivePhotoOsSupportLivePhoto: " + f434964f + ' ');
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        boolean z19 = f434961c == 0 && f434962d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        boolean z27 = z19 && f434964f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enablePublishLivePhoto", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        return z27;
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateServerPublishConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoConfig", "updateServerPublishConfig " + i17);
        f434961c = i17;
        f434960b.A("SnsLivePhoto.ServerPublishConfig", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateServerPublishConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
    }
}
