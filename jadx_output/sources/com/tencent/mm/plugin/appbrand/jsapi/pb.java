package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pb;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiPrivateGetProfileConfig$MsgQueryTaskParam;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiPrivateGetProfileConfig$MsgQueryTaskResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class pb implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam params = (com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam) obj;
        kotlin.jvm.internal.o.g(params, "params");
        int D0 = ((com.tencent.mm.storage.z9) ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi()).D0(params.f78598d);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskResult(D0 > 0));
        }
    }
}
