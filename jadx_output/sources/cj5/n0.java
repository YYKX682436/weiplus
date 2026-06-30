package cj5;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.o0 f42198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(cj5.o0 o0Var) {
        super(1);
        this.f42198d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            cj5.o0 o0Var = this.f42198d;
            androidx.appcompat.app.AppCompatActivity activity = o0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            mMActivity.setActionbarColor(o0Var.getResources().getColor(com.tencent.mm.R.color.f478491c));
            mMActivity.setNavigationbarColor(o0Var.getResources().getColor(com.tencent.mm.R.color.f478491c));
            int e17 = com.tencent.mm.ui.zk.e(o0Var.getActivity(), com.tencent.mm.R.dimen.f479704cz);
            if (fp.h.c(23)) {
                mMActivity.getController().Q0(com.tencent.mm.ui.uk.c(o0Var.getActivity(), com.tencent.mm.R.raw.icons_outlined_arrow_down, o0Var.getResources().getColor(com.tencent.mm.R.color.FG_0), o0Var.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3), e17, e17 * 0.5f));
            }
        }
        return jz5.f0.f302826a;
    }
}
