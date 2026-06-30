package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo */
/* loaded from: classes7.dex */
public class C11831x52cc1bc5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5> f33608x681a0c0c = new k91.u5();

    /* renamed from: d, reason: collision with root package name */
    public int f159007d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159008e;

    /* renamed from: f, reason: collision with root package name */
    public int f159009f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f159010g;

    public C11831x52cc1bc5(android.os.Parcel parcel) {
        this.f159007d = parcel.readInt();
        this.f159008e = parcel.readString();
        this.f159010g = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.f33604x681a0c0c);
        if (parcel.dataAvail() > 0) {
            this.f159009f = parcel.readInt();
        }
    }

    public static java.util.List a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return b(new org.json.JSONArray(str));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo", "parse json array, e = %s", e17);
            return null;
        }
    }

    public static java.util.List b(org.json.JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        if (jSONObject != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
                            c11831x52cc1bc5.f159007d = jSONObject.optInt("package_type");
                            c11831x52cc1bc5.f159008e = jSONObject.optString("wxapkg_md5");
                            c11831x52cc1bc5.f159009f = jSONObject.optInt("wxapkg_size");
                            if (u46.a.a(qq5.a.f447528b, c11831x52cc1bc5.f159007d)) {
                                c11831x52cc1bc5.f159010g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.a(jSONObject.opt("separated_plugin_list"));
                                linkedList.add(c11831x52cc1bc5);
                            }
                        }
                    }
                    return linkedList;
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo", "parse json array, e = %s", e17);
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f159007d);
        parcel.writeString(this.f159008e);
        parcel.writeTypedList(this.f159010g);
        parcel.writeInt(this.f159009f);
    }
}
