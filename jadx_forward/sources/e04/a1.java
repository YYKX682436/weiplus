package e04;

/* loaded from: classes5.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f327394a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f327395b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f327396c;

    static {
        try {
            boolean a17 = gm0.j1.a();
            if (a17 && f327396c == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "_scan_camera_error_mmkv");
                f327396c = M;
                f327394a = (M != null ? M.getLong("open_camera_error_time", 0L) : 0L) > 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraErrorHelper", "checkInitMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f327396c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCameraErrorHelper", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    public static final void a(e04.y0 y0Var, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraErrorHelper", "reportCameraErrorAction action: " + y0Var + ", actionTimestamp: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        java.lang.String str = f327395b;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(y0Var.f327693d);
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        objArr[4] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion);
        g0Var.d(30467, objArr);
    }
}
