package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class as extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b59;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.k4 item = (so2.k4) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oov);
        int i19 = item.f410456f;
        android.content.Context context = holder.f293121e;
        if (i19 == 1) {
            if (textView == null) {
                return;
            }
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.etz));
        } else {
            if (i19 != 2 || textView == null) {
                return;
            }
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.f491982eu5));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
