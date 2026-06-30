package n0;

/* loaded from: classes11.dex */
public final class o2 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f415165d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f415166e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f415167f;

    public o2(oz5.l parentCoroutineContext, yz5.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentCoroutineContext, "parentCoroutineContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f415165d = task;
        this.f415166e = p3325xe03a0797.p3326xc267989b.z0.a(parentCoroutineContext);
    }

    @Override // n0.e4
    public void b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f415167f;
        if (r2Var != null) {
            ((p3325xe03a0797.p3326xc267989b.c3) r2Var).b(p3325xe03a0797.p3326xc267989b.e2.a("Old job was still running!", null));
        }
        this.f415167f = p3325xe03a0797.p3326xc267989b.l.d(this.f415166e, null, null, this.f415165d, 3, null);
    }

    @Override // n0.e4
    public void c() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f415167f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f415167f = null;
    }

    @Override // n0.e4
    public void d() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f415167f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f415167f = null;
    }
}
