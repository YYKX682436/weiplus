package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v9 f108979d;

    public s9(com.tencent.mm.plugin.finder.feed.v9 v9Var) {
        this.f108979d = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter3;
        com.tencent.mm.plugin.finder.feed.v9 v9Var = this.f108979d;
        int i17 = 0;
        if (v9Var.f108807e - 1 >= 0 && (recyclerView2 = v9Var.f108810h) != null && (adapter3 = recyclerView2.getAdapter()) != null) {
            adapter3.notifyItemRangeChanged(0, v9Var.f108807e, new jz5.l(25, 1));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = v9Var.f108810h;
        if (recyclerView3 != null && (adapter2 = recyclerView3.getAdapter()) != null) {
            i17 = adapter2.getItemCount();
        }
        int i18 = i17 - (v9Var.f108807e + 1);
        if (i18 <= 0 || (recyclerView = v9Var.f108810h) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemRangeChanged(v9Var.f108807e + 1, i18, new jz5.l(25, 1));
    }
}
