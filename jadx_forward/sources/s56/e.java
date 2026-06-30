package s56;

/* loaded from: classes16.dex */
public final class e extends z56.c {

    /* renamed from: g, reason: collision with root package name */
    public static final p56.m f484734g = new s56.a();

    /* renamed from: e, reason: collision with root package name */
    public final s56.d f484735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f484736f;

    public e(s56.d dVar) {
        super(new s56.c(dVar));
        this.f484735e = dVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        boolean z17 = this.f484736f;
        s56.d dVar = this.f484735e;
        if (z17) {
            ((p56.m) dVar.get()).a(obj);
            return;
        }
        dVar.f484731g.getClass();
        if (obj == null) {
            obj = s56.j.f484750c;
        }
        i(obj);
    }

    public final void i(java.lang.Object obj) {
        synchronized (this.f484735e.f484728d) {
            this.f484735e.f484730f.add(obj);
            if (this.f484735e.get() != null) {
                s56.d dVar = this.f484735e;
                if (!dVar.f484729e) {
                    this.f484736f = true;
                    dVar.f484729e = true;
                }
            }
        }
        if (!this.f484736f) {
            return;
        }
        while (true) {
            java.lang.Object poll = this.f484735e.f484730f.poll();
            if (poll == null) {
                return;
            }
            s56.d dVar2 = this.f484735e;
            dVar2.f484731g.a((p56.m) dVar2.get(), poll);
        }
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        boolean z17 = this.f484736f;
        s56.d dVar = this.f484735e;
        if (z17) {
            ((p56.m) dVar.get()).mo157868xaa8b332c();
        } else {
            dVar.f484731g.getClass();
            i(s56.j.f484749b);
        }
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        boolean z17 = this.f484736f;
        s56.d dVar = this.f484735e;
        if (z17) {
            ((p56.m) dVar.get()).mo157869xaf8aa769(th6);
        } else {
            dVar.f484731g.getClass();
            i(new s56.i(th6));
        }
    }
}
