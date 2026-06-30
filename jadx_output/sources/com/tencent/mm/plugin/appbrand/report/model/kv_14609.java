package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class kv_14609 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.report.model.kv_14609> CREATOR = new com.tencent.mm.plugin.appbrand.report.model.n0();
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
    public long f88025J;
    public int K;
    public boolean L;
    public int M;

    /* renamed from: d, reason: collision with root package name */
    public transient com.tencent.mars.cdn.CdnManager.WebPageProfile f88026d;

    /* renamed from: e, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.report.quality.QualitySession f88027e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f88028f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f88029g;

    /* renamed from: h, reason: collision with root package name */
    public int f88030h = 1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f88031i;

    /* renamed from: m, reason: collision with root package name */
    public final int f88032m;

    /* renamed from: n, reason: collision with root package name */
    public final int f88033n;

    /* renamed from: o, reason: collision with root package name */
    public long f88034o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f88035p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f88036q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f88037r;

    /* renamed from: s, reason: collision with root package name */
    public int f88038s;

    /* renamed from: t, reason: collision with root package name */
    public int f88039t;

    /* renamed from: u, reason: collision with root package name */
    public int f88040u;

    /* renamed from: v, reason: collision with root package name */
    public long f88041v;

    /* renamed from: w, reason: collision with root package name */
    public long f88042w;

    /* renamed from: x, reason: collision with root package name */
    public long f88043x;

    /* renamed from: y, reason: collision with root package name */
    public long f88044y;

    /* renamed from: z, reason: collision with root package name */
    public int f88045z;

    public kv_14609(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14609", "<init> appid:%s,oldVersion:%s,targetVersion:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f88028f = str;
        if ("@LibraryAppId".equals(str)) {
            this.f88029g = "publiclib";
            this.f88031i = null;
            this.f88035p = gm0.j1.a();
        } else {
            if (str.contains("$")) {
                java.lang.String[] split = str.split(java.util.regex.Pattern.quote("$"));
                java.lang.String str2 = split[0];
                this.f88029g = str2;
                int length = split.length;
                if (length == 2) {
                    java.lang.String str3 = split[1];
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        if (str3.equals(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE)) {
                            this.f88045z = 12;
                            this.f88031i = null;
                        } else if (str3.equals(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE)) {
                            this.f88045z = 22;
                            this.f88031i = null;
                        } else if (str3.equals(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE)) {
                            this.f88045z = 6;
                            this.f88031i = null;
                        } else {
                            this.f88031i = str3;
                            this.f88045z = 4;
                        }
                    }
                } else if (length == 3) {
                    this.f88031i = split[1];
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(split[2])) {
                        if (split[2].equals(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE)) {
                            this.f88045z = 13;
                        } else if (split[2].equals(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE)) {
                            this.f88045z = 23;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14609", "getModuleName modulename:%s,appid:%s,pkgtype:%s", this.f88031i, str2, java.lang.Integer.valueOf(this.f88045z));
            } else {
                this.f88029g = str;
                this.f88031i = null;
            }
            this.f88035p = gm0.j1.a();
        }
        this.f88032m = i17;
        this.f88033n = i18;
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
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r0 = java.lang.System.currentTimeMillis()
            r4.f88042w = r0
            long r2 = r4.f88041v
            long r0 = r0 - r2
            r4.f88034o = r0
            long r0 = com.tencent.mm.plugin.appbrand.networking.i.a()
            r4.f88025J = r0
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
            java.lang.String r0 = r4.f88029g
            int r1 = r4.M
            sj1.l.h(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.model.kv_14609.a():void");
    }

    public void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f88041v = java.lang.System.currentTimeMillis();
        this.M = sj1.l.f(this.f88029g, "public:download", "代码包下载和校验");
    }

    public void c() {
        com.tencent.mm.plugin.appbrand.report.model.m0 m0Var = new com.tencent.mm.plugin.appbrand.report.model.m0(this);
        if (!((km0.c) gm0.j1.p().a()).a()) {
            m0Var.a();
            return;
        }
        com.tencent.mm.autogen.events.KV14609ReportEvent kV14609ReportEvent = new com.tencent.mm.autogen.events.KV14609ReportEvent();
        am.ai aiVar = kV14609ReportEvent.f54451g;
        aiVar.f6157a = this;
        aiVar.f6158b = m0Var;
        kV14609ReportEvent.e();
        m0Var.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "kv_14609{appId='" + this.f88029g + "', appstate=" + this.f88030h + ", moduleName='" + this.f88031i + "', oldVersion=" + this.f88032m + ", targetVersion=" + this.f88033n + ", spendTime=" + this.f88034o + ", canUsePatchUpdate=" + this.f88035p + ", isUpdateComplete=" + this.f88036q + ", isUpdateCompleteWithPatch=" + this.f88037r + ", fullPkgSize=" + this.f88038s + ", patchSize=" + this.f88039t + ", errcode=" + this.f88040u + ", processStartMs=" + this.f88041v + ", processEndMs=" + this.f88042w + ", gzipReadyTimeMs=" + this.f88043x + ", zstdReadyTimeMs=" + this.f88044y + ", pkgType=" + this.f88045z + ", instanceId='" + this.A + "', appType=" + this.B + ", scene=" + this.C + ", protocol=" + this.D + ", downloadFileSize=" + this.E + ", isNewDNSUsed=" + this.F + ", RequestSource_sync_type=" + this.G + ", RequestSource_is_pre_hot=" + this.H + ", RequestSource_launch_flag=" + this.I + ", weakNetType=" + this.f88025J + ", downloadComponentType=" + this.K + ", hasSystemProxy=" + this.L + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f88028f);
        parcel.writeString(this.f88029g);
        parcel.writeString(this.f88031i);
        parcel.writeInt(this.f88032m);
        parcel.writeInt(this.f88033n);
        parcel.writeLong(this.f88034o);
        parcel.writeByte(this.f88035p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f88036q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f88037r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f88038s);
        parcel.writeInt(this.f88039t);
        parcel.writeInt(this.f88040u);
        parcel.writeLong(this.f88041v);
        parcel.writeLong(this.f88042w);
        parcel.writeString(this.A);
        parcel.writeLong(this.f88043x);
        parcel.writeLong(this.f88044y);
        parcel.writeInt(this.f88045z);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeLong(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeLong(this.f88025J);
        parcel.writeInt(this.K);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
    }

    public kv_14609(android.os.Parcel parcel) {
        this.f88028f = parcel.readString();
        this.f88029g = parcel.readString();
        this.f88031i = parcel.readString();
        this.f88032m = parcel.readInt();
        this.f88033n = parcel.readInt();
        this.f88034o = parcel.readLong();
        this.f88035p = parcel.readByte() != 0;
        this.f88036q = parcel.readByte() != 0;
        this.f88037r = parcel.readByte() != 0;
        this.f88038s = parcel.readInt();
        this.f88039t = parcel.readInt();
        this.f88040u = parcel.readInt();
        this.f88041v = parcel.readLong();
        this.f88042w = parcel.readLong();
        this.A = parcel.readString();
        this.f88043x = parcel.readLong();
        this.f88044y = parcel.readLong();
        this.f88045z = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readLong();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.f88025J = parcel.readLong();
        this.K = parcel.readInt();
        this.L = parcel.readByte() != 0;
    }
}
