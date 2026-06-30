package ah;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4712a;

    /* renamed from: b, reason: collision with root package name */
    public static ah.c f4713b = new ah.a();

    public static void a() {
        if (f4712a) {
            ah.i.b("MagicBrush", "library already loaded", new java.lang.Object[0]);
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ah.i.b("MagicBrush", "start loadLibraries", new java.lang.Object[0]);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        f4713b.loadLibrary("mmv8");
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        f4713b.loadLibrary("magicbrush");
        f4712a = true;
        ah.i.b("MagicBrush", "total[%d]ms load mmv8 cost [%d]ms, load magicbrush cost [%d]ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime3 - elapsedRealtime2), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
    }

    public static void b(java.lang.String str) {
        f4713b.loadLibrary(str);
    }
}
