package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig[i17];
    }
}
