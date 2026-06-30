package s56;

/* loaded from: classes16.dex */
public class t implements p56.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s56.u f484773d;

    public t(s56.u uVar) {
        this.f484773d = uVar;
    }

    @Override // p56.n
    public void d(long j17) {
        long j18;
        long j19;
        if (j17 > 0) {
            s56.u uVar = this.f484773d;
            java.util.concurrent.atomic.AtomicLong atomicLong = uVar.f484781r;
            do {
                j18 = atomicLong.get();
                j19 = j18 + j17;
                if (j19 < 0) {
                    j19 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                }
            } while (!atomicLong.compareAndSet(j18, j19));
            uVar.i();
        }
    }
}
