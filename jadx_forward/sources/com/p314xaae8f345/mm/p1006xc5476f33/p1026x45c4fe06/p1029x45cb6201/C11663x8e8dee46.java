package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info */
/* loaded from: classes7.dex */
public class C11663x8e8dee46 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46> f33464x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x8();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156921d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156922e;

    /* renamed from: f, reason: collision with root package name */
    public final int f156923f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156924g;

    public C11663x8e8dee46(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f156921d = str;
        this.f156922e = str2;
        this.f156923f = i17;
        this.f156924g = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156921d);
        parcel.writeString(this.f156922e);
        parcel.writeInt(this.f156923f);
        parcel.writeInt(this.f156924g);
    }

    public C11663x8e8dee46(android.os.Parcel parcel) {
        this.f156921d = parcel.readString();
        this.f156922e = parcel.readString();
        this.f156923f = parcel.readInt();
        this.f156924g = parcel.readInt();
    }
}
