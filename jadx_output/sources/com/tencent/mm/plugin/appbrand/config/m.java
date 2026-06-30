package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        java.lang.String readString2 = parcel.readString();
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(readString, k91.s2.valueOf(readString2 != null ? readString2 : ""));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig[i17];
    }
}
