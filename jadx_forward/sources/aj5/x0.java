package aj5;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f87060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(aj5.g1 g1Var) {
        super(1);
        this.f87060d = g1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            state.f527853p.addAll((java.util.HashSet) ((jz5.n) this.f87060d.f86968h).mo141623x754a37bb());
        }
        return jz5.f0.f384359a;
    }
}
