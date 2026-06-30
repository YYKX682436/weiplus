package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ur extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f110833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(com.tencent.mm.plugin.finder.feed.xr xrVar) {
        super(1);
        this.f110833d = xrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f110833d;
        com.tencent.mm.plugin.finder.feed.kr krVar = xrVar.f111097f;
        com.tencent.mm.plugin.finder.feed.tr trVar = new com.tencent.mm.plugin.finder.feed.tr(xrVar);
        krVar.getClass();
        krVar.m().setInitDone(trVar);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(krVar.m(), false, 1, null);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
        if (refreshLoadMoreLayout != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.T(refreshLoadMoreLayout, 0, false, null, 7, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }
}
