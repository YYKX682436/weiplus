package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class WxaAttributes$WxaChatToolInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo> CREATOR = new k91.m5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77403d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77404e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77405f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f77406g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String[] f77407h;

    public WxaAttributes$WxaChatToolInfo(android.os.Parcel parcel) {
        this.f77403d = parcel.readString();
        this.f77404e = parcel.readString();
        this.f77405f = parcel.readString();
        this.f77406g = parcel.createStringArray();
        this.f77407h = parcel.createStringArray();
    }

    public static java.util.List a(org.json.JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        if (jSONObject != null) {
                            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo wxaAttributes$WxaChatToolInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo();
                            wxaAttributes$WxaChatToolInfo.f77403d = jSONObject.optString("root");
                            wxaAttributes$WxaChatToolInfo.f77404e = jSONObject.optString("entry_page_path");
                            wxaAttributes$WxaChatToolInfo.f77405f = jSONObject.optString("desc");
                            wxaAttributes$WxaChatToolInfo.f77406g = b(jSONObject.optJSONArray("scopes"));
                            wxaAttributes$WxaChatToolInfo.f77407h = b(jSONObject.optJSONArray("supported_materials"));
                            linkedList.add(wxaAttributes$WxaChatToolInfo);
                        }
                    }
                    return linkedList;
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes", "parse json array, e = %s", e17);
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
        parcel.writeString(this.f77403d);
        parcel.writeString(this.f77404e);
        parcel.writeString(this.f77405f);
        parcel.writeStringArray(this.f77406g);
        parcel.writeStringArray(this.f77407h);
    }
}
