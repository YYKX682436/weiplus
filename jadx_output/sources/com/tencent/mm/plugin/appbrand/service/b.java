package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest(parcel.readString(), (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.class.getClassLoader()), parcel.createStringArray());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest[i17];
    }
}
