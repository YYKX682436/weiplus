package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
class q1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private q1() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d);
        android.os.Bundle bundle = new android.os.Bundle();
        if (e17 == null) {
            rVar.a(bundle);
        }
        java.lang.String optString = e17.optString("current");
        org.json.JSONArray optJSONArray = e17.optJSONArray("urls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            rVar.a(bundle);
        }
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            java.lang.String optString2 = optJSONArray.optString(i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || optString2.equalsIgnoreCase("null")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiImagePreview", "null url, i = %d", java.lang.Integer.valueOf(i17));
            } else {
                if (optString2.startsWith("weixin://resourceid/")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(optString2);
                    if (b17 != null) {
                        optString2 = b17.f264271g;
                    }
                }
                arrayList.add(optString2);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = strArr[0];
        } else if (optString.startsWith("weixin://resourceid/")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(optString);
            optString = b18 != null ? b18.f264271g : "";
        }
        bundle.putString("nowUrl", optString);
        bundle.putStringArray("urlList", strArr);
        rVar.a(bundle);
    }
}
