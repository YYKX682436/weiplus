package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq[i17];
    }
}
