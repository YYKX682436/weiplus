package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo */
/* loaded from: classes7.dex */
public final class C11828xf29fad17 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17> f33605x681a0c0c = new k91.r5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158976e;

    public C11828xf29fad17(android.os.Parcel parcel) {
        this.f158975d = parcel.readString();
        this.f158976e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158975d);
        parcel.writeString(this.f158976e);
    }
}
