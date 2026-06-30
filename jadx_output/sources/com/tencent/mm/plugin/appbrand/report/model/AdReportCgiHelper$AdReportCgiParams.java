package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes.dex */
final class AdReportCgiHelper$AdReportCgiParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams> CREATOR = new com.tencent.mm.plugin.appbrand.report.model.c();

    /* renamed from: d, reason: collision with root package name */
    public int f87922d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f87923e;

    public AdReportCgiHelper$AdReportCgiParams(android.os.Parcel parcel) {
        this.f87922d = parcel.readInt();
        this.f87923e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f87922d);
        parcel.writeString(this.f87923e);
    }
}
