package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI f110325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.wb f110326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, com.tencent.mm.plugin.finder.feed.wb wbVar) {
        super(1);
        this.f110325d = finderHorizontalVideoHalfFeedUI;
        this.f110326e = wbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject it = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.B;
        com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI = this.f110325d;
        finderHorizontalVideoHalfFeedUI.l7(false);
        com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.k7(finderHorizontalVideoHalfFeedUI, false);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = finderHorizontalVideoHalfFeedUI.f109294z;
        if (finderFeedShareRelativeListLoader == null) {
            kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
            throw null;
        }
        com.tencent.mm.protocal.protobuf.FinderContact contact = it.getContact();
        java.lang.String username = contact != null ? contact.getUsername() : null;
        if (username == null) {
            username = "";
        }
        finderFeedShareRelativeListLoader.M = username;
        com.tencent.mm.plugin.finder.feed.wb wbVar = this.f110326e;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = wbVar.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.feed.model.l0 i07 = wbVar.i0();
        long id6 = it.getId();
        r45.dm2 object_extend = it.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        java.lang.String objectNonceId = it.getObjectNonceId();
        int i18 = wbVar.f106422e;
        boolean z17 = it.getSecondaryShowFlag() != 1;
        java.lang.String username2 = it.getUsername();
        i07.O0(id6, string, objectNonceId, i18, z17, username2 == null ? "" : username2, (i19 & 64) != 0 ? -1 : 0, (i19 & 128) != 0 ? com.tencent.mm.plugin.finder.feed.model.z.f108496d : null);
        com.tencent.mm.plugin.finder.feed.xb xbVar = finderHorizontalVideoHalfFeedUI.f109293y;
        if (xbVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = xbVar.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            recyclerView2.post(new com.tencent.mm.plugin.finder.feed.ui.j5(finderHorizontalVideoHalfFeedUI, finderLinearLayoutManager, recyclerView2));
        }
        return jz5.f0.f302826a;
    }
}
