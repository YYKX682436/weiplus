package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f108601d = s3Var;
        this.f108602e = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        ym5.s3 s3Var = this.f108601d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f108602e;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        androidx.recyclerview.widget.f2 adapter = (ctVar == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) ? null : recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        pzVar.Y = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        com.tencent.mars.xlog.Log.i(pzVar.U, "[checkEmptyHeader] isEmpty=" + pzVar.Y + " reason=" + s3Var);
        int i18 = pzVar.f108762p;
        boolean z17 = i18 == 35 && ((i17 = s3Var.f463517b) == -3 || i17 == -4);
        boolean z18 = pzVar.Y;
        in5.w wVar = pzVar.f108776y0;
        if (z18 || z17) {
            if (z17) {
                pzVar.C.getDataList().clear();
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            }
            com.tencent.mm.plugin.finder.feed.ct ctVar2 = pzVar.f108759m;
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ctVar2 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).l() : null;
            if (l17 != null) {
                l17.setEnableLoadMore(false);
            }
            if (wVar instanceof so2.s) {
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                ((so2.s) wVar).f410582d = string;
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f410583e = s3Var.f463517b;
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f410584f = i18;
                java.lang.Object obj = s3Var.f463520e;
                so2.g5 g5Var = obj instanceof so2.g5 ? (so2.g5) obj : null;
                if (g5Var != null) {
                    kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                    ((so2.s) wVar).f410585g = g5Var;
                }
            }
            if ((wxRecyclerAdapter == null || wxRecyclerAdapter.W(wVar)) ? false : true) {
                wxRecyclerAdapter.Q(wVar, false);
            } else if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.c0(((so2.s) wVar).hashCode());
            }
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.i0(((so2.s) wVar).hashCode(), false);
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar3 = pzVar.f108759m;
        com.tencent.mm.view.RefreshLoadMoreLayout l18 = ctVar3 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).l() : null;
        if (l18 != null) {
            l18.setEnableNestedScroll((s3Var.f463517b == -1 && pzVar.Y) ? false : true);
        }
        return jz5.f0.f302826a;
    }
}
