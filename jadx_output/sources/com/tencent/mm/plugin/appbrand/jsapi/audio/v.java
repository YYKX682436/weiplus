package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79290e;

    public v(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f79289d = str;
        this.f79290e = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void b() {
        java.util.Map map = jh1.a.f299795d;
        ((java.util.concurrent.ConcurrentHashMap) map).put(this.f79289d, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "onDestroy, appId:%s", this.f79289d);
        com.tencent.mm.plugin.appbrand.jsapi.audio.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.w();
        wVar.f79295f = 2;
        wVar.f79293d = this.f79289d;
        java.lang.System.currentTimeMillis();
        wVar.a();
        com.tencent.mm.plugin.appbrand.x0.e(this.f79289d, this);
        com.tencent.mm.plugin.appbrand.jsapi.audio.x.f79298g.remove(this.f79289d);
        com.tencent.mm.plugin.appbrand.jsapi.audio.d dVar = com.tencent.mm.plugin.appbrand.jsapi.audio.d.INSTANCE;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79290e;
        java.lang.String str = this.f79289d;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioInstanceContext", "removeBufferURLManager");
        com.tencent.mm.plugin.appbrand.jsruntime.c1 c1Var = (com.tencent.mm.plugin.appbrand.jsruntime.c1) dVar.f79174e.remove(str);
        com.tencent.mm.plugin.appbrand.jsruntime.d1 H = ((com.tencent.mm.plugin.appbrand.jsruntime.v) lVar.getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class)).H();
        if (c1Var == null || H == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.a aVar = (com.tencent.mm.plugin.appbrand.jsruntime.a) H;
        synchronized (aVar.f83963a) {
            aVar.f83963a.remove(c1Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        java.lang.String str = this.f79289d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "onPause, appId:%s", str);
        ((java.util.concurrent.ConcurrentHashMap) jh1.a.f299795d).put(str, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.appbrand.jsapi.audio.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.w();
        wVar.f79295f = 1;
        wVar.f79293d = str;
        wVar.c();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        java.util.Map map = jh1.a.f299795d;
        ((java.util.concurrent.ConcurrentHashMap) map).put(this.f79289d, java.lang.Boolean.TRUE);
    }
}
