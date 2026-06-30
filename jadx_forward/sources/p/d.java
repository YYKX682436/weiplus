package p;

/* loaded from: classes12.dex */
public class d extends p.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f431870a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f431871b = java.util.concurrent.Executors.newFixedThreadPool(4, new p.c(this));

    /* renamed from: c, reason: collision with root package name */
    public volatile android.os.Handler f431872c;

    public static android.os.Handler a(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.os.Handler.createAsync(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            return new android.os.Handler(looper);
        }
    }
}
