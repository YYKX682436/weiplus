package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.kv_14609 */
/* loaded from: classes7.dex */
public final class C12565x722467e8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8> f35156x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.n0();
    public java.lang.String A;
    public int B;
    public int C;
    public int D;
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public long f169558J;
    public int K;
    public boolean L;
    public int M;

    /* renamed from: d, reason: collision with root package name */
    public transient com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile f169559d;

    /* renamed from: e, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f169560e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f169561f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f169562g;

    /* renamed from: h, reason: collision with root package name */
    public int f169563h = 1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f169564i;

    /* renamed from: m, reason: collision with root package name */
    public final int f169565m;

    /* renamed from: n, reason: collision with root package name */
    public final int f169566n;

    /* renamed from: o, reason: collision with root package name */
    public long f169567o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f169568p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f169569q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f169570r;

    /* renamed from: s, reason: collision with root package name */
    public int f169571s;

    /* renamed from: t, reason: collision with root package name */
    public int f169572t;

    /* renamed from: u, reason: collision with root package name */
    public int f169573u;

    /* renamed from: v, reason: collision with root package name */
    public long f169574v;

    /* renamed from: w, reason: collision with root package name */
    public long f169575w;

    /* renamed from: x, reason: collision with root package name */
    public long f169576x;

    /* renamed from: y, reason: collision with root package name */
    public long f169577y;

    /* renamed from: z, reason: collision with root package name */
    public int f169578z;

    public C12565x722467e8(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_14609", "<init> appid:%s,oldVersion:%s,targetVersion:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f169561f = str;
        if ("@LibraryAppId".equals(str)) {
            this.f169562g = "publiclib";
            this.f169564i = null;
            this.f169568p = gm0.j1.a();
        } else {
            if (str.contains("$")) {
                java.lang.String[] split = str.split(java.util.regex.Pattern.quote("$"));
                java.lang.String str2 = split[0];
                this.f169562g = str2;
                int length = split.length;
                if (length == 2) {
                    java.lang.String str3 = split[1];
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        if (str3.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f)) {
                            this.f169578z = 12;
                            this.f169564i = null;
                        } else if (str3.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169)) {
                            this.f169578z = 22;
                            this.f169564i = null;
                        } else if (str3.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379)) {
                            this.f169578z = 6;
                            this.f169564i = null;
                        } else {
                            this.f169564i = str3;
                            this.f169578z = 4;
                        }
                    }
                } else if (length == 3) {
                    this.f169564i = split[1];
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[2])) {
                        if (split[2].equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f)) {
                            this.f169578z = 13;
                        } else if (split[2].equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169)) {
                            this.f169578z = 23;
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_14609", "getModuleName modulename:%s,appid:%s,pkgtype:%s", this.f169564i, str2, java.lang.Integer.valueOf(this.f169578z));
            } else {
                this.f169562g = str;
                this.f169564i = null;
            }
            this.f169568p = gm0.j1.a();
        }
        this.f169565m = i17;
        this.f169566n = i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if ((r0 == null || r0.length() == 0) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r4 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r0 = java.lang.System.currentTimeMillis()
            r4.f169575w = r0
            long r2 = r4.f169574v
            long r0 = r0 - r2
            r4.f169567o = r0
            long r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.i.a()
            r4.f169558J = r0
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L26
            int r0 = r0.length()
            if (r0 != 0) goto L24
            goto L26
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 == 0) goto L3d
            java.lang.String r0 = "https.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L3a
            int r0 = r0.length()
            if (r0 != 0) goto L38
            goto L3a
        L38:
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 != 0) goto L3e
        L3d:
            r1 = r2
        L3e:
            r4.L = r1
            java.lang.String r0 = r4.f169562g
            int r1 = r4.M
            sj1.l.h(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8.a():void");
    }

    public void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f169574v = java.lang.System.currentTimeMillis();
        this.M = sj1.l.f(this.f169562g, "public:download", "代码包下载和校验");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.m0(this);
        if (!((km0.c) gm0.j1.p().a()).a()) {
            m0Var.a();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5658x847c67d5 c5658x847c67d5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5658x847c67d5();
        am.ai aiVar = c5658x847c67d5.f135984g;
        aiVar.f87690a = this;
        aiVar.f87691b = m0Var;
        c5658x847c67d5.e();
        m0Var.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52418x9616526c() {
        return "kv_14609{appId='" + this.f169562g + "', appstate=" + this.f169563h + ", moduleName='" + this.f169564i + "', oldVersion=" + this.f169565m + ", targetVersion=" + this.f169566n + ", spendTime=" + this.f169567o + ", canUsePatchUpdate=" + this.f169568p + ", isUpdateComplete=" + this.f169569q + ", isUpdateCompleteWithPatch=" + this.f169570r + ", fullPkgSize=" + this.f169571s + ", patchSize=" + this.f169572t + ", errcode=" + this.f169573u + ", processStartMs=" + this.f169574v + ", processEndMs=" + this.f169575w + ", gzipReadyTimeMs=" + this.f169576x + ", zstdReadyTimeMs=" + this.f169577y + ", pkgType=" + this.f169578z + ", instanceId='" + this.A + "', appType=" + this.B + ", scene=" + this.C + ", protocol=" + this.D + ", downloadFileSize=" + this.E + ", isNewDNSUsed=" + this.F + ", RequestSource_sync_type=" + this.G + ", RequestSource_is_pre_hot=" + this.H + ", RequestSource_launch_flag=" + this.I + ", weakNetType=" + this.f169558J + ", downloadComponentType=" + this.K + ", hasSystemProxy=" + this.L + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f169561f);
        parcel.writeString(this.f169562g);
        parcel.writeString(this.f169564i);
        parcel.writeInt(this.f169565m);
        parcel.writeInt(this.f169566n);
        parcel.writeLong(this.f169567o);
        parcel.writeByte(this.f169568p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f169569q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f169570r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f169571s);
        parcel.writeInt(this.f169572t);
        parcel.writeInt(this.f169573u);
        parcel.writeLong(this.f169574v);
        parcel.writeLong(this.f169575w);
        parcel.writeString(this.A);
        parcel.writeLong(this.f169576x);
        parcel.writeLong(this.f169577y);
        parcel.writeInt(this.f169578z);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeLong(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeLong(this.f169558J);
        parcel.writeInt(this.K);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
    }

    public C12565x722467e8(android.os.Parcel parcel) {
        this.f169561f = parcel.readString();
        this.f169562g = parcel.readString();
        this.f169564i = parcel.readString();
        this.f169565m = parcel.readInt();
        this.f169566n = parcel.readInt();
        this.f169567o = parcel.readLong();
        this.f169568p = parcel.readByte() != 0;
        this.f169569q = parcel.readByte() != 0;
        this.f169570r = parcel.readByte() != 0;
        this.f169571s = parcel.readInt();
        this.f169572t = parcel.readInt();
        this.f169573u = parcel.readInt();
        this.f169574v = parcel.readLong();
        this.f169575w = parcel.readLong();
        this.A = parcel.readString();
        this.f169576x = parcel.readLong();
        this.f169577y = parcel.readLong();
        this.f169578z = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readLong();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.f169558J = parcel.readLong();
        this.K = parcel.readInt();
        this.L = parcel.readByte() != 0;
    }
}
