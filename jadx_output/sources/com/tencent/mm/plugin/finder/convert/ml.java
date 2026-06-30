package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class ml extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.akr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.w item = (so2.w) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.hzc)).getPaint(), 0.8f);
        holder.itemView.setOnClickListener(com.tencent.mm.plugin.finder.convert.ll.f103933d);
    }
}
