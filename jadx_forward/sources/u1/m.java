package u1;

/* loaded from: classes14.dex */
public final class m implements b1.b {

    /* renamed from: a, reason: collision with root package name */
    public final p2.f f505153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1.o f505154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1.c1 f505155c;

    public m(u1.o oVar, u1.c1 c1Var) {
        this.f505154b = oVar;
        this.f505155c = c1Var;
        this.f505153a = oVar.f505187d.f505087h.f505231v;
    }

    @Override // b1.b
    public long a() {
        return p2.r.b(this.f505155c.f483585f);
    }

    @Override // b1.b
    /* renamed from: getDensity */
    public p2.f mo9554x9a59d0b2() {
        return this.f505153a;
    }

    @Override // b1.b
    /* renamed from: getLayoutDirection */
    public p2.s mo9555x6fcfed3f() {
        return this.f505154b.f505187d.f505087h.f505233x;
    }
}
