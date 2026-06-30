package xt2;

/* loaded from: classes3.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538311d;

    public h4(xt2.b5 b5Var) {
        this.f538311d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initOrderSettings$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.b5 b5Var = this.f538311d;
        xt2.b5.B(b5Var, 2);
        xt2.b5.z(b5Var, 1, new xt2.g4(b5Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initOrderSettings$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
