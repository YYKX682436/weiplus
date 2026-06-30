package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper */
/* loaded from: classes13.dex */
public class C11754xcbc74679 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11754xcbc74679> f33524x681a0c0c = new b91.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f158579d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb f158580e;

    /* renamed from: f, reason: collision with root package name */
    public final org.json.JSONObject f158581f;

    public C11754xcbc74679(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        this.f158579d = readInt;
        if (readInt != 1) {
            if (readInt != 2) {
                return;
            }
            this.f158580e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11754xcbc74679.class.getClassLoader());
        } else {
            try {
                this.f158581f = new org.json.JSONObject(parcel.readString());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DrawActionWrapper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50006x9616526c() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = this.f158579d;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = i17 != 1 ? i17 != 2 ? "" : this.f158580e.f158574d : this.f158581f.optString(ya.b.f77491x8758c4e1);
        return java.lang.String.format("type %d ,method %s", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.f158579d;
        parcel.writeInt(i18);
        if (i18 == 1) {
            parcel.writeString(this.f158581f.toString());
        } else {
            if (i18 != 2) {
                return;
            }
            parcel.writeParcelable(this.f158580e, i17);
        }
    }
}
