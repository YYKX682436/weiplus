package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderDataListener$feedChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderDataListener$feedChangeListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> {
    public FinderDataListener$feedChangeListener$1(com.tencent.mm.plugin.finder.feed.model.o0 o0Var, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.__eventId = 439877283;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
        com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.model.m0(event, null));
        return false;
    }
}
