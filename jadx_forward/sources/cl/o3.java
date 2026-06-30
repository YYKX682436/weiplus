package cl;

/* loaded from: classes7.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f124245a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f124246b = 0;

    static {
        com.p159x477cd522.p160x333422.C1486x1128de25.m16457x24b28ecf(new cl.n3());
        try {
            int i17 = sj1.d.f489895a;
            int i18 = sj1.e.f489896a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f489897a;
            java.lang.String E0 = r26.p0.E0("LoadV8So", 127);
            java.lang.reflect.Method method = j3.v.f378876b;
            j3.t.a(E0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p159x477cd522.p160x333422.V8.m16067x746d94d1();
            cl.e0.class.getClassLoader();
            fp.d0.n("mmv8");
            cl.e0.class.getClassLoader();
            fp.d0.n("mmnode");
            cl.e0.class.getClassLoader();
            fp.d0.n("mmj2v8");
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            f124245a = elapsedRealtime2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8Env", "init, cost " + elapsedRealtime2 + " ms");
            j3.t.b();
        } catch (java.lang.Throwable th6) {
            int i19 = sj1.d.f489895a;
            int i27 = sj1.e.f489896a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = sj1.f.f489897a;
            java.lang.reflect.Method method2 = j3.v.f378876b;
            j3.t.b();
            throw th6;
        }
    }
}
