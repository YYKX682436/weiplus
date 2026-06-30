package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public final class h0 extends com.tencent.mm.plugin.appbrand.jsapi.picker.k {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void f(org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("array");
        int optInt = jSONObject.optInt("current", 0);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "showPickerView as selector, empty range");
            d("ok", null);
            h(new com.tencent.mm.plugin.appbrand.jsapi.picker.d0(this));
            return;
        }
        java.lang.String[] strArr = new java.lang.String[optJSONArray.length()];
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            try {
                strArr[i17] = optJSONArray.getString(i17);
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "opt data.array, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                d("fail", null);
                return;
            }
        }
        h(new com.tencent.mm.plugin.appbrand.jsapi.picker.e0(this, strArr, optInt));
    }
}
