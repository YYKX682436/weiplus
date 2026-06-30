package cj5;

/* loaded from: classes.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.q4 f42209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(cj5.q4 q4Var) {
        super(1);
        this.f42209d = q4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        cj5.q4 q4Var = this.f42209d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            androidx.appcompat.app.AppCompatActivity activity = q4Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            mMActivity.hideActionbarLine();
            if (state.e()) {
                mMActivity.addTextOptionMenu(1, (java.lang.String) ((jz5.n) q4Var.f42222e).getValue(), new cj5.n4(q4Var), null, com.tencent.mm.ui.fb.GREEN);
                q4Var.T6(state);
                mMActivity.getMMTitleView().setMaxWidth(((java.lang.Number) ((jz5.n) q4Var.f42221d).getValue()).intValue());
            }
        }
        if (state.e()) {
            j75.d dVar2 = state.f298066d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f298067a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                    q4Var.T6(state);
                }
            }
            j75.d dVar3 = state.f298066d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                q4Var.T6(state);
            }
            j75.d dVar4 = state.f298066d;
            if (dVar4 != null && (dVar4 instanceof wi5.k0)) {
                q4Var.T6(state);
            }
            j75.d dVar5 = state.f298066d;
            if (dVar5 != null && (dVar5 instanceof wi5.m0)) {
                q4Var.T6(state);
            }
            j75.d dVar6 = state.f298066d;
            if (dVar6 != null && (dVar6 instanceof wi5.j0)) {
                q4Var.T6(state);
            }
            j75.d dVar7 = state.f298066d;
            if (dVar7 != null && (dVar7 instanceof wi5.r)) {
                q4Var.T6(state);
            }
        }
        return jz5.f0.f302826a;
    }
}
