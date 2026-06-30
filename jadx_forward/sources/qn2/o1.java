package qn2;

/* loaded from: classes3.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.u1 f446661d;

    public o1(qn2.u1 u1Var) {
        this.f446661d = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.cz1 cz1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$initWinnerListView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn2.u1 u1Var = this.f446661d;
        km2.z zVar = ((on2.z2) u1Var.f446695a.P0(on2.z2.class)).f428625m;
        if (zVar != null && (cz1Var = zVar.f390765d) != null) {
            qn2.i0 i0Var = u1Var.f446695a;
            i0Var.getClass();
            qn2.v0 v0Var = i0Var.H;
            if (v0Var != null) {
                v0Var.d(cz1Var, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$initWinnerListView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
