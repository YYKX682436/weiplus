package f00;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final f00.a f339825d = new f00.a(null);

    /* renamed from: a, reason: collision with root package name */
    public wu5.c f339826a;

    /* renamed from: b, reason: collision with root package name */
    public f00.v f339827b;

    /* renamed from: c, reason: collision with root package name */
    public long f339828c = 500;

    public final synchronized void a() {
        wu5.c cVar = this.f339826a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        f00.b bVar = new f00.b(this);
        long j17 = this.f339828c;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f339826a = t0Var.z(bVar, j17, false);
    }

    public final synchronized void b() {
        wu5.c cVar = this.f339826a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        pm0.v.X(new f00.c(this));
    }
}
