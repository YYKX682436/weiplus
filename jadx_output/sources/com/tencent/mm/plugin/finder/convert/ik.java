package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ik extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f103673e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.hk f103674f = new com.tencent.mm.plugin.finder.convert.hk(this);

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f103675g;

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487843m;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.tencent.mm.plugin.finder.convert.hk hkVar = this.f103674f;
        recyclerView.V0(hkVar);
        recyclerView.i(hkVar);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.u item = (so2.u) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        this.f103675g = holder.itemView;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.fk(recyclerView, holder));
    }
}
