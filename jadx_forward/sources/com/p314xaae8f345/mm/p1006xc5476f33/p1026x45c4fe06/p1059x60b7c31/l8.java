package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes9.dex */
class l8 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private l8() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        org.json.JSONObject optJSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "data is null");
            if (rVar != null) {
                bundle2.putString("errMsg", "fail:IPCLoadPayOfflineUserBindQuery data is null");
                rVar.a(bundle2);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "data != null");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca c5653x583ecdca = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca();
        java.lang.String string = bundle.getString("appId", "");
        am.uh uhVar = c5653x583ecdca.f135978g;
        uhVar.f89618a = string;
        uhVar.f89619b = bundle.getString("appName", "");
        uhVar.f89620c = bundle.getString("appPath", "");
        uhVar.f89621d = bundle.getString("nonceStr");
        uhVar.f89622e = bundle.getString("timeStamp");
        uhVar.f89624g = bundle.getString("paySign");
        uhVar.f89625h = bundle.getString("signType");
        uhVar.f89623f = bundle.getString("packageInfo");
        java.lang.String string2 = bundle.getString("packageInfo");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCLoadPayOfflineUserBindQuery", "fail:packageInfo is null");
            if (rVar != null) {
                bundle2.putString("errMsg", "fail:packageInfo is null");
                rVar.a(bundle2);
                return;
            }
            return;
        }
        java.lang.String[] split = string2.split("=");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[1])) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(split[1]).optJSONArray("busi_data");
                if (optJSONArray != null) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i17);
                        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("new_card_info")) != null) {
                            uhVar.f89626i = optJSONObject.optString("bank_type");
                            uhVar.f89627j = optJSONObject.optString("bind_serial");
                            uhVar.f89628k = optJSONObject.optString("open_success");
                        }
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCLoadPayOfflineUserBindQuery", "parseTextViewData Exception:%s", e17.getMessage());
            }
        }
        uhVar.f89629l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k8(this, c5653x583ecdca, bundle2, rVar);
        c5653x583ecdca.e();
    }
}
