package com.tencent.mm.plugin.finder.config.base;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/config/base/FinderSvrConfigMonitor;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-config_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderSvrConfigMonitor extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ConfigUpdatedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor f102819d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f102820e;

    static {
        com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor finderSvrConfigMonitor = new com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor();
        f102819d = finderSvrConfigMonitor;
        finderSvrConfigMonitor.alive();
        f102820e = new java.util.concurrent.ConcurrentHashMap(512);
    }

    private FinderSvrConfigMonitor() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = 320120113;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent) {
        java.lang.ref.WeakReference weakReference;
        mb2.e eVar;
        com.tencent.mm.autogen.events.ConfigUpdatedEvent event = configUpdatedEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f102820e;
        if (concurrentHashMap != null) {
            am.k3 k3Var = event.f54072g;
            java.lang.String str = k3Var.f7126a;
            if (!(str == null || str.length() == 0) && (weakReference = (java.lang.ref.WeakReference) concurrentHashMap.get(k3Var.f7126a)) != null && (eVar = (mb2.e) weakReference.get()) != null) {
                com.tencent.mars.xlog.Log.i("FinderSvrConfigMonitor", "config: " + k3Var.f7126a + " has update");
                eVar.a();
                yz5.a aVar = ((mb2.a) eVar).f325335c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
        return false;
    }
}
