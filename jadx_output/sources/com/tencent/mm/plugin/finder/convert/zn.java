package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class zn extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b2a;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.iqa);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
    }
}
