package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.wb f108815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.finder.feed.wb wbVar) {
        super(0);
        this.f108815d = wbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f108815d.f106424g;
        if (i0Var != null && (recyclerView = i0Var.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(0, new jz5.l(12, null));
        }
        return jz5.f0.f302826a;
    }
}
