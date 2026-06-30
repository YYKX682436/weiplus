package rn2;

/* loaded from: classes15.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479357d;

    public q1(rn2.t2 t2Var) {
        this.f479357d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.h32 h32Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.t2 t2Var = this.f479357d;
        rn2.f fVar = t2Var.f479387f;
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(t2Var.f479386e), null, null, new rn2.r2(t2Var, (fVar == null || (h32Var = ((rn2.c1) fVar).f479207q) == null) ? null : h32Var.m75945x2fec8307(4), null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
