package aj5;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.a0 f5518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(aj5.a0 a0Var, boolean z17) {
        super(1);
        this.f5518d = a0Var;
        this.f5519e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        aj5.a0 a0Var = this.f5518d;
        boolean z17 = this.f5519e;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            aj5.a0.U6(a0Var, state);
            if (z17) {
                aj5.a0.T6(a0Var, state);
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.t0)) {
            if (((wi5.t0) dVar2).f446341b.f396110e == ri5.j.W) {
                aj5.a0.U6(a0Var, state);
            }
            if (z17) {
                aj5.a0.T6(a0Var, state);
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
            aj5.a0.U6(a0Var, state);
            if (z17) {
                aj5.a0.T6(a0Var, state);
            }
        }
        return jz5.f0.f302826a;
    }
}
