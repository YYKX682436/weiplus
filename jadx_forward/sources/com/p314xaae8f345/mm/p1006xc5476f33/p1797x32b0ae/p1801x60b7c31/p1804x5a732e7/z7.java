package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class z7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiWriteCommData", "writeCommData fail, packageName is null");
            this.f224976f.a("fail: packageName is null");
            return;
        }
        boolean commit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "_comm_preferences", 0).edit().putString(optString, jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiWriteCommData", "writeCommData, ret = %b, packageName = %s, data length = %d", java.lang.Boolean.valueOf(commit), optString, java.lang.Integer.valueOf(jSONObject.length()));
        if (commit) {
            this.f224976f.d(false);
        } else {
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
