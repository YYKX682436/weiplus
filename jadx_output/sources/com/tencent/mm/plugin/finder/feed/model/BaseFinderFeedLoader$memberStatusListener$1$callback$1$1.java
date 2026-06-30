package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BaseFinderFeedLoader$memberStatusListener$1$callback$1$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.autogen.events.MemberStatusEvent $event;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$memberStatusListener$1$callback$1$1(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent) {
        super(0);
        this.this$0 = baseFinderFeedLoader;
        this.$event = memberStatusEvent;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m107invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m107invoke() {
        java.util.AbstractCollection dataList = this.this$0.getDataList();
        com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent = this.$event;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.this$0;
        int i17 = 0;
        for (java.lang.Object obj : dataList) {
            int i18 = i17 + 1;
            if (i17 >= 0) {
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (baseFinderFeed.getFeedObject().isMemberFeed()) {
                        ya2.b2 contact = baseFinderFeed.getContact();
                        if (kotlin.jvm.internal.o.b(contact != null ? contact.D0() : null, memberStatusEvent.f54494g.f7823b)) {
                            baseFinderFeedLoader.getDispatcher().c(i17, 1, new jz5.l(39, 1));
                        }
                    }
                }
                i17 = i18;
            } else {
                kz5.c0.p();
                throw null;
            }
        }
    }
}
