package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class s0 implements lu4.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u0 f175960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175961e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u0 u0Var, java.lang.String str) {
        this.f175960d = u0Var;
        this.f175961e = str;
    }

    @Override // lu4.r
    public int F() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.b(this.f175960d.c().B0());
    }

    @Override // lu4.r
    public void I(java.lang.String func, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
    }

    @Override // lu4.r
    public int S() {
        return 0;
    }

    @Override // lu4.r
    @android.webkit.JavascriptInterface
    /* renamed from: getLocalData */
    public java.lang.String mo54387xb79006ff(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v3.t((com.p314xaae8f345.mm.sdk.p2603x2137b148.v3) ((jz5.n) this.f175960d.f175992c).mo141623x754a37bb(), this.f175961e + ':' + key, null, 2, null);
        if (t17 == null) {
            t17 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] getLocalData key = " + key + ", data = " + t17);
        return t17;
    }

    @Override // lu4.r
    public nw4.i s() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.r0();
    }

    @Override // lu4.r
    @android.webkit.JavascriptInterface
    /* renamed from: setLocalData */
    public void mo54388x13e3c773(java.lang.String key, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] setLocalData key = " + key + ", data = " + data);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.v3) ((jz5.n) this.f175960d.f175992c).mo141623x754a37bb()).i()).D(this.f175961e + ':' + key, data);
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f175960d.c().t(eventType, event, valueCallback);
    }

    @Override // lu4.r
    public boolean y(int i17, java.lang.String cgiUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiUrl, "cgiUrl");
        return false;
    }
}
