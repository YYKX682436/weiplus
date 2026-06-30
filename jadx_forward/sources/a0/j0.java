package a0;

/* loaded from: classes14.dex */
public final class j0 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f81715b;

    public j0(n0.v2 v2Var, c0.o oVar) {
        this.f81714a = v2Var;
        this.f81715b = oVar;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        n0.v2 v2Var = this.f81714a;
        c0.d dVar = (c0.d) v2Var.mo128745x754a37bb();
        if (dVar != null) {
            c0.e eVar = new c0.e(dVar);
            c0.o oVar = this.f81715b;
            if (oVar != null) {
                ((c0.p) oVar).b(eVar);
            }
            v2Var.mo148714x53d8522f(null);
        }
    }
}
