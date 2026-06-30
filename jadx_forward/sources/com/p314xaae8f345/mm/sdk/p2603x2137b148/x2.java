package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f274604a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f274605b = "com.tencent.mm";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f274606c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f274607d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile android.content.res.Resources f274608e;

    /* renamed from: f, reason: collision with root package name */
    public static android.app.ActivityManager f274609f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f274610g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f274611h = {-1};

    public static int a(int i17) {
        return b3.l.m9702x7444d5ad(f274604a, i17);
    }

    public static android.content.Context b() {
        return f274604a;
    }

    public static java.lang.String c() {
        return f274605b + "_debugEnv";
    }

    public static android.content.SharedPreferences d() {
        android.content.Context context = f274604a;
        if (context != null) {
            return context.getSharedPreferences(e(), 0);
        }
        return null;
    }

    public static java.lang.String e() {
        return f274605b + "_preferences";
    }

    public static java.lang.String f() {
        return f274605b;
    }

    public static java.lang.String g(int i17) {
        return f274608e.getString(i17);
    }

    public static java.lang.String h(int i17, java.lang.Object... objArr) {
        return f274608e.getString(i17, objArr);
    }

    public static android.content.SharedPreferences i() {
        android.content.Context context = f274604a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f274605b + "_preferences_tools", 0);
    }

    public static boolean j() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        return a17.startsWith(f274605b + ":appbrand");
    }

    public static boolean k() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        return (f274605b + ":exdevice").equalsIgnoreCase(a17);
    }

    public static boolean l() {
        int[] iArr = f274611h;
        if (iArr[0] == -1) {
            synchronized (iArr) {
                if (iArr[0] == -1) {
                    iArr[0] = new java.io.File(f274604a.getFilesDir(), ".launched").exists() ? 0 : 1;
                }
            }
        }
        return iArr[0] == 1;
    }

    public static boolean m() {
        return o(f274605b);
    }

    public static boolean n() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        return f274605b.equals(a17);
    }

    public static boolean o(java.lang.String str) {
        android.content.Context context = f274604a;
        if (context != null && f274605b != null) {
            if (f274609f == null) {
                f274609f = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            }
            try {
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = f274609f.getRunningAppProcesses().iterator();
                while (it.hasNext()) {
                    if (it.next().processName.equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Error e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Error: " + e17.toString());
                return false;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Exception: " + e18.toString());
            }
        }
        return false;
    }

    public static boolean p() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        return (f274605b + ":push").equalsIgnoreCase(a17);
    }

    public static boolean q() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        return (f274605b + ":sandbox").equalsIgnoreCase(a17);
    }

    public static boolean r() {
        java.lang.String a17 = bm5.f1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationContext", "isToolsIsolatedProcess, processName:" + a17);
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        if (!(f274605b + ":isolated_process0").equalsIgnoreCase(a17)) {
            if (!(f274605b + ":isolated_process1").equalsIgnoreCase(a17)) {
                if (!(f274605b + ":isolated_process2").equalsIgnoreCase(a17)) {
                    if (!a17.contains(f274605b + ":xweb_sandboxed_process")) {
                        if (!a17.contains(f274605b + ":xweb_sandboxed_process_ex")) {
                            if (!a17.contains(f274605b + ":xweb_privileged_process")) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean s() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f274605b;
        }
        return (f274605b + ":tools").equalsIgnoreCase(a17);
    }

    public static void t() {
        boolean z17;
        int[] iArr = f274611h;
        synchronized (iArr) {
            int i17 = iArr[0];
            z17 = true;
            if (i17 != -1) {
                z17 = i17 == 1;
            }
        }
        if (z17) {
            java.io.File file = new java.io.File(f274604a.getFilesDir(), ".launched");
            if (file.exists()) {
                return;
            }
            try {
                file.createNewFile();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void u(android.content.Context context) {
        f274604a = context;
        f274605b = context.getPackageName();
        if (context instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) context;
            synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.i.class) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.i.f274263a == null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.i.f274263a = application;
                }
            }
        }
        ak0.o.f87076b = context;
    }
}
