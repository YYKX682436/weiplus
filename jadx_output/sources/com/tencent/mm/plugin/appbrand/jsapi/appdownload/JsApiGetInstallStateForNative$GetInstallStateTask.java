package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes8.dex */
class JsApiGetInstallStateForNative$GetInstallStateTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative$GetInstallStateTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.h0();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78852f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78853g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78854h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78855i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78856m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f78857n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78858o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f78859p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f78860q;

    public JsApiGetInstallStateForNative$GetInstallStateTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78852f = k0Var;
        this.f78853g = e9Var;
        this.f78854h = i17;
        this.f78855i = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("packageNameArray");
        if (optJSONArray != null) {
            this.f78856m = optJSONArray.toString();
        }
        this.f78860q = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78855i = parcel.readString();
        this.f78856m = parcel.readString();
        this.f78860q = parcel.readInt() == 1;
        this.f78858o = parcel.readInt() == 1;
        this.f78859p = parcel.readString();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f78857n = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetInstallStateForNative", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78855i);
        parcel.writeString(this.f78856m);
        parcel.writeInt(this.f78860q ? 1 : 0);
        parcel.writeInt(this.f78858o ? 1 : 0);
        parcel.writeString(this.f78859p);
        org.json.JSONArray jSONArray = this.f78857n;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        boolean z17 = this.f78860q;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78852f;
        int i17 = this.f78854h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78853g;
        if (z17) {
            e9Var.a(i17, k0Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f78857n;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("versionName", this.f78859p);
            hashMap.put("isInstalled", java.lang.Boolean.valueOf(this.f78858o));
        }
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78856m)) {
            android.content.pm.PackageInfo a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f78855i);
            int i17 = a17 == null ? 0 : a17.versionCode;
            java.lang.String str = a17 != null ? a17.versionName : "null";
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInstallStateForNative", "doGetInstallState, packageName = " + this.f78855i + ", packageInfo = " + a17 + ", version = " + i17 + ", versionName = " + str);
            if (a17 == null) {
                this.f78858o = false;
            } else {
                this.f78859p = str;
                this.f78858o = true;
            }
            this.f78860q = false;
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.f78856m);
                this.f78857n = new org.json.JSONArray();
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    java.lang.String optString = jSONArray.optString(i18);
                    android.content.pm.PackageInfo a18 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
                    int i19 = a18 == null ? 0 : a18.versionCode;
                    java.lang.String str2 = a18 == null ? "null" : a18.versionName;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInstallStateForNative", "getInstallState, packageName = " + optString + ", packageInfo = " + a18 + ", version = " + i19 + ", versionName = " + str2);
                    boolean z17 = a18 != null;
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, optString);
                        jSONObject.put("isInstalled", z17);
                        if (z17) {
                            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, i19);
                            jSONObject.put("versionName", str2);
                        }
                        this.f78857n.put(jSONObject);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInstallStateForNative", e17.getMessage());
                    }
                }
                this.f78860q = false;
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetInstallStateForNative", e18.getMessage());
                this.f78860q = true;
            }
        }
        c();
    }

    public JsApiGetInstallStateForNative$GetInstallStateTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
