package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class a1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.e1 f79952a;

    public a1(com.tencent.mm.plugin.appbrand.jsapi.biz.e1 e1Var) {
        this.f79952a = e1Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "publishCallback, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17 && jSONObject == null) {
            return;
        }
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        this.f79952a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse(z17, err_msg, str));
    }
}
