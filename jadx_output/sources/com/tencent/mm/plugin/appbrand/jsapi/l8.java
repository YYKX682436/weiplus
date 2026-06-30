package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes9.dex */
class l8 implements com.tencent.mm.ipcinvoker.j {
    private l8() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        org.json.JSONObject optJSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "data is null");
            if (rVar != null) {
                bundle2.putString("errMsg", "fail:IPCLoadPayOfflineUserBindQuery data is null");
                rVar.a(bundle2);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "data != null");
        com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = new com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent();
        java.lang.String string = bundle.getString("appId", "");
        am.uh uhVar = jsApiOfflineUserBindQueryResultCallBackEvent.f54445g;
        uhVar.f8085a = string;
        uhVar.f8086b = bundle.getString("appName", "");
        uhVar.f8087c = bundle.getString("appPath", "");
        uhVar.f8088d = bundle.getString("nonceStr");
        uhVar.f8089e = bundle.getString("timeStamp");
        uhVar.f8091g = bundle.getString("paySign");
        uhVar.f8092h = bundle.getString("signType");
        uhVar.f8090f = bundle.getString("packageInfo");
        java.lang.String string2 = bundle.getString("packageInfo");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCLoadPayOfflineUserBindQuery", "fail:packageInfo is null");
            if (rVar != null) {
                bundle2.putString("errMsg", "fail:packageInfo is null");
                rVar.a(bundle2);
                return;
            }
            return;
        }
        java.lang.String[] split = string2.split("=");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(split[1])) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(split[1]).optJSONArray("busi_data");
                if (optJSONArray != null) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i17);
                        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("new_card_info")) != null) {
                            uhVar.f8093i = optJSONObject.optString("bank_type");
                            uhVar.f8094j = optJSONObject.optString("bind_serial");
                            uhVar.f8095k = optJSONObject.optString("open_success");
                        }
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCLoadPayOfflineUserBindQuery", "parseTextViewData Exception:%s", e17.getMessage());
            }
        }
        uhVar.f8096l = new com.tencent.mm.plugin.appbrand.jsapi.k8(this, jsApiOfflineUserBindQueryResultCallBackEvent, bundle2, rVar);
        jsApiOfflineUserBindQueryResultCallBackEvent.e();
    }
}
