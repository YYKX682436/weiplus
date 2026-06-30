package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class y2 implements com.tencent.mm.plugin.appbrand.jsapi.auth.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.z2 f79795a;

    public y2(com.tencent.mm.plugin.appbrand.jsapi.auth.z2 z2Var) {
        this.f79795a = z2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.b0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79795a.f79808a;
        jsApiOperateWXData$OperateWXDataTask.f79394x = str;
        jsApiOperateWXData$OperateWXDataTask.c();
    }
}
