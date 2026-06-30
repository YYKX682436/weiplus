package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class d6 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.p6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.finder.feed.ui.p6 p6Var, in5.s sVar, java.util.ArrayList arrayList) {
        super(sVar, arrayList, true);
        this.I = p6Var;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        int itemViewType = holder.getItemViewType();
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.I;
        p6Var.getClass();
        if (itemViewType == 0 || holder.getItemViewType() == p6Var.f110411t) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
    }

    @Override // in5.n0, com.tencent.mm.ui.recyclerview.SynchronizedAdapter, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.onBindViewHolder(holder, i17, payloads);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter
    public void y0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        fc2.o Z6;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.ui.MMFragmentActivity context = this.I.f110398d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        new fc2.i(Z6).onScrollStateChanged(recyclerView, 5);
    }
}
