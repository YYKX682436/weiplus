package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
final class AppBrandTaskUsageRecorder$LaunchCheckParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams> CREATOR = new com.tencent.mm.plugin.appbrand.launching.l2();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84393d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f84394e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84395f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f84396g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84397h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f84398i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f84399m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f84400n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f84401o;

    public AppBrandTaskUsageRecorder$LaunchCheckParams(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str2, boolean z17, boolean z18) {
        this.f84393d = appBrandInitConfigWC;
        this.f84394e = appBrandStatObject;
        this.f84395f = i17;
        this.f84396g = str;
        this.f84397h = qualitySession;
        this.f84398i = iCommLibReader;
        this.f84399m = str2;
        this.f84400n = z17;
        this.f84401o = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f84393d, i17);
        parcel.writeParcelable(this.f84394e, i17);
        parcel.writeInt(this.f84395f);
        parcel.writeString(this.f84396g);
        parcel.writeParcelable(this.f84397h, i17);
        com.tencent.mm.plugin.appbrand.appstorage.s1.b(this.f84398i, parcel, i17);
        parcel.writeString(this.f84399m);
        parcel.writeByte(this.f84400n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84401o ? (byte) 1 : (byte) 0);
    }

    public AppBrandTaskUsageRecorder$LaunchCheckParams(android.os.Parcel parcel) {
        this.f84393d = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class.getClassLoader());
        this.f84394e = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
        this.f84395f = parcel.readInt();
        this.f84396g = parcel.readString();
        this.f84397h = (com.tencent.mm.plugin.appbrand.report.quality.QualitySession) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.quality.QualitySession.class.getClassLoader());
        this.f84398i = com.tencent.mm.plugin.appbrand.appstorage.s1.a(parcel);
        this.f84399m = parcel.readString();
        this.f84400n = parcel.readByte() > 0;
        this.f84401o = parcel.readByte() > 0;
    }
}
