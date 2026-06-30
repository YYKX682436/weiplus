package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class l5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 906;
    public static final java.lang.String NAME = "editTextWithPopForm";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null) {
            return;
        }
        if (jSONObject == null) {
            d0Var.a(i17, "fail:invalid data");
            return;
        }
        com.tencent.mars.xlog.Log.i("JsApiEditTextWithPopForm", "invoke data:" + jSONObject);
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
        kotlin.jvm.internal.o.d(optString);
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.k5(this, r07, optString, d0Var, i17));
        }
    }
}
