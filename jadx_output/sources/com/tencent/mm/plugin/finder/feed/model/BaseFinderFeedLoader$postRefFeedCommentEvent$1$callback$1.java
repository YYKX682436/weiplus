package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BaseFinderFeedLoader$postRefFeedCommentEvent$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent $event;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$postRefFeedCommentEvent$1$callback$1(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent) {
        super(0);
        this.this$0 = baseFinderFeedLoader;
        this.$event = finderPostRefFeedCommentEvent;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m109invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m109invoke() {
        java.util.List dataList = this.this$0.getDataList();
        com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent = this.$event;
        java.util.Iterator it = dataList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == finderPostRefFeedCommentEvent.f54315g.f8073a) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            this.this$0.getDispatcher().c(i17, 1, new jz5.l(41, this.$event));
        }
    }
}
