package s56;

/* loaded from: classes16.dex */
public class f0 extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public int f484742h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f484743i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p56.r f484744m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s56.g0 f484745n;

    public f0(s56.g0 g0Var, p56.r rVar) {
        this.f484745n = g0Var;
        this.f484744m = rVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        if (this.f433636d.f506372e) {
            return;
        }
        int i17 = this.f484742h;
        int i18 = i17 + 1;
        this.f484742h = i18;
        int i19 = this.f484745n.f484746a;
        if (i17 < i19) {
            boolean z17 = i18 == i19;
            this.f484744m.a(obj);
            if (!z17 || this.f484743i) {
                return;
            }
            this.f484743i = true;
            try {
                this.f484744m.mo157868xaa8b332c();
            } finally {
                c();
            }
        }
    }

    @Override // p56.r
    public void g(p56.n nVar) {
        this.f484744m.g(new s56.e0(this, nVar));
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        if (this.f484743i) {
            return;
        }
        this.f484743i = true;
        this.f484744m.mo157868xaa8b332c();
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        if (this.f484743i) {
            return;
        }
        this.f484743i = true;
        try {
            this.f484744m.mo157869xaf8aa769(th6);
        } finally {
            c();
        }
    }
}
