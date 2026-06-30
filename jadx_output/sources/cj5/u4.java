package cj5;

/* loaded from: classes.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.x4 f42253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(cj5.x4 x4Var) {
        super(1);
        this.f42253d = x4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        cj5.x4 x4Var = this.f42253d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            androidx.appcompat.app.AppCompatActivity activity = x4Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setActionbarColor(x4Var.getResources().getColor(com.tencent.mm.R.color.f478491c));
            em.l2 T6 = x4Var.T6();
            if (T6.f254566w == null) {
                T6.f254566w = (android.widget.LinearLayout) T6.f254544a.findViewById(com.tencent.mm.R.id.r4h);
            }
            T6.f254566w.setVisibility(((java.lang.Boolean) ((jz5.n) x4Var.f42273e).getValue()).booleanValue() ? 0 : 8);
            x4Var.T6().i().setChecked(((java.lang.Boolean) ((jz5.n) x4Var.f42274f).getValue()).booleanValue());
            em.l2 T62 = x4Var.T6();
            if (T62.f254566w == null) {
                T62.f254566w = (android.widget.LinearLayout) T62.f254544a.findViewById(com.tencent.mm.R.id.r4h);
            }
            T62.f254566w.setOnClickListener(new cj5.t4(x4Var));
        }
        if (state.e()) {
            j75.d dVar2 = state.f298066d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f298067a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                    x4Var.U6(state);
                }
            }
            j75.d dVar3 = state.f298066d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                x4Var.U6(state);
            }
        }
        j75.d dVar4 = state.f298066d;
        java.util.LinkedList list = state.f446319o;
        if (dVar4 != null && (dVar4 instanceof wi5.b)) {
            com.tencent.mars.xlog.Log.i("SelectCustomContactUIC", "ClickCancelMenuAction: " + list);
            new android.content.Intent().putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof wi5.r)) {
            x4Var.getClass();
            kotlin.jvm.internal.o.g(list, "list");
            java.util.LinkedList linkedList = x4Var.f42276h;
            linkedList.clear();
            linkedList.addAll(list);
        }
        return jz5.f0.f302826a;
    }
}
