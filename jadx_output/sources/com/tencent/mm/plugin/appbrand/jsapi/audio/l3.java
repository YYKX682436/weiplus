package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class l3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 32;
    public static final java.lang.String NAME = "stopRecord";

    public static void C(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.jsapi.audio.d3.f79175m)) {
            return;
        }
        mi1.w0 w0Var = com.tencent.mm.plugin.appbrand.m6.b(e9Var.getAppId()).f85710c;
        if (w0Var != null) {
            w0Var.dismiss();
        }
        new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice$StopRecordVoice().d();
        com.tencent.mm.plugin.appbrand.jsapi.audio.d3.f79175m = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        C(e9Var);
        e9Var.a(i17, o("ok"));
    }
}
