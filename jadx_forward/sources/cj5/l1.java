package cj5;

/* loaded from: classes.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n1 f123713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(cj5.n1 n1Var) {
        super(1);
        this.f123713d = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            cj5.n1 n1Var = this.f123713d;
            ((em.l2) ((jz5.n) n1Var.f123732d).mo141623x754a37bb()).e().setOnClickListener(new cj5.k1(n1Var, state));
        }
        return jz5.f0.f384359a;
    }
}
