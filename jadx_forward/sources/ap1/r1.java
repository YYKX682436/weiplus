package ap1;

/* loaded from: classes5.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ap1.r1 f94267d = new ap1.r1();

    public r1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof ap1.g2)) {
            state.f94164o = 0L;
            java.util.HashSet hashSet = state.f94163n;
            if (((ap1.g2) dVar).f94202a) {
                for (ap1.a0 a0Var : state.f94162m) {
                    state.f94164o += a0Var.f94135c;
                    hashSet.add(a0Var.f94133a);
                }
            } else {
                hashSet.clear();
            }
        }
        return jz5.f0.f384359a;
    }
}
