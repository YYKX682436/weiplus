package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f81553a;

    /* renamed from: b, reason: collision with root package name */
    public ft.p4 f81554b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f81555c;

    public r() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f81555c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$CheckLiteAppTask$LiteAppLifeCycleListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                if (liteAppLifeCycleEvent.f54468g.f7817a != 3) {
                    return false;
                }
                dead();
                com.tencent.mm.plugin.appbrand.jsapi.liteapp.r rVar = com.tencent.mm.plugin.appbrand.jsapi.liteapp.r.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "remove app data callback. waAppId: %s", rVar.f81553a);
                ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(rVar.f81553a, rVar.f81554b);
                return false;
            }
        };
    }
}
