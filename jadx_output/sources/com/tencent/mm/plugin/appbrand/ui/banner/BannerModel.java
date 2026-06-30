package com.tencent.mm.plugin.appbrand.ui.banner;

/* loaded from: classes.dex */
final class BannerModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ui.banner.BannerModel> CREATOR = new com.tencent.mm.plugin.appbrand.ui.banner.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f89590d;

    /* renamed from: e, reason: collision with root package name */
    public int f89591e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f89592f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f89593g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f89594h;

    public BannerModel(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.ui.banner.h hVar) {
        this.f89590d = parcel.readString();
        this.f89591e = parcel.readInt();
        this.f89592f = parcel.readString();
        this.f89593g = parcel.readString();
        this.f89594h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f89590d);
        parcel.writeInt(this.f89591e);
        parcel.writeString(this.f89592f);
        parcel.writeString(this.f89593g);
        parcel.writeString(this.f89594h);
    }
}
