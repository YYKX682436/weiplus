package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class f1 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.feed.s1 s1Var, in5.s sVar, boolean z17) {
        super(sVar, arrayList, z17);
        this.I = s1Var;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        if (holder.getItemViewType() == 0 || holder.getItemViewType() == -1) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
            return;
        }
        ((com.tencent.mm.plugin.finder.feed.h2) this.I).getClass();
        if (holder.getItemViewType() == -2 || ((obj = holder.f293124h) != null && kotlin.jvm.internal.o.b(obj, -2))) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
    }

    @Override // in5.n0, com.tencent.mm.ui.recyclerview.SynchronizedAdapter, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.onBindViewHolder(holder, i17, payloads);
        this.I.getClass();
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter
    public void y0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        fc2.o Z6;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.feed.s1 s1Var = this.I;
        com.tencent.mm.ui.MMActivity context = s1Var.f108960d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(s1Var.f108961e)) == null) {
            return;
        }
        new fc2.i(Z6).onScrollStateChanged(recyclerView, 5);
    }
}
