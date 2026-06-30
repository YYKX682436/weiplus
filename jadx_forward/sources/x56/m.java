package x56;

/* loaded from: classes16.dex */
public abstract class m {

    /* renamed from: f, reason: collision with root package name */
    public static volatile r56.e f533666f;

    /* renamed from: a, reason: collision with root package name */
    public static volatile r56.b f533661a = new x56.f();

    /* renamed from: d, reason: collision with root package name */
    public static volatile r56.f f533664d = new x56.g();

    /* renamed from: h, reason: collision with root package name */
    public static volatile r56.e f533668h = new x56.h();

    /* renamed from: e, reason: collision with root package name */
    public static volatile r56.f f533665e = new x56.i();

    /* renamed from: g, reason: collision with root package name */
    public static volatile r56.e f533667g = new x56.j();

    /* renamed from: i, reason: collision with root package name */
    public static volatile r56.e f533669i = new x56.k();

    /* renamed from: k, reason: collision with root package name */
    public static volatile r56.e f533671k = new x56.l();

    /* renamed from: j, reason: collision with root package name */
    public static volatile r56.e f533670j = new x56.c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile r56.e f533662b = new x56.d();

    /* renamed from: c, reason: collision with root package name */
    public static volatile r56.e f533663c = new x56.e();

    public static void a(java.lang.Throwable th6) {
        r56.b bVar = f533661a;
        if (bVar != null) {
            try {
                ((x56.f) bVar).mo131526x2e7a5e(th6);
                return;
            } catch (java.lang.Throwable th7) {
                java.lang.System.err.println("The onError handler threw an Exception. It shouldn't. => " + th7.getMessage());
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th7);
            }
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th6);
    }

    public static java.lang.Throwable b(java.lang.Throwable th6) {
        r56.e eVar = f533669i;
        return eVar != null ? (java.lang.Throwable) ((x56.k) eVar).mo14559x2e7a5e(th6) : th6;
    }

    public static r56.a c(r56.a aVar) {
        r56.e eVar = f533667g;
        return eVar != null ? (r56.a) ((x56.j) eVar).mo14559x2e7a5e(aVar) : aVar;
    }
}
