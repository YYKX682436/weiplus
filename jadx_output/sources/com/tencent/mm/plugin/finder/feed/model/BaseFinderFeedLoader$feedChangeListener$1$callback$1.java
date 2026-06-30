package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BaseFinderFeedLoader$feedChangeListener$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ r45.qt2 $contextObj;
    final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent $event;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$feedChangeListener$1$callback$1(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, r45.qt2 qt2Var) {
        super(0);
        this.$event = feedUpdateEvent;
        this.this$0 = baseFinderFeedLoader;
        this.$contextObj = qt2Var;
    }

    private static final void invoke$notifyFavChange(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, kotlin.jvm.internal.c0 c0Var, int i17) {
        if (i17 != -1) {
            java.lang.Object obj = baseFinderFeedLoader.getDataList().get(i17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
            am.ia iaVar = feedUpdateEvent.f54252g;
            int i18 = iaVar.f6921d;
            am.ia iaVar2 = feedUpdateEvent.f54252g;
            if (i18 == 1) {
                int i19 = iaVar.f6922e;
                int likeFlag = baseFinderFeed.getFeedObject().getLikeFlag();
                com.tencent.mars.xlog.Log.i(baseFinderFeedLoader.getF123427d(), "TYPE_FEED_LIKE_CHANGED oldFlag:" + likeFlag + ", newFlag:" + i19);
                if (likeFlag != i19) {
                    baseFinderFeed.getFeedObject().setLikeFlag(i19);
                    if (likeFlag == 0) {
                        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
                        feedObject.setLikeCount(feedObject.getLikeCount() + 1);
                    } else if (i19 == 0) {
                        baseFinderFeed.getFeedObject().setLikeCount(r8.getLikeCount() - 1);
                    }
                    if (i19 == 1) {
                        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
                        feedObject2.setFriendLikeCount(feedObject2.getFriendLikeCount() + 1);
                        nv2.h1 h1Var = nv2.n1.f340550g;
                        nv2.n1.f340551h.a(baseFinderFeed.getFeedObject().getLikeList());
                    } else if (likeFlag == 1) {
                        baseFinderFeed.getFeedObject().setFriendLikeCount(r2.getFriendLikeCount() - 1);
                        nv2.h1 h1Var2 = nv2.n1.f340550g;
                        nv2.n1.f340551h.o(baseFinderFeed.getFeedObject().getLikeList());
                    }
                    baseFinderFeedLoader.getDispatcher().c(i17, 1, new jz5.l(java.lang.Integer.valueOf(iaVar2.f6932o ? 45 : 3), 1));
                }
            } else {
                baseFinderFeedLoader.getDispatcher().c(i17, 1, new jz5.l(java.lang.Integer.valueOf(iaVar2.f6932o ? 45 : 3), 1));
            }
            if (iaVar2.f6928k > 0) {
                baseFinderFeedLoader.getDispatcher().c(i17, 1, new jz5.l(35, feedUpdateEvent));
            }
            c0Var.f310112d = true;
        }
    }

    private static final void invoke$notifyFavChange$5(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, int i17, kotlin.jvm.internal.c0 c0Var, int i18) {
        if (i18 != -1) {
            java.lang.Object obj = baseFinderFeedLoader.getDataList().get(i18);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
            int i19 = feedUpdateEvent.f54252g.f6921d;
            am.ia iaVar = feedUpdateEvent.f54252g;
            if (i19 == 1) {
                com.tencent.mars.xlog.Log.i(baseFinderFeedLoader.getF123427d(), "TYPE_FAV_CHANGED oldFlag = " + baseFinderFeed.getFeedObject().getFavFlag() + ", eventFlag = " + i17);
                if (baseFinderFeed.getFeedObject().getFavFlag() != i17) {
                    baseFinderFeed.getFeedObject().setFavFlag(i17);
                }
                if (iaVar.f6934q != -1) {
                    baseFinderFeed.getFeedObject().setFavCount(iaVar.f6934q);
                }
                baseFinderFeedLoader.getDispatcher().c(i18, 1, new jz5.l(4, 1));
                baseFinderFeedLoader.getDispatcher().c(i18, 1, new jz5.l(9, 1));
            } else {
                baseFinderFeedLoader.getDispatcher().c(i18, 1, new jz5.l(4, 1));
                baseFinderFeedLoader.getDispatcher().c(i18, 1, new jz5.l(9, 1));
            }
            if (iaVar.f6928k > 0) {
                baseFinderFeedLoader.getDispatcher().c(i18, 1, new jz5.l(35, feedUpdateEvent));
            }
            c0Var.f310112d = true;
        }
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m104invoke();
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:707:0x1154, code lost:
    
        if (r0 != false) goto L664;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036c A[LOOP:4: B:94:0x0334->B:104:0x036c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0705 A[LOOP:10: B:238:0x06d0->B:250:0x0705, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0efb A[LOOP:24: B:557:0x0ec6->B:569:0x0efb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0f00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x11bc  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x11d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d0 A[LOOP:3: B:72:0x029a->B:82:0x02d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cb  */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m104invoke() {
        /*
            Method dump skipped, instructions count: 5134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1.m104invoke():void");
    }
}
