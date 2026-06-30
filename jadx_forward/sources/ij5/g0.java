package ij5;

/* loaded from: classes.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f373303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ij5.n0 n0Var) {
        super(1);
        this.f373303d = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ij5.n0 n0Var = this.f373303d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = n0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
            if (state.e()) {
                abstractActivityC21394xb3d2c0cf.m78494xd9193382(1, (java.lang.String) ((jz5.n) n0Var.f373321e).mo141623x754a37bb(), new ij5.f0(n0Var), null, com.p314xaae8f345.mm.ui.fb.a(((java.lang.Number) ((jz5.n) n0Var.f373320d).mo141623x754a37bb()).intValue()));
                n0Var.V6(state);
            }
        }
        if (state.e()) {
            j75.d dVar2 = state.f379599d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f379600a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                    n0Var.V6(state);
                }
            }
            j75.d dVar3 = state.f379599d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                n0Var.V6(state);
            }
            j75.d dVar4 = state.f379599d;
            if (dVar4 != null && (dVar4 instanceof wi5.k0)) {
                n0Var.V6(state);
            }
            j75.d dVar5 = state.f379599d;
            if (dVar5 != null && (dVar5 instanceof wi5.j0)) {
                n0Var.V6(state);
            }
            j75.d dVar6 = state.f379599d;
            if (dVar6 != null && (dVar6 instanceof wi5.r)) {
                n0Var.V6(state);
            }
        }
        return jz5.f0.f384359a;
    }
}
