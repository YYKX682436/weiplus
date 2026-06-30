package cj5;

/* loaded from: classes.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f123794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(cj5.d1 d1Var) {
        super(1);
        this.f123794d = d1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        cj5.d1 d1Var = this.f123794d;
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            if (state.e()) {
                d1Var.U6(true);
                d1Var.T6().f().setOnClickListener(new cj5.v0(d1Var));
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(d1Var.m158354x19263085());
                f5Var.f291933e = (com.p314xaae8f345.mm.ui.p2740x696c9db.c5) ((jz5.n) d1Var.f123633o).mo141623x754a37bb();
                f5Var.f();
                d1Var.f123631m = f5Var;
                d1Var.V6(state);
            }
        }
        cj5.d1 d1Var2 = this.f123794d;
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            d1Var2.V6(state);
            d1Var2.U6(state.e());
        }
        cj5.d1 d1Var3 = this.f123794d;
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.e)) {
            d1Var3.V6(state);
            d1Var3.U6(state.e());
        }
        if (state.e()) {
            cj5.d1 d1Var4 = this.f123794d;
            j75.d dVar4 = state.f379599d;
            if (dVar4 != null && (dVar4 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar4).f379600a) != null && (eVar instanceof wi5.w0) && ((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                d1Var4.V6(state);
            }
            cj5.d1 d1Var5 = this.f123794d;
            j75.d dVar5 = state.f379599d;
            if (dVar5 != null && (dVar5 instanceof wi5.x0)) {
                d1Var5.V6(state);
            }
            cj5.d1 d1Var6 = this.f123794d;
            j75.d dVar6 = state.f379599d;
            if (dVar6 != null && (dVar6 instanceof wi5.k0)) {
                d1Var6.V6(state);
            }
            cj5.d1 d1Var7 = this.f123794d;
            j75.d dVar7 = state.f379599d;
            if (dVar7 != null && (dVar7 instanceof wi5.j0)) {
                d1Var7.V6(state);
            }
            cj5.d1 d1Var8 = this.f123794d;
            j75.d dVar8 = state.f379599d;
            if (dVar8 != null && (dVar8 instanceof wi5.r)) {
                d1Var8.V6(state);
            }
            cj5.d1 d1Var9 = this.f123794d;
            j75.d dVar9 = state.f379599d;
            if (dVar9 != null && (dVar9 instanceof wi5.m0)) {
                d1Var9.V6(state);
            }
        }
        return jz5.f0.f384359a;
    }
}
