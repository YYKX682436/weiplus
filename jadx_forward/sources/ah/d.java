package ah;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f86245a;

    /* renamed from: b, reason: collision with root package name */
    public static ah.c f86246b = new ah.a();

    public static void a() {
        if (f86245a) {
            ah.i.b("MagicBrush", "library already loaded", new java.lang.Object[0]);
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ah.i.b("MagicBrush", "start loadLibraries", new java.lang.Object[0]);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        f86246b.mo1152xeb57c8f5("mmv8");
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        f86246b.mo1152xeb57c8f5("magicbrush");
        f86245a = true;
        ah.i.b("MagicBrush", "total[%d]ms load mmv8 cost [%d]ms, load magicbrush cost [%d]ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime3 - elapsedRealtime2), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
    }

    public static void b(java.lang.String str) {
        f86246b.mo1152xeb57c8f5(str);
    }
}
