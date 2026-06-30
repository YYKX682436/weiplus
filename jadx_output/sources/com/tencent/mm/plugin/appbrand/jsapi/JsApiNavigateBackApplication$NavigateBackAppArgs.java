package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class JsApiNavigateBackApplication$NavigateBackAppArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.c8();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78563d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78564e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f78565f;

    /* renamed from: g, reason: collision with root package name */
    public final int f78566g;

    public JsApiNavigateBackApplication$NavigateBackAppArgs(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f78563d = str;
        this.f78564e = str2;
        this.f78565f = str3;
        this.f78566g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78563d);
        parcel.writeString(this.f78564e);
        parcel.writeString(this.f78565f);
        parcel.writeInt(this.f78566g);
    }

    public JsApiNavigateBackApplication$NavigateBackAppArgs(android.os.Parcel parcel) {
        this.f78563d = parcel.readString();
        this.f78564e = parcel.readString();
        this.f78565f = parcel.readString();
        this.f78566g = parcel.readInt();
    }
}
