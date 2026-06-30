package hr0;

/* loaded from: classes12.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr0.k0 f364832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f364833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364834f;

    public h0(hr0.k0 k0Var, q01.s0 s0Var, long j17) {
        this.f364832d = k0Var;
        this.f364833e = s0Var;
        this.f364834f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Ai = this.f364832d.Ai();
        hr0.k0 k0Var = this.f364832d;
        q01.s0 req = this.f364833e;
        long j17 = this.f364834f;
        synchronized (Ai) {
            java.util.Iterator it = k0Var.Ai().iterator();
            while (it.hasNext()) {
                ((cr0.h3) ((q01.p0) it.next())).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
                if (cr0.k3.f303199a.a()) {
                    cr0.k3.f303201c.m40834x32c52b(new cr0.i3(req, j17));
                }
            }
        }
    }
}
