package cj5;

/* loaded from: classes.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cj5.y3 f42280d = new cj5.y3();

    public y3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.v)) {
            wi5.v vVar = (wi5.v) dVar;
            if (kotlin.jvm.internal.o.b(vVar.f446348b.f446366a, state.f446326v)) {
                state.f446327w = vVar.f446349c;
            }
        }
        return jz5.f0.f302826a;
    }
}
