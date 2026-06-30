package ma4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f406750a = 6;

    /* renamed from: b, reason: collision with root package name */
    public static int f406751b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static int f406752c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f406753d = true;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f406754e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f406755f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f406756g = 60;

    /* renamed from: h, reason: collision with root package name */
    public static int f406757h = 1200;

    /* renamed from: i, reason: collision with root package name */
    public static float f406758i = 4.0f;

    /* renamed from: j, reason: collision with root package name */
    public static float f406759j = 8.0f;

    /* renamed from: k, reason: collision with root package name */
    public static int f406760k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static int f406761l = 3;

    public static boolean a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        if (!f406753d) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_MAIN_SWITCH", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474794h) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
        } else if (r75.d.f474791e == -100) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
            r75.d.f474791e = i17;
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
            i17 = r75.d.f474791e;
        }
        int i18 = f406755f;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 == 4 && i17 != 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                        return false;
                    }
                } else if (i17 != 1 && i17 != 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    return false;
                }
            } else if (i17 != 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                return false;
            }
        } else if (i17 != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        if (!android.text.TextUtils.isEmpty(f406754e) && d11.b.a(f406754e)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_DAY_UNABLE_PRELOAD_TIME_INTERVAL %s", f406754e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        if (d(0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_MAX_PRELOAD_COUNT", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return false;
    }

    public static int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsPreloadVideoExpiredTime", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_preload_video_expired_time, 3);
        f406761l = Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsPreloadVideoExpiredTime", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return Ni;
    }

    public static int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_red_dot_preload, 1);
        f406760k = Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return Ni;
    }

    public static boolean d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        java.lang.String format = java.text.DateFormat.getDateInstance().format(new java.util.Date());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.SnsPreloadSwitch");
        java.lang.String t17 = M.t("SnsPreloadSwitch_KEY_DATE");
        if (android.text.TextUtils.isEmpty(t17) || !t17.equals(format)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreloadSwitch", "yesterday preload count:%d", java.lang.Integer.valueOf(M.n("SnsPreloadSwitch_KEY_COUNT")));
            M.D("SnsPreloadSwitch_KEY_DATE", format);
            M.A("SnsPreloadSwitch_KEY_COUNT", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
        int o17 = i17 + M.o("SnsPreloadSwitch_KEY_COUNT", 0);
        if (o17 >= f406752c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        M.A("SnsPreloadSwitch_KEY_COUNT", o17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return true;
    }
}
