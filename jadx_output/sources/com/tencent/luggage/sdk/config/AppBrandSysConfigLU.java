package com.tencent.luggage.sdk.config;

/* loaded from: classes7.dex */
public class AppBrandSysConfigLU extends k91.z0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.config.AppBrandSysConfigLU> CREATOR = new ne.f();
    public com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized A;
    public java.util.HashMap B;
    public java.util.HashMap C;
    public java.lang.String D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f47293J;
    public boolean K;
    public boolean L;
    public byte[] M;
    public int[] N;
    public java.util.ArrayList P;
    public java.util.ArrayList Q;
    public java.util.ArrayList R;
    public java.util.ArrayList S;
    public java.util.ArrayList T;
    public java.util.ArrayList U;
    public boolean V;
    public int W;
    public long X;
    public com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig Y;
    public java.lang.String[] Z;

    /* renamed from: p0, reason: collision with root package name */
    public long f47294p0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f47295v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f47296w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f47297x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f47298x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f47299y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f47300z;

    public AppBrandSysConfigLU() {
        this.f47296w = false;
        this.f47297x = false;
        this.f47299y = false;
        this.f47300z = false;
        this.X = 0L;
        this.Z = new java.lang.String[0];
        this.f47298x0 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandSysConfigLU{, brandName='");
        sb6.append(this.f305841d);
        sb6.append("', appId='");
        sb6.append(this.f305842e);
        sb6.append("', appIconUrl='");
        sb6.append(this.f305843f);
        sb6.append("', debugEnabled=");
        sb6.append(this.f47296w);
        sb6.append(", performancePanelEnabled=");
        sb6.append(this.f47297x);
        sb6.append(", maxWebViewDepth=");
        sb6.append(this.f305844g);
        sb6.append(", maxBackgroundLifeSpan=");
        sb6.append(this.E);
        sb6.append(", maxRequestConcurrent=");
        sb6.append(this.F);
        sb6.append(", maxUploadConcurrent=");
        sb6.append(this.G);
        sb6.append(", maxDownloadConcurrent=");
        sb6.append(this.H);
        sb6.append(", maxWebsocketConnect=");
        sb6.append(this.I);
        sb6.append(", websocketSkipPortCheck=");
        sb6.append(this.K);
        sb6.append(", requestDomains=");
        sb6.append(this.P);
        sb6.append(", socketDomains=");
        sb6.append(this.Q);
        sb6.append(", uploadDomains=");
        sb6.append(this.R);
        sb6.append(", downloadDomains=");
        sb6.append(this.S);
        sb6.append(", udpDomains=");
        sb6.append(this.T);
        sb6.append(", tcpDomains=");
        sb6.append(this.U);
        sb6.append(", appPkgInfo=");
        sb6.append(this.f305852r);
        sb6.append(", systemSettings=");
        sb6.append(this.Y);
        sb6.append(", runningFlag=");
        sb6.append(this.f47294p0);
        sb6.append(", operationInfo=");
        sb6.append(this.D);
        sb6.append(", kvStorageScheme=");
        sb6.append(this.f305853s);
        sb6.append(", TLSSkipHostnameCheck=");
        sb6.append(this.L);
        sb6.append(", kvStoragePerformanceReportOn=");
        sb6.append(this.f305854t);
        sb6.append(", pluginPermissionBundleMap=");
        java.util.HashMap hashMap = this.B;
        sb6.append(hashMap == null ? java.lang.String.valueOf(0) : java.lang.String.valueOf(hashMap.size()));
        sb6.append(", appidABTestPermissionBundleMap=");
        java.util.HashMap hashMap2 = this.C;
        sb6.append(hashMap2 == null ? java.lang.String.valueOf(0) : java.lang.String.valueOf(hashMap2.size()));
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f305841d);
        parcel.writeString(this.f47295v);
        parcel.writeString(this.f305842e);
        parcel.writeString(this.f305843f);
        parcel.writeByte(this.f47296w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f47297x ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A, i17);
        parcel.writeInt(this.f305844g);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.f47293J);
        parcel.writeByte(this.K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.P);
        parcel.writeStringList(this.Q);
        parcel.writeStringList(this.R);
        parcel.writeStringList(this.S);
        parcel.writeStringList(this.T);
        parcel.writeStringList(this.U);
        parcel.writeParcelable(this.f305852r, i17);
        parcel.writeParcelable(this.Y, i17);
        parcel.writeByte(this.f305845h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f305846i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f305847m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f305850p);
        parcel.writeInt(this.f305851q);
        parcel.writeInt(this.W);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeLong(this.X);
        parcel.writeString(this.D);
        parcel.writeInt(this.Z.length);
        parcel.writeStringArray(this.Z);
        parcel.writeInt(this.f305853s);
        parcel.writeInt(this.f305854t ? 1 : 0);
        parcel.writeInt(this.f305848n ? 1 : 0);
        parcel.writeInt(this.f305849o ? 1 : 0);
        parcel.writeLong(this.f47294p0);
        parcel.writeMap(this.B);
        parcel.writeMap(this.C);
        parcel.writeString(this.f305855u);
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.M)) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(this.M.length);
            parcel.writeByteArray(this.M);
        }
        int[] iArr = this.N;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.N);
        }
        parcel.writeString(this.f47298x0);
    }

    public AppBrandSysConfigLU(android.os.Parcel parcel) {
        this.f47296w = false;
        this.f47297x = false;
        this.f47299y = false;
        this.f47300z = false;
        this.X = 0L;
        this.Z = new java.lang.String[0];
        this.f47298x0 = "";
        this.f305841d = parcel.readString();
        this.f47295v = parcel.readString();
        this.f305842e = parcel.readString();
        this.f305843f = parcel.readString();
        this.f47296w = parcel.readByte() != 0;
        this.f47297x = parcel.readByte() != 0;
        this.A = (com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized) parcel.readParcelable(com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized.class.getClassLoader());
        this.f305844g = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.f47293J = parcel.readInt();
        this.K = parcel.readByte() != 0;
        this.L = parcel.readByte() != 0;
        this.P = parcel.createStringArrayList();
        this.Q = parcel.createStringArrayList();
        this.R = parcel.createStringArrayList();
        this.S = parcel.createStringArrayList();
        this.T = parcel.createStringArrayList();
        this.U = parcel.createStringArrayList();
        this.f305852r = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.class.getClassLoader());
        this.Y = (com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.class.getClassLoader());
        this.f305845h = parcel.readByte() > 0;
        this.f305846i = parcel.readByte() > 0;
        this.f305847m = parcel.readByte() > 0;
        this.f305850p = parcel.readInt();
        this.f305851q = parcel.readInt();
        this.W = parcel.readInt();
        this.V = parcel.readInt() == 1;
        this.X = parcel.readLong();
        this.D = parcel.readString();
        java.lang.String[] strArr = new java.lang.String[parcel.readInt()];
        this.Z = strArr;
        parcel.readStringArray(strArr);
        this.f305853s = parcel.readInt();
        this.f305854t = parcel.readInt() == 1;
        this.f305848n = parcel.readInt() == 1;
        this.f305849o = parcel.readInt() == 1;
        this.f47294p0 = parcel.readLong();
        this.B = parcel.readHashMap(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle.class.getClassLoader());
        this.C = parcel.readHashMap(com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle.class.getClassLoader());
        this.f305855u = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.M = bArr;
            parcel.readByteArray(bArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            int[] iArr = new int[readInt2];
            this.N = iArr;
            parcel.readIntArray(iArr);
        }
        this.f47298x0 = parcel.readString();
    }
}
