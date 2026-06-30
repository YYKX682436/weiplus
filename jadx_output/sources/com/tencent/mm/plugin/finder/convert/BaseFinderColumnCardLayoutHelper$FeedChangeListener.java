package com.tencent.mm.plugin.finder.convert;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/finder/convert/BaseFinderColumnCardLayoutHelper$FeedChangeListener", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/finder/convert/d;", "helperRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BaseFinderColumnCardLayoutHelper$FeedChangeListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f102821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderColumnCardLayoutHelper$FeedChangeListener(java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.convert.d> helperRef) {
        super(com.tencent.mm.app.a0.f53288d);
        kotlin.jvm.internal.o.g(helperRef, "helperRef");
        this.f102821d = helperRef;
        this.__eventId = 439877283;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
        com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.convert.d dVar = (com.tencent.mm.plugin.finder.convert.d) this.f102821d.get();
        if (dVar == null) {
            return false;
        }
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.convert.a(event, dVar));
        return true;
    }
}
