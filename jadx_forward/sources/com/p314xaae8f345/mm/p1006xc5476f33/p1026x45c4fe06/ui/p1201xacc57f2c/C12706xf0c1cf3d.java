package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.BannerModel */
/* loaded from: classes.dex */
final class C12706xf0c1cf3d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.C12706xf0c1cf3d> f35302x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f171123d;

    /* renamed from: e, reason: collision with root package name */
    public int f171124e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f171125f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171126g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f171127h;

    public C12706xf0c1cf3d(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.h hVar) {
        this.f171123d = parcel.readString();
        this.f171124e = parcel.readInt();
        this.f171125f = parcel.readString();
        this.f171126g = parcel.readString();
        this.f171127h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f171123d);
        parcel.writeInt(this.f171124e);
        parcel.writeString(this.f171125f);
        parcel.writeString(this.f171126g);
        parcel.writeString(this.f171127h);
    }
}
