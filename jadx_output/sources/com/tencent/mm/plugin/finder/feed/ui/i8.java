package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class i8 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI f110144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI) {
        super(3);
        this.f110144d = finderLiveBizSearchUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.kx5 resp = (r45.kx5) obj3;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI = this.f110144d;
        if (intValue == 0 && intValue2 == 0) {
            bm2.f1 f1Var = finderLiveBizSearchUI.B;
            java.util.LinkedList list = resp.getList(0);
            kotlin.jvm.internal.o.f(list, "getList(...)");
            f1Var.getClass();
            int size = f1Var.f21881d.size();
            f1Var.f21881d.addAll(list);
            f1Var.notifyItemRangeInserted(size, list.size());
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = finderLiveBizSearchUI.f109348v;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.e(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("refreshLayout");
        throw null;
    }
}
