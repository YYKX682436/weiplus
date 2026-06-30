package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f106952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f106953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.zu zuVar) {
        super(0);
        this.f106952d = s3Var;
        this.f106953e = zuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ym5.s3 s3Var = this.f106952d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.era);
        }
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f106953e;
        androidx.recyclerview.widget.RecyclerView recyclerView = zuVar.g().getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        boolean z17 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        com.tencent.mars.xlog.Log.i("Finder.TimelineLbsPresenter", "[checkEmptyHeader] isEmpty=" + z17 + " reason=" + s3Var);
        boolean z18 = s3Var.f463516a != 2 && s3Var.f463517b == -2;
        so2.s sVar = zuVar.f111301p;
        if (z17 || z18) {
            if (z18) {
                zuVar.f111297i.getDataList().clear();
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                zuVar.f111300o = true;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout f17 = zuVar.g().f();
            if (f17 != null) {
                f17.setEnableLoadMore(false);
            }
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.era);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            sVar.getClass();
            sVar.f410582d = string;
            sVar.f410583e = s3Var.f463517b;
            sVar.f410584f = 2;
            if ((wxRecyclerAdapter == null || wxRecyclerAdapter.W(sVar)) ? false : true) {
                wxRecyclerAdapter.Q(sVar, false);
            } else if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.c0(sVar.hashCode());
            }
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.i0(sVar.hashCode(), false);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout f18 = zuVar.g().f();
        if (f18 != null) {
            f18.setEnableNestedScroll((s3Var.f463517b == -1 && z17) ? false : true);
        }
        return jz5.f0.f302826a;
    }
}
