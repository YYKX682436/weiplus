package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public abstract class s1 {
    public static com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (android.text.TextUtils.isEmpty(readString)) {
            return null;
        }
        try {
            return (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) parcel.readParcelable(java.lang.Class.forName(readString).getClassLoader());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.ICommLibReader.ParcelHelper", "readFromParcel e=%s", e17);
            return null;
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, android.os.Parcel parcel, int i17) {
        if (iCommLibReader == null) {
            parcel.writeString(null);
        } else {
            parcel.writeString(iCommLibReader.getClass().getName());
            parcel.writeParcelable(iCommLibReader, i17);
        }
    }
}
