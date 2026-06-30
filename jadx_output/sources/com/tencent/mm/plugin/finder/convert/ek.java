package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ek extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f103267e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f103268f;

    public ek(yz5.l onClickMoreView) {
        kotlin.jvm.internal.o.g(onClickMoreView, "onClickMoreView");
        this.f103267e = onClickMoreView;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487842l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.k1 item = (so2.k1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        this.f103268f = holder.itemView;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        holder.itemView.findViewById(com.tencent.mm.R.id.jrd).setOnClickListener(new com.tencent.mm.plugin.finder.convert.dk(this));
    }
}
