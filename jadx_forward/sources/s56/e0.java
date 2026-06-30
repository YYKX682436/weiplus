package s56;

/* loaded from: classes16.dex */
public class e0 implements p56.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f484737d = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p56.n f484738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s56.f0 f484739f;

    public e0(s56.f0 f0Var, p56.n nVar) {
        this.f484739f = f0Var;
        this.f484738e = nVar;
    }

    @Override // p56.n
    public void d(long j17) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j18;
        long min;
        if (j17 > 0) {
            if (this.f484739f.f484743i) {
                return;
            }
            do {
                atomicLong = this.f484737d;
                j18 = atomicLong.get();
                min = java.lang.Math.min(j17, r2.f484745n.f484746a - j18);
                if (min == 0) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j18, j18 + min));
            this.f484738e.d(min);
        }
    }
}
