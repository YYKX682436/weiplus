package b0;

/* loaded from: classes14.dex */
public final class d1 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f16260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f16261b;

    public d1(n0.v2 v2Var, c0.o oVar) {
        this.f16260a = v2Var;
        this.f16261b = oVar;
    }

    @Override // n0.a2
    public void dispose() {
        n0.v2 v2Var = this.f16260a;
        c0.b bVar = (c0.b) v2Var.getValue();
        if (bVar != null) {
            c0.o oVar = this.f16261b;
            if (oVar != null) {
                ((c0.p) oVar).b(new c0.a(bVar));
            }
            v2Var.setValue(null);
        }
    }
}
