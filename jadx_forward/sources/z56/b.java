package z56;

/* loaded from: classes16.dex */
public final class b extends z56.c {

    /* renamed from: e, reason: collision with root package name */
    public final z56.g f551817e;

    public b(p56.i iVar, z56.g gVar) {
        super(iVar);
        this.f551817e = gVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        for (z56.f fVar : ((z56.e) this.f551817e.get()).f551824b) {
            fVar.a(obj);
        }
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        z56.g gVar = this.f551817e;
        if (gVar.f551831e) {
            java.lang.Object obj = s56.j.f484749b;
            for (z56.f fVar : gVar.b(obj)) {
                fVar.b(obj, gVar.f551835i);
            }
        }
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        z56.g gVar = this.f551817e;
        if (gVar.f551831e) {
            s56.i iVar = new s56.i(th6);
            java.util.ArrayList arrayList = null;
            for (z56.f fVar : gVar.b(iVar)) {
                try {
                    fVar.b(iVar, gVar.f551835i);
                } catch (java.lang.Throwable th7) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th7);
                }
            }
            q56.f.a(arrayList);
        }
    }
}
