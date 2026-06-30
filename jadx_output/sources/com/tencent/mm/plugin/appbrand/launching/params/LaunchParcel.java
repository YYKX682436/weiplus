package com.tencent.mm.plugin.appbrand.launching.params;

/* loaded from: classes7.dex */
public final class LaunchParcel implements android.os.Parcelable {
    public static boolean B1;
    public int A;
    public com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams A1;
    public com.tencent.luggage.sdk.launching.h B;
    public android.os.PersistableBundle C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer G;
    public com.tencent.mm.plugin.appbrand.config.HalfScreenConfig H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f84900J;
    public com.tencent.luggage.sdk.config.AppBrandInitWindowConfig K;
    public android.os.Parcelable L;
    public com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle M;
    public final java.util.List N;
    public com.tencent.luggage.sdk.launching.p P;
    public int Q;
    public java.lang.String R;
    public java.lang.String S;
    public k91.b1 T;
    public java.lang.String U;
    public boolean V;
    public boolean W;
    public android.os.Parcelable X;
    public com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84901d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f84902e;

    /* renamed from: f, reason: collision with root package name */
    public int f84903f;

    /* renamed from: g, reason: collision with root package name */
    public int f84904g;

    /* renamed from: h, reason: collision with root package name */
    public int f84905h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f84906i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f84907l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f84908m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f84909n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f84910o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer f84911p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f84912p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams f84913p1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelappbrand.LaunchParamsOptional f84914q;

    /* renamed from: r, reason: collision with root package name */
    public long f84915r;

    /* renamed from: s, reason: collision with root package name */
    public long f84916s;

    /* renamed from: t, reason: collision with root package name */
    public double f84917t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f84918u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f84919v;

    /* renamed from: w, reason: collision with root package name */
    public android.os.PersistableBundle f84920w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate f84921x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f84922x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f84923x1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.h f84924y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f84925y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f84926y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.h f84927z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f84928z1;
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel> CREATOR = new vg1.b();
    public static final bm5.x0 C1 = new bm5.x0(new vg1.a$$a());

    public LaunchParcel() {
        this.A = -1;
        this.C = null;
        this.D = null;
        this.E = null;
        this.H = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
        this.I = false;
        this.f84900J = false;
        this.K = null;
        this.N = new java.util.ArrayList();
        this.P = com.tencent.luggage.sdk.launching.p.LEGACY;
        this.Q = 0;
        this.R = "";
        this.S = "";
        this.T = k91.b1.f305540d;
        this.U = "";
        this.Y = null;
        this.Z = false;
        this.f84925y0 = false;
        this.f84926y1 = false;
        this.f84928z1 = "";
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2 = "";
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        if (B1) {
            return ((com.tencent.mm.weapp_core.CoreUrlParser) C1.b()).appendHtmlSuffixForEnterPathIfNeed(str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String i17 = com.tencent.mm.plugin.appbrand.appstorage.l1.i(str);
        int lastIndexOf = i17.lastIndexOf("?");
        if (lastIndexOf != -1) {
            java.lang.String substring = i17.substring(0, lastIndexOf);
            str2 = i17.substring(lastIndexOf);
            i17 = substring;
        }
        if (android.text.TextUtils.isEmpty(i17) || i17.endsWith(".html")) {
            sb6.append(i17);
            sb6.append(str2);
        } else {
            sb6.append(i17);
            sb6.append(".html");
            sb6.append(str2);
        }
        return sb6.toString();
    }

    public void b(com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU) {
        com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams appBrandWeishiParams;
        if (appBrandInitConfigLU == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(appBrandInitConfigLU.f47278x)) {
            appBrandInitConfigLU.f47278x = this.f84901d;
        }
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = this.f84914q;
        if (launchParamsOptional != null && (appBrandWeishiParams = launchParamsOptional.f70418g) != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams appBrandWeishiParams2 = appBrandInitConfigLU.E;
            appBrandWeishiParams2.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.setDataPosition(0);
            appBrandWeishiParams.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            appBrandWeishiParams2.a(obtain);
            obtain.recycle();
        }
        appBrandInitConfigLU.f77283i = com.tencent.mm.plugin.appbrand.appstorage.l1.i(this.f84906i);
        appBrandInitConfigLU.f47281y = u46.l.u(this.f84908m);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = this.f84911p;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer2 = appBrandInitConfigLU.D;
        if (appBrandLaunchReferrer == null) {
            appBrandLaunchReferrer2.b(new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer());
        } else {
            appBrandLaunchReferrer2.b(appBrandLaunchReferrer);
        }
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional2 = this.f84914q;
        appBrandInitConfigLU.B = launchParamsOptional2 == null ? null : launchParamsOptional2.f70415d;
        appBrandInitConfigLU.C = launchParamsOptional2 == null ? null : launchParamsOptional2.f70416e;
        appBrandInitConfigLU.H = launchParamsOptional2 == null ? null : launchParamsOptional2.f70421m;
        appBrandInitConfigLU.I = this.f84915r;
        appBrandInitConfigLU.f47267J = this.f84916s;
        appBrandInitConfigLU.K = this.f84917t;
        appBrandInitConfigLU.f47272l1 = this.f84924y;
        appBrandInitConfigLU.f47274p1 = this.f84927z;
        appBrandInitConfigLU.W1 = this.P;
        appBrandInitConfigLU.Z = this.I;
        appBrandInitConfigLU.f47273p0 = this.f84900J;
        appBrandInitConfigLU.f47283y1 = this.Z;
        appBrandInitConfigLU.B1 = this.K;
        appBrandInitConfigLU.V1 = this.f84912p0;
        java.lang.String str = this.f84909n;
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandInitConfigLU", "resetSession(%s) %s", str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        appBrandInitConfigLU.f47276v = str;
        appBrandInitConfigLU.S = this.f84918u;
        appBrandInitConfigLU.T = this.f84919v;
        appBrandInitConfigLU.W = null;
        appBrandInitConfigLU.C1 = this.Y;
        appBrandInitConfigLU.L1 = this.H;
        appBrandInitConfigLU.K1 = this.F;
        appBrandInitConfigLU.f47271d2 = this.f84913p1;
        com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = this.M;
        if (appBrandRuntimeReloadReportBundle != null) {
            appBrandInitConfigLU.f47268a2 = appBrandRuntimeReloadReportBundle;
        }
        appBrandInitConfigLU.f47285z1 = this.f84926y1;
        appBrandInitConfigLU.Z1 = this.f84928z1;
        appBrandInitConfigLU.A1 = this.A1;
    }

    public void c() {
        com.tencent.luggage.sdk.launching.k.b(this.f84924y);
        com.tencent.luggage.sdk.launching.k.b(this.f84927z);
        com.tencent.luggage.sdk.launching.k.b(this.B);
    }

    public java.lang.Object clone() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel(obtain);
        obtain.recycle();
        return launchParcel;
    }

    public void d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f84915r = java.lang.System.currentTimeMillis();
        this.f84916s = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis()) + (java.lang.System.nanoTime() % 1000000);
        this.f84917t = sj1.l.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LaunchParcel{username='");
        sb6.append(this.f84901d);
        sb6.append("', appId='");
        sb6.append(this.f84902e);
        sb6.append("', version=");
        sb6.append(this.f84903f);
        sb6.append(", versionType=");
        sb6.append(this.f84904g);
        sb6.append(", enterPath='");
        sb6.append(this.f84906i);
        sb6.append("', statObj=");
        sb6.append(this.f84910o);
        sb6.append(", referrer=");
        sb6.append(this.f84911p);
        sb6.append(", startClickTimestamp=");
        sb6.append(this.f84915r);
        sb6.append(", windowConfig=");
        com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = this.K;
        sb6.append(appBrandInitWindowConfig == null ? "null" : appBrandInitWindowConfig.toString());
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84901d);
        parcel.writeString(this.f84902e);
        parcel.writeInt(this.f84903f);
        parcel.writeInt(this.f84904g);
        parcel.writeInt(this.f84905h);
        parcel.writeString(this.f84906i);
        parcel.writeString(this.f84908m);
        parcel.writeString(this.f84909n);
        parcel.writeParcelable(this.f84910o, i17);
        parcel.writeParcelable(this.f84911p, i17);
        parcel.writeParcelable(this.f84914q, i17);
        parcel.writeLong(this.f84915r);
        parcel.writeLong(this.f84916s);
        parcel.writeString(this.f84918u);
        parcel.writePersistableBundle(this.f84920w);
        parcel.writeParcelable(this.f84921x, i17);
        com.tencent.luggage.sdk.launching.k.c(this.f84924y, parcel);
        com.tencent.luggage.sdk.launching.k.c(this.f84927z, parcel);
        parcel.writeInt(this.A);
        com.tencent.luggage.sdk.launching.k.c(this.B, parcel);
        parcel.writePersistableBundle(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.F);
        parcel.writeParcelable(this.G, i17);
        parcel.writeParcelable(this.L, i17);
        parcel.writeParcelable(this.M, i17);
        parcel.writeStringList(this.N);
        parcel.writeParcelable(this.H, i17);
        parcel.writeInt(this.P.ordinal());
        parcel.writeInt(this.Q);
        parcel.writeString(this.R);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84900J ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.K, i17);
        parcel.writeString(this.S);
        parcel.writeString(this.U);
        parcel.writeString(this.T.name());
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeInt(this.W ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeByte(this.f84912p0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.Y, i17);
        parcel.writeString(this.f84922x0);
        parcel.writeByte(this.f84925y0 ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.f84917t);
        parcel.writeParcelable(this.X, i17);
        parcel.writeString(this.f84907l1);
        parcel.writeString(this.E);
        parcel.writeParcelable(this.f84913p1, i17);
        parcel.writeByte(this.f84923x1 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f84919v);
        parcel.writeByte(this.f84926y1 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f84928z1);
        parcel.writeParcelable(this.A1, i17);
    }

    public LaunchParcel(android.os.Parcel parcel) {
        this.A = -1;
        this.C = null;
        this.D = null;
        this.E = null;
        this.H = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
        this.I = false;
        this.f84900J = false;
        this.K = null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.N = arrayList;
        this.P = com.tencent.luggage.sdk.launching.p.LEGACY;
        this.Q = 0;
        this.R = "";
        this.S = "";
        k91.b1 b1Var = k91.b1.f305540d;
        this.T = b1Var;
        this.U = "";
        this.Y = null;
        this.Z = false;
        this.f84925y0 = false;
        this.f84926y1 = false;
        this.f84928z1 = "";
        this.f84901d = parcel.readString();
        this.f84902e = parcel.readString();
        this.f84903f = parcel.readInt();
        this.f84904g = parcel.readInt();
        this.f84905h = parcel.readInt();
        this.f84906i = parcel.readString();
        this.f84908m = parcel.readString();
        this.f84909n = parcel.readString();
        this.f84910o = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
        this.f84911p = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.class.getClassLoader());
        this.f84914q = (com.tencent.mm.modelappbrand.LaunchParamsOptional) parcel.readParcelable(com.tencent.mm.modelappbrand.LaunchParamsOptional.class.getClassLoader());
        this.f84915r = parcel.readLong();
        this.f84916s = parcel.readLong();
        this.f84918u = parcel.readString();
        this.f84920w = parcel.readPersistableBundle(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.class.getClassLoader());
        this.f84921x = (com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate) parcel.readParcelable(com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.class.getClassLoader());
        this.f84924y = com.tencent.luggage.sdk.launching.k.a(parcel);
        this.f84927z = com.tencent.luggage.sdk.launching.k.a(parcel);
        this.A = parcel.readInt();
        this.B = com.tencent.luggage.sdk.launching.k.a(parcel);
        this.C = parcel.readPersistableBundle(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.class.getClassLoader());
        this.D = parcel.readString();
        this.F = parcel.readInt();
        this.G = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer.class.getClassLoader());
        this.L = parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.class.getClassLoader());
        this.M = (com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.class.getClassLoader());
        parcel.readStringList(arrayList);
        this.H = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.class.getClassLoader());
        this.P = com.tencent.luggage.sdk.launching.p.i(parcel);
        this.Q = parcel.readInt();
        this.R = parcel.readString();
        this.I = parcel.readByte() > 0;
        this.f84900J = parcel.readByte() > 0;
        this.K = (com.tencent.luggage.sdk.config.AppBrandInitWindowConfig) parcel.readParcelable(com.tencent.luggage.sdk.config.AppBrandInitWindowConfig.class.getClassLoader());
        this.S = parcel.readString();
        this.U = parcel.readString();
        java.lang.String readString = parcel.readString();
        this.T = android.text.TextUtils.isEmpty(readString) ? b1Var : k91.b1.valueOf(readString);
        this.V = parcel.readInt() == 1;
        this.W = parcel.readInt() == 1;
        this.Z = parcel.readInt() == 1;
        this.f84912p0 = parcel.readByte() > 0;
        this.Y = (com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig.class.getClassLoader());
        this.f84922x0 = parcel.readString();
        this.f84925y0 = parcel.readByte() > 0;
        if (parcel.dataAvail() > 0) {
            this.f84917t = parcel.readDouble();
        }
        if (parcel.dataAvail() > 0) {
            this.X = parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.class.getClassLoader());
        }
        this.f84907l1 = parcel.readString();
        this.E = parcel.readString();
        this.f84913p1 = (com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams.class.getClassLoader());
        if (parcel.dataAvail() > 0) {
            this.f84923x1 = parcel.readByte() != 0;
        }
        if (parcel.dataAvail() > 0) {
            this.f84919v = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.f84926y1 = parcel.readByte() > 0;
        }
        if (parcel.dataAvail() > 0) {
            this.f84928z1 = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.A1 = (com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams.class.getClassLoader());
        }
    }
}
