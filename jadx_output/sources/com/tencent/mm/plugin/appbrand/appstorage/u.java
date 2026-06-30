package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject[i17];
    }
}
