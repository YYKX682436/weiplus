package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams */
/* loaded from: classes.dex */
final class C12563xfeff452c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12563xfeff452c> f35155x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c();

    /* renamed from: d, reason: collision with root package name */
    public int f169455d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f169456e;

    public C12563xfeff452c(android.os.Parcel parcel) {
        this.f169455d = parcel.readInt();
        this.f169456e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f169455d);
        parcel.writeString(this.f169456e);
    }
}
