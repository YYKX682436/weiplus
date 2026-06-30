package com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342;

/* renamed from: com.tencent.luggage.sdk.config.AppBrandSysConfigLU */
/* loaded from: classes7.dex */
public class C3899xf952a052 extends k91.z0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052> f15682x681a0c0c = new ne.f();
    public com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b A;
    public java.util.HashMap B;
    public java.util.HashMap C;
    public java.lang.String D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f128826J;
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
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a Y;
    public java.lang.String[] Z;

    /* renamed from: p0, reason: collision with root package name */
    public long f128827p0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f128828v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f128829w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f128830x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f128831x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f128832y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f128833z;

    public C3899xf952a052() {
        this.f128829w = false;
        this.f128830x = false;
        this.f128832y = false;
        this.f128833z = false;
        this.X = 0L;
        this.Z = new java.lang.String[0];
        this.f128831x0 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m32070x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandSysConfigLU{, brandName='");
        sb6.append(this.f387374d);
        sb6.append("', appId='");
        sb6.append(this.f387375e);
        sb6.append("', appIconUrl='");
        sb6.append(this.f387376f);
        sb6.append("', debugEnabled=");
        sb6.append(this.f128829w);
        sb6.append(", performancePanelEnabled=");
        sb6.append(this.f128830x);
        sb6.append(", maxWebViewDepth=");
        sb6.append(this.f387377g);
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
        sb6.append(this.f387385r);
        sb6.append(", systemSettings=");
        sb6.append(this.Y);
        sb6.append(", runningFlag=");
        sb6.append(this.f128827p0);
        sb6.append(", operationInfo=");
        sb6.append(this.D);
        sb6.append(", kvStorageScheme=");
        sb6.append(this.f387386s);
        sb6.append(", TLSSkipHostnameCheck=");
        sb6.append(this.L);
        sb6.append(", kvStoragePerformanceReportOn=");
        sb6.append(this.f387387t);
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
        parcel.writeString(this.f387374d);
        parcel.writeString(this.f128828v);
        parcel.writeString(this.f387375e);
        parcel.writeString(this.f387376f);
        parcel.writeByte(this.f128829w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f128830x ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A, i17);
        parcel.writeInt(this.f387377g);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.f128826J);
        parcel.writeByte(this.K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.P);
        parcel.writeStringList(this.Q);
        parcel.writeStringList(this.R);
        parcel.writeStringList(this.S);
        parcel.writeStringList(this.T);
        parcel.writeStringList(this.U);
        parcel.writeParcelable(this.f387385r, i17);
        parcel.writeParcelable(this.Y, i17);
        parcel.writeByte(this.f387378h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f387379i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f387380m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f387383p);
        parcel.writeInt(this.f387384q);
        parcel.writeInt(this.W);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeLong(this.X);
        parcel.writeString(this.D);
        parcel.writeInt(this.Z.length);
        parcel.writeStringArray(this.Z);
        parcel.writeInt(this.f387386s);
        parcel.writeInt(this.f387387t ? 1 : 0);
        parcel.writeInt(this.f387381n ? 1 : 0);
        parcel.writeInt(this.f387382o ? 1 : 0);
        parcel.writeLong(this.f128827p0);
        parcel.writeMap(this.B);
        parcel.writeMap(this.C);
        parcel.writeString(this.f387388u);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.M)) {
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
        parcel.writeString(this.f128831x0);
    }

    public C3899xf952a052(android.os.Parcel parcel) {
        this.f128829w = false;
        this.f128830x = false;
        this.f128832y = false;
        this.f128833z = false;
        this.X = 0L;
        this.Z = new java.lang.String[0];
        this.f128831x0 = "";
        this.f387374d = parcel.readString();
        this.f128828v = parcel.readString();
        this.f387375e = parcel.readString();
        this.f387376f = parcel.readString();
        this.f128829w = parcel.readByte() != 0;
        this.f128830x = parcel.readByte() != 0;
        this.A = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b) parcel.readParcelable(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b.class.getClassLoader());
        this.f387377g = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.f128826J = parcel.readInt();
        this.K = parcel.readByte() != 0;
        this.L = parcel.readByte() != 0;
        this.P = parcel.createStringArrayList();
        this.Q = parcel.createStringArrayList();
        this.R = parcel.createStringArrayList();
        this.S = parcel.createStringArrayList();
        this.T = parcel.createStringArrayList();
        this.U = parcel.createStringArrayList();
        this.f387385r = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6.class.getClassLoader());
        this.Y = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.class.getClassLoader());
        this.f387378h = parcel.readByte() > 0;
        this.f387379i = parcel.readByte() > 0;
        this.f387380m = parcel.readByte() > 0;
        this.f387383p = parcel.readInt();
        this.f387384q = parcel.readInt();
        this.W = parcel.readInt();
        this.V = parcel.readInt() == 1;
        this.X = parcel.readLong();
        this.D = parcel.readString();
        java.lang.String[] strArr = new java.lang.String[parcel.readInt()];
        this.Z = strArr;
        parcel.readStringArray(strArr);
        this.f387386s = parcel.readInt();
        this.f387387t = parcel.readInt() == 1;
        this.f387381n = parcel.readInt() == 1;
        this.f387382o = parcel.readInt() == 1;
        this.f128827p0 = parcel.readLong();
        this.B = parcel.readHashMap(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54.class.getClassLoader());
        this.C = parcel.readHashMap(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89.class.getClassLoader());
        this.f387388u = parcel.readString();
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
        this.f128831x0 = parcel.readString();
    }
}
