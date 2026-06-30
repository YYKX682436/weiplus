package d55;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f308121a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f308122b;

    /* renamed from: c, reason: collision with root package name */
    public final d55.x f308123c;

    /* renamed from: d, reason: collision with root package name */
    public final d55.k f308124d;

    public j(d55.k kVar, d55.x xVar) {
        this.f308123c = xVar;
        this.f308124d = kVar;
    }

    public static d55.j b(android.content.Context context) {
        d55.v vVar = new d55.v(context, "recovery_crash_count");
        vVar.a();
        d55.k kVar = new d55.k(vVar);
        d55.j jVar = new d55.j(kVar, new d55.v(context, "recovery_crash"));
        kVar.f308130a = java.lang.Math.max(vVar.mo123525xb58848b9("crash_count", 0), 0);
        jVar.a();
        return jVar;
    }

    public static d55.j c(android.content.Context context) {
        d55.v vVar = new d55.v(context, "recovery_crash_count_isolated");
        vVar.a();
        d55.k kVar = new d55.k(vVar);
        d55.j jVar = new d55.j(kVar, new d55.v(context, "recovery_crash_isolated"));
        kVar.f308130a = java.lang.Math.max(vVar.mo123525xb58848b9("crash_count", 0), 0);
        jVar.a();
        return jVar;
    }

    public void a() {
        d55.x xVar = this.f308123c;
        xVar.a();
        if (this.f308122b != null) {
            return;
        }
        this.f308122b = xVar.mo123527x2fec8307("crash_version", null);
        this.f308121a = java.lang.Math.max(xVar.mo123526xfb822ef2("crash_time", 0L), 0L);
    }

    public d55.j d() {
        d55.o0.a(5, "MicroMsg.recovery.crash", "reset crash record!");
        this.f308124d.f308130a = 0;
        this.f308121a = 0L;
        this.f308122b = null;
        return this;
    }

    public void e() {
        d55.k kVar = this.f308124d;
        kVar.f308131b.mo123529xc5c55e60("crash_count", kVar.f308130a).c();
        this.f308123c.mo123531xe4673800("crash_version", this.f308122b).mo123530xf2e7ce2b("crash_time", this.f308121a).c();
    }

    public j(long j17, java.lang.String str, d55.k kVar, d55.x xVar) {
        this.f308121a = j17;
        this.f308122b = str;
        this.f308123c = xVar;
        this.f308124d = kVar;
    }
}
