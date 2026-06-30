package kn4;

/* loaded from: classes12.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p552xbf8d97c1.p589xc06221fd.C4718x22597b70 f391293a = null;

    /* renamed from: b, reason: collision with root package name */
    public static nj.a f391294b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f391295c = false;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f391296d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f391297e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final java.text.DateFormat f391298f = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.CHINA);

    /* renamed from: g, reason: collision with root package name */
    public static long f391299g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f391300h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f391301i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f391302j;

    /* renamed from: k, reason: collision with root package name */
    public static int f391303k;

    /* renamed from: l, reason: collision with root package name */
    public static long f391304l;

    /* renamed from: m, reason: collision with root package name */
    public static long f391305m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f391306n;

    static {
        boolean m40092xb9aa8b5f;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        f391301i = m40092xb9aa8b5f;
        f391302j = false;
        f391303k = 0;
        f391304l = 0L;
        f391305m = 0L;
        f391306n = null;
    }

    public static void a(int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.HashMap h17 = f391293a.h(i17);
        java.lang.String str5 = "MatrixTrafficCollector";
        if (h17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "trafficInfoMap is empty, dumpTraffic type = " + i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "dumpTraffic type = %d, trafficInfoMap = %s", java.lang.Integer.valueOf(i17), h17.toString());
        java.lang.String str6 = "";
        java.lang.String str7 = "";
        long j17 = 0;
        long j18 = 0;
        for (java.util.Map.Entry entry : h17.entrySet()) {
            java.lang.String str8 = (java.lang.String) entry.getKey();
            long parseLong = java.lang.Long.parseLong((java.lang.String) entry.getValue());
            j18 += parseLong;
            if (parseLong > j17) {
                if (!(str8 != null && (str8.contains("TPDemuxer") || str8.contains("TVKDL-LServer") || str8.contains("TP-workthread")))) {
                    str7 = str8;
                    j17 = parseLong;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "getTraffic final, type = %d, theKey = %s, maxTraffic = %d", java.lang.Integer.valueOf(i17), str7, java.lang.Long.valueOf(j17));
        if (str7 == null || str7.isEmpty()) {
            return;
        }
        f391299g += j17;
        f391305m += j18;
        java.lang.String replace = h17.toString().replace(',', ';');
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (j17 >= 102400) {
            java.lang.String g17 = f391293a.g(str7);
            if (f391293a.f134621h.f419328c && (str4 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.p552xbf8d97c1.p589xc06221fd.C4718x22597b70.f134620m).get(str7)) != null && !str4.isEmpty()) {
                str6 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.p552xbf8d97c1.p589xc06221fd.C4718x22597b70.f134619i).get(str4);
            }
            sb6.append(g17);
            sb6.append(" \n ");
            sb6.append(str6);
            java.lang.String[] split = g17.split("\n");
            int length = split.length;
            int i18 = 0;
            while (i18 < length) {
                java.lang.String[] split2 = split[i18].split("/");
                java.lang.String[] strArr = split;
                if (split2.length >= 2) {
                    sb7.append(split2[0]);
                    sb7.append(split2[split2.length - 1]);
                } else if (split2.length > 0) {
                    sb7.append(split2[0]);
                }
                sb7.append("\n");
                i18++;
                split = strArr;
            }
            sb7.append(str6);
        }
        java.util.Map map = null;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("webview_url_prefs_url", null);
        try {
            str = str7.substring(str7.indexOf("-") + 1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MatrixTrafficCollector", "dumpTraffic get threadName error : " + th6.getMessage());
            str = str7;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "theKey = %s, maxTraffic = %d, sumTraffic = %d, evilStackTrace = %s, type = %d, lastUrl = %s", str7, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), sb6, java.lang.Integer.valueOf(i17), string);
        java.lang.String a17 = bm5.f1.a();
        java.lang.String sb8 = sb7.toString();
        if (sb8.length() > 0) {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(sb8.getBytes());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "stackMd5 = " + str2);
        } else {
            str2 = "null";
        }
        if (f391301i) {
            return;
        }
        if (kn4.d0.f391215d) {
            if (i17 == 0) {
                kn4.c0 c0Var = kn4.c0.INSTANCE;
                if (kn4.d0.f391215d) {
                    map = c0Var.a(c0Var.f391213d);
                } else {
                    c0Var.getClass();
                }
            } else {
                kn4.c0 c0Var2 = kn4.c0.INSTANCE;
                if (kn4.d0.f391215d) {
                    map = c0Var2.a(c0Var2.f391214e);
                } else {
                    c0Var2.getClass();
                }
            }
            if (map != null && map.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "cdnTrafficMap = " + map);
                long j19 = j18;
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    java.lang.String str9 = str5;
                    java.lang.String str10 = string;
                    long min = java.lang.Math.min(java.lang.Math.max(0L, j19), ((java.lang.Long) entry2.getValue()).longValue());
                    j19 -= ((java.lang.Long) entry2.getValue()).longValue();
                    if (min >= 102400) {
                        jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(min), sb6, java.lang.Integer.valueOf(i17), replace, str10, str2 + "::" + ((java.lang.String) entry2.getKey()), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    }
                    str5 = str9;
                    string = str10;
                }
                java.lang.String str11 = str5;
                java.lang.String str12 = string;
                if (j19 >= 102400) {
                    str3 = str11;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "tag=notClustered, traffic=%d\n", java.lang.Long.valueOf(j19));
                    jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(j19), sb6, java.lang.Integer.valueOf(i17), replace, str12, str2 + "::notClustered", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                } else {
                    str3 = str11;
                }
                long j27 = -j19;
                if (j27 >= 102400) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "tag=notHooked, traffic=%d\n", java.lang.Long.valueOf(j27));
                    jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(j27), sb6, java.lang.Integer.valueOf(i17), replace, str12, str2 + "::notHooked", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    return;
                }
                return;
            }
        }
        if (j17 >= 102400) {
            jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(j17), sb6, java.lang.Integer.valueOf(i17), replace, string, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        }
    }

    public static void b() {
        if (f391302j) {
            f391304l += f391305m;
            if (f391301i || !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() || (f391305m < 20971520 && f391304l < 314572800)) {
                f391303k = 0;
                f391304l = 0L;
                return;
            }
            int i17 = f391303k + 1;
            f391303k = i17;
            if (i17 >= 10) {
                jx3.f.INSTANCE.d(24883, bm5.f1.a(), "kill-self", java.lang.Long.valueOf(f391304l), f391306n, 110, f391298f.format(new java.util.Date()), com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("webview_url_prefs_url", null), java.lang.String.valueOf(f391305m), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MatrixTrafficCollector", "Try to kill self after 30s, because current process cost too much mobile traffic at background.");
                ((ku5.t0) ku5.t0.f394148d).k(new kn4.RunnableC29039x37186a(), 30000L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixTrafficCollector", "unsafeCount=%d, totalTraffic=%d, currentTraffic=%d", java.lang.Integer.valueOf(f391303k), java.lang.Long.valueOf(f391304l), java.lang.Long.valueOf(f391305m));
            if (f391303k == 1) {
                f391306n = f391298f.format(new java.util.Date());
            }
        }
    }
}
