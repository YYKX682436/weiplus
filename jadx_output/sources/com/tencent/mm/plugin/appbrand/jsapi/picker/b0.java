package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class b0 extends com.tencent.mm.plugin.appbrand.jsapi.picker.k {
    public b0(com.tencent.mm.plugin.appbrand.jsapi.picker.c0 c0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void f(org.json.JSONObject jSONObject) {
        int optInt = jSONObject.optInt("column", -1);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("array");
        if (optInt < 0 || optJSONArray == null || optJSONArray.length() < 0) {
            d("fail:invalid data", null);
            return;
        }
        try {
            int length = optJSONArray.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                strArr[i17] = optJSONArray.getString(i17);
            }
            h(new com.tencent.mm.plugin.appbrand.jsapi.picker.a0(this, optInt, new tl1.j(strArr, jSONObject.optInt("current", 0))));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiUpdateMultiPickerView", e17, "opt params", new java.lang.Object[0]);
            d("fail:invalid data", null);
        }
    }
}
