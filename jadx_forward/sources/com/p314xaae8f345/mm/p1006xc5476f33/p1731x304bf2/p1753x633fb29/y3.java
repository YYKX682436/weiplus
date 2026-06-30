package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f222066a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f222067b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f222068c;

    /* renamed from: d, reason: collision with root package name */
    public int f222069d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f222070e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f222071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f222072g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f222073h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f222074i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f222075j;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x3 x3Var) {
    }

    public com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQDownloaderSDKWrapper", "params is : [%s]", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "params is null or nil");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                this.f222068c = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56301x838f48c);
                this.f222070e = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56308x97129f1f);
                this.f222069d = jSONObject.optInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56305x2252dbed);
                this.f222074i = jSONObject.optString("channelID");
                this.f222072g = jSONObject.optString("uin");
                this.f222066a = jSONObject.optString("SNGAppId");
                this.f222067b = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56302x8390751);
                this.f222073h = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56307x4c587525);
                this.f222071f = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56304xd1b84066);
                this.f222075j = jSONObject.optString("actionFlag");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "parse parms failed:[%s]", e17.getMessage());
            }
        }
        return new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b(this.f222066a, this.f222067b, this.f222068c, this.f222069d, this.f222070e, this.f222071f, this.f222072g, this.f222073h, this.f222074i, this.f222075j);
    }
}
