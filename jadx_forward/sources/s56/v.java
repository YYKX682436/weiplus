package s56;

/* loaded from: classes16.dex */
public final class v implements p56.j {

    /* renamed from: a, reason: collision with root package name */
    public final p56.q f484785a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f484786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f484787c;

    public v(p56.q qVar, boolean z17, int i17) {
        this.f484785a = qVar;
        this.f484786b = z17;
        this.f484787c = i17 <= 0 ? u56.l.f506366e : i17;
    }

    @Override // r56.e
    /* renamed from: call */
    public java.lang.Object mo14559x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.q qVar = this.f484785a;
        if ((qVar instanceof t56.v) || (qVar instanceof t56.q0)) {
            return rVar;
        }
        s56.u uVar = new s56.u(qVar, rVar, this.f484786b, this.f484787c);
        s56.t tVar = new s56.t(uVar);
        p56.r rVar2 = uVar.f484774h;
        rVar2.g(tVar);
        rVar2.d(uVar.f484775i);
        rVar2.d(uVar);
        return uVar;
    }
}
