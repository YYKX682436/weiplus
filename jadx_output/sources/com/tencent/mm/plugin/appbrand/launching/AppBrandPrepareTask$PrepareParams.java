package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
final class AppBrandPrepareTask$PrepareParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams> CREATOR = new com.tencent.mm.plugin.appbrand.launching.p1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84380d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84381e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84382f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f84383g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f84384h;

    public AppBrandPrepareTask$PrepareParams(android.os.Parcel parcel) {
        this.f84380d = parcel.readString();
        this.f84381e = parcel.readInt() > 0;
        this.f84382f = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class.getClassLoader());
        this.f84383g = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
        this.f84384h = com.tencent.mm.plugin.appbrand.appstorage.s1.a(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84380d);
        parcel.writeInt(this.f84381e ? 1 : 0);
        parcel.writeParcelable(this.f84382f, i17);
        parcel.writeParcelable(this.f84383g, i17);
        com.tencent.mm.plugin.appbrand.appstorage.s1.b(this.f84384h, parcel, i17);
    }
}
