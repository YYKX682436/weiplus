package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k {
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.c0 c0Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
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
            h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.a0(this, optInt, new tl1.j(strArr, jSONObject.optInt("current", 0))));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiUpdateMultiPickerView", e17, "opt params", new java.lang.Object[0]);
            d("fail:invalid data", null);
        }
    }
}
