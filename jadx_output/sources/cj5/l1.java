package cj5;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n1 f42180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(cj5.n1 n1Var) {
        super(1);
        this.f42180d = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            cj5.n1 n1Var = this.f42180d;
            ((em.l2) ((jz5.n) n1Var.f42199d).getValue()).e().setOnClickListener(new cj5.k1(n1Var, state));
        }
        return jz5.f0.f302826a;
    }
}
