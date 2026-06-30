package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent */
/* loaded from: classes7.dex */
public class C12140x27120291 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12140x27120291> f34344x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.f();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162801g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162802h;

    /* renamed from: i, reason: collision with root package name */
    public int f162803i;

    public C12140x27120291() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162801g);
        parcel.writeString(this.f162802h);
        parcel.writeInt(this.f162803i);
    }

    public C12140x27120291(android.os.Parcel parcel) {
        this.f162801g = parcel.readString();
        this.f162802h = parcel.readString();
        this.f162803i = parcel.readInt();
    }
}
