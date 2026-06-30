package ez1;

/* loaded from: classes13.dex */
public final class g extends dz1.a {

    /* renamed from: m, reason: collision with root package name */
    public static int f339374m;

    /* renamed from: n, reason: collision with root package name */
    public static java.util.List f339375n;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f339378q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f339379r;

    /* renamed from: s, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f339380s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f339381t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f339382u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f339383v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f339384w;

    /* renamed from: x, reason: collision with root package name */
    public static long f339385x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.app.C13183x45aeaaf2 f339386y;

    /* renamed from: z, reason: collision with root package name */
    public static final ez1.e f339387z;

    /* renamed from: i, reason: collision with root package name */
    public static final ez1.g f339373i = new ez1.g();

    /* renamed from: o, reason: collision with root package name */
    public static final uz1.a f339376o = new uz1.a();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.List f339377p = new java.util.ArrayList();

    /* JADX WARN: Type inference failed for: r0v7, types: [com.tencent.mm.plugin.datareport.monitor.adapter.app.AppEventMonitor$mScreenReceiver$1] */
    static {
        nm5.j.c(0L, 0);
        nm5.j.c(0L, 0);
        f339383v = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        f339385x = 300L;
        f339386y = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.app.AppEventMonitor$mScreenReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (intent == null) {
                    return;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.SCREEN_ON", intent.getAction())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[onReceive] ACTION_SCREEN_ON");
                    ez1.g.f339381t = true;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.intent.action.SCREEN_OFF", intent.getAction())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[onReceive] ACTION_SCREEN_OFF");
                    ez1.g.f339382u = true;
                }
            }
        };
        f339387z = new ez1.e();
    }

    public final void P(ez1.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.List list = f339377p;
        synchronized (list) {
            if (!((java.util.ArrayList) list).contains(aVar)) {
                ((java.util.ArrayList) list).add(aVar);
            }
        }
        if (f339378q) {
            aVar.Na(java.lang.System.currentTimeMillis(), false, null);
        }
    }

    public final void Q(long j17, android.app.Activity activity) {
        if (f339378q || !cy1.a.Ui().oj()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[appIn] time : " + f339383v.format(new java.util.Date(j17)) + ", processName: " + bm5.f1.a());
        java.util.List list = f339377p;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((ez1.a) it.next()).Na(j17, f339381t, null);
            }
        }
        f339378q = true;
        f339381t = false;
        f339382u = false;
    }

    public final void R(long j17, android.app.Activity activity) {
        if (f339378q && cy1.a.Ui().oj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[appOut] time : " + f339383v.format(new java.util.Date(j17)) + ", processName: " + bm5.f1.a());
            java.util.List list = f339377p;
            synchronized (list) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((ez1.a) it.next()).b7(j17, f339382u, null);
                }
            }
            f339378q = false;
            f339381t = false;
            f339382u = false;
        }
    }

    public final void S() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && f339384w && u46.l.c(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_data_report_check_op_appinout", "0"), "1")) {
            long j17 = f339385x;
            if (j17 < 3000) {
                f339385x = j17 + 300;
            }
            if (V().getBoolean("mmkv_key_is_op_sa", false)) {
                W();
                f339385x = 300L;
            }
            sz1.i.d(ez1.d.f339371d, f339385x);
            sz1.i.e(null).mo50305x3d8a09a2(1004);
        }
    }

    public final boolean T(long j17, boolean z17) {
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        uz1.a aVar = f339376o;
        if (n17) {
            if (aVar.m170826x35e001() > 0 && ((!V().getBoolean("mmkv_key_is_op_sa", false) || !z17) && f339374m == 0)) {
                Q(j17, null);
                return true;
            }
        } else if (aVar.m170826x35e001() > 0 && !V().getBoolean("mmkv_key_is_mp_sa", false)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && cy1.a.Ui().oj()) {
                java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
                java.lang.String str = string != null ? string : "";
                V().putString("mmkv_key_op_app_inout_time", str + ',' + j17);
                f339378q = true;
            }
            return true;
        }
        return false;
    }

    public final boolean U(long j17) {
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        uz1.a aVar = f339376o;
        if (n17) {
            if (aVar.m170826x35e001() == 0 && !V().getBoolean("mmkv_key_is_op_sa", false) && j17 > V().getLong("mmkv_key_op_last_stop_time", 0L) && f339374m == 0) {
                R(j17, null);
                return true;
            }
        } else if (aVar.m170826x35e001() == 0 && !V().getBoolean("mmkv_key_is_mp_sa", false) && j17 > V().getLong("mmkv_key_mp_last_stop_time", 0L)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && cy1.a.Ui().oj()) {
                java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
                java.lang.String str = string != null ? string : "";
                V().putString("mmkv_key_op_app_inout_time", str + ';' + j17);
                f339378q = false;
            }
            return true;
        }
        return false;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 V() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f339380s;
        if (o4Var != null) {
            return o4Var;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_key_app_event_monitor");
        f339380s = M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "apply(...)");
        return M;
    }

    public final void W() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
            java.lang.String str = string == null ? "" : string;
            V().putString("mmkv_key_op_app_inout_time", "");
            if (u46.l.e(str)) {
                return;
            }
            try {
                int i17 = 0;
                for (java.lang.String str2 : (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                    if (i17 > 100) {
                        return;
                    }
                    i17++;
                    if (!u46.l.e(str2)) {
                        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
                        if (strArr.length > 0 && !u46.l.e(strArr[0])) {
                            long parseLong = java.lang.Long.parseLong(strArr[0]);
                            if (f339374m == 0) {
                                R(parseLong, null);
                            }
                        }
                        if (strArr.length > 1 && !u46.l.e(strArr[1])) {
                            long parseLong2 = java.lang.Long.parseLong(strArr[1]);
                            if (f339374m == 0) {
                                Q(parseLong2, null);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final boolean X(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        if (f339375n == null) {
            f339375n = new java.util.ArrayList();
            java.lang.String Zi = h62.d.vj().Zi(e42.c0.clicfg_data_report_app_event_filter_activity, "WeChatSplashActivity|FinderMultiTaskRouterUI", true);
            if (!u46.l.e(Zi)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
                for (java.lang.String str : (java.lang.String[]) r26.n0.f0(Zi, new java.lang.String[]{"|"}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                    java.util.List list = f339375n;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                    list.add(str);
                }
            }
        }
        java.util.List list2 = f339375n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        return list2.contains(activity.getClass().getSimpleName());
    }

    public final void Y(ez1.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.List list = f339377p;
        synchronized (list) {
            ((java.util.ArrayList) list).remove(aVar);
        }
    }

    public final void Z() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 V = V();
            uz1.a aVar = f339376o;
            V.putBoolean("mmkv_key_is_mp_sa", aVar.m170826x35e001() > 0);
            if (aVar.m170826x35e001() > 0) {
                f339384w = false;
            } else {
                f339384w = true;
                S();
            }
        }
    }

    @Override // dz1.a, mz1.c
    /* renamed from: onActivityPaused */
    public void mo54636x99a658dc(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // dz1.a, mz1.c
    /* renamed from: onActivityResumed */
    public void mo54651xba973e9(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[onActivityResumed] activity : ".concat(activity.getClass().getSimpleName()));
        if (!X(activity) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !f339378q) {
            uz1.a aVar = f339376o;
            if (!aVar.m170825xde2d761f(activity)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[activityResumed] activity : " + activity.getClass().getSimpleName() + ", mStartedActivities : " + aVar.m170826x35e001());
                mo54653x59297693(activity);
            }
        }
        new java.lang.ref.WeakReference(activity);
    }

    @Override // dz1.a, mz1.c
    /* renamed from: onActivityStarted */
    public void mo54653x59297693(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        nm5.j.c(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(activity.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[onActivityStarted] activity : ".concat(activity.getClass().getSimpleName()));
        if (X(activity)) {
            return;
        }
        f339379r = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[activityStarted] activity : ");
        sb6.append(activity.getClass().getSimpleName());
        sb6.append(", mStartedActivities : ");
        uz1.a aVar = f339376o;
        sb6.append(aVar.m170826x35e001());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", sb6.toString());
        aVar.add(activity);
        java.lang.String string = V().getString("mmkv_key_op_app_inout_time", "");
        java.lang.String str = string == null ? "" : string;
        boolean D = str.length() == 0 ? true : r26.n0.D((java.lang.CharSequence) kz5.z.f0(r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0])), ",", false, 2, null);
        W();
        if (!T(currentTimeMillis, D)) {
            sz1.i.d(new ez1.b(currentTimeMillis), 300L);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            V().putBoolean("mmkv_key_is_op_sa", false);
        } else {
            V().putBoolean("mmkv_key_is_op_sa", aVar.m170826x35e001() > 0);
        }
        Z();
    }

    @Override // dz1.a, mz1.c
    /* renamed from: onActivityStopped */
    public void mo54654x59edc7df(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        nm5.j.c(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(activity.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[onActivityStopped] activity : ".concat(activity.getClass().getSimpleName()));
        if (X(activity)) {
            return;
        }
        f339379r = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[activityStopped] activity : ");
        sb6.append(activity.getClass().getSimpleName());
        sb6.append(", mStartedActivities : ");
        uz1.a aVar = f339376o;
        sb6.append(aVar.m170826x35e001());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", sb6.toString());
        aVar.e(activity);
        if (!U(currentTimeMillis)) {
            sz1.i.d(new ez1.c(currentTimeMillis), 300L);
        }
        Z();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            V().putLong("mmkv_key_mp_last_stop_time", currentTimeMillis);
        } else {
            V().putLong("mmkv_key_op_last_stop_time", currentTimeMillis);
        }
    }
}
