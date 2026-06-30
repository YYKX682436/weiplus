package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage */
/* loaded from: classes7.dex */
public final class C11823xd380b08f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f> f33600x681a0c0c = new k91.i5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158935d;

    public C11823xd380b08f(android.os.Parcel parcel) {
        this.f158935d = "default";
        this.f158935d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158935d);
    }

    public C11823xd380b08f() {
        this.f158935d = "default";
    }
}
