package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class e2 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader f107821a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader) {
        super(finderFloatBallDetailLoader, false, 1, null);
        this.f107821a = finderFloatBallDetailLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        if (!(response instanceof com.tencent.mm.plugin.finder.feed.model.c2)) {
            super.mergeRefresh(response, lVar);
            return;
        }
        if (response.getIncrementList() == null) {
            response.setIncrementList(kz5.p0.f313996d);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.d2(this.f107821a, response, lVar));
    }
}
