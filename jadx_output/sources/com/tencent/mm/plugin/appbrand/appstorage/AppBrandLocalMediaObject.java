package com.tencent.mm.plugin.appbrand.appstorage;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class AppBrandLocalMediaObject implements android.os.Parcelable, com.tencent.mm.plugin.appbrand.appstorage.t1 {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject> CREATOR = new com.tencent.mm.plugin.appbrand.appstorage.u();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f76102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f76103e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f76104f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f76105g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f76106h;

    /* renamed from: i, reason: collision with root package name */
    public long f76107i;

    /* renamed from: m, reason: collision with root package name */
    public long f76108m;

    public AppBrandLocalMediaObject() {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.t1
    public java.lang.String a() {
        return this.f76102d;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.t1
    public long b() {
        return this.f76107i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.t1
    public long lastModified() {
        return this.f76108m;
    }

    public java.lang.String toString() {
        return "AppBrandLocalMediaObject{localId='" + this.f76102d + "', fileFullPath='" + this.f76103e + "', mimeType='" + this.f76104f + "', fileExt='" + this.f76105g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76102d);
        parcel.writeString(this.f76103e);
        parcel.writeString(this.f76104f);
        parcel.writeString(this.f76105g);
        parcel.writeByte(this.f76106h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f76107i);
        parcel.writeLong(this.f76108m);
    }

    public AppBrandLocalMediaObject(android.os.Parcel parcel) {
        this.f76102d = parcel.readString();
        this.f76103e = parcel.readString();
        this.f76104f = parcel.readString();
        this.f76105g = parcel.readString();
        this.f76106h = parcel.readByte() != 0;
        this.f76107i = parcel.readLong();
        this.f76108m = parcel.readLong();
    }
}
