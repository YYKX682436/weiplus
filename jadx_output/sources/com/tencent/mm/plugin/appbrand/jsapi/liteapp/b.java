package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class b implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.liteapp.c f81531b;

    public b(com.tencent.mm.plugin.appbrand.jsapi.liteapp.c cVar, java.lang.String str) {
        this.f81531b = cVar;
        this.f81530a = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "create store fail.");
        this.f81531b.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INTERNAL_ERROR")));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "create store success appId: %s", this.f81530a);
        this.f81531b.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("OK")));
    }
}
