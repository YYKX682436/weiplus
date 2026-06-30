package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class h1 implements android.os.Parcelable.Creator {
    public h1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.s1 s1Var;
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r1 r1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.s1.f161801e;
        int readInt = parcel.readInt();
        r1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.s1[] m50798xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.s1.m50798xcee59d22();
        int length = m50798xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                s1Var = null;
                break;
            }
            s1Var = m50798xcee59d22[i17];
            if (readInt == s1Var.f161805d) {
                break;
            }
            i17++;
        }
        if (s1Var == null) {
            s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.s1.f161802f;
        }
        int readInt2 = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                jSONObject = new org.json.JSONObject(readString);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "OpenFinderFeedResult#<init>, create JSONObject fail for " + readString + " since " + e17);
                jSONObject = new org.json.JSONObject();
            }
        } else {
            jSONObject = new org.json.JSONObject();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12058x46df12ab(s1Var, readInt2, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12058x46df12ab[i17];
    }
}
