package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes.dex */
public final class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        boolean z17 = parcel.readByte() != 0;
        java.lang.String readString = parcel.readString();
        kotlin.jvm.internal.o.d(readString);
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(z17, readString);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig[i17];
    }
}
