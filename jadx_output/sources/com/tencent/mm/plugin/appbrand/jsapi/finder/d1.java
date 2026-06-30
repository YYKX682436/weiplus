package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/finder/d1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/finder/b1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class d1 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.finder.b1 f81196d = new com.tencent.mm.plugin.appbrand.jsapi.finder.b1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f81197e = "CheckStrangerTask";

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(request, "request");
        if (request instanceof com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShowFinderLiveToast$ShowLoadingDialogRequest) {
            java.lang.String reqData = ((com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShowFinderLiveToast$ShowLoadingDialogRequest) request).getReqData();
            if (reqData == null) {
                reqData = "";
            }
            try {
                jSONObject = new org.json.JSONObject(reqData);
            } catch (java.lang.Throwable unused) {
                jSONObject = null;
            }
            java.lang.String optString = jSONObject != null ? jSONObject.optString("toastContent") : null;
            if (optString == null) {
                optString = "正在加载";
            }
            java.lang.Number valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("duration")) : 2000L;
            com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(getActivityContext(), optString, true, 3, null);
            c17.show();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.finder.c1(c17, this), valueOf.longValue());
        }
    }
}
