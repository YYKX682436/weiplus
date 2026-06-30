package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f111094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(0);
        this.f111094d = krVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f111094d.f107247x;
        if (xrVar != null) {
            com.tencent.mars.xlog.Log.i(xrVar.f111096e, "onGuideToDiscoverAppended");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setCanLoadMore(false);
        }
        return jz5.f0.f302826a;
    }
}
