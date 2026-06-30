package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class WxaAttributes$WxaWidgetInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo> CREATOR = new k91.u5();

    /* renamed from: d, reason: collision with root package name */
    public int f77474d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77475e;

    /* renamed from: f, reason: collision with root package name */
    public int f77476f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f77477g;

    public WxaAttributes$WxaWidgetInfo(android.os.Parcel parcel) {
        this.f77474d = parcel.readInt();
        this.f77475e = parcel.readString();
        this.f77477g = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.CREATOR);
        if (parcel.dataAvail() > 0) {
            this.f77476f = parcel.readInt();
        }
    }

    public static java.util.List a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return b(new org.json.JSONArray(str));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo", "parse json array, e = %s", e17);
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
                            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
                            wxaAttributes$WxaWidgetInfo.f77474d = jSONObject.optInt("package_type");
                            wxaAttributes$WxaWidgetInfo.f77475e = jSONObject.optString("wxapkg_md5");
                            wxaAttributes$WxaWidgetInfo.f77476f = jSONObject.optInt("wxapkg_size");
                            if (u46.a.a(qq5.a.f365995b, wxaAttributes$WxaWidgetInfo.f77474d)) {
                                wxaAttributes$WxaWidgetInfo.f77477g = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.a(jSONObject.opt("separated_plugin_list"));
                                linkedList.add(wxaAttributes$WxaWidgetInfo);
                            }
                        }
                    }
                    return linkedList;
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo", "parse json array, e = %s", e17);
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
        parcel.writeInt(this.f77474d);
        parcel.writeString(this.f77475e);
        parcel.writeTypedList(this.f77477g);
        parcel.writeInt(this.f77476f);
    }
}
