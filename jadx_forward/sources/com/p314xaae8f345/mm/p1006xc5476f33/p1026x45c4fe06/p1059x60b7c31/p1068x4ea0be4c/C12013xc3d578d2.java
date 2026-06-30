package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel */
/* loaded from: classes.dex */
class C12013xc3d578d2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c.C12013xc3d578d2> f33881x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161369d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161370e;

    public C12013xc3d578d2(java.lang.String str, java.lang.String str2) {
        this.f161369d = str;
        this.f161370e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f161369d);
        parcel.writeString(this.f161370e);
    }

    public C12013xc3d578d2(android.os.Parcel parcel) {
        this.f161369d = parcel.readString();
        this.f161370e = parcel.readString();
    }
}
