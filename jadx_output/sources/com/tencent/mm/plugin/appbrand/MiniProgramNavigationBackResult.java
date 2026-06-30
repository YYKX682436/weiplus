package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class MiniProgramNavigationBackResult implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.AppBrandRuntime f74874d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f74875e;

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONObject f74876f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult f74873g = new com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult();
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult> CREATOR = new com.tencent.mm.plugin.appbrand.rc();

    public MiniProgramNavigationBackResult(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.rc rcVar) {
        try {
            java.lang.String readString = parcel.readString();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = "{}";
            this.f74875e = new org.json.JSONObject(readString == null ? "{}" : readString);
            java.lang.String readString2 = parcel.readString();
            if (readString2 != null) {
                str = readString2;
            }
            this.f74876f = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.MiniProgramNavigationBackResult", "readFromParcel, ex = %s", e17);
        }
    }

    public static com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult miniProgramNavigationBackResult = new com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult();
        miniProgramNavigationBackResult.f74874d = appBrandRuntime;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (jSONObject == null) {
            jSONObject = jSONObject3;
        }
        miniProgramNavigationBackResult.f74875e = jSONObject;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        if (jSONObject2 == null) {
            jSONObject2 = jSONObject4;
        }
        miniProgramNavigationBackResult.f74876f = jSONObject2;
        return miniProgramNavigationBackResult;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MiniProgramNavigationBackResult{extraData=" + this.f74875e + ", privateData=" + this.f74876f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        org.json.JSONObject jSONObject = this.f74875e;
        parcel.writeString(jSONObject == null ? null : jSONObject.toString());
        org.json.JSONObject jSONObject2 = this.f74876f;
        parcel.writeString(jSONObject2 != null ? jSONObject2.toString() : null);
    }
}
