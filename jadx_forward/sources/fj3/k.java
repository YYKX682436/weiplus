package fj3;

/* loaded from: classes14.dex */
public final class k implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final ej3.c f344747d;

    /* renamed from: e, reason: collision with root package name */
    public final fj3.n f344748e;

    /* renamed from: f, reason: collision with root package name */
    public final u26.w f344749f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f344750g;

    /* JADX WARN: Multi-variable type inference failed */
    public k(ej3.c mtrTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mtrTask, "mtrTask");
        this.f344747d = mtrTask;
        fj3.n nVar = new fj3.n();
        this.f344748e = nVar;
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        ((u26.o) a17).n(new fj3.g(this));
        this.f344749f = a17;
        this.f344750g = p3325xe03a0797.p3326xc267989b.z0.a(nVar.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public final void a(ej3.a input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.lang.Object obj = this.f344749f;
        if (((u26.o) obj).j()) {
            return;
        }
        ((u26.o) obj).e(input);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRExecutor", "executor stopped");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(u26.x0.a(this.f344749f, null, 1, null)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
    }
}
