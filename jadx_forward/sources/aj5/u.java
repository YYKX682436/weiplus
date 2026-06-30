package aj5;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.a0 f87051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f87052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(aj5.a0 a0Var, boolean z17) {
        super(1);
        this.f87051d = a0Var;
        this.f87052e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        aj5.a0 a0Var = this.f87051d;
        boolean z17 = this.f87052e;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            aj5.a0.U6(a0Var, state);
            if (z17) {
                aj5.a0.T6(a0Var, state);
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.t0)) {
            if (((wi5.t0) dVar2).f527874b.f477643e == ri5.j.W) {
                aj5.a0.U6(a0Var, state);
            }
            if (z17) {
                aj5.a0.T6(a0Var, state);
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
            aj5.a0.U6(a0Var, state);
            if (z17) {
                aj5.a0.T6(a0Var, state);
            }
        }
        return jz5.f0.f384359a;
    }
}
