package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent */
/* loaded from: classes7.dex */
public final class C11567x4f93c04a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11567x4f93c04a> f33408x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156525d;

    public C11567x4f93c04a(android.os.Parcel parcel) {
        this.f156525d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156525d);
    }
}
