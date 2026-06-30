package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo */
/* loaded from: classes7.dex */
public final class C11824x9e479fd1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1> f33601x681a0c0c = new k91.m5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158936d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158937e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158938f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f158939g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String[] f158940h;

    public C11824x9e479fd1(android.os.Parcel parcel) {
        this.f158936d = parcel.readString();
        this.f158937e = parcel.readString();
        this.f158938f = parcel.readString();
        this.f158939g = parcel.createStringArray();
        this.f158940h = parcel.createStringArray();
    }

    public static java.util.List a(org.json.JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        if (jSONObject != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1 c11824x9e479fd1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1();
                            c11824x9e479fd1.f158936d = jSONObject.optString("root");
                            c11824x9e479fd1.f158937e = jSONObject.optString("entry_page_path");
                            c11824x9e479fd1.f158938f = jSONObject.optString("desc");
                            c11824x9e479fd1.f158939g = b(jSONObject.optJSONArray("scopes"));
                            c11824x9e479fd1.f158940h = b(jSONObject.optJSONArray("supported_materials"));
                            linkedList.add(c11824x9e479fd1);
                        }
                    }
                    return linkedList;
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes", "parse json array, e = %s", e17);
            }
        }
        return null;
    }

    public static java.lang.String[] b(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return new java.lang.String[0];
        }
        java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            strArr[i17] = jSONArray.optString(i17);
        }
        return strArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158936d);
        parcel.writeString(this.f158937e);
        parcel.writeString(this.f158938f);
        parcel.writeStringArray(this.f158939g);
        parcel.writeStringArray(this.f158940h);
    }
}
