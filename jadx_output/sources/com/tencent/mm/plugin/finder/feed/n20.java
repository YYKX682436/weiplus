package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class n20 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public int f108546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader f108547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader) {
        super(finderTopicTimelineUIContract$RelativeLoader, false, 1, null);
        this.f108547b = finderTopicTimelineUIContract$RelativeLoader;
        this.f108546a = 1000;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader = this.f108547b;
        r45.vx0 vx0Var = finderTopicTimelineUIContract$RelativeLoader.f106149q;
        if (!(vx0Var != null && vx0Var.getInteger(10) == 2) || this.f108546a != 19) {
            return super.mergeDataAndNotify(i17, list, z17, obj);
        }
        this.f108546a = 1000;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.u0 u0Var = new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, list.size(), new java.util.LinkedList(), false, false, 24, null);
        finderTopicTimelineUIContract$RelativeLoader.getDataList().addAll(0, list);
        finderTopicTimelineUIContract$RelativeLoader.getDispatcher().d(0, list.size());
        return u0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f108546a = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(0);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463517b = 1;
        } else {
            s3Var.f463517b = -1;
        }
        s3Var.f463520e = java.lang.Integer.valueOf(response.getPullType());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.m20(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 2 : 6, response.getIncrementList(), false, null, 12, null), s3Var, this.f108547b, lVar, response));
    }
}
