package s56;

/* loaded from: classes16.dex */
public final class l extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final p56.r f484753h;

    /* renamed from: i, reason: collision with root package name */
    public final r56.e f484754i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f484755m;

    public l(p56.r rVar, r56.e eVar) {
        this.f484753h = rVar;
        this.f484754i = eVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        try {
            this.f484753h.a(this.f484754i.mo14559x2e7a5e(obj));
        } catch (java.lang.Throwable th6) {
            q56.f.b(th6);
            c();
            mo157869xaf8aa769(q56.m.a(th6, obj));
        }
    }

    @Override // p56.r
    public void g(p56.n nVar) {
        this.f484753h.g(nVar);
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        if (this.f484755m) {
            return;
        }
        this.f484753h.mo157868xaa8b332c();
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        if (this.f484755m) {
            x56.m.a(th6);
        } else {
            this.f484755m = true;
            this.f484753h.mo157869xaf8aa769(th6);
        }
    }
}
