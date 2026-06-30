package s56;

/* loaded from: classes16.dex */
public final class c implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final s56.d f484724d;

    public c(s56.d dVar) {
        this.f484724d = dVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        boolean z17;
        p56.r rVar = (p56.r) obj;
        if (!this.f484724d.compareAndSet(null, rVar)) {
            rVar.mo157869xaf8aa769(new java.lang.IllegalStateException("Only one subscriber allowed!"));
            return;
        }
        rVar.d(new a66.b(new s56.b(this)));
        synchronized (this.f484724d.f484728d) {
            s56.d dVar = this.f484724d;
            if (dVar.f484729e) {
                z17 = false;
            } else {
                z17 = true;
                dVar.f484729e = true;
            }
        }
        if (!z17) {
            return;
        }
        s56.j jVar = s56.j.f484748a;
        while (true) {
            java.lang.Object poll = this.f484724d.f484730f.poll();
            if (poll != null) {
                jVar.a((p56.m) this.f484724d.get(), poll);
            } else {
                synchronized (this.f484724d.f484728d) {
                    if (this.f484724d.f484730f.isEmpty()) {
                        this.f484724d.f484729e = false;
                        return;
                    }
                }
            }
        }
    }
}
