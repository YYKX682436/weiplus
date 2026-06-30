package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/e9;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "i", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseRequest;", "d", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseRequest;", "()Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseRequest;", "g", "(Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseRequest;)V", "mRequest", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseResult;", "e", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseResult;", "()Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseResult;", "h", "(Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseResult;)V", "mResult", "", "f", "()Z", "isMemoryEnough", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class e9 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest mRequest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult mResult = new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult();

    /* renamed from: d, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest getMRequest() {
        return this.mRequest;
    }

    /* renamed from: e, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult getMResult() {
        return this.mResult;
    }

    public final boolean f() {
        return com.tencent.mm.sdk.platformtools.t8.w(getActivityContext()) > 200;
    }

    public final void g(com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest) {
        this.mRequest = jsApiOpenCameraForImageSearch$ChooseRequest;
    }

    public final void h(com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult jsApiOpenCameraForImageSearch$ChooseResult) {
        kotlin.jvm.internal.o.g(jsApiOpenCameraForImageSearch$ChooseResult, "<set-?>");
        this.mResult = jsApiOpenCameraForImageSearch$ChooseResult;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest = (com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest) request;
        this.mRequest = jsApiOpenCameraForImageSearch$ChooseRequest;
        jsApiOpenCameraForImageSearch$ChooseRequest.t(true);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest2 = this.mRequest;
        kotlin.jvm.internal.o.d(jsApiOpenCameraForImageSearch$ChooseRequest2);
        kotlin.jvm.internal.o.d(this.mRequest);
        jsApiOpenCameraForImageSearch$ChooseRequest2.o((int) java.lang.Math.max(1.0d, java.lang.Math.min(9.0d, r1.getCount())));
        if (!f()) {
            db5.t7.makeText(getActivityContext(), getString(com.tencent.mm.R.string.f490079kb), 1).show();
        }
        getActivityContext().mmSetOnActivityResultCallback(this);
        i();
    }

    public final void i() {
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.d9(this));
    }
}
