package ap1;

/* loaded from: classes5.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ap1.v0 f12749d = new ap1.v0();

    public v0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List F0;
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof ap1.f2)) {
            int ordinal = ((ap1.f2) dVar).f12662a.ordinal();
            if (ordinal == 0) {
                F0 = kz5.n0.F0(state.f12629m, new ap1.t0());
            } else if (ordinal == 1) {
                F0 = kz5.n0.F0(state.f12629m, new ap1.r0());
            } else if (ordinal == 2) {
                F0 = kz5.n0.F0(state.f12629m, new ap1.u0());
            } else if (ordinal == 3) {
                F0 = kz5.n0.F0(state.f12629m, new ap1.s0());
            }
            state.f12628i = true;
            state.f12629m = F0;
        }
        return jz5.f0.f302826a;
    }
}
