package oj;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final android.app.ActivityManager f427245a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f427246b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f427247c;

    static {
        if (!ih.d.c()) {
            throw new java.lang.IllegalStateException("Matrix is NOT installed or MemoryInfoFactory is not initialized!!!");
        }
        ih.d d17 = ih.d.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "Matrix.with()");
        android.app.Application application = d17.f373004b;
        java.lang.Object systemService = application != null ? application.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100) : null;
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        f427245a = activityManager;
        f427246b = activityManager.getMemoryClass();
        f427247c = activityManager.getLargeMemoryClass();
    }
}
