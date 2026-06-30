package t56;

/* loaded from: classes16.dex */
public final class b0 extends java.util.concurrent.atomic.AtomicBoolean implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final t56.c0 f497387d;

    /* renamed from: e, reason: collision with root package name */
    public final a66.c f497388e;

    public b0(t56.c0 c0Var, a66.c cVar) {
        this.f497387d = c0Var;
        this.f497388e = cVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f497387d.f497395d.f506372e;
    }

    @Override // p56.s
    public void c() {
        if (compareAndSet(false, true)) {
            this.f497388e.e(this.f497387d);
        }
    }
}
