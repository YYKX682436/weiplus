package pn2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f438563d;

    public u(pn2.c0 c0Var) {
        this.f438563d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pn2.a aVar = this.f438563d.f438509i;
        if (aVar != null) {
            ((pn2.s) aVar).m();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
