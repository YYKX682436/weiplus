package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI f110758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI) {
        super(3);
        this.f110758d = finderLiveBizListUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        r45.vl3 resp = (r45.vl3) obj3;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI = this.f110758d;
        bm2.f1 f1Var = finderLiveBizListUI.f109345z;
        java.util.LinkedList list = resp.getList(0);
        kotlin.jvm.internal.o.f(list, "getList(...)");
        f1Var.getClass();
        int size = f1Var.f21881d.size();
        f1Var.f21881d.addAll(list);
        f1Var.notifyItemRangeInserted(size, list.size());
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = finderLiveBizListUI.f109341v;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.e(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("refreshLayout");
        throw null;
    }
}
