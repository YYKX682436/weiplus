package xt2;

/* loaded from: classes3.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538646d;

    public y1(xt2.e3 e3Var) {
        this.f538646d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a m175935xb35999f1 = this.f538646d.m175935xb35999f1();
        if (m175935xb35999f1 != null) {
            m175935xb35999f1.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
