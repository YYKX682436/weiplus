package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/o;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput;", "Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class o implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput, com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskRet> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput data = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.wechat.iam.biz.o0.f217763b.b(data.f79924d, data.f79925e, new com.tencent.mm.plugin.appbrand.jsapi.biz.n(callback));
    }
}
