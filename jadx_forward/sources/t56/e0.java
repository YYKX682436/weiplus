package t56;

/* loaded from: classes16.dex */
public class e0 implements p56.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t56.k0 f497403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t56.f0 f497404e;

    public e0(t56.f0 f0Var, t56.k0 k0Var) {
        this.f497404e = f0Var;
        this.f497403d = k0Var;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.s sVar;
        p56.d dVar = (p56.d) ((p56.g) obj);
        a66.e eVar = dVar.f433624a;
        t56.k0 k0Var = this.f497403d;
        eVar.a(k0Var);
        p56.p pVar = this.f497404e.f497406a;
        int i17 = t56.k0.f497430d;
        p56.s sVar2 = (p56.s) k0Var.get();
        p56.s sVar3 = t56.l0.f497431h;
        if (sVar2 != a66.g.f83334a && sVar2 == (sVar = t56.l0.f497431h)) {
            p56.s a17 = k0Var.a(pVar);
            if (!k0Var.compareAndSet(sVar, a17)) {
                a17.c();
            }
        }
        dVar.f433624a.c();
    }
}
