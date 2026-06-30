package z56;

/* loaded from: classes16.dex */
public final class f implements p56.m {

    /* renamed from: d, reason: collision with root package name */
    public final p56.r f551825d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f551826e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f551827f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f551828g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f551829h;

    public f(p56.r rVar) {
        this.f551825d = rVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        this.f551825d.a(obj);
    }

    public void b(java.lang.Object obj, s56.j jVar) {
        if (!this.f551829h) {
            synchronized (this) {
                this.f551826e = false;
                if (this.f551827f) {
                    if (this.f551828g == null) {
                        this.f551828g = new java.util.ArrayList();
                    }
                    this.f551828g.add(obj);
                    return;
                }
                this.f551829h = true;
            }
        }
        jVar.a(this.f551825d, obj);
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        this.f551825d.mo157868xaa8b332c();
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        this.f551825d.mo157869xaf8aa769(th6);
    }
}
