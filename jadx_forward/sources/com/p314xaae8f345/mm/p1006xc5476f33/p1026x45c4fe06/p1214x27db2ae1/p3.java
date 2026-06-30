package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class p3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        java.lang.String readString3 = parcel.readString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 a17 = readString3 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172303f.a(readString3) : null;
        java.lang.String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        java.lang.String readString5 = parcel.readString();
        try {
            jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j1.a(parcel.readString(), "{}"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JSONObjectParceler", "create JSONObject failure since " + e17);
            jSONObject = new org.json.JSONObject();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80(readInt, readString, readString2, readInt2, a17, readString4, readLong, readLong2, readString5, jSONObject, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80[i17];
    }
}
