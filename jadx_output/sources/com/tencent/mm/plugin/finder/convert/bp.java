package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class bp extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ah7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.feed.km item = (com.tencent.mm.plugin.finder.feed.km) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.s(com.tencent.mm.R.id.gzb, item.f107223f);
        android.view.ViewGroup.LayoutParams layoutParams = holder.p(com.tencent.mm.R.id.gzc).getLayoutParams();
        int integer = item.f107221d.getInteger(2);
        android.content.Context context = holder.f293121e;
        if (integer == 0) {
            layoutParams.height = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480427xm);
        } else {
            layoutParams.height = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gzb);
        if (textView == null) {
            return;
        }
        textView.setText("");
    }
}
