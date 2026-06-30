package ap1;

/* loaded from: classes5.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ap1.r1 f12734d = new ap1.r1();

    public r1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof ap1.g2)) {
            state.f12631o = 0L;
            java.util.HashSet hashSet = state.f12630n;
            if (((ap1.g2) dVar).f12669a) {
                for (ap1.a0 a0Var : state.f12629m) {
                    state.f12631o += a0Var.f12602c;
                    hashSet.add(a0Var.f12600a);
                }
            } else {
                hashSet.clear();
            }
        }
        return jz5.f0.f302826a;
    }
}
