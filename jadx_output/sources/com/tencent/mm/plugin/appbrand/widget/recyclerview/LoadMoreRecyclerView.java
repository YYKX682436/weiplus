package com.tencent.mm.plugin.appbrand.widget.recyclerview;

/* loaded from: classes11.dex */
public class LoadMoreRecyclerView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: f2, reason: collision with root package name */
    public android.view.View f92095f2;

    /* renamed from: g2, reason: collision with root package name */
    public vl1.j f92096g2;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f92097h2;

    public LoadMoreRecyclerView(android.content.Context context) {
        super(context);
        h1();
    }

    private void h1() {
        androidx.recyclerview.widget.LinearLayoutManager l17 = l1();
        super.setLayoutManager(l17);
        i(new vl1.h(this, l17));
        this.f92098b2.registerAdapterDataObserver(new vl1.i(this, l17));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView
    public void addFooterView(android.view.View view) {
        int x17 = this.f92098b2.x() - 1;
        if (this.f92095f2 == null || x17 < 0) {
            super.addFooterView(view);
            return;
        }
        vl1.g gVar = this.f92098b2;
        ((java.util.LinkedList) gVar.f437798h).add(x17, view);
        gVar.notifyItemRangeChanged(gVar.getItemCount() - 1, 1);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView
    public boolean k1() {
        return this.f92095f2 != null ? this.f92098b2.getItemCount() == 1 && this.f92098b2.x() == 1 : super.k1();
    }

    public androidx.recyclerview.widget.LinearLayoutManager l1() {
        return new androidx.recyclerview.widget.LinearLayoutManager(getContext());
    }

    public void m1(boolean z17) {
        if (this.f92097h2 == z17) {
            return;
        }
        this.f92097h2 = z17;
        android.view.View view = this.f92095f2;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
    }

    public void setLoadingView(android.view.View view) {
        android.view.View view2 = this.f92095f2;
        if (view2 == view) {
            return;
        }
        if (view2 != null && !view2.equals(view)) {
            i1(this.f92095f2);
        }
        this.f92095f2 = view;
        if (view != null) {
            addFooterView(view);
            android.view.View view3 = this.f92095f2;
            int i17 = this.f92097h2 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setOnLoadingStateChangedListener(vl1.j jVar) {
        this.f92096g2 = jVar;
    }

    public LoadMoreRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h1();
    }

    public LoadMoreRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        h1();
    }

    public void setLoadingView(int i17) {
        setLoadingView(android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) this, false));
    }
}
