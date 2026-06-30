package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo */
/* loaded from: classes7.dex */
public final class C11829x68027553 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553> f33606x681a0c0c = new k91.s5();
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f A;
    public long B;
    public java.lang.String C;
    public boolean D;
    public long E;
    public java.util.List F;

    /* renamed from: d, reason: collision with root package name */
    public int f158977d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158978e;

    /* renamed from: f, reason: collision with root package name */
    public int f158979f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158980g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158981h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17 f158982i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f158983m;

    /* renamed from: n, reason: collision with root package name */
    public int f158984n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f158985o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f158986p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f158987q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f158988r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f158989s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f158990t;

    /* renamed from: u, reason: collision with root package name */
    public long f158991u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f158992v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f158993w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f158994x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f158995y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f158996z;

    public C11829x68027553() {
        this.f158992v = "";
        this.f158993w = "";
        this.f158994x = "";
        this.f158995y = "";
        this.f158996z = false;
        this.E = 0L;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.os.SystemClock.elapsedRealtime();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553();
            c11829x68027553.f158977d = jSONObject.optInt("AppVersion", 0);
            c11829x68027553.f158978e = jSONObject.optString("custom_version");
            c11829x68027553.f158979f = jSONObject.optInt("VersionState", -1);
            c11829x68027553.f158980g = jSONObject.optString("VersionMD5");
            c11829x68027553.f158981h = jSONObject.optString("device_orientation");
            c11829x68027553.f158988r = jSONObject.optString("client_js_ext_info");
            c11829x68027553.f158984n = jSONObject.optInt("code_size");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("loading_image_info");
            if (optJSONObject != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17 c11828xf29fad17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17();
                c11829x68027553.f158982i = c11828xf29fad17;
                c11828xf29fad17.f158975d = optJSONObject.optString("url");
                c11829x68027553.f158982i.f158976e = optJSONObject.optString("progressbar_color");
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("fake_native_loading_style_info");
            if (optJSONObject2 != null) {
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("white_style");
                org.json.JSONObject optJSONObject4 = optJSONObject2.optJSONObject("black_style");
                if (optJSONObject3 != null) {
                    if (optJSONObject3.has("navigation_bar_text_color")) {
                        c11829x68027553.f158992v = optJSONObject3.optString("navigation_bar_text_color");
                    }
                    if (optJSONObject3.has("background_color")) {
                        c11829x68027553.f158993w = optJSONObject3.optString("background_color");
                    }
                }
                if (optJSONObject4 != null) {
                    if (optJSONObject4.has("navigation_bar_text_color")) {
                        c11829x68027553.f158994x = optJSONObject4.optString("navigation_bar_text_color");
                    }
                    if (optJSONObject4.has("background_color")) {
                        c11829x68027553.f158995y = optJSONObject4.optString("background_color");
                    }
                }
            }
            c11829x68027553.f158985o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f.b(jSONObject.optJSONArray("module_list"));
            c11829x68027553.f158986p = jSONObject.optBoolean("UseModule", false);
            c11829x68027553.f158987q = jSONObject.optString("EntranceModule");
            c11829x68027553.f158989s = jSONObject.optString("without_lib_md5");
            java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5.b(jSONObject.optJSONArray("widget_list"));
            c11829x68027553.f158990t = b17;
            c11829x68027553.f158983m = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.b(b17, jSONObject.opt("separated_plugin_list"), 22);
            c11829x68027553.f158991u = jSONObject.optLong("ForceSyncUpdateWhenLaunchLastInterval", -1L);
            c11829x68027553.f158996z = jSONObject.optBoolean("resizable", false);
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("halfPage");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f c11823xd380b08f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f();
            c11829x68027553.A = c11823xd380b08f;
            if (optJSONObject5 != null) {
                c11823xd380b08f.f158935d = optJSONObject5.optString("firstPageNavigationStyle");
            }
            c11829x68027553.B = jSONObject.optLong("template_id", -1L);
            c11829x68027553.C = jSONObject.optString("renderer");
            if (jSONObject.has("isTransparentBackgroundSupport")) {
                java.lang.String optString = jSONObject.optString("isTransparentBackgroundSupport");
                if (optString == null) {
                    optString = "";
                }
                java.lang.String trim = optString.trim();
                if (u46.l.d("true", trim)) {
                    c11829x68027553.D = true;
                } else if (u46.l.d("false", trim)) {
                    c11829x68027553.D = false;
                } else {
                    c11829x68027553.D = "1".equals(trim);
                }
            }
            c11829x68027553.E = jSONObject.optLong("depend_lib_bit_flag", 0L);
            c11829x68027553.F = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1.a(jSONObject.optJSONArray("chat_tools"));
            return c11829x68027553;
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
        parcel.writeInt(this.f158977d);
        parcel.writeString(this.f158978e);
        parcel.writeInt(this.f158979f);
        parcel.writeString(this.f158980g);
        parcel.writeString(this.f158981h);
        parcel.writeParcelable(this.f158982i, i17);
        parcel.writeTypedList(this.f158983m);
        parcel.writeInt(this.f158984n);
        parcel.writeTypedList(this.f158985o);
        parcel.writeByte(this.f158986p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f158987q);
        parcel.writeString(this.f158988r);
        parcel.writeString(this.f158989s);
        parcel.writeTypedList(this.f158990t);
        parcel.writeString(this.f158992v);
        parcel.writeString(this.f158993w);
        parcel.writeString(this.f158994x);
        parcel.writeString(this.f158995y);
        parcel.writeByte(this.f158996z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.B);
        parcel.writeParcelable(this.A, i17);
        parcel.writeString(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.F);
    }

    public C11829x68027553(android.os.Parcel parcel) {
        this.f158992v = "";
        this.f158993w = "";
        this.f158994x = "";
        this.f158995y = "";
        this.f158996z = false;
        this.E = 0L;
        this.f158977d = parcel.readInt();
        this.f158978e = parcel.readString();
        this.f158979f = parcel.readInt();
        this.f158980g = parcel.readString();
        this.f158981h = parcel.readString();
        this.f158982i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11828xf29fad17.class.getClassLoader());
        this.f158983m = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.f33604x681a0c0c);
        this.f158984n = parcel.readInt();
        this.f158985o = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f.f33607x681a0c0c);
        this.f158986p = parcel.readByte() != 0;
        this.f158987q = parcel.readString();
        this.f158988r = parcel.readString();
        this.f158989s = parcel.readString();
        this.f158990t = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5.f33608x681a0c0c);
        this.f158992v = parcel.readString();
        this.f158993w = parcel.readString();
        this.f158994x = parcel.readString();
        this.f158995y = parcel.readString();
        this.f158996z = parcel.readByte() > 0;
        this.B = parcel.readLong();
        this.A = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f.class.getClassLoader());
        this.C = parcel.readString();
        this.D = parcel.readByte() > 0;
        this.F = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1.f33601x681a0c0c);
    }
}
