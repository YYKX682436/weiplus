package nq3;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f420521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f420522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nq3.c f420523f;

    public b(nq3.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar) {
        this.f420523f = cVar;
        this.f420521d = f9Var;
        this.f420522e = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nq3.c cVar = this.f420523f;
        nq3.d dVar = cVar.f420524d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f420521d;
        dVar.f420526e = new bt3.l0(f9Var.m124847x74d37ac6(), f9Var.Q0(), this.f420522e.f430227p, null);
        cVar.f420524d.f420526e.f105863y = 3;
        gm0.j1.d().a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, cVar.f420524d);
        gm0.j1.d().g(cVar.f420524d.f420526e);
    }
}
