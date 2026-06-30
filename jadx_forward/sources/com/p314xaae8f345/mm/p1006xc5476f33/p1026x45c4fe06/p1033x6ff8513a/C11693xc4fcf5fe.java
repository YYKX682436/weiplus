package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject */
/* loaded from: classes7.dex */
public class C11693xc4fcf5fe implements android.os.Parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t1 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe> f33483x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f157635d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f157636e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157637f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157638g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f157639h;

    /* renamed from: i, reason: collision with root package name */
    public long f157640i;

    /* renamed from: m, reason: collision with root package name */
    public long f157641m;

    public C11693xc4fcf5fe() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t1
    public java.lang.String a() {
        return this.f157635d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t1
    public long b() {
        return this.f157640i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t1
    /* renamed from: lastModified */
    public long mo49594x74c4037f() {
        return this.f157641m;
    }

    /* renamed from: toString */
    public java.lang.String mo49595x9616526c() {
        return "AppBrandLocalMediaObject{localId='" + this.f157635d + "', fileFullPath='" + this.f157636e + "', mimeType='" + this.f157637f + "', fileExt='" + this.f157638g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f157635d);
        parcel.writeString(this.f157636e);
        parcel.writeString(this.f157637f);
        parcel.writeString(this.f157638g);
        parcel.writeByte(this.f157639h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f157640i);
        parcel.writeLong(this.f157641m);
    }

    public C11693xc4fcf5fe(android.os.Parcel parcel) {
        this.f157635d = parcel.readString();
        this.f157636e = parcel.readString();
        this.f157637f = parcel.readString();
        this.f157638g = parcel.readString();
        this.f157639h = parcel.readByte() != 0;
        this.f157640i = parcel.readLong();
        this.f157641m = parcel.readLong();
    }
}
