package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes5.dex */
public final class h0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        int readInt = parcel.readInt();
        java.util.HashMap hashMap = new java.util.HashMap(readInt);
        int i17 = 0;
        for (int i18 = 0; i18 != readInt; i18++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        boolean z17 = parcel.readInt() != 0;
        long readLong4 = parcel.readLong();
        int readInt2 = parcel.readInt();
        long readLong5 = parcel.readLong();
        boolean z18 = parcel.readInt() != 0;
        int readInt3 = parcel.readInt();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(readInt3);
        while (i17 != readInt3) {
            linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            i17++;
            readInt3 = readInt3;
        }
        return new com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams(readString, readLong, readLong2, readLong3, hashMap, z17, readLong4, readInt2, readLong5, z18, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams[i17];
    }
}
