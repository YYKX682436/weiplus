package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class AppBrandDownloadState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f78779d;

    /* renamed from: e, reason: collision with root package name */
    public long f78780e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f78781f;

    /* renamed from: g, reason: collision with root package name */
    public long f78782g;

    /* renamed from: h, reason: collision with root package name */
    public long f78783h;

    /* renamed from: i, reason: collision with root package name */
    public float f78784i;

    public AppBrandDownloadState(android.os.Parcel parcel) {
        this.f78779d = parcel.readString();
        this.f78780e = parcel.readLong();
        this.f78781f = parcel.readString();
        this.f78782g = parcel.readLong();
        this.f78783h = parcel.readLong();
        this.f78784i = parcel.readFloat();
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", this.f78779d);
            jSONObject.put("downloadId", this.f78780e);
            jSONObject.put("appId", this.f78781f);
            jSONObject.put("progress", this.f78782g);
            jSONObject.put("taskSize", this.f78783h);
            jSONObject.put("progressFloat", this.f78784i);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandDownloadState", "toJsonObject: " + e17.getMessage());
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78779d);
        parcel.writeLong(this.f78780e);
        parcel.writeString(this.f78781f);
        parcel.writeLong(this.f78782g);
        parcel.writeLong(this.f78783h);
        parcel.writeFloat(this.f78784i);
    }
}
