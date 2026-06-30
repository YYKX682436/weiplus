package gx4;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f358966a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f358967b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f358968c;

    /* renamed from: d, reason: collision with root package name */
    public int f358969d;

    /* renamed from: e, reason: collision with root package name */
    public int f358970e;

    /* renamed from: f, reason: collision with root package name */
    public long f358971f;

    /* renamed from: g, reason: collision with root package name */
    public int f358972g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f358973h;

    public s() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "BagInfo#load %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f358966a = null;
            this.f358967b = null;
            this.f358968c = null;
            this.f358970e = (i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - gx4.e.f358946d) - gx4.e.f358947e;
            this.f358969d = gx4.e.f358945c + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aeh);
            this.f358973h = new org.json.JSONObject();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "BAG_INIT_X:%d BAG_INIT_Y:%d", java.lang.Integer.valueOf(this.f358970e), java.lang.Integer.valueOf(this.f358969d));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f358967b = jSONObject.getString("url");
            this.f358966a = jSONObject.optString(dm.i4.f66865x76d1ec5a, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.String.format("bagId#%d#%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), this.f358967b)));
            this.f358968c = jSONObject.getString("icon");
            this.f358969d = jSONObject.getInt("pos_y");
            this.f358970e = jSONObject.getInt("pos_x");
            this.f358971f = jSONObject.getLong("last_active_time");
            this.f358973h = jSONObject.getJSONObject("extras");
            this.f358972g = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagMgr", "BagInfo#load exp:%s", e17);
        }
    }

    public void a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f358966a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put(dm.i4.f66865x76d1ec5a, str);
            java.lang.String str3 = this.f358967b;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("url", str3);
            java.lang.String str4 = this.f358968c;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("icon", str2);
            jSONObject.put("pos_y", this.f358969d);
            jSONObject.put("pos_x", this.f358970e);
            jSONObject.put("last_active_time", this.f358971f);
            jSONObject.put("extras", this.f358973h);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f358972g);
            java.lang.String jSONObject2 = jSONObject.toString();
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC, jSONObject2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagMgr", "BagInfo#save exp:%s", e17);
        }
    }
}
