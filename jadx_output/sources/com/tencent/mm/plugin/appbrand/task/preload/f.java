package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController.TaskParamsCallPredownload[0];
    }
}
