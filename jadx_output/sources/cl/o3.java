package cl;

/* loaded from: classes7.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f42712a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f42713b = 0;

    static {
        com.eclipsesource.mmv8.V8TracerAccessible.setTracer(new cl.n3());
        try {
            int i17 = sj1.d.f408362a;
            int i18 = sj1.e.f408363a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f408364a;
            java.lang.String E0 = r26.p0.E0("LoadV8So", 127);
            java.lang.reflect.Method method = j3.v.f297343b;
            j3.t.a(E0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.eclipsesource.mmv8.V8.getFlags();
            cl.e0.class.getClassLoader();
            fp.d0.n("mmv8");
            cl.e0.class.getClassLoader();
            fp.d0.n("mmnode");
            cl.e0.class.getClassLoader();
            fp.d0.n("mmj2v8");
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            f42712a = elapsedRealtime2;
            com.tencent.mars.xlog.Log.i("MicroMsg.V8Env", "init, cost " + elapsedRealtime2 + " ms");
            j3.t.b();
        } catch (java.lang.Throwable th6) {
            int i19 = sj1.d.f408362a;
            int i27 = sj1.e.f408363a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = sj1.f.f408364a;
            java.lang.reflect.Method method2 = j3.v.f297343b;
            j3.t.b();
            throw th6;
        }
    }
}
