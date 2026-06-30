package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oo extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dox;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.f item = (jo2.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.quw);
        r45.mk4 mk4Var = item.f300885d;
        textView.setText(mk4Var.f380603d);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.qux)).setText(mk4Var.f380604e);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.qux)).getPaint(), 0.8f);
    }
}
