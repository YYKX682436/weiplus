package xt2;

/* loaded from: classes3.dex */
public final class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r5 f538457d;

    public o5(xt2.r5 r5Var) {
        this.f538457d = r5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.r5 r5Var = this.f538457d;
        yz5.l lVar = r5Var.f538531q;
        if (lVar != null) {
            lVar.mo146xb9724478(null);
        }
        r5Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
