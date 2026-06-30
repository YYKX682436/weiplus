package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes8.dex */
class JsApiGetInstallState$GetInstallStateTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState$GetInstallStateTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.f0();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78843f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78844g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78845h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78846i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78847m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONArray f78848n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78849o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f78850p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f78851q;

    public JsApiGetInstallState$GetInstallStateTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f78843f = k0Var;
        this.f78844g = lVar;
        this.f78845h = i17;
        this.f78846i = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("packageNameArray");
        if (optJSONArray != null) {
            this.f78847m = optJSONArray.toString();
        }
        this.f78851q = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78846i = parcel.readString();
        this.f78847m = parcel.readString();
        this.f78851q = parcel.readInt() == 1;
        this.f78849o = parcel.readInt() == 1;
        this.f78850p = parcel.readString();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f78848n = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetInstallState", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78846i);
        parcel.writeString(this.f78847m);
        parcel.writeInt(this.f78851q ? 1 : 0);
        parcel.writeInt(this.f78849o ? 1 : 0);
        parcel.writeString(this.f78850p);
        org.json.JSONArray jSONArray = this.f78848n;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        boolean z17 = this.f78851q;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78843f;
        int i17 = this.f78845h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78844g;
        if (z17) {
            lVar.a(i17, k0Var.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = this.f78848n;
        if (jSONArray != null) {
            hashMap.put("result", jSONArray);
        } else {
            hashMap.put("versionName", this.f78850p);
            hashMap.put("isInstalled", java.lang.Boolean.valueOf(this.f78849o));
        }
        lVar.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78847m)) {
            android.content.pm.PackageInfo a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f78846i);
            int i17 = a17 == null ? 0 : a17.versionCode;
            java.lang.String str = a17 != null ? a17.versionName : "null";
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInstallState", "doGetInstallState, packageName = " + this.f78846i + ", packageInfo = " + a17 + ", version = " + i17 + ", versionName = " + str);
            if (a17 == null) {
                this.f78849o = false;
            } else {
                this.f78850p = str;
                this.f78849o = true;
            }
            this.f78851q = false;
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.f78847m);
                this.f78848n = new org.json.JSONArray();
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    java.lang.String optString = jSONArray.optString(i18);
                    android.content.pm.PackageInfo a18 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, optString);
                    int i19 = a18 == null ? 0 : a18.versionCode;
                    java.lang.String str2 = a18 == null ? "null" : a18.versionName;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInstallState", "getInstallState, packageName = " + optString + ", packageInfo = " + a18 + ", version = " + i19 + ", versionName = " + str2);
                    boolean z17 = a18 != null;
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, optString);
                        jSONObject.put("isInstalled", z17);
                        if (z17) {
                            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, i19);
                            jSONObject.put("versionName", str2);
                        }
                        this.f78848n.put(jSONObject);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInstallState", e17.getMessage());
                    }
                }
                this.f78851q = false;
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetInstallState", e18.getMessage());
                this.f78851q = true;
            }
        }
        c();
    }

    public JsApiGetInstallState$GetInstallStateTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
