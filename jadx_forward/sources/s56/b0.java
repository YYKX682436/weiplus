package s56;

/* loaded from: classes16.dex */
public class b0 extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Thread f484722h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s56.c0 f484723i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s56.c0 c0Var, p56.r rVar, java.lang.Thread thread) {
        super(rVar, true);
        this.f484723i = c0Var;
        this.f484722h = thread;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        this.f484723i.f484725d.a(obj);
    }

    @Override // p56.r
    public void g(p56.n nVar) {
        this.f484723i.f484725d.g(new s56.a0(this, nVar));
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        s56.c0 c0Var = this.f484723i;
        try {
            c0Var.f484725d.mo157868xaa8b332c();
        } finally {
            c0Var.f484726e.c();
        }
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        s56.c0 c0Var = this.f484723i;
        try {
            c0Var.f484725d.mo157869xaf8aa769(th6);
        } finally {
            c0Var.f484726e.c();
        }
    }
}
