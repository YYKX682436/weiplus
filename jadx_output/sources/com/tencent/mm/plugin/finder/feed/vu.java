package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f110928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(com.tencent.mm.plugin.finder.feed.zu zuVar) {
        super(0);
        this.f110928d = zuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f110928d;
        androidx.recyclerview.widget.RecyclerView recyclerView = zuVar.g().getRecyclerView();
        if (recyclerView != null) {
            zuVar.f111302q.getClass();
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, 512L, false, 2, null);
            java.lang.Integer valueOf = Y != null ? java.lang.Integer.valueOf(Y.getAdapterPosition()) : null;
            if (valueOf != null) {
                valueOf.intValue();
                androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(valueOf.intValue());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
