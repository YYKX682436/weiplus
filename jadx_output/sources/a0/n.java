package a0;

/* loaded from: classes14.dex */
public final class n implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f233b;

    public n(n0.v2 v2Var, c0.o oVar) {
        this.f232a = v2Var;
        this.f233b = oVar;
    }

    @Override // n0.a2
    public void dispose() {
        n0.v2 v2Var = this.f232a;
        c0.r rVar = (c0.r) v2Var.getValue();
        if (rVar != null) {
            ((c0.p) this.f233b).b(new c0.q(rVar));
            v2Var.setValue(null);
        }
    }
}
