package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ia extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f106997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f106998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.finder.feed.oa oaVar) {
        super(0);
        this.f106997d = wxRecyclerAdapter;
        this.f106998e = oaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f106997d;
        if (wxRecyclerAdapter != null) {
            com.tencent.mm.plugin.finder.feed.oa oaVar = this.f106998e;
            in5.w info = oaVar.f108630p;
            kotlin.jvm.internal.o.g(info, "info");
            if (!wxRecyclerAdapter.f293103m.contains(info)) {
                in5.n0.N(wxRecyclerAdapter, oaVar.f108630p, false, 2, null);
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            com.tencent.mars.xlog.Log.i("FinderFollowFeedUIContract.Presenter", "[checkNoMoreFooter] EMPTY_FOOTER_IGNORE_CHECK=false");
            com.tencent.mm.plugin.finder.feed.a1 a1Var = oaVar.f107157f;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = a1Var != null ? a1Var.f106180m : null;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableLoadMore(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
