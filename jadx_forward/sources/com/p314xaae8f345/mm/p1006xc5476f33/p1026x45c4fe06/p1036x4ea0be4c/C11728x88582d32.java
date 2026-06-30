package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel */
/* loaded from: classes.dex */
public class C11728x88582d32 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11728x88582d32> f33514x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.z();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158328d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158329e;

    public C11728x88582d32(android.os.Parcel parcel) {
        this.f158328d = parcel.readString();
        this.f158329e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158328d);
        parcel.writeString(this.f158329e);
    }
}
