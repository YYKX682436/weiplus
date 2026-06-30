package i64;

/* loaded from: classes4.dex */
public class b1 {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.Set f370618z;

    /* renamed from: j, reason: collision with root package name */
    public final int f370628j;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Activity f370632n;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f370636r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f370637s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f370638t;

    /* renamed from: u, reason: collision with root package name */
    public final i64.v f370639u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f370640v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f370641w;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f370619a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f370620b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f370621c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f370622d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f370623e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f370624f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f370625g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f370626h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f370627i = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f370629k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public int f370630l = 0;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f370631m = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f370633o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f370634p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f370635q = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public int f370642x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f370643y = false;

    static {
        new java.util.HashMap();
        f370618z = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    public b1(android.app.Activity activity, int i17) {
        this.f370628j = 0;
        this.f370636r = false;
        this.f370637s = false;
        this.f370640v = true;
        this.f370641w = true;
        this.f370628j = i17;
        this.f370632n = activity;
        try {
            boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5;
            this.f370636r = z17;
            boolean k17 = k();
            this.f370637s = k17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "init, isImproveTimeLineUI=" + z17 + ", isEnableFreqLimit=" + k17 + ", source=" + i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "SnsAdStatistic, exp=" + th6);
        }
        try {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f370639u = new i64.v();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "init devInfo, cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "SnsAdStatistic, devInfo exp=" + th7);
        }
        if (i17 == 0) {
            java.lang.String O = ca4.m0.O();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            O = O == null ? "" : O;
            this.f370638t = O;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "timelineSessionId=".concat(O));
        }
        boolean z27 = ca4.m0.u0(e42.c0.clicfg_ad_enable_cache_exposure_count, 1) == 1;
        this.f370640v = z27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExposureCountCache", "init, isExpCacheExposureCount=" + z27);
        if (!z27) {
            java.util.Map map = i64.z0.f370916a;
            synchronized (i64.z0.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                ((java.util.HashMap) i64.z0.f370916a).clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExposureCountCache", "clear");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            }
        }
        boolean z28 = ca4.m0.u0(e42.c0.clicfg_ad_exposure_report_check_video_type, 1) == 1;
        this.f370641w = z28;
        if (!z28) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2023, 44);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "init, isCheckVideoType=" + z28);
    }

    public static boolean k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableFreqLimit", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_enable_report_freq_limit, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "is expt enableFreqLimit=" + Ni);
        boolean z17 = Ni > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableFreqLimit", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return z17;
    }

    public void A(long j17, int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = this.f370625g;
        i64.c1 c1Var = map.containsKey(valueOf) ? (i64.c1) map.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
        ca4.z0.t0(j17);
        if (i17 > 0) {
            c1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDuration", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            c1Var.f370654i.f379445d = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDuration", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        }
        c1Var.f370647b = z17 ? 1 : 0;
        map.put(java.lang.Long.valueOf(j17), c1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void a(java.lang.String str, i64.k0 k0Var) {
        java.util.Map map = this.f370626h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (k0Var != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "addAdRemovedListener exp= " + th6.toString());
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                if (map.containsKey(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "may put a new Listener by " + str);
                }
                map.put(str, k0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.r0(this, j17, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void c(long j17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addLikeTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.util.Map map = this.f370633o;
        if (((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            i17 = ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17))).intValue();
        } else {
            i17 = 0;
        }
        ((java.util.HashMap) map).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17 + 1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addLikeTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void d(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.t0(this, j17, j18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "-checkAd, isScroolIdle=" + z17);
        java.util.Iterator it = ((java.util.HashMap) this.f370623e).entrySet().iterator();
        while (it.hasNext()) {
            i64.d0 d0Var = (i64.d0) ((java.util.Map.Entry) it.next()).getValue();
            if (d0Var != null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
                d0Var.a(z17);
                java.lang.String str = d0Var.G;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    java.util.HashMap hashMap = (java.util.HashMap) this.f370627i;
                    if (hashMap.get(str) != null) {
                        i64.a1 a1Var = (i64.a1) hashMap.get(str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        boolean z18 = d0Var.F == 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z18 && a1Var.f370605h == 0) {
                            a1Var.f370605h = android.os.SystemClock.elapsedRealtime();
                        } else if (!z18) {
                            long j17 = a1Var.f370605h;
                            if (j17 > 0) {
                                a1Var.f370607j += android.os.SystemClock.elapsedRealtime() - j17;
                                a1Var.f370605h = 0L;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        boolean z19 = d0Var.H;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z19 && a1Var.f370609l == 0) {
                            a1Var.f370609l = android.os.SystemClock.elapsedRealtime();
                        } else if (!z19) {
                            long j18 = a1Var.f370609l;
                            if (j18 > 0) {
                                a1Var.f370608k += android.os.SystemClock.elapsedRealtime() - j18;
                                a1Var.f370609l = 0L;
                            }
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
        if (this.f370628j == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = c17933xe8d1b226.m70356x450e1efa();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return m70356x450e1efa;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return m70346x10413e67;
    }

    public long g(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        try {
            i64.c1 c1Var = (i64.c1) this.f370625g.get(java.lang.Long.valueOf(j17));
            if (c1Var != null) {
                long j18 = c1Var.f370658m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return j18;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "getCurPlayTime exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return 0L;
    }

    public long h(java.lang.String str, int i17) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposureStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        i64.d0 d0Var = (i64.d0) ((java.util.HashMap) this.f370623e).get(str);
        if (d0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getZeroStartTime", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            j17 = d0Var.f370683r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getZeroStartTime", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        } else {
            j17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "getExposureStartTime, localId=" + str + ", clkPos=" + i17 + ", time=" + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return j17;
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
        if (this.f370628j == 2) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m70302xec4a6114 = c17933xe8d1b226.m70351xaa22b9ed().m70302xec4a6114();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return m70302xec4a6114;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m70312x94afa0a4 = c17933xe8d1b226.m70351xaa22b9ed().m70312x94afa0a4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return m70312x94afa0a4;
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
        if (this.f370628j == 2) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m70303x1b6a23e3 = c17933xe8d1b226.m70351xaa22b9ed().m70303x1b6a23e3();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return m70303x1b6a23e3;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m70313x3f7dbf73 = c17933xe8d1b226.m70351xaa22b9ed().m70313x3f7dbf73();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return m70313x3f7dbf73;
    }

    public boolean l(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOnScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        boolean contains = this.f370620b.contains(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return contains;
    }

    public boolean m(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (this.f370624f.contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0697  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r37, java.lang.String r38, boolean r39, android.view.View r40, long r41, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.b1.n(int, java.lang.String, boolean, android.view.View, long, com.tencent.mm.protocal.protobuf.SnsObject, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:78|(1:80)(2:143|(2:212|(1:261)(25:218|(1:220)(1:260)|221|(4:(1:258)(10:228|229|231|232|234|235|236|237|238|239)|240|(1:242)(1:245)|243)(1:259)|244|82|(1:84)(1:142)|85|(1:87)(1:141)|88|(1:90)(1:140)|(1:92)|93|(2:95|(1:97))|(1:103)|104|(3:108|(1:110)(1:112)|111)|113|114|115|(1:117)|119|7e1|132|133))(20:147|(1:149)(2:150|(1:152)(2:153|(1:155)(2:156|(1:158)(2:159|(5:161|(1:174)(1:165)|166|(1:(1:169))(2:(1:172)|173)|170)(3:175|(2:191|(5:197|(1:211)(1:201)|202|(2:(1:205)|206)(2:(1:209)|210)|207))(1:(3:186|(1:188)|189))|190)))))|82|(0)(0)|85|(0)(0)|88|(0)(0)|(0)|93|(0)|(3:99|101|103)|104|(4:106|108|(0)(0)|111)|113|114|115|(0)|119|7e1))|81|82|(0)(0)|85|(0)(0)|88|(0)(0)|(0)|93|(0)|(0)|104|(0)|113|114|115|(0)|119|7e1) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x079b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x079c, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "callSnsAdRemovedListener exp= " + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0797 A[Catch: all -> 0x079b, TRY_LEAVE, TryCatch #3 {all -> 0x079b, blocks: (B:115:0x078d, B:117:0x0797), top: B:114:0x078d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0715  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r41, java.lang.String r42, long r43, int r45) {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.b1.o(int, java.lang.String, long, int):void");
    }

    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.util.Map map = this.f370627i;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            i64.a1 a1Var = (i64.a1) ((java.util.HashMap) map).get(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "onPause Key " + str);
            long j17 = a1Var.f370606i;
            long j18 = a1Var.f370599b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a1Var.f370606i = j17 + (android.os.SystemClock.elapsedRealtime() - j18);
            a1Var.f370599b = 0L;
            i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f370625g).get(java.lang.Long.valueOf(a1Var.f370603f));
            if (c1Var != null) {
                c1Var.b();
            }
        }
        java.util.Iterator it = ((java.util.HashMap) this.f370623e).entrySet().iterator();
        while (it.hasNext()) {
            i64.d0 d0Var = (i64.d0) ((java.util.Map.Entry) it.next()).getValue();
            if (d0Var != null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
                d0Var.a(false);
                java.lang.String str2 = d0Var.G;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((java.util.HashMap) map).get(str2) != null) {
                    i64.a1 a1Var2 = (i64.a1) ((java.util.HashMap) map).get(str2);
                    long j19 = a1Var2.f370605h;
                    if (j19 > 0) {
                        a1Var2.f370607j += android.os.SystemClock.elapsedRealtime() - j19;
                        a1Var2.f370605h = 0L;
                    }
                    long j27 = a1Var2.f370609l;
                    if (j27 > 0) {
                        a1Var2.f370608k += android.os.SystemClock.elapsedRealtime() - j27;
                        a1Var2.f370609l = 0L;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void q(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.x0(this, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashMap hashMap = (java.util.HashMap) this.f370627i;
        for (java.lang.String str : hashMap.keySet()) {
            i64.a1 a1Var = (i64.a1) hashMap.get(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "onResume Key " + str);
            a1Var.f370599b = elapsedRealtime;
            i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f370625g).get(java.lang.Long.valueOf(a1Var.f370603f));
            if (c1Var != null) {
                c1Var.c();
            }
        }
        java.util.Iterator it = ((java.util.HashMap) this.f370623e).entrySet().iterator();
        while (it.hasNext()) {
            i64.d0 d0Var = (i64.d0) ((java.util.Map.Entry) it.next()).getValue();
            if (d0Var != null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
                d0Var.a(false);
                java.lang.String str2 = d0Var.G;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && hashMap.get(str2) != null) {
                    i64.a1 a1Var2 = (i64.a1) hashMap.get(str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    boolean z18 = d0Var.F == 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    if (z18) {
                        a1Var2.f370605h = android.os.SystemClock.elapsedRealtime();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    boolean z19 = d0Var.H;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    if (z19) {
                        a1Var2.f370609l = android.os.SystemClock.elapsedRealtime();
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void s(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.w0(this, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public final void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "preloadOnScrollIdle, size=" + this.f370634p.size());
        for (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 : this.f370634p.values()) {
            java.lang.String y07 = ca4.z0.y0(c17933xe8d1b226);
            if (!android.text.TextUtils.isEmpty(y07) && !this.f370635q.contains(y07)) {
                android.app.Activity activity = this.f370632n;
                int i17 = this.f370628j;
                m64.h hVar = m64.h.f405932a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                if (c17933xe8d1b226 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineAdExposurePreloader", "doPreloadOnScrollIdle, id=" + y07);
                    if (m64.h.f405932a.a(activity)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPreload", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                        ((ku5.t0) ku5.t0.f394148d).g(new p44.v(c17933xe8d1b226));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPreload", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                        m64.e eVar = m64.e.f405926a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        if (activity == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        } else if (ca4.m0.u0(e42.c0.clicfg_ad_preload_vangogh_canvas, 0) != 1) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        } else {
                            ((ku5.t0) ku5.t0.f394148d).g(new m64.d(activity, c17933xe8d1b226));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClickInfoPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                        if (activity == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickInfoPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                        } else {
                            ((ku5.t0) ku5.t0.f394148d).g(new m64.f(activity, c17933xe8d1b226, i17));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickInfoPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                    }
                }
                this.f370635q.add(y07);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public i64.k0 u(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return null;
            }
            i64.k0 k0Var = (i64.k0) ((java.util.HashMap) this.f370626h).remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return k0Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdStatistic", "removeAdRemovedListener exp= " + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
    }

    public void v(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.y0(this, j17, j18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void w(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.u0(this, j17, j18, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void x(long j17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i64.s0(this, j17, i17, z17, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void y(long j17, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = this.f370625g;
        i64.c1 c1Var = map.containsKey(valueOf) ? (i64.c1) map.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
        if (z17) {
            c1Var.f370654i.f379446e = 2;
        } else {
            c1Var.f370654i.f379446e = 1;
        }
        c1Var.f370654i.f379447f = i17;
        map.put(java.lang.Long.valueOf(j17), c1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void z(long j17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        A(j17, i17, z17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }
}
