package cj5;

/* loaded from: classes.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123745d;

    public p1(cj5.l2 l2Var) {
        this.f123745d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$flowPlaceTopFoldLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f123745d.Z6();
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$flowPlaceTopFoldLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
