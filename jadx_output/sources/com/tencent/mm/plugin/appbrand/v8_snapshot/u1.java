package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class u1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) parcel.readParcelable(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams.class.getClassLoader());
        java.lang.String readString = parcel.readString();
        return new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams(iCommLibReader, readString != null ? com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90770f.a(readString) : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams[i17];
    }
}
