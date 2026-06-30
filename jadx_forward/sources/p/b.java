package p;

/* loaded from: classes12.dex */
public class b extends p.e {

    /* renamed from: b, reason: collision with root package name */
    public static volatile p.b f431866b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.Executor f431867c = new p.a();

    /* renamed from: a, reason: collision with root package name */
    public final p.e f431868a = new p.d();

    public static p.b a() {
        if (f431866b != null) {
            return f431866b;
        }
        synchronized (p.b.class) {
            if (f431866b == null) {
                f431866b = new p.b();
            }
        }
        return f431866b;
    }

    public void b(java.lang.Runnable runnable) {
        p.d dVar = (p.d) this.f431868a;
        if (dVar.f431872c == null) {
            synchronized (dVar.f431870a) {
                if (dVar.f431872c == null) {
                    dVar.f431872c = p.d.a(android.os.Looper.getMainLooper());
                }
            }
        }
        dVar.f431872c.post(runnable);
    }
}
