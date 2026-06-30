package za4;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f552668b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.IntentFilter f552669c;

    /* renamed from: d, reason: collision with root package name */
    public volatile za4.f f552670d;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f552675i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f552671e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f552672f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f552673g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 f552674h = new za4.b(this);

    /* renamed from: a, reason: collision with root package name */
    public final za4.e f552667a = new za4.e(this, null);

    public k(za4.b bVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        this.f552669c = intentFilter;
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        this.f552675i = new za4.c(this, android.os.Looper.getMainLooper());
    }

    public static /* synthetic */ java.util.concurrent.ConcurrentHashMap a(za4.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = kVar.f552671e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return concurrentHashMap;
    }

    public static /* synthetic */ za4.f b(za4.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        za4.f fVar = kVar.f552670d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return fVar;
    }

    public static /* synthetic */ void c(za4.k kVar, dm.t3 t3Var, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        kVar.u(t3Var, i17, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public static void d(za4.k kVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        kVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = kVar.f552675i;
        n3Var.mo50303x856b99f0(10008);
        n3Var.mo50307xb9e94560(10008, 300000L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public static za4.k g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        za4.k kVar = za4.j.f552663a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return kVar;
    }

    public static boolean l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDisableRegisterInstallReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_disable_register_apk_install_receiver, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "isDisableRegisterInstallReceiver is " + Ni);
            boolean z17 = true;
            if (Ni != 1) {
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, z17 ? 95 : 96);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDisableRegisterInstallReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "isDisableRegisterInstallReceiver, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDisableRegisterInstallReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
    }

    public void e(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (android.text.TextUtils.isEmpty(str) || j3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "addReportInfo, but appid or apkReportInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 85);
            ca4.e0.a("ad_app_download_exp", "", 7, 1002, "appid=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "addReportInfo, appid is " + str + ", uxInfo is " + j3Var.f246813f + ", downloadScene is " + j3Var.f246819o + ", clickScene is " + j3Var.f246820p);
        this.f552672f.put(str, new za4.i(j3Var.f246811d, j3Var.f246812e, j3Var.f246813f, j3Var.f246814g, j3Var.f246815h, j3Var.f246816i, j3Var.f246817m, j3Var.f246818n, j3Var.f246819o, j3Var.f246820p));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public int f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        try {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
            if (q17 != null) {
                if (q17.f178496f == 3 && !android.text.TextUtils.isEmpty(q17.f178497g) && com.p314xaae8f345.mm.vfs.w6.j(q17.f178497g)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    return 3;
                }
                int i17 = q17.f178496f;
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    return 1;
                }
                if (i17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    return 2;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "getDownloadStatus, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return 0;
    }

    public za4.i h(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar.m134976x2690a4ac();
        h02.a D0 = gVar.f81913d.D0(j17);
        if (D0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0.f68430x3a1eb979)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "getReportInfo, fileDownloadInfo or field_rawAppId is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return null;
        }
        za4.i iVar = (za4.i) this.f552672f.get(D0.f68430x3a1eb979);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return iVar;
    }

    public int i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTaskProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        long j17 = q17.f178501n;
        int i17 = j17 != 0 ? (int) ((q17.f178500m * 100) / j17) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTaskProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return i17;
    }

    public boolean j(android.content.Context context, java.lang.String str, java.lang.String str2, za4.h hVar, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        if (q17 == null || q17.f178496f != 3 || android.text.TextUtils.isEmpty(q17.f178497g)) {
            if (q17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "installApp, downloadtaskinfo==null-3, op=4, appid=" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 79);
                ca4.e0.a("ad_app_download_exp", "", 5, 1001, "appid=" + str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "installApp, info error and id=" + q17.f178494d + ", appid=" + q17.f178499i + ", status=" + q17.f178496f + ", downloadSize=" + q17.f178500m + ", url=" + q17.f178495e);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        long j17 = q17.f178494d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar.m134976x2690a4ac();
        u(gVar.f81913d.D0(j17), 4, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        long j18 = q17.f178494d;
        za4.g gVar2 = new za4.g(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar3 = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar3.m134976x2690a4ac();
        r(gVar3.f81913d.D0(j18), 4001010, j18, gVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.lang.String str4 = q17.f178495e;
        yb0.a.f542145a.a(str4, str3);
        yb0.b.a(q17.f178497g, str4);
        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
        java.lang.String str5 = q17.f178497g;
        ((yb0.c) yVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(context, str5, null, false);
        p(str2, hVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return true;
    }

    public boolean k(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isApkExist", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        boolean z17 = q17 != null && q17.f178496f == 3 && !android.text.TextUtils.isEmpty(q17.f178497g) && com.p314xaae8f345.mm.vfs.w6.j(q17.f178497g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isApkExist", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return z17;
    }

    public boolean m(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        boolean b17 = ik1.b.b(context, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return b17;
    }

    public boolean n(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseTaskByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        long o17 = o(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        boolean o18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(o17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseTaskByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return o18;
    }

    public long o(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryIdByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        long j17 = q17 != null ? q17.f178494d : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryIdByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return j17;
    }

    public final void p(java.lang.String str, za4.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerInstallCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (hVar != null) {
            if (l()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdDownloadApkMgr", "registerInstallCallback, but disable register installReceiver");
            } else {
                this.f552671e.put(str, hVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdDownloadApkMgr", "register package receiver");
                if (!this.f552668b) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f552667a, this.f552669c);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "register package receiver, exp=" + e17.toString());
                    }
                }
                this.f552668b = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f552675i;
            n3Var.mo50303x856b99f0(10008);
            n3Var.mo50307xb9e94560(10008, 300000L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerInstallCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void q(int i17, java.lang.String str, za4.g gVar) {
        int i18;
        int i19;
        java.lang.String str2;
        java.lang.String str3;
        ca4.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar2 = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar2.m134976x2690a4ac();
        if (gVar2.f81913d.z0(str) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "fileDownloadInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        za4.i iVar = (za4.i) this.f552672f.get(str);
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        java.lang.String str4 = iVar.f552646f;
        java.lang.String str5 = iVar.f552647g;
        int i27 = iVar.f552648h;
        java.lang.String str6 = iVar.f552649i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        java.lang.String str7 = iVar.f552644d;
        java.lang.String a17 = iVar.a();
        java.lang.String str8 = iVar.f552650m;
        int i28 = iVar.f552651n;
        int i29 = iVar.f552652o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        if (i17 != 4001011) {
            str3 = "reportConversionDownloadInfo";
        } else {
            if (gVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                i18 = (int) (java.lang.System.currentTimeMillis() - iVar.f552654q);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                i19 = gVar.f552613a;
            } else {
                i18 = 0;
                i19 = 0;
            }
            java.util.ArrayList arrayList = l44.z.f397961a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                fVar = new ca4.f();
                str2 = "reportConversionDownloadInfo";
            } catch (java.lang.Throwable th6) {
                th = th6;
                str2 = "reportConversionDownloadInfo";
            }
            try {
                fVar.m(4001011);
                fVar.o(str4);
                fVar.f(str5);
                fVar.l(i27);
                fVar.c(str6);
                fVar.p(str7);
                fVar.n(a17);
                fVar.q(str8);
                fVar.k(i29);
                fVar.e(i28);
                fVar.b(i19);
                fVar.g(i18);
                a84.t0.a(fVar.a());
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallComplete, exp is " + th.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                str3 = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            str3 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void r(dm.t3 t3Var, int i17, long j17, za4.g gVar) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (t3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t3Var.f68430x3a1eb979)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "fileDownloadInfo or field_rawAppId is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        za4.i iVar = (za4.i) this.f552672f.get(t3Var.f68430x3a1eb979);
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid = " + t3Var.f68430x3a1eb979);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        java.lang.String a17 = iVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        java.lang.String str = iVar.f552646f;
        java.lang.String str2 = iVar.f552644d;
        java.lang.String str3 = iVar.f552647g;
        int i19 = iVar.f552648h;
        java.lang.String str4 = iVar.f552649i;
        java.lang.String str5 = iVar.f552650m;
        int i27 = iVar.f552651n;
        int i28 = iVar.f552652o;
        switch (i17) {
            case 4001001:
                java.util.ArrayList arrayList = l44.z.f397961a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar = new ca4.f();
                    fVar.m(4001001);
                    fVar.o(str);
                    fVar.f(str3);
                    fVar.l(i19);
                    fVar.c(str4);
                    fVar.p(str2);
                    fVar.n(a17);
                    fVar.q(str5);
                    fVar.k(i28);
                    fVar.e(i27);
                    a84.t0.a(fVar.a());
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportStartDownload, exp is " + th6.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001004:
                java.util.ArrayList arrayList2 = l44.z.f397961a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPauseDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar2 = new ca4.f();
                    fVar2.m(4001004);
                    fVar2.o(str);
                    fVar2.f(str3);
                    fVar2.l(i19);
                    fVar2.c(str4);
                    fVar2.p(str2);
                    fVar2.n(a17);
                    fVar2.q(str5);
                    fVar2.k(i28);
                    fVar2.e(i27);
                    fVar2.b(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    fVar2.f121418n = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    a84.t0.a(fVar2.a());
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportPauseDownload, exp is " + th7.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPauseDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001005:
                java.util.ArrayList arrayList3 = l44.z.f397961a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportResumeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar3 = new ca4.f();
                    fVar3.m(4001005);
                    fVar3.o(str);
                    fVar3.f(str3);
                    fVar3.l(i19);
                    fVar3.c(str4);
                    fVar3.p(str2);
                    fVar3.n(a17);
                    fVar3.q(str5);
                    fVar3.k(i28);
                    fVar3.e(i27);
                    fVar3.b(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    fVar3.f121418n = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    a84.t0.a(fVar3.a());
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportResumeDownload, exp is " + th8.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportResumeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001006:
                java.util.ArrayList arrayList4 = l44.z.f397961a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDownloadFailed", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar4 = new ca4.f();
                    fVar4.m(4001006);
                    fVar4.o(str);
                    fVar4.f(str3);
                    fVar4.l(i19);
                    fVar4.c(str4);
                    fVar4.p(str2);
                    fVar4.n(a17);
                    fVar4.q(str5);
                    fVar4.k(i28);
                    fVar4.e(i27);
                    a84.t0.a(fVar4.a());
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDownloadFailed, exp is " + th9.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadFailed", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001009:
                java.util.ArrayList arrayList5 = l44.z.f397961a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDownloadComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar5 = new ca4.f();
                    fVar5.m(4001009);
                    fVar5.o(str);
                    fVar5.f(str3);
                    fVar5.l(i19);
                    fVar5.c(str4);
                    fVar5.p(str2);
                    fVar5.n(a17);
                    fVar5.q(str5);
                    fVar5.k(i28);
                    fVar5.e(i27);
                    a84.t0.a(fVar5.a());
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDownloadComplete, exp is " + th10.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001010:
                if (gVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    i18 = gVar.f552613a;
                } else {
                    i18 = 0;
                }
                iVar.f552654q = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList6 = l44.z.f397961a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInstallStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar6 = new ca4.f();
                    fVar6.m(4001010);
                    fVar6.o(str);
                    fVar6.f(str3);
                    fVar6.l(i19);
                    fVar6.c(str4);
                    fVar6.p(str2);
                    fVar6.n(a17);
                    fVar6.q(str5);
                    fVar6.k(i28);
                    fVar6.e(i27);
                    fVar6.b(i18);
                    a84.t0.a(fVar6.a());
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportInstallStart, exp is " + th11.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInstallStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void s(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, appId is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 86);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
        gVar.m134976x2690a4ac();
        h02.a z07 = gVar.f81913d.z0(str);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, downloadinfo==null-2, appId=" + str + ", op=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1958, 78);
            g0Var.A(1958, 87);
            ca4.e0.a("ad_app_download_exp", "", 2, i17, "appId=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        if (i17 == 2 && z07.f68414xf4f8adf4 == 2) {
            java.lang.String str2 = z07.f68411x238eb002;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteTempApkFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "deleteTempApkFile, url is " + str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteTempApkFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            } else {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().f(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteTempApkFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            }
        }
        t(i17, str, z07.f68429xa1e9e82c, z07.f68426x4b6e68b9, z07.f68411x238eb002);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void t(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String sb6;
        int i18;
        java.lang.String str5 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.lang.System.currentTimeMillis();
        za4.i iVar = (za4.i) this.f552672f.get(str);
        java.lang.String str6 = "";
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, reportInfo is null, appid=" + str + ", op=" + i17 + ", pkg=" + str5);
            if (i17 == 9) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 75);
                ca4.e0.a("ad_app_download_exp", "", 3, i17, "appId=" + str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 76);
                ca4.e0.a("ad_app_download_exp", "", 4, i17, "appId=" + str);
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            str5 = str5.replaceAll("\\.", "_");
        }
        if (iVar == null) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            sb7.append(iVar.f552644d);
            sb7.append(".");
            sb7.append(iVar.a());
            sb7.append(".");
            sb7.append(str5);
            sb7.append(".0.20.0");
            sb6 = sb7.toString();
        }
        if (iVar != null && (i18 = iVar.f552653p) != 0) {
            sb6 = sb6 + "." + i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, op=" + i17 + ", downloadScene=" + iVar.f552652o + ", autoDownload=" + iVar.f552651n + ", clickScene=" + i18);
        } else if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo but reportInfo is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, reportInfo is not null but clickScene is " + iVar.f552653p);
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = str4;
        objArr[3] = sb6;
        objArr[4] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            str6 = iVar.f552646f;
        }
        objArr[5] = str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < 6; i19++) {
            sb8.append(java.lang.String.valueOf(objArr[i19]));
            if (i19 != 5) {
                sb8.append(',');
            }
        }
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo %d  %s", 14542, sb9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.f(14542, sb9, true, false);
        int i27 = -1;
        java.lang.String str7 = "appId=" + str + "|op=" + i17 + "|exprValue=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_apk_clickid_inject_android, -1);
        if (iVar != null) {
            str7 = str7 + "|traceId=" + iVar.a() + "|downloadScene=" + iVar.f552652o + "|autoDownload=" + iVar.f552651n + "|clickScene=" + iVar.f552653p;
        }
        ca4.e0.a("ad_app_download_op_report", "0", 0, i17, str7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report14542ForIdkey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        switch (i17) {
            case 1:
                i27 = 65;
                break;
            case 2:
                i27 = 66;
                break;
            case 3:
                i27 = 67;
                break;
            case 4:
                i27 = 68;
                break;
            case 5:
                i27 = 69;
                break;
            case 6:
                i27 = 70;
                break;
            case 7:
                i27 = 71;
                break;
            case 8:
                i27 = 72;
                break;
            case 9:
                i27 = 73;
                break;
        }
        if (i27 > 0) {
            g0Var.A(1958, i27);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report14542ForIdkey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public final void u(dm.t3 t3Var, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (t3Var != null) {
            s(i17, t3Var.f68430x3a1eb979);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, downloadinfo==null-1, op=" + i17 + ", id=" + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 77);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        sb6.append(j17);
        ca4.e0.a("ad_app_download_exp", "", 1, i17, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public boolean v(java.lang.String str, za4.f fVar, java.lang.String str2, boolean z17, za4.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this.f552674h);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        if (q17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdDownloadApkMgr", "resumeTask, downloadtaskinfo==null-4 and appid is " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 84);
            ca4.e0.a("ad_app_download_exp", "", 6, 1000, "appid=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        if (fVar != null) {
            this.f552670d = fVar;
        }
        this.f552672f.put(str, new za4.i(j3Var.f246811d, j3Var.f246812e, j3Var.f246813f, j3Var.f246814g, j3Var.f246815h, j3Var.f246816i, j3Var.f246817m, j3Var.f246818n, j3Var.f246819o, j3Var.f246820p));
        if (hVar != null) {
            str3 = "MicroMsg.AdDownloadApkMgr";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "resumeTask, autoInstall is " + z17 + ", packageName is " + str2);
            if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                p(str2, hVar);
            }
        } else {
            str3 = "MicroMsg.AdDownloadApkMgr";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "resumeTask, id is " + q17.f178494d + ", appid is " + str);
        yb0.a.f542145a.a(q17.f178495e, j3Var.f246812e);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        boolean w17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(q17.f178494d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return w17;
    }

    public long w(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, za4.h hVar, za4.f fVar, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var) {
        long wi6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
            aVar.f178767a = str5;
            aVar.f178770d = str2;
            aVar.f178771e = str;
            aVar.f178772f = str3;
            aVar.f178774h = str4;
            aVar.f178769c = str6;
            aVar.f178775i = 1;
            aVar.f178779m = z17;
            aVar.f178777k = 5101;
            wi6 = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, new za4.d(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
            t0Var.f178689g = str;
            t0Var.f178706x = str;
            t0Var.f178690h = str3;
            t0Var.f178687e = str4;
            t0Var.f178683a = str5;
            t0Var.f178686d = str6;
            t0Var.f178691i = z17;
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdDownloadApkMgr", "startDownload, id is " + wi6 + ", appid is " + str + ", wxAppId is " + str2 + ", pkg is " + str3 + ", fileName is " + str6 + ", downloadUrl is " + str5);
        if (fVar != null) {
            this.f552670d = fVar;
        }
        if (z17) {
            p(str3, hVar);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f552673g.put(str, java.lang.Long.valueOf(wi6));
        }
        yb0.a.f542145a.a(str5, j3Var.f246812e);
        long j17 = wi6;
        this.f552672f.put(str, new za4.i(j3Var.f246811d, j3Var.f246812e, j3Var.f246813f, j3Var.f246814g, j3Var.f246815h, j3Var.f246816i, j3Var.f246817m, j3Var.f246818n, j3Var.f246819o, j3Var.f246820p));
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this.f552674h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return j17;
    }

    public void x(java.lang.String str, za4.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (fVar != null) {
            this.f552670d = fVar;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this.f552674h);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        if (q17 != null) {
            long j17 = q17.f178494d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }
}
