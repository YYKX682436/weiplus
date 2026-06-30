package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b20 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader f106342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader) {
        super(finderTopicTimelineUIContract$Loader, false, 1, null);
        this.f106342a = finderTopicTimelineUIContract$Loader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(0);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463517b = 1;
        } else {
            s3Var.f463517b = -1;
        }
        if ((response instanceof com.tencent.mm.plugin.finder.feed.y10) && this.f106342a.f106133o == 5) {
            s3Var.f463520e = ((com.tencent.mm.plugin.finder.feed.y10) response).f111139a;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.a20(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 2 : 6, response.getIncrementList(), false, null, 12, null), s3Var, this.f106342a, lVar, response));
    }
}
