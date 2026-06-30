package com.tencent.mm.plugin.appbrand.jsapi.op_report;

/* loaded from: classes7.dex */
public final class AppBrandOpReportLogic$AppBrandOnOpReportStartEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent> CREATOR = new ld1.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82473d;

    public AppBrandOpReportLogic$AppBrandOnOpReportStartEvent(android.os.Parcel parcel) {
        this.f82473d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f82473d);
    }
}
