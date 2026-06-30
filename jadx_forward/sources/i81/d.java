package i81;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f371089a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f371089a = hashSet;
        hashSet.add(1001);
        hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.z.f33965x366c91de));
        hashSet.add(1104);
        hashSet.add(1103);
    }

    public static boolean a() {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrandAd").o("allshowad", -1);
        if (o17 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "canAllShowAppBrandAd, command value:%s", java.lang.Integer.valueOf(o17));
            return o17 == 1;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_all_show_ad, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "canAllShowAppBrandAd, experiment value:%s", java.lang.Integer.valueOf(Ni));
        return Ni == 1;
    }

    public static boolean b() {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrandAd").o("showad", -1);
        if (o17 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "canShowAppBrandAd, command value:%s", java.lang.Integer.valueOf(o17));
            return o17 == 1;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_ad, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "canShowAppBrandAd, experiment value:%s", java.lang.Integer.valueOf(Ni));
        return Ni == 1;
    }

    public static int c() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_ad_check_block_time, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "getCheckBlockTimeThreshold, timeThreshold:%d", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public static int d() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_appbrand_ad_hot_start_timeout_interval, 1500);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "getHotStartTimeoutThreshold, timeoutThreshold:%d", java.lang.Integer.valueOf(Ni));
        return Ni;
    }
}
