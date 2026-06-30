package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class z3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111225d;

    public z3(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f111225d = a7Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f111225d;
        com.tencent.mm.plugin.finder.feed.a7.C(a7Var);
        yw2.a0 a0Var = a7Var.f106216o;
        if (a0Var == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
