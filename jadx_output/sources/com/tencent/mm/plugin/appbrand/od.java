package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class od implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.ReportStorageSizeTask reportStorageSizeTask = new com.tencent.mm.plugin.appbrand.ReportStorageSizeTask();
        reportStorageSizeTask.v(parcel);
        return reportStorageSizeTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.ReportStorageSizeTask[i17];
    }
}
