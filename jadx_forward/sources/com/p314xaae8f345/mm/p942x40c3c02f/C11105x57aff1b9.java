package com.p314xaae8f345.mm.p942x40c3c02f;

/* renamed from: com.tencent.mm.modelappbrand.LaunchParamsOptional */
/* loaded from: classes7.dex */
public final class C11105x57aff1b9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9> f32536x681a0c0c = new k01.y0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f151948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f151949e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f151950f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385 f151951g;

    /* renamed from: h, reason: collision with root package name */
    public int f151952h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42 f151953i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f151954m;

    public C11105x57aff1b9(android.os.Parcel parcel, k01.y0 y0Var) {
        this.f151948d = parcel.readString();
        this.f151949e = parcel.readString();
        this.f151951g = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385.class.getClassLoader());
        this.f151952h = parcel.readInt();
        this.f151954m = parcel.readString();
        this.f151950f = parcel.readString();
        this.f151953i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f151948d);
        parcel.writeString(this.f151949e);
        parcel.writeParcelable(this.f151951g, i17);
        parcel.writeInt(this.f151952h);
        parcel.writeString(this.f151954m);
        parcel.writeString(this.f151950f);
        parcel.writeParcelable(this.f151953i, i17);
    }
}
