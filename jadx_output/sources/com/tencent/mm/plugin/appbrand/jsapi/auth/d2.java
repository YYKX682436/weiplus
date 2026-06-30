package com.tencent.mm.plugin.appbrand.jsapi.auth;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/d2;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class d2 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest)) {
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse("", -1, "unknown request"));
            return;
        }
        wd0.i1 i1Var = (wd0.i1) i95.n0.c(wd0.i1.class);
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        wd0.b bVar = new wd0.b();
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest jsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest = (com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest) appBrandProxyUIProcessTask$ProcessRequest;
        bVar.f444689a = jsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest.getBusinessId();
        java.lang.String displayName = jsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest.getDisplayName();
        kotlin.jvm.internal.o.g(displayName, "<set-?>");
        bVar.f444690b = displayName;
        java.lang.String string = getString(com.tencent.mm.R.string.mjq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        bVar.f444691c = string;
        java.lang.String usageDescription = jsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest.getUsageDescription();
        kotlin.jvm.internal.o.g(usageDescription, "<set-?>");
        bVar.f444692d = usageDescription;
        bVar.f444693e = new com.tencent.mm.plugin.appbrand.jsapi.auth.b2(appBrandProxyUIProcessTask$ProcessRequest);
        com.tencent.mm.plugin.appbrand.jsapi.auth.c2 c2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.c2(this);
        ((vd0.a) i1Var).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplyForPhoneNumberUtil", "requestTicket: " + bVar);
        v65.i.b(new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ApplyForPhoneNumberUtil", activityContext, 0, 4, null), null, new k14.a(c2Var, activityContext, bVar, null), 1, null);
    }
}
