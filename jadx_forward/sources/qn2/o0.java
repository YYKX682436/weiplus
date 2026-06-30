package qn2;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f446660d;

    public o0(qn2.v0 v0Var) {
        this.f446660d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn2.v0 v0Var = this.f446660d;
        v0Var.f446709a.y1(1);
        v0Var.f446709a.z1(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
