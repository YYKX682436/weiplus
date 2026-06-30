package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo */
/* loaded from: classes7.dex */
public class C11830xcf46aa1f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f> f33607x681a0c0c = new k91.t5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158997d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158998e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f158999f;

    /* renamed from: g, reason: collision with root package name */
    public int f159000g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String[] f159001h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f159002i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f159003m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f159004n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f159005o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f159006p;

    public C11830xcf46aa1f(android.os.Parcel parcel) {
        this.f158997d = parcel.readString();
        this.f158998e = parcel.readString();
        this.f158999f = parcel.readByte() != 0;
        this.f159000g = parcel.readInt();
        this.f159001h = parcel.createStringArray();
        this.f159002i = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.f33604x681a0c0c);
        this.f159003m = parcel.readString();
        this.f159004n = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5.f33608x681a0c0c);
        this.f159005o = parcel.readByte() != 0;
        this.f159006p = parcel.readByte() != 0;
    }

    public static java.util.List a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            return b(jSONArray);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, json = %s, e = %s", str, e17);
            return null;
        }
    }

    public static java.util.List b(org.json.JSONArray jSONArray) {
        java.lang.String[] strArr;
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f();
                    c11830xcf46aa1f.f158997d = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    if (jSONObject.has("md5")) {
                        c11830xcf46aa1f.f158998e = jSONObject.getString("md5");
                    } else if (jSONObject.has("checkSumMd5")) {
                        c11830xcf46aa1f.f158998e = jSONObject.getString("checkSumMd5");
                    }
                    c11830xcf46aa1f.f159000g = jSONObject.optInt("size", 0);
                    c11830xcf46aa1f.f158999f = jSONObject.optBoolean("independent", false);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("alias");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        strArr = new java.lang.String[optJSONArray.length()];
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            strArr[i18] = optJSONArray.optString(i18);
                        }
                        c11830xcf46aa1f.f159001h = strArr;
                        c11830xcf46aa1f.f159003m = jSONObject.optString("without_lib_md5");
                        java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5.b(jSONObject.optJSONArray("widget_list"));
                        c11830xcf46aa1f.f159004n = b17;
                        c11830xcf46aa1f.f159002i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.b(b17, jSONObject.opt("separated_plugin_list"), 23);
                        c11830xcf46aa1f.f159005o = jSONObject.optBoolean("brotli", false);
                        c11830xcf46aa1f.f159006p = jSONObject.optBoolean("parallelDownloadOnLaunchStage", false);
                        linkedList.add(c11830xcf46aa1f);
                    }
                    strArr = new java.lang.String[0];
                    c11830xcf46aa1f.f159001h = strArr;
                    c11830xcf46aa1f.f159003m = jSONObject.optString("without_lib_md5");
                    java.util.List b172 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5.b(jSONObject.optJSONArray("widget_list"));
                    c11830xcf46aa1f.f159004n = b172;
                    c11830xcf46aa1f.f159002i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.b(b172, jSONObject.opt("separated_plugin_list"), 23);
                    c11830xcf46aa1f.f159005o = jSONObject.optBoolean("brotli", false);
                    c11830xcf46aa1f.f159006p = jSONObject.optBoolean("parallelDownloadOnLaunchStage", false);
                    linkedList.add(c11830xcf46aa1f);
                }
            }
            return linkedList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, e = %s", e17);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158997d);
        parcel.writeString(this.f158998e);
        parcel.writeByte(this.f158999f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f159000g);
        parcel.writeStringArray(this.f159001h);
        parcel.writeTypedList(this.f159002i);
        parcel.writeString(this.f159003m);
        parcel.writeTypedList(this.f159004n);
        parcel.writeByte(this.f159005o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f159006p ? (byte) 1 : (byte) 0);
    }
}
