package fr4;

/* loaded from: classes11.dex */
public final class i implements hr4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kr4.g f347368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr4.g f347369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr4.l f347370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f347371d;

    public i(kr4.g gVar, kr4.g gVar2, fr4.l lVar, int i17) {
        this.f347368a = gVar;
        this.f347369b = gVar2;
        this.f347370c = lVar;
        this.f347371d = i17;
    }

    @Override // hr4.q
    public void a(boolean z17, kr4.e eVar) {
        if (!z17 || eVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 t07 = eVar.t0();
        kr4.g gVar = this.f347368a;
        gVar.Z = t07;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = gVar.Z;
        gVar.f393040x0 = z3Var != null ? z3Var.g2() : null;
        java.lang.String str = gVar.f393040x0 + ':' + gVar.f69038xf66fcca9;
        kr4.g gVar2 = this.f347369b;
        gVar2.f69038xf66fcca9 = str;
        this.f347370c.t(gVar2, gVar, this.f347371d);
    }

    @Override // hr4.q
    public void b() {
    }
}
