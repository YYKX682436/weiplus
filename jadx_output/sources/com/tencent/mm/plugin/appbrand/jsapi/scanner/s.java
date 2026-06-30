package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes.dex */
public final class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 869;
    private static final java.lang.String NAME = "scanItem";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.service.c0 f82975g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82976h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f82977i;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (jSONObject != null) {
            jSONObject.toString();
        }
        if (c0Var == null) {
            return;
        }
        this.f82975g = c0Var;
        java.lang.String optString = jSONObject != null ? jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : null;
        if (optString == null) {
            optString = "";
        }
        this.f82976h = optString;
        this.f82977i = i17;
        if (!(optString.length() == 0)) {
            new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask(this).d();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiScanItem", "scanItem data is empty");
            c0Var.a(i17, o("fail:invalid data"));
        }
    }
}
