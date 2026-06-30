package b0;

/* loaded from: classes14.dex */
public final class d1 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f97793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f97794b;

    public d1(n0.v2 v2Var, c0.o oVar) {
        this.f97793a = v2Var;
        this.f97794b = oVar;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        n0.v2 v2Var = this.f97793a;
        c0.b bVar = (c0.b) v2Var.mo128745x754a37bb();
        if (bVar != null) {
            c0.o oVar = this.f97794b;
            if (oVar != null) {
                ((c0.p) oVar).b(new c0.a(bVar));
            }
            v2Var.mo148714x53d8522f(null);
        }
    }
}
