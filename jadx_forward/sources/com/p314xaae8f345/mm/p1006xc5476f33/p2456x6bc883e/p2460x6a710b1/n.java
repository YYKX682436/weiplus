package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* loaded from: classes8.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f270035b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f270034a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f270036c = new java.util.HashSet();

    public static void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a aVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = 1001;
        c19540x47e34072.f269882q = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.l(c19540x47e34072, aVar));
        } else {
            c19540x47e34072.f269883r = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.m(currentTimeMillis, aVar, c19540x47e34072);
            c19540x47e34072.d();
        }
    }

    public static boolean b(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m() && r6Var.y()) {
                return true;
            }
            r6Var.J();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        return kk.k.g((str + "_" + str2).getBytes());
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d() {
        if (f270035b == null) {
            synchronized (f270034a) {
                if (f270035b == null) {
                    f270035b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("WebviewCache#WorkerThread");
                }
            }
        }
        return f270035b;
    }

    public static boolean e(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                if (runningAppProcessInfo.processName.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                    return true;
                }
                if (runningAppProcessInfo.processName.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":tools")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kh0.i.a(str))) {
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences != null && sharedPreferences.getBoolean("disable_we_pkg", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUtil", "disable wepkg");
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, kh0.i.a(str), null, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(11));
            return false;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.a()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUtil", "config wepkg disable");
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", str, kh0.i.a(str), null, 0L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(12));
        return false;
    }
}
