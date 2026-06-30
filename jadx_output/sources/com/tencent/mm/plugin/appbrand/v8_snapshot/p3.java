package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class p3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        java.lang.String readString3 = parcel.readString();
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 a17 = readString3 != null ? com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90770f.a(readString3) : null;
        java.lang.String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        java.lang.String readString5 = parcel.readString();
        try {
            jSONObject = new org.json.JSONObject(com.tencent.mm.plugin.appbrand.utils.j1.a(parcel.readString(), "{}"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JSONObjectParceler", "create JSONObject failure since " + e17);
            jSONObject = new org.json.JSONObject();
        }
        return new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo(readInt, readString, readString2, readInt2, a17, readString4, readLong, readLong2, readString5, jSONObject, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo[i17];
    }
}
