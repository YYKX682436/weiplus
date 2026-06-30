package hr0;

/* loaded from: classes12.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr0.k0 f364828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f364829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364830f;

    public g0(hr0.k0 k0Var, java.util.List list, long j17) {
        this.f364828d = k0Var;
        this.f364829e = list;
        this.f364830f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Ai = this.f364828d.Ai();
        hr0.k0 k0Var = this.f364828d;
        java.util.List<q01.s0> list = this.f364829e;
        long j17 = this.f364830f;
        synchronized (Ai) {
            for (q01.p0 p0Var : k0Var.Ai()) {
                for (q01.s0 s0Var : list) {
                    long j18 = j17 - s0Var.f440864c;
                    ((cr0.h3) p0Var).getClass();
                    if (cr0.k3.f303199a.a()) {
                        cr0.k3.f303201c.m40834x32c52b(new cr0.i3(s0Var, j18));
                    }
                }
            }
        }
    }
}
