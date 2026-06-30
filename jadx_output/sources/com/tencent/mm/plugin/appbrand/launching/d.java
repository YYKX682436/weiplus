package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs[i17];
    }
}
