package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class q implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper(parcel.readString(), parcel.readString(), com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs.CREATOR.createFromParcel(parcel), (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper[i17];
    }
}
