package k5;

/* loaded from: classes13.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f385704e = a5.a0.e("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f385705a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f385706b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f385707c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f385708d;

    public y() {
        k5.v vVar = new k5.v(this);
        this.f385706b = new java.util.HashMap();
        this.f385707c = new java.util.HashMap();
        this.f385708d = new java.lang.Object();
        this.f385705a = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(vVar);
    }

    public void a(java.lang.String str, long j17, k5.w wVar) {
        synchronized (this.f385708d) {
            a5.a0.c().a(f385704e, java.lang.String.format("Starting timer for %s", str), new java.lang.Throwable[0]);
            b(str);
            k5.x xVar = new k5.x(this, str);
            ((java.util.HashMap) this.f385706b).put(str, xVar);
            ((java.util.HashMap) this.f385707c).put(str, wVar);
            this.f385705a.schedule(xVar, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public void b(java.lang.String str) {
        synchronized (this.f385708d) {
            if (((k5.x) ((java.util.HashMap) this.f385706b).remove(str)) != null) {
                a5.a0.c().a(f385704e, java.lang.String.format("Stopping timer for %s", str), new java.lang.Throwable[0]);
                ((java.util.HashMap) this.f385707c).remove(str);
            }
        }
    }
}
