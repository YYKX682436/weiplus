package az2;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public static final az2.c f97658d = new az2.c(null);

    /* renamed from: a, reason: collision with root package name */
    public wu5.c f97659a;

    /* renamed from: b, reason: collision with root package name */
    public az2.s f97660b;

    /* renamed from: c, reason: collision with root package name */
    public long f97661c = 500;

    public synchronized void a() {
        wu5.c cVar = this.f97659a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        az2.d dVar = new az2.d(this);
        long j17 = this.f97661c;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f97659a = t0Var.z(dVar, j17, false);
    }

    public synchronized void b() {
        wu5.c cVar = this.f97659a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        pm0.v.X(new az2.e(this));
    }
}
