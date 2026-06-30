package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class l6 implements android.os.Parcelable.Creator {
    public l6(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        return new com.tencent.mm.plugin.appbrand.appusage.QueryParams(readInt, readInt2 == 1 ? com.tencent.mm.plugin.appbrand.appusage.y5.ASC : readInt2 == 0 ? com.tencent.mm.plugin.appbrand.appusage.y5.DESC : null, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appusage.QueryParams[i17];
    }
}
