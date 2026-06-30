package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class pq extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489036b40;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.d4 item = (so2.d4) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        int i19 = I1 != null ? I1.field_systemMsgCount : 0;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.jue);
        if (i19 > 0) {
            textView.setVisibility(0);
            textView.setText(i19 > 999 ? "999+" : java.lang.String.valueOf(i19));
        } else {
            textView.setVisibility(8);
        }
        holder.itemView.setOnTouchListener(new com.tencent.mm.plugin.finder.convert.oq(textView));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
