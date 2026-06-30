package com.tencent.mm.plugin.appbrand.widget.recyclerview;

/* loaded from: classes11.dex */
public class MRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public vl1.g f92098b2;

    /* renamed from: c2, reason: collision with root package name */
    public vl1.n f92099c2;

    /* renamed from: d2, reason: collision with root package name */
    public vl1.o f92100d2;

    /* renamed from: e2, reason: collision with root package name */
    public android.view.View f92101e2;

    public MRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h1();
    }

    private void h1() {
        vl1.g gVar = new vl1.g();
        this.f92098b2 = gVar;
        gVar.setHasStableIds(true);
        super.setAdapter(this.f92098b2);
        this.f92098b2.registerAdapterDataObserver(new vl1.k(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        super.a1(i17);
    }

    public void addFooterView(android.view.View view) {
        vl1.g gVar = this.f92098b2;
        ((java.util.LinkedList) gVar.f437798h).add(view);
        gVar.notifyItemRangeChanged(gVar.getItemCount() - 1, 1);
    }

    public void addHeaderView(android.view.View view) {
        vl1.g gVar = this.f92098b2;
        ((java.util.LinkedList) gVar.f437797g).add(view);
        gVar.notifyItemRangeChanged(0, 1);
    }

    public int g1(androidx.recyclerview.widget.k3 k3Var) {
        vl1.g gVar = this.f92098b2;
        if (gVar == null) {
            return -1;
        }
        gVar.getClass();
        if (k3Var == null || k3Var.getAdapterPosition() == -1) {
            return -1;
        }
        return k3Var.getAdapterPosition() - (!gVar.f437797g.isEmpty() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public androidx.recyclerview.widget.f2 getAdapter() {
        return this.f92098b2;
    }

    public android.view.View getEmptyView() {
        return this.f92101e2;
    }

    public void i1(android.view.View view) {
        vl1.g gVar = this.f92098b2;
        ((java.util.LinkedList) gVar.f437798h).remove(view);
        gVar.notifyItemRangeChanged(gVar.getItemCount() - 1, 1);
    }

    public void j1(android.view.View view) {
        vl1.g gVar = this.f92098b2;
        ((java.util.LinkedList) gVar.f437797g).remove(view);
        gVar.notifyItemRangeChanged(0, 1);
    }

    public boolean k1() {
        return this.f92098b2.getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        vl1.g gVar = this.f92098b2;
        androidx.recyclerview.widget.f2 f2Var2 = gVar.f437794d;
        androidx.recyclerview.widget.h2 h2Var = gVar.f437801n;
        if (f2Var2 != null) {
            if (f2Var2.equals(f2Var)) {
                return;
            } else {
                gVar.f437794d.unregisterAdapterDataObserver(h2Var);
            }
        }
        gVar.f437794d = f2Var;
        if (f2Var != null) {
            f2Var.registerAdapterDataObserver(h2Var);
        }
    }

    public void setEmptyView(android.view.View view) {
        if (this.f92101e2 == view) {
            return;
        }
        this.f92101e2 = view;
        if (view != null) {
            int i17 = k1() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView", "setEmptyView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView", "setEmptyView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setOnItemClickListener(vl1.n nVar) {
        this.f92099c2 = nVar;
        this.f92098b2.f437799i = new vl1.l(this);
    }

    public void setOnItemLongClickListener(vl1.o oVar) {
        this.f92100d2 = oVar;
        this.f92098b2.f437800m = new vl1.m(this);
    }

    public MRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        h1();
    }

    public MRecyclerView(android.content.Context context) {
        super(context, null);
        h1();
    }
}
