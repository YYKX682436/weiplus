package cj5;

/* loaded from: classes.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n3 f42163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(cj5.n3 n3Var) {
        super(1);
        this.f42163d = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view;
        android.widget.LinearLayout linearLayout;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        cj5.n3 n3Var = this.f42163d;
        if (dVar != null && (dVar instanceof wi5.q)) {
            wi5.q qVar = (wi5.q) dVar;
            android.view.View view2 = n3Var.f42201d;
            if (view2 != null && state.f446319o.size() > 0) {
                int e17 = com.tencent.mm.ui.zk.e(n3Var.getActivity(), com.tencent.mm.R.dimen.f479734dr);
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.gxy);
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(linearLayout2.getWidth(), e17));
                }
            }
            j75.f Q6 = n3Var.Q6();
            if (Q6 != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) n3Var.f42202e).getValue()).k();
                kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
                Q6.B3(new wi5.o(qVar.f446334b, qVar.f446335c, k17));
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.t)) {
            wi5.t tVar = (wi5.t) dVar2;
            if (!((java.lang.Boolean) ((jz5.n) n3Var.f42203f).getValue()).booleanValue() && (view = n3Var.f42201d) != null && (linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.gxy)) != null) {
                linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(linearLayout.getWidth(), tVar.f446340b));
            }
        }
        return jz5.f0.f302826a;
    }
}
