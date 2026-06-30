package pn4;

/* loaded from: classes9.dex */
public final class r implements tl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f438735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f438736b;

    public r(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f438735a = atomicBoolean;
        this.f438736b = qVar;
    }

    @Override // tl.f
    public final void a() {
        if (this.f438735a.compareAndSet(false, true)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f438736b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
    }
}
