package cj5;

/* loaded from: classes.dex */
public final class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.c5 f42281d;

    public y4(cj5.c5 c5Var) {
        this.f42281d = c5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f stateCenter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectLabelEmptyViewUIC$initEmptyView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f42281d.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new wi5.n());
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectLabelEmptyViewUIC$initEmptyView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
