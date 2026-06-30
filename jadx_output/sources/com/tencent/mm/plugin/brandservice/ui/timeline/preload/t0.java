package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class t0 implements lu4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 f94434d;

    public t0(com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 u0Var) {
        this.f94434d = u0Var;
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(event, "event");
        this.f94434d.c().t(eventType, event, valueCallback);
    }
}
