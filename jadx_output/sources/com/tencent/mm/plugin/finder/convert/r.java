package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class r extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aeg;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.z item = (so2.z) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e_q);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(item.f410729d.f(context));
        com.tencent.mm.plugin.finder.view.b0 b0Var = com.tencent.mm.plugin.finder.view.CollapsibleTextView.f130818x;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.e_q);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        b0Var.a((android.widget.TextView) p17);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
