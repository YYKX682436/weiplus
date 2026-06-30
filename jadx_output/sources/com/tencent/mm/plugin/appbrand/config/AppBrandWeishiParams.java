package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class AppBrandWeishiParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams> CREATOR = new k91.c1();

    /* renamed from: d, reason: collision with root package name */
    public int f77344d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77345e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77346f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77347g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77348h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f77349i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f77350m;

    public AppBrandWeishiParams(android.os.Parcel parcel) {
        a(parcel);
    }

    public void a(android.os.Parcel parcel) {
        this.f77344d = parcel.readInt();
        this.f77345e = parcel.readString();
        this.f77346f = parcel.readString();
        this.f77347g = parcel.readString();
        this.f77348h = parcel.readString();
        this.f77349i = parcel.readString();
        this.f77350m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandWeishiParams{fromOpenSdk=" + this.f77344d + ", thumbUrl='" + this.f77345e + "', thumbFullPath='" + this.f77346f + "', msgImgPath='" + this.f77347g + "', appId='" + this.f77348h + "', appName='" + this.f77349i + "', sourceUserName='" + this.f77350m + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f77344d);
        parcel.writeString(this.f77345e);
        parcel.writeString(this.f77346f);
        parcel.writeString(this.f77347g);
        parcel.writeString(this.f77348h);
        parcel.writeString(this.f77349i);
        parcel.writeString(this.f77350m);
    }
}
