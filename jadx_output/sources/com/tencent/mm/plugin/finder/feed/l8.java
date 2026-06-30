package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.t8 f107282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f107283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.tencent.mm.plugin.finder.feed.t8 t8Var, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f107282d = t8Var;
        this.f107283e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.plugin.finder.feed.t8 t8Var = this.f107282d;
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = t8Var.f106424g;
        if (i0Var2 != null && (recyclerView2 = i0Var2.getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            adapter2.notifyItemChanged(0, new jz5.l(12, null));
        }
        if (t8Var.G != 0 && !((com.tencent.mm.plugin.finder.storage.FinderItem) this.f107283e.f310123d).isMemberFeed() && (i0Var = t8Var.f106424g) != null && (recyclerView = i0Var.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(0, new jz5.l(53, java.lang.Long.valueOf(t8Var.G)));
        }
        return jz5.f0.f302826a;
    }
}
