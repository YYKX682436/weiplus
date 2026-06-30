package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult */
/* loaded from: classes7.dex */
class C12099xe9665e2b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b> f34162x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.m0();

    /* renamed from: d, reason: collision with root package name */
    public int f162451d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f162452e = "";

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONObject f162453f = null;

    public C12099xe9665e2b() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        this.f162451d = parcel.readInt();
        this.f162452e = parcel.readString();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                if (!readString.isEmpty()) {
                    jSONObject = new org.json.JSONObject(readString);
                    this.f162453f = jSONObject;
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaOpenLiteAppBusinessViewResult", "readParcel: ", e17);
                return;
            }
        }
        jSONObject = new org.json.JSONObject();
        this.f162453f = jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f162451d);
        parcel.writeString(this.f162452e);
        org.json.JSONObject jSONObject = this.f162453f;
        parcel.writeString(jSONObject == null ? null : jSONObject.toString());
    }

    public C12099xe9665e2b(android.os.Parcel parcel) {
        mo50320xdc053d3f(parcel);
    }
}
