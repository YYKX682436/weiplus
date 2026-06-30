package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BaseFinderFeedLoader$feedDeleteListener$1$callback$1$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.autogen.events.FeedDeleteEvent $event;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$feedDeleteListener$1$callback$1$1(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader) {
        super(0);
        this.$event = feedDeleteEvent;
        this.this$0 = baseFinderFeedLoader;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m105invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m105invoke() {
        this.$event.f54247g.getClass();
        if (!this.$event.f54247g.f6439c || this.this$0.ifDelLiveFeed()) {
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.this$0;
            am.da daVar = this.$event.f54247g;
            baseFinderFeedLoader.onDeleteFeed(daVar.f6437a, daVar.f6438b);
        }
    }
}
