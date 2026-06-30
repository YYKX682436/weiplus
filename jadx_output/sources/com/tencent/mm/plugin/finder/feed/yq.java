package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f111187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(1);
        this.f111187d = krVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f111187d.f107247x;
        if (xrVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setEnableRefresh(false);
            refreshLoadMoreLayout.setLimitTopRequest(-1);
            refreshLoadMoreLayout.setRefreshTargetY(-1);
            refreshLoadMoreLayout.setDamping(0.0f);
            refreshLoadMoreLayout.animate().cancel();
            refreshLoadMoreLayout.setTranslationY(0.0f);
            refreshLoadMoreLayout.getRecyclerView().setTranslationY(0.0f);
        }
        return jz5.f0.f302826a;
    }
}
