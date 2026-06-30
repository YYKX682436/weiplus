package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class s0 implements lu4.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 f94427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94428e;

    public s0(com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 u0Var, java.lang.String str) {
        this.f94427d = u0Var;
        this.f94428e = str;
    }

    @Override // lu4.r
    public int F() {
        return com.tencent.mm.plugin.webview.webcompt.a.b(this.f94427d.c().B0());
    }

    @Override // lu4.r
    public void I(java.lang.String func, java.lang.String message) {
        kotlin.jvm.internal.o.g(func, "func");
        kotlin.jvm.internal.o.g(message, "message");
    }

    @Override // lu4.r
    public int S() {
        return 0;
    }

    @Override // lu4.r
    @android.webkit.JavascriptInterface
    public java.lang.String getLocalData(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String t17 = com.tencent.mm.sdk.platformtools.v3.t((com.tencent.mm.sdk.platformtools.v3) ((jz5.n) this.f94427d.f94459c).getValue(), this.f94428e + ':' + key, null, 2, null);
        if (t17 == null) {
            t17 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] getLocalData key = " + key + ", data = " + t17);
        return t17;
    }

    @Override // lu4.r
    public nw4.i s() {
        return new com.tencent.mm.plugin.brandservice.ui.timeline.preload.r0();
    }

    @Override // lu4.r
    @android.webkit.JavascriptInterface
    public void setLocalData(java.lang.String key, java.lang.String data) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] setLocalData key = " + key + ", data = " + data);
        ((com.tencent.mm.sdk.platformtools.o4) ((com.tencent.mm.sdk.platformtools.v3) ((jz5.n) this.f94427d.f94459c).getValue()).i()).D(this.f94428e + ':' + key, data);
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(event, "event");
        this.f94427d.c().t(eventType, event, valueCallback);
    }

    @Override // lu4.r
    public boolean y(int i17, java.lang.String cgiUrl) {
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        return false;
    }
}
