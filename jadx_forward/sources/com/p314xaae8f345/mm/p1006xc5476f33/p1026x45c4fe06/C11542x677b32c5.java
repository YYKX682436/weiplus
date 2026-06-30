package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult */
/* loaded from: classes7.dex */
public class C11542x677b32c5 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f156407d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f156408e;

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONObject f156409f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5 f156406g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5();

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5> f33364x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.rc();

    public C11542x677b32c5(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.rc rcVar) {
        try {
            java.lang.String readString = parcel.readString();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = "{}";
            this.f156408e = new org.json.JSONObject(readString == null ? "{}" : readString);
            java.lang.String readString2 = parcel.readString();
            if (readString2 != null) {
                str = readString2;
            }
            this.f156409f = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.MiniProgramNavigationBackResult", "readFromParcel, ex = %s", e17);
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5 c11542x677b32c5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5();
        c11542x677b32c5.f156407d = c11510xdd90c2f2;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (jSONObject == null) {
            jSONObject = jSONObject3;
        }
        c11542x677b32c5.f156408e = jSONObject;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        if (jSONObject2 == null) {
            jSONObject2 = jSONObject4;
        }
        c11542x677b32c5.f156409f = jSONObject2;
        return c11542x677b32c5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48825x9616526c() {
        return "MiniProgramNavigationBackResult{extraData=" + this.f156408e + ", privateData=" + this.f156409f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        org.json.JSONObject jSONObject = this.f156408e;
        parcel.writeString(jSONObject == null ? null : jSONObject.toString());
        org.json.JSONObject jSONObject2 = this.f156409f;
        parcel.writeString(jSONObject2 != null ? jSONObject2.toString() : null);
    }
}
