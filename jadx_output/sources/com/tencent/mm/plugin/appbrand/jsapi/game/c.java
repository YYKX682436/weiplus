package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public class c implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult f81256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask f81257b;

    public c(com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask jsApiOpenGameDetail$OpenGameDetailTask, com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult openGameDetailResult) {
        this.f81257b = jsApiOpenGameDetail$OpenGameDetailTask;
        this.f81256a = openGameDetailResult;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail success");
        com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult openGameDetailResult = this.f81256a;
        openGameDetailResult.f81248d = true;
        this.f81257b.finishProcess(openGameDetailResult);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult openGameDetailResult = this.f81256a;
        openGameDetailResult.f81248d = false;
        openGameDetailResult.f81249e = "";
        openGameDetailResult.f81250f = "";
        if (map.containsKey("error")) {
            openGameDetailResult.f81249e = (java.lang.String) map.get("error");
        }
        if (map.containsKey("type")) {
            openGameDetailResult.f81250f = (java.lang.String) map.get("type");
        }
        this.f81257b.finishProcess(openGameDetailResult);
    }
}
