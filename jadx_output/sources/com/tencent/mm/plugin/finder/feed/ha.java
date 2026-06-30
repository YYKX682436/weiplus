package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ha extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f106910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f106911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.oa oaVar) {
        super(0);
        this.f106910d = s3Var;
        this.f106911e = oaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ym5.s3 s3Var;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        android.view.View f213435x;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        ym5.s3 s3Var2 = this.f106910d;
        if (s3Var2 == null) {
            s3Var = new ym5.s3(0);
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
        } else {
            s3Var = s3Var2;
        }
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f106911e;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = oaVar.f107157f;
        androidx.recyclerview.widget.f2 adapter = (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) ? null : recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        boolean z17 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        com.tencent.mars.xlog.Log.i("FinderFollowFeedUIContract.Presenter", "[checkEmptyHeader] isEmpty=" + z17 + " reason=" + s3Var);
        if (s3Var2 != null) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128043yd).getValue()).r()).intValue() == 1) {
                com.tencent.mm.plugin.finder.feed.a1 a1Var2 = oaVar.f107157f;
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = a1Var2 != null ? a1Var2.f106180m : null;
                if (refreshLoadMoreLayout4 != null) {
                    refreshLoadMoreLayout4.setEnableLoadMore(false);
                }
            }
            if (s3Var2.f463521f) {
                com.tencent.mm.plugin.finder.feed.a1 a1Var3 = oaVar.f107157f;
                if ((a1Var3 == null || (refreshLoadMoreLayout3 = a1Var3.f106180m) == null || refreshLoadMoreLayout3.getEnableLoadMore()) ? false : true) {
                    com.tencent.mm.plugin.finder.feed.a1 a1Var4 = oaVar.f107157f;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = a1Var4 != null ? a1Var4.f106180m : null;
                    if (refreshLoadMoreLayout5 != null) {
                        refreshLoadMoreLayout5.setEnableLoadMore(true);
                    }
                    com.tencent.mm.plugin.finder.feed.a1 a1Var5 = oaVar.f107157f;
                    if (a1Var5 != null && (refreshLoadMoreLayout2 = a1Var5.f106180m) != null) {
                        android.view.View inflate = com.tencent.mm.ui.id.b(oaVar.f107155d).inflate(com.tencent.mm.R.layout.f489175bk1, (android.view.ViewGroup) null);
                        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                        refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
                    }
                    com.tencent.mm.plugin.finder.feed.a1 a1Var6 = oaVar.f107157f;
                    if (a1Var6 instanceof com.tencent.mm.plugin.finder.feed.xa) {
                    }
                    if (a1Var6 != null && (refreshLoadMoreLayout = a1Var6.f106180m) != null && (f213435x = refreshLoadMoreLayout.getF213435x()) != null && (mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) f213435x.findViewById(com.tencent.mm.R.id.m6l)) != null) {
                        mMProcessBar.setBackgroundResource(com.tencent.mm.R.drawable.avk);
                    }
                }
            } else {
                com.tencent.mm.plugin.finder.feed.a1 a1Var7 = oaVar.f107157f;
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = a1Var7 != null ? a1Var7.f106180m : null;
                if (refreshLoadMoreLayout6 != null) {
                    refreshLoadMoreLayout6.setEnableLoadMore(false);
                }
            }
        }
        in5.w wVar = oaVar.f108631q;
        if (z17) {
            if (wVar instanceof so2.s) {
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                ((so2.s) wVar).f410582d = string;
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f410583e = s3Var.f463517b;
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f410584f = oaVar.f108627m;
            }
            if ((wxRecyclerAdapter == null || wxRecyclerAdapter.W(wVar)) ? false : true) {
                wxRecyclerAdapter.Q(wVar, false);
            } else if (s3Var2 != null && wxRecyclerAdapter != null) {
                wxRecyclerAdapter.c0(((so2.s) wVar).hashCode());
            }
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.i0(((so2.s) wVar).hashCode(), false);
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var8 = oaVar.f107157f;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout7 = a1Var8 != null ? a1Var8.f106180m : null;
        if (refreshLoadMoreLayout7 != null) {
            refreshLoadMoreLayout7.setEnableNestedScroll((s3Var.f463517b == -1 && z17) ? false : true);
        }
        return jz5.f0.f302826a;
    }
}
