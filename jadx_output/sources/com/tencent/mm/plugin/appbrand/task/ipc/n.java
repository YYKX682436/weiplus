package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class n implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground((com.tencent.luggage.sdk.processes.main.RuntimeInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground[i17];
    }
}
