package fy0;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f348720a = new android.os.Handler(android.os.Looper.getMainLooper());

    public static boolean a() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static void b(java.lang.Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            f348720a.post(runnable);
        }
    }
}
