package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
class WxaOpenLiteAppBusinessViewResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.m0();

    /* renamed from: d, reason: collision with root package name */
    public int f80918d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f80919e = "";

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONObject f80920f = null;

    public WxaOpenLiteAppBusinessViewResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        this.f80918d = parcel.readInt();
        this.f80919e = parcel.readString();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                if (!readString.isEmpty()) {
                    jSONObject = new org.json.JSONObject(readString);
                    this.f80920f = jSONObject;
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("WxaOpenLiteAppBusinessViewResult", "readParcel: ", e17);
                return;
            }
        }
        jSONObject = new org.json.JSONObject();
        this.f80920f = jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f80918d);
        parcel.writeString(this.f80919e);
        org.json.JSONObject jSONObject = this.f80920f;
        parcel.writeString(jSONObject == null ? null : jSONObject.toString());
    }

    public WxaOpenLiteAppBusinessViewResult(android.os.Parcel parcel) {
        readParcel(parcel);
    }
}
