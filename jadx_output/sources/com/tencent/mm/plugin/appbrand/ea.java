package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ea implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.BindRemoteServiceData((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.BindRemoteServiceData.class.getClassLoader()), (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.BindRemoteServiceData.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.BindRemoteServiceData[i17];
    }
}
