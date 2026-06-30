package com.tencent.mm.plugin.finder.config.base;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/config/base/FinderDynConfigMonitor;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DynamicConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-config_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderDynConfigMonitor extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor f102817d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f102818e;

    static {
        com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor finderDynConfigMonitor = new com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor();
        f102817d = finderDynConfigMonitor;
        finderDynConfigMonitor.alive();
        f102818e = new java.util.concurrent.ConcurrentHashMap();
    }

    private FinderDynConfigMonitor() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = -443124368;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent) {
        yz5.a aVar;
        com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent event = dynamicConfigUpdatedEvent;
        kotlin.jvm.internal.o.g(event, "event");
        for (java.util.Map.Entry entry : f102818e.entrySet()) {
            mb2.e eVar = (mb2.e) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (eVar != null) {
                eVar.a();
            }
            mb2.e eVar2 = (mb2.e) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (eVar2 != null && (aVar = ((mb2.a) eVar2).f325335c) != null) {
                aVar.invoke();
            }
        }
        return false;
    }
}
