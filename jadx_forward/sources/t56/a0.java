package t56;

/* loaded from: classes16.dex */
public final class a0 extends java.util.concurrent.atomic.AtomicBoolean implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final t56.c0 f497384d;

    /* renamed from: e, reason: collision with root package name */
    public final u56.o f497385e;

    public a0(t56.c0 c0Var, u56.o oVar) {
        this.f497384d = c0Var;
        this.f497385e = oVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f497384d.f497395d.f506372e;
    }

    @Override // p56.s
    public void c() {
        if (compareAndSet(false, true)) {
            u56.o oVar = this.f497385e;
            t56.c0 c0Var = this.f497384d;
            if (oVar.f506372e) {
                return;
            }
            synchronized (oVar) {
                java.util.List list = oVar.f506371d;
                if (!oVar.f506372e && list != null) {
                    boolean remove = list.remove(c0Var);
                    if (remove) {
                        c0Var.c();
                    }
                }
            }
        }
    }
}
