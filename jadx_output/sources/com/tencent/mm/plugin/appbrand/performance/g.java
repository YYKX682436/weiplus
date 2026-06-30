package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask appBrandPerformanceManager$SetAppPerformanceModeTask = new com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask();
        appBrandPerformanceManager$SetAppPerformanceModeTask.v(parcel);
        return appBrandPerformanceManager$SetAppPerformanceModeTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask[i17];
    }
}
