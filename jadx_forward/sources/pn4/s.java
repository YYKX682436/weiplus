package pn4;

/* loaded from: classes5.dex */
public final class s implements pn4.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f438749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f438750c;

    public s(java.lang.String str, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f438748a = str;
        this.f438749b = atomicBoolean;
        this.f438750c = qVar;
    }

    @Override // pn4.n
    public void a(int i17, java.lang.Long l17) {
        if (i17 < this.f438748a.length() || !this.f438749b.compareAndSet(false, true)) {
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f438750c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
    }
}
