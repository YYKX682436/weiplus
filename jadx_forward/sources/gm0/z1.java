package gm0;

/* loaded from: classes12.dex */
public final class z1 {

    /* renamed from: j, reason: collision with root package name */
    public static gm0.z1 f354828j;

    /* renamed from: a, reason: collision with root package name */
    public final gm0.z f354829a;

    /* renamed from: b, reason: collision with root package name */
    public final gm0.a0 f354830b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f354831c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f354832d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f354833e;

    /* renamed from: f, reason: collision with root package name */
    public gm0.v1 f354834f;

    /* renamed from: g, reason: collision with root package name */
    public final gm0.y1 f354835g;

    /* renamed from: h, reason: collision with root package name */
    public final gm0.y1 f354836h;

    /* renamed from: i, reason: collision with root package name */
    public final gm0.y1 f354837i;

    public z1(km0.b bVar) {
        lm5.j jVar = lm5.d.f401133a;
        this.f354835g = new gm0.y1(jVar, false);
        this.f354836h = new gm0.y1(jVar, true);
        this.f354837i = new gm0.y1(lm5.d.f401134b, true);
        this.f354829a = new gm0.z();
        this.f354830b = new gm0.a0(bVar);
    }

    public final void a(gm0.y1 y1Var, hm0.t tVar) {
        boolean z17;
        synchronized (this.f354831c) {
            if (this.f354832d) {
                z17 = true;
            } else {
                y1Var.v(tVar);
                z17 = false;
            }
        }
        if (z17) {
            tVar.b();
        }
    }

    public gm0.a0 b() {
        gm0.a0 a0Var = this.f354830b;
        iz5.a.d("mCoreProcess not initialized!", a0Var);
        return a0Var;
    }
}
