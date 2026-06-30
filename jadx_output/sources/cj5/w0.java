package cj5;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f42261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(cj5.d1 d1Var) {
        super(1);
        this.f42261d = d1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        cj5.d1 d1Var = this.f42261d;
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            if (state.e()) {
                d1Var.U6(true);
                d1Var.T6().f().setOnClickListener(new cj5.v0(d1Var));
                com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(d1Var.getActivity());
                f5Var.f210400e = (com.tencent.mm.ui.tools.c5) ((jz5.n) d1Var.f42100o).getValue();
                f5Var.f();
                d1Var.f42098m = f5Var;
                d1Var.V6(state);
            }
        }
        cj5.d1 d1Var2 = this.f42261d;
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            d1Var2.V6(state);
            d1Var2.U6(state.e());
        }
        cj5.d1 d1Var3 = this.f42261d;
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.e)) {
            d1Var3.V6(state);
            d1Var3.U6(state.e());
        }
        if (state.e()) {
            cj5.d1 d1Var4 = this.f42261d;
            j75.d dVar4 = state.f298066d;
            if (dVar4 != null && (dVar4 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar4).f298067a) != null && (eVar instanceof wi5.w0) && ((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                d1Var4.V6(state);
            }
            cj5.d1 d1Var5 = this.f42261d;
            j75.d dVar5 = state.f298066d;
            if (dVar5 != null && (dVar5 instanceof wi5.x0)) {
                d1Var5.V6(state);
            }
            cj5.d1 d1Var6 = this.f42261d;
            j75.d dVar6 = state.f298066d;
            if (dVar6 != null && (dVar6 instanceof wi5.k0)) {
                d1Var6.V6(state);
            }
            cj5.d1 d1Var7 = this.f42261d;
            j75.d dVar7 = state.f298066d;
            if (dVar7 != null && (dVar7 instanceof wi5.j0)) {
                d1Var7.V6(state);
            }
            cj5.d1 d1Var8 = this.f42261d;
            j75.d dVar8 = state.f298066d;
            if (dVar8 != null && (dVar8 instanceof wi5.r)) {
                d1Var8.V6(state);
            }
            cj5.d1 d1Var9 = this.f42261d;
            j75.d dVar9 = state.f298066d;
            if (dVar9 != null && (dVar9 instanceof wi5.m0)) {
                d1Var9.V6(state);
            }
        }
        return jz5.f0.f302826a;
    }
}
