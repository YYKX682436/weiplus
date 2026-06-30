package a0;

/* loaded from: classes14.dex */
public final class e1 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f81651b;

    public e1(n0.v2 v2Var, c0.o oVar) {
        this.f81650a = v2Var;
        this.f81651b = oVar;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        n0.v2 v2Var = this.f81650a;
        c0.i iVar = (c0.i) v2Var.mo128745x754a37bb();
        if (iVar != null) {
            ((c0.p) this.f81651b).b(new c0.j(iVar));
            v2Var.mo148714x53d8522f(null);
        }
    }
}
