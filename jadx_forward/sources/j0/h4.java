package j0;

/* loaded from: classes14.dex */
public final class h4 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f377850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f377851b;

    public h4(n0.v2 v2Var, c0.o oVar) {
        this.f377850a = v2Var;
        this.f377851b = oVar;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        n0.v2 v2Var = this.f377850a;
        c0.r rVar = (c0.r) v2Var.mo128745x754a37bb();
        if (rVar != null) {
            c0.q qVar = new c0.q(rVar);
            c0.o oVar = this.f377851b;
            if (oVar != null) {
                ((c0.p) oVar).b(qVar);
            }
            v2Var.mo148714x53d8522f(null);
        }
    }
}
