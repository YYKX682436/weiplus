package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.p6 f110258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.plugin.finder.feed.ui.p6 p6Var) {
        super(0);
        this.f110258d = p6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.f110258d;
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) p6Var.f110402h).getValue()).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (p6Var.j()) {
            p6Var.g().setVisibility(0);
        } else {
            p6Var.g().setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
