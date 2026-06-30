package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vo extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f104803e = new java.util.ArrayList();

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aks;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.k item = (so2.k) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.p(com.tencent.mm.R.id.mgs);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f104803e;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.mgk);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        ((java.util.ArrayList) list).add(p17);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.mgl);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        ((java.util.ArrayList) list).add(p18);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.mgm);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        ((java.util.ArrayList) list).add(p19);
    }
}
