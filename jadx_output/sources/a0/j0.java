package a0;

/* loaded from: classes14.dex */
public final class j0 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f182b;

    public j0(n0.v2 v2Var, c0.o oVar) {
        this.f181a = v2Var;
        this.f182b = oVar;
    }

    @Override // n0.a2
    public void dispose() {
        n0.v2 v2Var = this.f181a;
        c0.d dVar = (c0.d) v2Var.getValue();
        if (dVar != null) {
            c0.e eVar = new c0.e(dVar);
            c0.o oVar = this.f182b;
            if (oVar != null) {
                ((c0.p) oVar).b(eVar);
            }
            v2Var.setValue(null);
        }
    }
}
