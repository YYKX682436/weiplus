package com.tencent.mm.modelappbrand;

/* loaded from: classes7.dex */
public final class LaunchParamsOptional implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelappbrand.LaunchParamsOptional> CREATOR = new k01.y0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f70415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f70416e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f70417f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams f70418g;

    /* renamed from: h, reason: collision with root package name */
    public int f70419h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams f70420i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f70421m;

    public LaunchParamsOptional(android.os.Parcel parcel, k01.y0 y0Var) {
        this.f70415d = parcel.readString();
        this.f70416e = parcel.readString();
        this.f70418g = (com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams.class.getClassLoader());
        this.f70419h = parcel.readInt();
        this.f70421m = parcel.readString();
        this.f70417f = parcel.readString();
        this.f70420i = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f70415d);
        parcel.writeString(this.f70416e);
        parcel.writeParcelable(this.f70418g, i17);
        parcel.writeInt(this.f70419h);
        parcel.writeString(this.f70421m);
        parcel.writeString(this.f70417f);
        parcel.writeParcelable(this.f70420i, i17);
    }
}
