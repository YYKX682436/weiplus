package a0;

/* loaded from: classes14.dex */
public final class n implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f81766b;

    public n(n0.v2 v2Var, c0.o oVar) {
        this.f81765a = v2Var;
        this.f81766b = oVar;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        n0.v2 v2Var = this.f81765a;
        c0.r rVar = (c0.r) v2Var.mo128745x754a37bb();
        if (rVar != null) {
            ((c0.p) this.f81766b).b(new c0.q(rVar));
            v2Var.mo148714x53d8522f(null);
        }
    }
}
