package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderDataListener$feedDeleteListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedDeleteEvent;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderDataListener$feedDeleteListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent> {
    public FinderDataListener$feedDeleteListener$1(com.tencent.mm.plugin.finder.feed.model.o0 o0Var, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.__eventId = -108499199;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
        com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.n0(event, null));
        return false;
    }
}
