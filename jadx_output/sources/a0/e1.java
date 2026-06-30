package a0;

/* loaded from: classes14.dex */
public final class e1 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f118b;

    public e1(n0.v2 v2Var, c0.o oVar) {
        this.f117a = v2Var;
        this.f118b = oVar;
    }

    @Override // n0.a2
    public void dispose() {
        n0.v2 v2Var = this.f117a;
        c0.i iVar = (c0.i) v2Var.getValue();
        if (iVar != null) {
            ((c0.p) this.f118b).b(new c0.j(iVar));
            v2Var.setValue(null);
        }
    }
}
