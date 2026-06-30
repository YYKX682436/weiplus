package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class x7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f104931e;

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ais;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderHistoryDateItem item = (com.tencent.mm.plugin.finder.presenter.contract.FinderHistoryDateItem) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        android.view.View view = holder.itemView;
        this.f104931e = view;
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cqs)).setText(item.f122642d);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
    }
}
