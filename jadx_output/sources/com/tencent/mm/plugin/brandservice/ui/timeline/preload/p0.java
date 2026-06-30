package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class p0 implements lu4.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f94404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 f94405e;

    public p0(java.lang.String str, com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 u0Var) {
        this.f94405e = u0Var;
        this.f94404d = str;
    }

    @Override // lu4.w
    public java.lang.String getId() {
        return this.f94404d;
    }

    @Override // lu4.w
    public void m(int i17) {
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(event, "event");
        this.f94405e.c().t(eventType, event, valueCallback);
    }
}
