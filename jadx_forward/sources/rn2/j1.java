package rn2;

/* loaded from: classes5.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479306d;

    public j1(rn2.t2 t2Var) {
        this.f479306d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initPrizeSourceChooser$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.t2.a(this.f479306d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initPrizeSourceChooser$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
