package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ow extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f108682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f108682d = wxRecyclerAdapter;
        this.f108683e = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f108682d;
        if (wxRecyclerAdapter != null) {
            com.tencent.mm.plugin.finder.feed.pz pzVar = this.f108683e;
            in5.w info = pzVar.f108758l1;
            kotlin.jvm.internal.o.g(info, "info");
            if (!wxRecyclerAdapter.f293103m.contains(info)) {
                in5.n0.N(wxRecyclerAdapter, pzVar.f108758l1, false, 2, null);
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            com.tencent.mars.xlog.Log.i(pzVar.U, "[checkNoMoreFooter] EMPTY_FOOTER_IGNORE_CHECK=false");
            com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null;
            if (l17 != null) {
                l17.setCanLoadMore(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
