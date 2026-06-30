package cj5;

/* loaded from: classes.dex */
public final class e2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42110d;

    public e2(cj5.l2 l2Var) {
        this.f42110d = l2Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        cj5.l2 l2Var = this.f42110d;
        if (((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) l2Var.f42184g).getValue()).w() == 0) {
            android.view.View childAt = recyclerView.getChildAt(0);
            if (childAt != null) {
                if (childAt.getTop() == 0) {
                    l2Var.Y6().t().setVisibility(8);
                } else {
                    l2Var.Y6().t().setVisibility(0);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                l2Var.Y6().t().setVisibility(8);
            }
        }
        try {
            l2Var.V6();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectContactMainRecycleViewUIC", th6, "checkUpdateFoldBtnFlow err", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactMainRecycleViewUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
