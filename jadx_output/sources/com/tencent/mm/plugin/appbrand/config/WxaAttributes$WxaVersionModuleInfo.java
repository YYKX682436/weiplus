package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class WxaAttributes$WxaVersionModuleInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> CREATOR = new k91.t5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77465e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f77466f;

    /* renamed from: g, reason: collision with root package name */
    public int f77467g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String[] f77468h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f77469i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f77470m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f77471n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f77472o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f77473p;

    public WxaAttributes$WxaVersionModuleInfo(android.os.Parcel parcel) {
        this.f77464d = parcel.readString();
        this.f77465e = parcel.readString();
        this.f77466f = parcel.readByte() != 0;
        this.f77467g = parcel.readInt();
        this.f77468h = parcel.createStringArray();
        this.f77469i = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.CREATOR);
        this.f77470m = parcel.readString();
        this.f77471n = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo.CREATOR);
        this.f77472o = parcel.readByte() != 0;
        this.f77473p = parcel.readByte() != 0;
    }

    public static java.util.List a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            return b(jSONArray);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, json = %s, e = %s", str, e17);
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
                    com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo();
                    wxaAttributes$WxaVersionModuleInfo.f77464d = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    if (jSONObject.has("md5")) {
                        wxaAttributes$WxaVersionModuleInfo.f77465e = jSONObject.getString("md5");
                    } else if (jSONObject.has("checkSumMd5")) {
                        wxaAttributes$WxaVersionModuleInfo.f77465e = jSONObject.getString("checkSumMd5");
                    }
                    wxaAttributes$WxaVersionModuleInfo.f77467g = jSONObject.optInt("size", 0);
                    wxaAttributes$WxaVersionModuleInfo.f77466f = jSONObject.optBoolean("independent", false);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("alias");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        strArr = new java.lang.String[optJSONArray.length()];
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            strArr[i18] = optJSONArray.optString(i18);
                        }
                        wxaAttributes$WxaVersionModuleInfo.f77468h = strArr;
                        wxaAttributes$WxaVersionModuleInfo.f77470m = jSONObject.optString("without_lib_md5");
                        java.util.List b17 = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo.b(jSONObject.optJSONArray("widget_list"));
                        wxaAttributes$WxaVersionModuleInfo.f77471n = b17;
                        wxaAttributes$WxaVersionModuleInfo.f77469i = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.b(b17, jSONObject.opt("separated_plugin_list"), 23);
                        wxaAttributes$WxaVersionModuleInfo.f77472o = jSONObject.optBoolean("brotli", false);
                        wxaAttributes$WxaVersionModuleInfo.f77473p = jSONObject.optBoolean("parallelDownloadOnLaunchStage", false);
                        linkedList.add(wxaAttributes$WxaVersionModuleInfo);
                    }
                    strArr = new java.lang.String[0];
                    wxaAttributes$WxaVersionModuleInfo.f77468h = strArr;
                    wxaAttributes$WxaVersionModuleInfo.f77470m = jSONObject.optString("without_lib_md5");
                    java.util.List b172 = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo.b(jSONObject.optJSONArray("widget_list"));
                    wxaAttributes$WxaVersionModuleInfo.f77471n = b172;
                    wxaAttributes$WxaVersionModuleInfo.f77469i = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.b(b172, jSONObject.opt("separated_plugin_list"), 23);
                    wxaAttributes$WxaVersionModuleInfo.f77472o = jSONObject.optBoolean("brotli", false);
                    wxaAttributes$WxaVersionModuleInfo.f77473p = jSONObject.optBoolean("parallelDownloadOnLaunchStage", false);
                    linkedList.add(wxaAttributes$WxaVersionModuleInfo);
                }
            }
            return linkedList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, e = %s", e17);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77464d);
        parcel.writeString(this.f77465e);
        parcel.writeByte(this.f77466f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77467g);
        parcel.writeStringArray(this.f77468h);
        parcel.writeTypedList(this.f77469i);
        parcel.writeString(this.f77470m);
        parcel.writeTypedList(this.f77471n);
        parcel.writeByte(this.f77472o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f77473p ? (byte) 1 : (byte) 0);
    }
}
