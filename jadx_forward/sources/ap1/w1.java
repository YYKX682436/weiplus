package ap1;

/* loaded from: classes5.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x1 f94290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ap1.x1 x1Var) {
        super(1);
        this.f94290d = x1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ap1.x1 x1Var = this.f94290d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            ap1.x1.T6(x1Var, state);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof ap1.h2)) {
            ap1.x1.T6(x1Var, state);
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof ap1.g2)) {
            ap1.x1.T6(x1Var, state);
        }
        return jz5.f0.f384359a;
    }
}
