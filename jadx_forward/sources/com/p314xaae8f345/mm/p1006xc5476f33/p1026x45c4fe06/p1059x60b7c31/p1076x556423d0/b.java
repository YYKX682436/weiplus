package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                jSONObject = new org.json.JSONObject(readString);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "EnterFinderResult#<init>, create JSONObject fail for " + readString + " since " + e17);
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12045xdf760ebb(readInt, jSONObject);
        }
        jSONObject = null;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12045xdf760ebb(readInt, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12045xdf760ebb[i17];
    }
}
