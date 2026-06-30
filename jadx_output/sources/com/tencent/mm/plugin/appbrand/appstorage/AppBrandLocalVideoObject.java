package com.tencent.mm.plugin.appbrand.appstorage;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class AppBrandLocalVideoObject extends com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject> CREATOR = new com.tencent.mm.plugin.appbrand.appstorage.z();

    /* renamed from: n, reason: collision with root package name */
    public int f76112n;

    /* renamed from: o, reason: collision with root package name */
    public long f76113o;

    /* renamed from: p, reason: collision with root package name */
    public int f76114p;

    /* renamed from: q, reason: collision with root package name */
    public int f76115q;

    public /* synthetic */ AppBrandLocalVideoObject(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.appstorage.z zVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject
    public java.lang.String toString() {
        return "AppBrandLocalVideoObject{duration=" + this.f76112n + ", size=" + this.f76113o + ", width=" + this.f76114p + ", height=" + this.f76115q + '}';
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f76112n);
        parcel.writeLong(this.f76113o);
        parcel.writeInt(this.f76114p);
        parcel.writeInt(this.f76115q);
    }

    public AppBrandLocalVideoObject() {
    }

    private AppBrandLocalVideoObject(android.os.Parcel parcel) {
        super(parcel);
        this.f76112n = parcel.readInt();
        this.f76113o = parcel.readLong();
        this.f76114p = parcel.readInt();
        this.f76115q = parcel.readInt();
    }
}
