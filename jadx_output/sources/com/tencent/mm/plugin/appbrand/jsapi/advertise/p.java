package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask f78770d;

    public p(com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask jsApiOpenAdCanvas$JsApiOpenAdCanvasTask) {
        this.f78770d = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.OpenCanvasEvent openCanvasEvent = new com.tencent.mm.autogen.events.OpenCanvasEvent();
        com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask jsApiOpenAdCanvas$JsApiOpenAdCanvasTask = this.f78770d;
        java.lang.String str = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78713i;
        am.jn jnVar = openCanvasEvent.f54590g;
        jnVar.f7052a = str;
        jnVar.f7053b = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78717p;
        jnVar.f7054c = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78714m;
        jnVar.f7055d = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78715n;
        jnVar.f7057f = 0;
        jnVar.f7056e = 28;
        jnVar.f7058g = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78718q;
        jnVar.f7059h = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78720s;
        java.lang.String str2 = jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78721t;
        jnVar.getClass();
        openCanvasEvent.e();
        jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.f78719r = openCanvasEvent.f54591h.f7171a;
        jsApiOpenAdCanvas$JsApiOpenAdCanvasTask.c();
    }
}
