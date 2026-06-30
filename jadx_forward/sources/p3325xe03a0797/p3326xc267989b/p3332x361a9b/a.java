package p3325xe03a0797.p3326xc267989b.p3332x361a9b;

/* loaded from: classes14.dex */
public final class a extends p3325xe03a0797.p3326xc267989b.n {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.q f392177d;

    /* renamed from: e, reason: collision with root package name */
    public final int f392178e;

    public a(p3325xe03a0797.p3326xc267989b.p3332x361a9b.q qVar, int i17) {
        this.f392177d = qVar;
        this.f392178e = i17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.o
    public void a(java.lang.Throwable th6) {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.q qVar = this.f392177d;
        qVar.getClass();
        qVar.f392209e.set(this.f392178e, p3325xe03a0797.p3326xc267989b.p3332x361a9b.p.f392207e);
        if (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i0.f392033d.incrementAndGet(qVar) != p3325xe03a0797.p3326xc267989b.p3332x361a9b.p.f392208f || qVar.c()) {
            return;
        }
        qVar.d();
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return jz5.f0.f384359a;
    }

    /* renamed from: toString */
    public java.lang.String m144109x9616526c() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f392177d + ", " + this.f392178e + ']';
    }
}
