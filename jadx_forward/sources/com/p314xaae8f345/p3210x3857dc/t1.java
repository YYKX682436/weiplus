package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f302128a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f302129b;

    public static void a() {
        android.content.SharedPreferences c17 = by5.d4.c();
        if (c17 == null) {
            by5.c4.g("XWebChildProcessMonitor", "checkSwitchToSysIfNeed, getSharedPreferencesForMultiProcess return null");
            return;
        }
        if (!c17.contains("SP_KEY_DISABLE_MULTI_PROCESS_STATE") || c17.getBoolean("SP_KEY_DISABLE_MULTI_PROCESS_STATE", false)) {
            return;
        }
        int d17 = d();
        int b17 = b();
        by5.c4.f("XWebChildProcessMonitor", "checkSwitchToSysIfNeed, configCount:" + b17 + ", currentCount:" + d17);
        if (d17 > b17) {
            by5.c4.g("XWebChildProcessMonitor", "checkSwitchToSysIfNeed, switch to sys");
            m(true, "DowngradeCrashCount");
        }
    }

    public static int b() {
        return com.p314xaae8f345.p3210x3857dc.b.m().i("child_process_crash_watch_count", "tools", 5);
    }

    public static int c() {
        return com.p314xaae8f345.p3210x3857dc.b.m().i("child_process_crash_watch_time", "tools", 1440) * 60 * 1000;
    }

    public static int d() {
        android.content.SharedPreferences c17 = by5.d4.c();
        if (c17 != null) {
            return c17.getInt(e(), 0);
        }
        return 0;
    }

    public static java.lang.String e() {
        java.lang.String str = f302129b;
        if (str != null) {
            return str;
        }
        f302129b = "SP_KEY_CHILD_PROCESS_CRASH_COUNT_" + new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        by5.c4.f("XWebChildProcessMonitor", "getCrashCountKeyForToday, crashCountKeyForToday:" + f302129b);
        android.content.SharedPreferences c17 = by5.d4.c();
        if (c17 != null) {
            for (java.lang.String str2 : c17.getAll().keySet()) {
                if (str2.startsWith("SP_KEY_CHILD_PROCESS_CRASH_COUNT_") && !f302129b.equals(str2)) {
                    c17.edit().remove(str2).apply();
                }
            }
        }
        return f302129b;
    }

    public static synchronized boolean f() {
        synchronized (com.p314xaae8f345.p3210x3857dc.t1.class) {
            android.content.SharedPreferences c17 = by5.d4.c();
            if (!org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l().equalsIgnoreCase(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464())) {
                return false;
            }
            return c17.getBoolean("SP_KEY_SWITCH_TO_SYS", false);
        }
    }

    public static boolean g() {
        android.content.SharedPreferences c17 = by5.d4.c();
        if (c17 == null || !c17.contains("SP_KEY_CHILD_PROCESS_CRASH_KEY")) {
            return false;
        }
        java.lang.String string = c17.getString("SP_KEY_CHILD_PROCESS_CRASH_KEY", "");
        java.lang.String str = "SP_KEY_CHILD_PROCESS_CRASH_VERSION_" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
        by5.c4.g("XWebChildProcessMonitor", "hasChildProcessCrash, savedVersion:" + string + ", childProcessCrashVersion:" + str);
        return string.equalsIgnoreCase(str);
    }

    public static synchronized void h() {
        synchronized (com.p314xaae8f345.p3210x3857dc.t1.class) {
            android.content.SharedPreferences c17 = by5.d4.c();
            if (c17 != null) {
                int i17 = c17.getInt(e(), 0) + 1;
                by5.c4.f("XWebChildProcessMonitor", "increaseCrashCount, new crash count:" + i17);
                c17.edit().putInt(e(), i17).apply();
                a();
            }
        }
    }

    public static synchronized void i() {
        synchronized (com.p314xaae8f345.p3210x3857dc.t1.class) {
            android.content.SharedPreferences c17 = by5.d4.c();
            if (c17 != null && by5.a1.c()) {
                by5.c4.f("XWebChildProcessMonitor", "init, remove disable multi process state & switch to sys flag");
                c17.edit().remove("SP_KEY_DISABLE_MULTI_PROCESS_STATE").apply();
                c17.edit().remove("SP_KEY_SWITCH_TO_SYS").apply();
            }
        }
    }

    public static void j(java.lang.String str) {
        android.content.SharedPreferences c17 = by5.d4.c();
        if (c17 != null) {
            c17.edit().remove("SP_KEY_CHILD_PROCESS_CRASH_KEY").apply();
            java.lang.String str2 = "SP_KEY_CHILD_PROCESS_CRASH_VERSION_" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
            if (android.text.TextUtils.isEmpty(str)) {
                str = "DowngradeChildProcessCrash";
            }
            by5.c4.g("XWebChildProcessMonitor", "recordChildProcessCrash, crashType:" + str + ", childProcessCrashVersion:" + str2);
            c17.edit().putString("SP_KEY_CHILD_PROCESS_CRASH_KEY", str2).apply();
            xx5.k.a(4, d(), b(), c(), str);
        }
    }

    public static synchronized void k(boolean z17) {
        android.content.SharedPreferences c17;
        synchronized (com.p314xaae8f345.p3210x3857dc.t1.class) {
            if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l().equalsIgnoreCase(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464()) && (c17 = by5.d4.c()) != null) {
                by5.c4.f("XWebChildProcessMonitor", "saveDisableMultiProcessStateIfNeed, value:" + z17);
                c17.edit().putBoolean("SP_KEY_DISABLE_MULTI_PROCESS_STATE", z17).apply();
            }
        }
    }

    public static void l(boolean z17) {
        android.content.SharedPreferences c17 = by5.d4.c();
        if (c17 != null) {
            by5.c4.g("XWebChildProcessMonitor", "setMaybeWxdk, flag:" + z17);
            c17.edit().putBoolean("SP_KEY_MAYBE_WXDK", z17).apply();
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.a("WXDK_USER");
        }
    }

    public static synchronized void m(boolean z17, java.lang.String str) {
        synchronized (com.p314xaae8f345.p3210x3857dc.t1.class) {
            android.content.SharedPreferences c17 = by5.d4.c();
            if (c17 != null) {
                c17.edit().putBoolean("SP_KEY_SWITCH_TO_SYS", z17).apply();
            }
            if (android.text.TextUtils.isEmpty(str)) {
                str = "DowngradeSys";
            }
            by5.c4.g("XWebChildProcessMonitor", "setShouldSwitchToSys, flag:" + z17 + ", crashType:" + str);
            if (z17) {
                xx5.k.a(3, d(), b(), c(), str);
            }
        }
    }
}
