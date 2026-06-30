package com.tencent.mm.plugin.appbrand.jsapi.errno;

/* loaded from: classes7.dex */
public class AppBrandErrorInfoParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable> CREATOR = new jc1.a();

    /* renamed from: d, reason: collision with root package name */
    public int f80866d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80867e;

    public AppBrandErrorInfoParcelable(jc1.d dVar) {
        this.f80866d = dVar.f298903a;
        this.f80867e = dVar.f298904b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandErrorInfoParcelable{errno=" + this.f80866d + ", errnoMsg='" + this.f80867e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f80866d);
        parcel.writeString(this.f80867e);
    }

    public AppBrandErrorInfoParcelable(android.os.Parcel parcel) {
        this.f80866d = parcel.readInt();
        this.f80867e = parcel.readString();
    }
}
