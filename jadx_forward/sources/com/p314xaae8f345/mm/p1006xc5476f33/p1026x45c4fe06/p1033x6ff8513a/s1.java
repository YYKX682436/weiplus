package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public abstract class s1 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (android.text.TextUtils.isEmpty(readString)) {
            return null;
        }
        try {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) parcel.readParcelable(java.lang.Class.forName(readString).getClassLoader());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.ICommLibReader.ParcelHelper", "readFromParcel e=%s", e17);
            return null;
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, android.os.Parcel parcel, int i17) {
        if (interfaceC11702x4ae7c33 == null) {
            parcel.writeString(null);
        } else {
            parcel.writeString(interfaceC11702x4ae7c33.getClass().getName());
            parcel.writeParcelable(interfaceC11702x4ae7c33, i17);
        }
    }
}
