package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xr extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489063b55;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.j5 item = (so2.j5) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.k5h)).setText(((so2.l4) item).f410472d);
        }
    }
}
