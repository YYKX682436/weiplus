package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f107817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f107818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j17, com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.feed.model.l0 l0Var) {
        super(1);
        this.f107817d = j17;
        this.f107818e = fVar;
        this.f107819f = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            long id6 = baseFinderFeed.getFeedObject().getId();
            long j17 = this.f107817d;
            if (id6 == j17 && ((baseFinderFeed.getFeedObject().getMediaType() == 2 || baseFinderFeed.getFeedObject().getMediaType() == 4) && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) this.f107818e.f70618d).getCustom(2)) != null)) {
                boolean isHistoryFeed = baseFinderFeed.getIsHistoryFeed();
                com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f107819f;
                if (!isHistoryFeed || baseFinderFeed.getFeedObject().isUrlValid()) {
                    baseFinderFeed.getFeedObject().setCommentCount(finderObject.getCommentCount());
                    baseFinderFeed.getFeedObject().setLikeCount(finderObject.getLikeCount());
                    baseFinderFeed.getFeedObject().setForwardCount(finderObject.getForwardCount());
                    baseFinderFeed.getFeedObject().getFeedObject().setPlayhistory_info(finderObject.getPlayhistory_info());
                    com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                    am.ia iaVar = feedUpdateEvent.f54252g;
                    iaVar.f6918a = j17;
                    iaVar.f6919b = 20;
                    if (!l0Var.f108133r.containsKey(java.lang.Long.valueOf(j17))) {
                        l0Var.f108133r.put(java.lang.Long.valueOf(j17), feedUpdateEvent);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(l0Var.f108126h, "preloadFirstPageComment: notify feed full update, feedId = ".concat(pm0.v.u(j17)));
                    com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent2 = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                    am.ia iaVar2 = feedUpdateEvent2.f54252g;
                    iaVar2.f6918a = j17;
                    iaVar2.f6927j = 1;
                    iaVar2.f6919b = 0;
                    feedUpdateEvent2.e();
                    if (l0Var.f108125g instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
                        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.c0(l0Var));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
