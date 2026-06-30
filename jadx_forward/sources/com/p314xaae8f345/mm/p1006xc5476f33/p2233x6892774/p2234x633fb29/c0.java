package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static db5.d5 f253306a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f253307b = {"_id", "_begin_time", "_end_time", "_mode", "_steps"};

    /* renamed from: c, reason: collision with root package name */
    public static final android.net.Uri f253308c = android.net.Uri.parse("content://com.miui.providers.steps/item");

    public static boolean a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (fp.h.a(19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support SDK VERSION");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.w.f253349a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.w.f253349a = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter"));
        }
        java.lang.Boolean bool = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.w.f253349a;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support FEATURE_SENSOR_STEP_COUNTER");
            return false;
        }
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.w.f253350b == null) {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.w.f253350b = java.lang.Boolean.valueOf(((android.hardware.SensorManager) systemService).getDefaultSensor(19) != null);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.w.f253350b, bool2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support can not get sensor");
                return false;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optInt("deviceStepSwitch") == 1) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support deviceStepSwitch is off");
            return false;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support can not get sensor Exception");
            return false;
        }
    }

    public static boolean b() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optInt("extStepApiSwitch") == 1) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportUtil", "Not Support extStepApiSwitch is off");
        return false;
    }

    public static boolean c(long j17, long j18) {
        if (j17 == 0 && j18 > 0) {
            return true;
        }
        int i17 = 500;
        try {
            org.json.JSONObject optJSONObject = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optJSONObject("stepCountUploadConfig");
            if (optJSONObject != null) {
                i17 = optJSONObject.optInt("backgroundStepCountInterval", 500);
            }
        } catch (java.lang.Exception unused) {
        }
        return j18 - j17 >= ((long) i17);
    }

    public static boolean d(long j17, long j18) {
        long j19 = 3600000;
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().optJSONObject("stepCountUploadConfig") != null) {
                j19 = r2.optInt("backgroundTimeInterval", 60) * 60 * 1000;
            }
        } catch (java.lang.Exception unused) {
        }
        return j18 - j17 >= j19;
    }

    public static boolean e() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
        boolean r27 = n17 != null ? n17.r2() : false;
        if (!r27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportUtil", "checkUserInstallWeSportPlugin %b", java.lang.Boolean.valueOf(r27));
        }
        return r27;
    }

    public static final java.lang.String f(long j17) {
        return new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).format(new java.util.Date(j17));
    }

    public static long g() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(c01.id.c());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
