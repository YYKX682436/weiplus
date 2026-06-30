package gm0;

/* loaded from: classes12.dex */
public class u1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f354812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km0.b f354813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gm0.z1 f354814c;

    public u1(gm0.z1 z1Var, long j17, km0.b bVar) {
        this.f354814c = z1Var;
        this.f354812a = j17;
        this.f354813b = bVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        gm0.c2.b("executeBootExtension");
        synchronized (this.f354814c.f354831c) {
            this.f354814c.f354832d = true;
        }
        im0.a.a("summerboot mmskeleton boot startup finished in [%s]!", (java.lang.System.currentTimeMillis() - this.f354812a) + "ms");
        this.f354814c.f354836h.b();
        this.f354814c.f354835g.b();
        ((ku5.t0) ku5.t0.f394148d).g(new gm0.t1(this));
        gm0.c2.b("onStartupDone");
        com.p314xaae8f345.mm.app.u6.INSTANCE.h(com.p314xaae8f345.mm.app.t6.UNTIL_KERNEL_STARTUP_END);
        this.f354814c.f354833e = java.lang.System.currentTimeMillis();
        this.f354813b.f390524e.f390519f = this.f354814c.f354833e;
    }
}
