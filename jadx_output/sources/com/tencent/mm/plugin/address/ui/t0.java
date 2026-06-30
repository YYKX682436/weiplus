package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class t0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74626e;

    public t0(com.tencent.mm.plugin.address.ui.l1 l1Var) {
        this.f74626e = l1Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cji;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.address.ui.u0 addressItem = (com.tencent.mm.plugin.address.ui.u0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(addressItem, "addressItem");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f482729m9)).setText(addressItem.f74629d.f74371d);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.nh8)).setVisibility(this.f74626e.D.contains(addressItem.f74629d) ? 0 : 4);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
