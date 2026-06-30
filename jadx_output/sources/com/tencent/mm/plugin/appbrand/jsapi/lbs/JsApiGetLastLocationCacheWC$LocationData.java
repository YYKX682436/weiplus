package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
class JsApiGetLastLocationCacheWC$LocationData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.lbs.b0();

    /* renamed from: d, reason: collision with root package name */
    public double f81384d;

    /* renamed from: e, reason: collision with root package name */
    public double f81385e;

    public JsApiGetLastLocationCacheWC$LocationData() {
        this.f81384d = 0.0d;
        this.f81385e = 0.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f81384d);
        parcel.writeDouble(this.f81385e);
    }

    public JsApiGetLastLocationCacheWC$LocationData(android.os.Parcel parcel) {
        this.f81384d = 0.0d;
        this.f81385e = 0.0d;
        this.f81384d = parcel.readDouble();
        this.f81385e = parcel.readDouble();
    }
}
