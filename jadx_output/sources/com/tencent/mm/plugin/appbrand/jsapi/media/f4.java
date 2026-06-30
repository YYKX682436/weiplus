package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class f4 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.q4 f81805c;

    public f4(com.tencent.mm.plugin.appbrand.jsapi.media.q4 q4Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81805c = q4Var;
        this.f81803a = lVar;
        this.f81804b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.q4 q4Var = this.f81805c;
        int i17 = this.f81804b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81803a;
        if (jsApiChooseMultiMedia$ChooseResult == null) {
            lVar.a(i17, q4Var.o("fail"));
            return;
        }
        int i18 = jsApiChooseMultiMedia$ChooseResult.f81663d;
        if (i18 != -1) {
            if (i18 != 0) {
                lVar.a(i17, q4Var.o("fail"));
                return;
            } else {
                lVar.a(i17, q4Var.o("cancel"));
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("tempFiles", new org.json.JSONArray(jsApiChooseMultiMedia$ChooseResult.f81664e));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "err tempFiles json object create");
        }
        lVar.a(i17, q4Var.p("ok", hashMap));
    }
}
