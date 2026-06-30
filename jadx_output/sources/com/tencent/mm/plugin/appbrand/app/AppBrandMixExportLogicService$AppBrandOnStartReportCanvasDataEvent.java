package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent> CREATOR = new com.tencent.mm.plugin.appbrand.app.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f74992d;

    public AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent(android.os.Parcel parcel) {
        this.f74992d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f74992d);
    }
}
