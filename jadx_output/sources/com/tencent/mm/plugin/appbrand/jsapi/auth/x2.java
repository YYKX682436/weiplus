package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class x2 implements com.tencent.mm.plugin.appbrand.jsapi.auth.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o f79779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask f79780e;

    public x2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        this.f79780e = jsApiOperateWXData$OperateWXDataTask;
        this.f79779d = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public void a() {
        this.f79779d.a();
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79780e;
        com.tencent.mm.plugin.appbrand.y yVar = jsApiOperateWXData$OperateWXDataTask.f79377g;
        if (yVar != null && yVar.t3() != null) {
            jsApiOperateWXData$OperateWXDataTask.f79377g.t3().n2(jsApiOperateWXData$OperateWXDataTask);
        }
        jsApiOperateWXData$OperateWXDataTask.x();
    }
}
