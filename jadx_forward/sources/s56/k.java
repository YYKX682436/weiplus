package s56;

/* loaded from: classes16.dex */
public final class k implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final p56.i f484751d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.j f484752e;

    public k(p56.i iVar, p56.j jVar) {
        this.f484751d = iVar;
        this.f484752e = jVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        try {
            p56.j jVar = this.f484752e;
            r56.e eVar = x56.m.f533671k;
            if (eVar != null) {
                jVar = (p56.j) ((x56.l) eVar).mo14559x2e7a5e(jVar);
            }
            p56.r rVar2 = (p56.r) jVar.mo14559x2e7a5e(rVar);
            try {
                rVar2.e();
                this.f484751d.mo131526x2e7a5e(rVar2);
            } catch (java.lang.Throwable th6) {
                q56.f.b(th6);
                rVar2.mo157869xaf8aa769(th6);
            }
        } catch (java.lang.Throwable th7) {
            q56.f.b(th7);
            rVar.mo157869xaf8aa769(th7);
        }
    }
}
