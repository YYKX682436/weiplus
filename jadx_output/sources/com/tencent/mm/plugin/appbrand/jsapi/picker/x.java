package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public final class x extends com.tencent.mm.plugin.appbrand.jsapi.picker.k implements java.lang.Runnable {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f82760m = new java.util.concurrent.atomic.AtomicReference();

    public x(com.tencent.mm.plugin.appbrand.jsapi.picker.m mVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("array");
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("current");
        if (optJSONArray == null || optJSONArray2 == null || optJSONArray.length() != optJSONArray2.length()) {
            d("fail:invalid data", null);
            return;
        }
        if (optJSONArray.length() <= 0) {
            d("ok", null);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (one-dimensional)");
            h(new com.tencent.mm.plugin.appbrand.jsapi.picker.t(this));
            return;
        }
        try {
            tl1.j[] jVarArr = new tl1.j[optJSONArray.length()];
            boolean z17 = true;
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONArray jSONArray = optJSONArray.getJSONArray(i17);
                int i18 = optJSONArray2.getInt(i17);
                int length = jSONArray.length();
                java.lang.String[] strArr = new java.lang.String[length];
                for (int i19 = 0; i19 < length; i19++) {
                    strArr[i19] = jSONArray.getString(i19);
                }
                jVarArr[i17] = new tl1.j(strArr, i18);
                z17 &= jSONArray.length() <= 0;
            }
            if (!z17) {
                this.f82760m.set(jVarArr);
                h(this);
            } else {
                d("ok", null);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (multi-dimensional)");
                h(new com.tencent.mm.plugin.appbrand.jsapi.picker.u(this));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShowMultiPickerView", e17, "opt params", new java.lang.Object[0]);
            d("fail:invalid data", null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void f(org.json.JSONObject jSONObject) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2 appBrandMultiOptionsPickerV2 = (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2) c(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2.class);
        if (appBrandMultiOptionsPickerV2 == null) {
            d("fail cant init view", null);
            return;
        }
        tl1.j[] jVarArr = (tl1.j[]) this.f82760m.get();
        if (jVarArr == null || jVarArr.length <= 0) {
            d("fail error data", null);
            return;
        }
        appBrandMultiOptionsPickerV2.a(jVarArr);
        this.f420200d.setOnResultListener(new com.tencent.mm.plugin.appbrand.jsapi.picker.v(this));
        this.f420200d.setOnValueUpdateListener(new com.tencent.mm.plugin.appbrand.jsapi.picker.w(this));
        this.f420200d.setHeader(this.f82744h);
        this.f420200d.i();
    }
}
