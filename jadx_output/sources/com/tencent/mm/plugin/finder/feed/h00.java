package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class h00 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f106874J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(com.tencent.mm.plugin.finder.feed.v00 v00Var, in5.s itemConvertFactory, java.util.ArrayList data, boolean z17) {
        super(itemConvertFactory, data, z17);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
        this.f106874J = v00Var;
    }

    @Override // in5.n0
    public java.lang.String k0(java.lang.Exception e17, androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(e17, "e");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return j5Var.toString();
        }
        return "Feed[" + j5Var + "] is not BaseFinderFeed";
    }

    @Override // in5.n0
    public java.lang.String l0(java.lang.Exception e17, int i17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return super.l0(e17, i17);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.I(holder, i17);
        if (this.I) {
            return;
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zj(((com.tencent.mm.plugin.finder.feed.pz) this.f106874J.f110847e).U0(), "ShowResult");
        this.I = true;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter
    public void y0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
    }
}
