package ap1;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.c1 f12772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ap1.c1 c1Var) {
        super(1);
        this.f12772d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        ap1.c1 c1Var = this.f12772d;
        if (dVar != null && (dVar instanceof ap1.h2)) {
            ap1.c1.T6(c1Var, state);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof ap1.g2)) {
            ap1.c1.T6(c1Var, state);
        }
        return jz5.f0.f302826a;
    }
}
