package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative$GetInstallStateTask */
/* loaded from: classes8.dex */
class C11965x82ca0112 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11965x82ca0112> f33708x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h0();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160385f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160386g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160387h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160388i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160389m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f160390n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160391o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160392p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160393q;

    public C11965x82ca0112(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160385f = k0Var;
        this.f160386g = e9Var;
        this.f160387h = i17;
        this.f160388i = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("packageNameArray");
        if (optJSONArray != null) {
            this.f160389m = optJSONArray.toString();
        }
        this.f160393q = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160388i = parcel.readString();
        this.f160389m = parcel.readString();
        this.f160393q = parcel.readInt() == 1;
        this.f160391o = parcel.readInt() == 1;
        this.f160392p = parcel.readString();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f160390n = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetInstallStateForNative", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160388i);
        parcel.writeString(this.f160389m);
        parcel.writeInt(this.f160393q ? 1 : 0);
        parcel.writeInt(this.f160391o ? 1 : 0);
        parcel.writeString(this.f160392p);
        org.json.JSONArray jSONArray = this.f160390n;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        boolean z17 = this.f160393q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160385f;
        int i17 = this.f160387h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160386g;
        if (z17) {
            e9Var.a(i17, k0Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f160390n;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("versionName", this.f160392p);
            hashMap.put("isInstalled", java.lang.Boolean.valueOf(this.f160391o));
        }
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160389m)) {
            android.content.pm.PackageInfo a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f160388i);
            int i17 = a17 == null ? 0 : a17.versionCode;
            java.lang.String str = a17 != null ? a17.versionName : "null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInstallStateForNative", "doGetInstallState, packageName = " + this.f160388i + ", packageInfo = " + a17 + ", version = " + i17 + ", versionName = " + str);
            if (a17 == null) {
                this.f160391o = false;
            } else {
                this.f160392p = str;
                this.f160391o = true;
            }
            this.f160393q = false;
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.f160389m);
                this.f160390n = new org.json.JSONArray();
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    java.lang.String optString = jSONArray.optString(i18);
                    android.content.pm.PackageInfo a18 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
                    int i19 = a18 == null ? 0 : a18.versionCode;
                    java.lang.String str2 = a18 == null ? "null" : a18.versionName;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInstallStateForNative", "getInstallState, packageName = " + optString + ", packageInfo = " + a18 + ", version = " + i19 + ", versionName = " + str2);
                    boolean z17 = a18 != null;
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, optString);
                        jSONObject.put("isInstalled", z17);
                        if (z17) {
                            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5, i19);
                            jSONObject.put("versionName", str2);
                        }
                        this.f160390n.put(jSONObject);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInstallStateForNative", e17.getMessage());
                    }
                }
                this.f160393q = false;
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetInstallStateForNative", e18.getMessage());
                this.f160393q = true;
            }
        }
        c();
    }

    public C11965x82ca0112(android.os.Parcel parcel) {
        v(parcel);
    }
}
