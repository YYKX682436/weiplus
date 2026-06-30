package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class or extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ain;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.feed.model.e5 item = (com.tencent.mm.plugin.finder.feed.model.e5) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nsm);
        if (textView != null) {
            textView.setTextSize(1, 12.0f);
            textView.setText(item.getString(1));
            textView.setTextColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_6));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481629yh);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.setEnabled(true);
    }
}
