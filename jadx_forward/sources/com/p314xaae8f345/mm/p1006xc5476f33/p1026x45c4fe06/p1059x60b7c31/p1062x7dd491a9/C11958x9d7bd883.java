package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState */
/* loaded from: classes7.dex */
public class C11958x9d7bd883 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11958x9d7bd883> f33703x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160312d;

    /* renamed from: e, reason: collision with root package name */
    public long f160313e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160314f;

    /* renamed from: g, reason: collision with root package name */
    public long f160315g;

    /* renamed from: h, reason: collision with root package name */
    public long f160316h;

    /* renamed from: i, reason: collision with root package name */
    public float f160317i;

    public C11958x9d7bd883(android.os.Parcel parcel) {
        this.f160312d = parcel.readString();
        this.f160313e = parcel.readLong();
        this.f160314f = parcel.readString();
        this.f160315g = parcel.readLong();
        this.f160316h = parcel.readLong();
        this.f160317i = parcel.readFloat();
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", this.f160312d);
            jSONObject.put("downloadId", this.f160313e);
            jSONObject.put("appId", this.f160314f);
            jSONObject.put("progress", this.f160315g);
            jSONObject.put("taskSize", this.f160316h);
            jSONObject.put("progressFloat", this.f160317i);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandDownloadState", "toJsonObject: " + e17.getMessage());
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160312d);
        parcel.writeLong(this.f160313e);
        parcel.writeString(this.f160314f);
        parcel.writeLong(this.f160315g);
        parcel.writeLong(this.f160316h);
        parcel.writeFloat(this.f160317i);
    }
}
