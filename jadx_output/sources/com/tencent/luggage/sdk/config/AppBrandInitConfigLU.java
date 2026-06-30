package com.tencent.luggage.sdk.config;

/* loaded from: classes7.dex */
public class AppBrandInitConfigLU extends com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.config.AppBrandInitConfigLU> CREATOR = new ne.c();
    public java.lang.Boolean A;
    public com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams A1;
    public java.lang.String B;
    public com.tencent.luggage.sdk.config.AppBrandInitWindowConfig B1;
    public java.lang.String C;
    public com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig C1;
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer D;
    public java.lang.String D1;
    public final com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams E;
    public java.lang.String E1;
    public java.lang.String F;
    public java.lang.String F1;
    public boolean G;
    public int G1;
    public java.lang.String H;
    public boolean H1;
    public long I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public long f47267J;
    public boolean J1;
    public double K;
    public int K1;
    public int L;
    public com.tencent.mm.plugin.appbrand.config.HalfScreenConfig L1;
    public int M;
    public boolean M1;
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo N;
    public int N1;
    public java.util.ArrayList O1;
    public java.lang.String P;
    public int P1;
    public java.lang.String Q;
    public int Q1;
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting R;
    public java.lang.String R1;
    public java.lang.String S;
    public boolean S1;
    public java.lang.String T;
    public long T1;
    public java.lang.String U;
    public long U1;
    public android.os.PersistableBundle V;
    public boolean V1;
    public java.lang.String W;
    public com.tencent.luggage.sdk.launching.p W1;
    public int X;
    public com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode X1;
    public boolean Y;
    public int Y1;
    public boolean Z;
    public java.lang.String Z1;

    /* renamed from: a2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle f47268a2;

    /* renamed from: b2, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f47269b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.lang.String f47270c2;

    /* renamed from: d2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams f47271d2;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.h f47272l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f47273p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.h f47274p1;

    /* renamed from: u, reason: collision with root package name */
    public transient int f47275u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f47276v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f47277w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f47278x;

    /* renamed from: x0, reason: collision with root package name */
    public int f47279x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.h f47280x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f47281y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f47282y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f47283y1;

    /* renamed from: z, reason: collision with root package name */
    public int f47284z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f47285z1;

    public AppBrandInitConfigLU() {
        this.A = null;
        this.V = new android.os.PersistableBundle();
        this.f47283y1 = false;
        this.f47285z1 = false;
        this.A1 = null;
        this.B1 = null;
        this.E1 = "";
        this.L1 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
        this.M1 = false;
        this.S1 = false;
        this.W1 = com.tencent.luggage.sdk.launching.p.LEGACY;
        this.X1 = com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.f86100f;
        this.Y1 = 4;
        this.Z1 = "";
        this.f47271d2 = null;
        this.D = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        this.E = new com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams();
    }

    @Override // com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig
    public final org.json.JSONObject c() {
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = this.D;
        appBrandLaunchReferrer.getClass();
        try {
            obj = new org.json.JSONObject(appBrandLaunchReferrer.f77324f);
        } catch (java.lang.Exception unused) {
            obj = appBrandLaunchReferrer.f77324f;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", appBrandLaunchReferrer.f77323e);
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, obj);
            int i17 = appBrandLaunchReferrer.f77322d;
            if ((i17 == 1 || i17 == 3 || i17 == 2 || i17 == 10) && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77325g)) {
                jSONObject.put("privateExtraData", new org.json.JSONObject(appBrandLaunchReferrer.f77325g));
            }
            if (appBrandLaunchReferrer.f77322d == 6 && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77326h)) {
                jSONObject.put("messageExtraData", new org.json.JSONObject(appBrandLaunchReferrer.f77326h));
            }
            if (appBrandLaunchReferrer.f77322d == 7 && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77332q)) {
                jSONObject.put("openapiInvokeData", new org.json.JSONObject(appBrandLaunchReferrer.f77332q));
            }
            if (appBrandLaunchReferrer.f77322d == 7 && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77333r)) {
                jSONObject.put("transitiveData", new org.json.JSONObject(appBrandLaunchReferrer.f77333r));
            }
            if (appBrandLaunchReferrer.f77322d == 9 && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77334s)) {
                jSONObject.put("gameLiveInfo", new org.json.JSONObject(appBrandLaunchReferrer.f77334s));
            }
            if (appBrandLaunchReferrer.f77322d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77335t)) {
                java.lang.String b17 = ik1.t.b(appBrandLaunchReferrer.f77335t);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    jSONObject.put("externalFileRefs", new org.json.JSONObject(b17));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchReferrer", "toJsonObj exception: %s", e17);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    public final boolean d() {
        java.lang.String str = this.N.C;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.contains("skyline");
    }

    @Override // com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.tencent.luggage.sdk.config.AppBrandInitConfigLU clone() {
        return (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) super.clone();
    }

    public java.lang.String f() {
        com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams appBrandAssistantParams = this.A1;
        return appBrandAssistantParams != null ? appBrandAssistantParams.f77200e : "";
    }

    public boolean g() {
        return this.f47284z == 4;
    }

    public boolean h() {
        com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams appBrandAssistantParams = this.A1;
        return appBrandAssistantParams != null && appBrandAssistantParams.f77199d;
    }

    public final void i(java.lang.String str) {
        iz5.a.c(null, android.text.TextUtils.isEmpty(str));
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandInitConfigLU", "resetInstanceId(%s) %s", str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        this.f47277w = str;
    }

    public boolean k() {
        return k91.l3.a(this.f47284z);
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandInitConfigLU", "resetSession() %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        ne.q qVar = ne.p.f336485a;
        if (qVar == null) {
            qVar = ne.q.f336486a;
        }
        this.f47276v = qVar.a();
    }

    public org.json.JSONObject n() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("shareKey", this.C);
            jSONObject.put("shareName", this.B);
            if (jSONObject.length() == 0) {
                return null;
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final k91.y3 o() {
        com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = this.B1;
        return appBrandInitWindowConfig == null ? k91.y3.DEFAULT : appBrandInitWindowConfig.f47291i;
    }

    public final k91.y3 q() {
        com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = this.B1;
        return appBrandInitWindowConfig == null ? k91.y3.DEFAULT : appBrandInitWindowConfig.f47292m;
    }

    public final k91.z3 r() {
        com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = this.B1;
        return appBrandInitWindowConfig == null ? k91.z3.UNKNOWN : appBrandInitWindowConfig.f47288f;
    }

    public java.lang.String toString() {
        return "AppBrandInitConfigLU {visitingSessionId='" + this.f47276v + "', wxaLaunchInstanceId=" + this.f47277w + ", clickTimestamp=" + this.I + ", username='" + this.f47278x + "', appId='" + this.f77278d + "', brandName='" + this.f77279e + "', debugType=" + this.f77281g + ", orientation='" + this.f77282h + "', enterPath='" + this.f77283i + "', shareName='" + this.B + "', shareKey='" + this.C + "', startTime=" + this.I + ", referrer=" + this.D + ", extInfo=" + this.F + ", appVersion=" + this.L + ", wsEndpoint=" + this.H + '}';
    }

    @Override // com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f47276v);
        parcel.writeString(this.f47277w);
        parcel.writeString(this.f47278x);
        parcel.writeString(this.f47281y);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeParcelable(this.D, i17);
        parcel.writeParcelable(this.E, i17);
        parcel.writeInt(this.f47284z);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.F);
        parcel.writeString(this.H);
        parcel.writeLong(this.I);
        parcel.writeLong(this.f47267J);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeParcelable(this.N, i17);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeParcelable(this.R, i17);
        parcel.writeString(this.S);
        parcel.writeString(this.U);
        parcel.writePersistableBundle(this.V);
        parcel.writeString(this.W);
        parcel.writeInt(this.f47279x0);
        parcel.writeByte(this.S1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.V1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f47283y1 ? (byte) 1 : (byte) 0);
        com.tencent.luggage.sdk.launching.k.c(this.f47272l1, parcel);
        com.tencent.luggage.sdk.launching.k.c(this.f47274p1, parcel);
        com.tencent.luggage.sdk.launching.k.c(this.f47280x1, parcel);
        parcel.writeInt(this.W1.ordinal());
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f47273p0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.B1, i17);
        parcel.writeString(this.D1);
        parcel.writeString(this.E1);
        parcel.writeInt(this.H1 ? 1 : 0);
        parcel.writeInt(this.I1 ? 1 : 0);
        parcel.writeByte(this.J1 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.K1);
        parcel.writeParcelable(this.L1, i17);
        parcel.writeByte(this.M1 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.N1);
        parcel.writeStringList(this.O1);
        parcel.writeInt(this.P1);
        if (this.X1 == null) {
            this.X1 = com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.f86100f;
        }
        parcel.writeParcelable(this.X1, i17);
        parcel.writeInt(this.Y1);
        parcel.writeString(this.R1);
        parcel.writeParcelable(this.f47268a2, i17);
        parcel.writeParcelable(this.C1, i17);
        parcel.writeInt(this.Q1);
    }

    public AppBrandInitConfigLU(android.os.Parcel parcel) {
        super(parcel);
        this.A = null;
        this.V = new android.os.PersistableBundle();
        this.f47283y1 = false;
        this.f47285z1 = false;
        this.A1 = null;
        this.B1 = null;
        this.E1 = "";
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
        this.L1 = halfScreenConfig;
        this.M1 = false;
        this.S1 = false;
        this.W1 = com.tencent.luggage.sdk.launching.p.LEGACY;
        this.X1 = com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.f86100f;
        this.Y1 = 4;
        this.Z1 = "";
        this.f47271d2 = null;
        this.f47276v = parcel.readString();
        this.f47277w = parcel.readString();
        this.f47278x = parcel.readString();
        this.f47281y = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.class.getClassLoader());
        this.E = (com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams.class.getClassLoader());
        this.f47284z = parcel.readInt();
        this.G = parcel.readByte() != 0;
        this.F = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readLong();
        this.f47267J = parcel.readLong();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo.class.getClassLoader());
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting.class.getClassLoader());
        this.S = parcel.readString();
        this.U = parcel.readString();
        this.V = parcel.readPersistableBundle(com.tencent.luggage.sdk.config.AppBrandInitConfigLU.class.getClassLoader());
        this.W = parcel.readString();
        this.f47279x0 = parcel.readInt();
        this.S1 = parcel.readByte() != 0;
        this.V1 = parcel.readByte() > 0;
        this.f47283y1 = parcel.readByte() > 0;
        this.f47272l1 = com.tencent.luggage.sdk.launching.k.a(parcel);
        this.f47274p1 = com.tencent.luggage.sdk.launching.k.a(parcel);
        this.f47280x1 = com.tencent.luggage.sdk.launching.k.a(parcel);
        this.W1 = com.tencent.luggage.sdk.launching.p.i(parcel);
        this.X = parcel.readInt();
        this.Y = parcel.readInt() > 0;
        this.Z = parcel.readByte() > 0;
        this.f47273p0 = parcel.readByte() > 0;
        this.B1 = (com.tencent.luggage.sdk.config.AppBrandInitWindowConfig) parcel.readParcelable(com.tencent.luggage.sdk.config.AppBrandInitWindowConfig.class.getClassLoader());
        this.D1 = parcel.readString();
        this.E1 = parcel.readString();
        this.H1 = parcel.readInt() == 1;
        this.I1 = parcel.readInt() == 1;
        this.J1 = parcel.readByte() > 0;
        this.K1 = parcel.readInt();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig2 = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.class.getClassLoader());
        this.L1 = halfScreenConfig2 != null ? halfScreenConfig2 : halfScreenConfig;
        this.M1 = parcel.readByte() > 0;
        this.N1 = parcel.readInt();
        this.O1 = parcel.createStringArrayList();
        this.P1 = parcel.readInt();
        this.X1 = (com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode) parcel.readParcelable(com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.class.getClassLoader());
        this.Y1 = parcel.readInt();
        this.R1 = parcel.readString();
        this.f47268a2 = (com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle.class.getClassLoader());
        this.C1 = (com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig.class.getClassLoader());
        this.Q1 = parcel.readInt();
    }
}
