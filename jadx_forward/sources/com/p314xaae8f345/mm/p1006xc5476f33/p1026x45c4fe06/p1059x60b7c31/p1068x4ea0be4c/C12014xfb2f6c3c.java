package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel */
/* loaded from: classes7.dex */
class C12014xfb2f6c3c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c.C12014xfb2f6c3c> f33882x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c.i();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161371d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161372e;

    public C12014xfb2f6c3c(java.lang.String str, java.lang.String str2) {
        this.f161371d = str;
        this.f161372e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f161371d);
        parcel.writeString(this.f161372e);
    }

    public C12014xfb2f6c3c(android.os.Parcel parcel) {
        this.f161371d = parcel.readString();
        this.f161372e = parcel.readString();
    }
}
