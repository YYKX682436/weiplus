package j93;

/* loaded from: classes.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f379973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(j93.p2 p2Var) {
        super(1);
        this.f379973d = p2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j93.p2 p2Var = this.f379973d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = p2Var.W6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null && (g0Var = a17.f233604u) != null) {
            g0Var.mo7806x9d92d11c(p2Var.m158354x19263085(), new j93.l2(p2Var, state));
        }
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.b)) {
            j93.p2.V6(p2Var, !state.e());
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.e)) {
            j93.p2.V6(p2Var, !state.e());
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.n)) {
            j93.p2.U6(p2Var);
        }
        return jz5.f0.f384359a;
    }
}
