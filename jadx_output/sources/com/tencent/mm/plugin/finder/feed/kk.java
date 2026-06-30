package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f107220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(0);
        this.f107220d = tlVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.finder.feed.tl tlVar = this.f107220d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(tlVar.f109069d) { // from class: com.tencent.mm.plugin.finder.feed.FinderLongVideoShareContract$feedChangeListener$2$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.jk(event, com.tencent.mm.plugin.finder.feed.tl.this));
                return false;
            }
        };
    }
}
