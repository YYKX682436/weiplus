package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class WxaAttributes$WxaVersionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo> CREATOR = new k91.s5();
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage A;
    public long B;
    public java.lang.String C;
    public boolean D;
    public long E;
    public java.util.List F;

    /* renamed from: d, reason: collision with root package name */
    public int f77444d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77445e;

    /* renamed from: f, reason: collision with root package name */
    public int f77446f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77447g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77448h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo f77449i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f77450m;

    /* renamed from: n, reason: collision with root package name */
    public int f77451n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f77452o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f77453p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f77454q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f77455r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f77456s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f77457t;

    /* renamed from: u, reason: collision with root package name */
    public long f77458u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f77459v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f77460w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f77461x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f77462y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f77463z;

    public WxaAttributes$WxaVersionInfo() {
        this.f77459v = "";
        this.f77460w = "";
        this.f77461x = "";
        this.f77462y = "";
        this.f77463z = false;
        this.E = 0L;
    }

    public static com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.os.SystemClock.elapsedRealtime();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo();
            wxaAttributes$WxaVersionInfo.f77444d = jSONObject.optInt("AppVersion", 0);
            wxaAttributes$WxaVersionInfo.f77445e = jSONObject.optString("custom_version");
            wxaAttributes$WxaVersionInfo.f77446f = jSONObject.optInt("VersionState", -1);
            wxaAttributes$WxaVersionInfo.f77447g = jSONObject.optString("VersionMD5");
            wxaAttributes$WxaVersionInfo.f77448h = jSONObject.optString("device_orientation");
            wxaAttributes$WxaVersionInfo.f77455r = jSONObject.optString("client_js_ext_info");
            wxaAttributes$WxaVersionInfo.f77451n = jSONObject.optInt("code_size");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("loading_image_info");
            if (optJSONObject != null) {
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo wxaAttributes$WxaVersionCoverImageInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo();
                wxaAttributes$WxaVersionInfo.f77449i = wxaAttributes$WxaVersionCoverImageInfo;
                wxaAttributes$WxaVersionCoverImageInfo.f77442d = optJSONObject.optString("url");
                wxaAttributes$WxaVersionInfo.f77449i.f77443e = optJSONObject.optString("progressbar_color");
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("fake_native_loading_style_info");
            if (optJSONObject2 != null) {
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("white_style");
                org.json.JSONObject optJSONObject4 = optJSONObject2.optJSONObject("black_style");
                if (optJSONObject3 != null) {
                    if (optJSONObject3.has("navigation_bar_text_color")) {
                        wxaAttributes$WxaVersionInfo.f77459v = optJSONObject3.optString("navigation_bar_text_color");
                    }
                    if (optJSONObject3.has("background_color")) {
                        wxaAttributes$WxaVersionInfo.f77460w = optJSONObject3.optString("background_color");
                    }
                }
                if (optJSONObject4 != null) {
                    if (optJSONObject4.has("navigation_bar_text_color")) {
                        wxaAttributes$WxaVersionInfo.f77461x = optJSONObject4.optString("navigation_bar_text_color");
                    }
                    if (optJSONObject4.has("background_color")) {
                        wxaAttributes$WxaVersionInfo.f77462y = optJSONObject4.optString("background_color");
                    }
                }
            }
            wxaAttributes$WxaVersionInfo.f77452o = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo.b(jSONObject.optJSONArray("module_list"));
            wxaAttributes$WxaVersionInfo.f77453p = jSONObject.optBoolean("UseModule", false);
            wxaAttributes$WxaVersionInfo.f77454q = jSONObject.optString("EntranceModule");
            wxaAttributes$WxaVersionInfo.f77456s = jSONObject.optString("without_lib_md5");
            java.util.List b17 = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo.b(jSONObject.optJSONArray("widget_list"));
            wxaAttributes$WxaVersionInfo.f77457t = b17;
            wxaAttributes$WxaVersionInfo.f77450m = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.b(b17, jSONObject.opt("separated_plugin_list"), 22);
            wxaAttributes$WxaVersionInfo.f77458u = jSONObject.optLong("ForceSyncUpdateWhenLaunchLastInterval", -1L);
            wxaAttributes$WxaVersionInfo.f77463z = jSONObject.optBoolean("resizable", false);
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("halfPage");
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage wxaAttributes$HalfPage = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage();
            wxaAttributes$WxaVersionInfo.A = wxaAttributes$HalfPage;
            if (optJSONObject5 != null) {
                wxaAttributes$HalfPage.f77402d = optJSONObject5.optString("firstPageNavigationStyle");
            }
            wxaAttributes$WxaVersionInfo.B = jSONObject.optLong("template_id", -1L);
            wxaAttributes$WxaVersionInfo.C = jSONObject.optString("renderer");
            if (jSONObject.has("isTransparentBackgroundSupport")) {
                java.lang.String optString = jSONObject.optString("isTransparentBackgroundSupport");
                if (optString == null) {
                    optString = "";
                }
                java.lang.String trim = optString.trim();
                if (u46.l.d("true", trim)) {
                    wxaAttributes$WxaVersionInfo.D = true;
                } else if (u46.l.d("false", trim)) {
                    wxaAttributes$WxaVersionInfo.D = false;
                } else {
                    wxaAttributes$WxaVersionInfo.D = "1".equals(trim);
                }
            }
            wxaAttributes$WxaVersionInfo.E = jSONObject.optLong("depend_lib_bit_flag", 0L);
            wxaAttributes$WxaVersionInfo.F = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo.a(jSONObject.optJSONArray("chat_tools"));
            return wxaAttributes$WxaVersionInfo;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f77444d);
        parcel.writeString(this.f77445e);
        parcel.writeInt(this.f77446f);
        parcel.writeString(this.f77447g);
        parcel.writeString(this.f77448h);
        parcel.writeParcelable(this.f77449i, i17);
        parcel.writeTypedList(this.f77450m);
        parcel.writeInt(this.f77451n);
        parcel.writeTypedList(this.f77452o);
        parcel.writeByte(this.f77453p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f77454q);
        parcel.writeString(this.f77455r);
        parcel.writeString(this.f77456s);
        parcel.writeTypedList(this.f77457t);
        parcel.writeString(this.f77459v);
        parcel.writeString(this.f77460w);
        parcel.writeString(this.f77461x);
        parcel.writeString(this.f77462y);
        parcel.writeByte(this.f77463z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.B);
        parcel.writeParcelable(this.A, i17);
        parcel.writeString(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.F);
    }

    public WxaAttributes$WxaVersionInfo(android.os.Parcel parcel) {
        this.f77459v = "";
        this.f77460w = "";
        this.f77461x = "";
        this.f77462y = "";
        this.f77463z = false;
        this.E = 0L;
        this.f77444d = parcel.readInt();
        this.f77445e = parcel.readString();
        this.f77446f = parcel.readInt();
        this.f77447g = parcel.readString();
        this.f77448h = parcel.readString();
        this.f77449i = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo.class.getClassLoader());
        this.f77450m = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.CREATOR);
        this.f77451n = parcel.readInt();
        this.f77452o = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo.CREATOR);
        this.f77453p = parcel.readByte() != 0;
        this.f77454q = parcel.readString();
        this.f77455r = parcel.readString();
        this.f77456s = parcel.readString();
        this.f77457t = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo.CREATOR);
        this.f77459v = parcel.readString();
        this.f77460w = parcel.readString();
        this.f77461x = parcel.readString();
        this.f77462y = parcel.readString();
        this.f77463z = parcel.readByte() > 0;
        this.B = parcel.readLong();
        this.A = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage.class.getClassLoader());
        this.C = parcel.readString();
        this.D = parcel.readByte() > 0;
        this.F = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo.CREATOR);
    }
}
