package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState$GetInstallStateTask */
/* loaded from: classes8.dex */
class C11964x38de0d88 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11964x38de0d88> f33707x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.f0();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160376f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160377g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160378h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160379i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160380m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f160381n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160382o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160383p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160384q;

    public C11964x38de0d88(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f160376f = k0Var;
        this.f160377g = lVar;
        this.f160378h = i17;
        this.f160379i = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("packageNameArray");
        if (optJSONArray != null) {
            this.f160380m = optJSONArray.toString();
        }
        this.f160384q = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160379i = parcel.readString();
        this.f160380m = parcel.readString();
        this.f160384q = parcel.readInt() == 1;
        this.f160382o = parcel.readInt() == 1;
        this.f160383p = parcel.readString();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f160381n = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetInstallState", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160379i);
        parcel.writeString(this.f160380m);
        parcel.writeInt(this.f160384q ? 1 : 0);
        parcel.writeInt(this.f160382o ? 1 : 0);
        parcel.writeString(this.f160383p);
        org.json.JSONArray jSONArray = this.f160381n;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        boolean z17 = this.f160384q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160376f;
        int i17 = this.f160378h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160377g;
        if (z17) {
            lVar.a(i17, k0Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f160381n;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("versionName", this.f160383p);
            hashMap.put("isInstalled", java.lang.Boolean.valueOf(this.f160382o));
        }
        lVar.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160380m)) {
            android.content.pm.PackageInfo a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f160379i);
            int i17 = a17 == null ? 0 : a17.versionCode;
            java.lang.String str = a17 != null ? a17.versionName : "null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInstallState", "doGetInstallState, packageName = " + this.f160379i + ", packageInfo = " + a17 + ", version = " + i17 + ", versionName = " + str);
            if (a17 == null) {
                this.f160382o = false;
            } else {
                this.f160383p = str;
                this.f160382o = true;
            }
            this.f160384q = false;
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.f160380m);
                this.f160381n = new org.json.JSONArray();
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    java.lang.String optString = jSONArray.optString(i18);
                    android.content.pm.PackageInfo a18 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
                    int i19 = a18 == null ? 0 : a18.versionCode;
                    java.lang.String str2 = a18 == null ? "null" : a18.versionName;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInstallState", "getInstallState, packageName = " + optString + ", packageInfo = " + a18 + ", version = " + i19 + ", versionName = " + str2);
                    boolean z17 = a18 != null;
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, optString);
                        jSONObject.put("isInstalled", z17);
                        if (z17) {
                            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5, i19);
                            jSONObject.put("versionName", str2);
                        }
                        this.f160381n.put(jSONObject);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInstallState", e17.getMessage());
                    }
                }
                this.f160384q = false;
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetInstallState", e18.getMessage());
                this.f160384q = true;
            }
        }
        c();
    }

    public C11964x38de0d88(android.os.Parcel parcel) {
        v(parcel);
    }
}
