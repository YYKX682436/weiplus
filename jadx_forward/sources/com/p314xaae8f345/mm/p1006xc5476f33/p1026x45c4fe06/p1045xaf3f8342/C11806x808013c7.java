package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig */
/* loaded from: classes7.dex */
public class C11806x808013c7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11806x808013c7> f33573x681a0c0c = new k91.w();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158736d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158737e;

    public C11806x808013c7(android.os.Parcel parcel) {
        this.f158736d = parcel.readString();
        this.f158737e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158736d);
        parcel.writeString(this.f158737e);
    }
}
