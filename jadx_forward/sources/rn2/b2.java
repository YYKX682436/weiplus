package rn2;

/* loaded from: classes5.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479189d;

    public b2(rn2.t2 t2Var) {
        this.f479189d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f479189d.I;
        if (checkBox != null) {
            checkBox.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
