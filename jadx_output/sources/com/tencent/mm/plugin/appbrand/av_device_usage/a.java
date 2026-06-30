package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams(com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams[i17];
    }
}
