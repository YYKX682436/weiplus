package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes5.dex */
public final class g0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f77748e;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.f0 f77747d = new com.tencent.mm.plugin.appbrand.debugger.f0(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f77749f = new java.util.concurrent.CopyOnWriteArrayList();

    public g0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExptChangeEvent event = (com.tencent.mm.autogen.events.ExptChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        f77747d.a();
        return false;
    }
}
