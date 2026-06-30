package c30;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f38166d;

    public x(c30.f0 f0Var) {
        this.f38166d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.f0 f0Var = this.f38166d;
        c30.f0.wi(f0Var, f0Var.f38119m.incrementAndGet());
    }
}
