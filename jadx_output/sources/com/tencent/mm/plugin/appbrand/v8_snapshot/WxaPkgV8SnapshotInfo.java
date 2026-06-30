package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "Landroid/os/Parcelable;", "com/tencent/mm/plugin/appbrand/v8_snapshot/o3", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WxaPkgV8SnapshotInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final int f90664d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f90665e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f90666f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90667g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v8_snapshot.l3 f90668h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f90669i;

    /* renamed from: m, reason: collision with root package name */
    public final long f90670m;

    /* renamed from: n, reason: collision with root package name */
    public final long f90671n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f90672o;

    /* renamed from: p, reason: collision with root package name */
    public final org.json.JSONObject f90673p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f90674q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f90675r;

    /* renamed from: s, reason: collision with root package name */
    public final int f90676s;

    /* renamed from: t, reason: collision with root package name */
    public final int f90677t;

    /* renamed from: u, reason: collision with root package name */
    public final int f90678u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.o3 f90661v = new com.tencent.mm.plugin.appbrand.v8_snapshot.o3(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.p3();

    /* renamed from: w, reason: collision with root package name */
    public static final jz5.g f90662w = jz5.h.b(com.tencent.mm.plugin.appbrand.v8_snapshot.m3.f90787d);

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f90663x = jz5.h.b(com.tencent.mm.plugin.appbrand.v8_snapshot.n3.f90793d);

    public WxaPkgV8SnapshotInfo(int i17, java.lang.String wxaPkgMd5, java.lang.String wxaPkgPath, int i18, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 snapshotCategory, java.lang.String snapshotPath, long j17, long j18, java.lang.String snapshotBaseConfig, org.json.JSONObject snapshotMetaInfo, boolean z17, java.lang.String snapshotNodeConfig, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(wxaPkgMd5, "wxaPkgMd5");
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        kotlin.jvm.internal.o.g(snapshotCategory, "snapshotCategory");
        kotlin.jvm.internal.o.g(snapshotPath, "snapshotPath");
        kotlin.jvm.internal.o.g(snapshotBaseConfig, "snapshotBaseConfig");
        kotlin.jvm.internal.o.g(snapshotMetaInfo, "snapshotMetaInfo");
        kotlin.jvm.internal.o.g(snapshotNodeConfig, "snapshotNodeConfig");
        this.f90664d = i17;
        this.f90665e = wxaPkgMd5;
        this.f90666f = wxaPkgPath;
        this.f90667g = i18;
        this.f90668h = snapshotCategory;
        this.f90669i = snapshotPath;
        this.f90670m = j17;
        this.f90671n = j18;
        this.f90672o = snapshotBaseConfig;
        this.f90673p = snapshotMetaInfo;
        this.f90674q = z17;
        this.f90675r = snapshotNodeConfig;
        this.f90676s = i19;
        this.f90677t = i27;
        this.f90678u = i28;
    }

    public static com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo b(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, int i17, java.lang.String str, java.lang.String str2, int i18, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var, java.lang.String str3, long j17, long j18, java.lang.String str4, org.json.JSONObject jSONObject, boolean z17, java.lang.String str5, int i19, int i27, int i28, int i29, java.lang.Object obj) {
        int i37 = (i29 & 1) != 0 ? wxaPkgV8SnapshotInfo.f90664d : i17;
        java.lang.String wxaPkgMd5 = (i29 & 2) != 0 ? wxaPkgV8SnapshotInfo.f90665e : str;
        java.lang.String wxaPkgPath = (i29 & 4) != 0 ? wxaPkgV8SnapshotInfo.f90666f : str2;
        int i38 = (i29 & 8) != 0 ? wxaPkgV8SnapshotInfo.f90667g : i18;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 snapshotCategory = (i29 & 16) != 0 ? wxaPkgV8SnapshotInfo.f90668h : l3Var;
        java.lang.String snapshotPath = (i29 & 32) != 0 ? wxaPkgV8SnapshotInfo.f90669i : str3;
        long j19 = (i29 & 64) != 0 ? wxaPkgV8SnapshotInfo.f90670m : j17;
        long j27 = (i29 & 128) != 0 ? wxaPkgV8SnapshotInfo.f90671n : j18;
        java.lang.String snapshotBaseConfig = (i29 & 256) != 0 ? wxaPkgV8SnapshotInfo.f90672o : str4;
        org.json.JSONObject snapshotMetaInfo = (i29 & 512) != 0 ? wxaPkgV8SnapshotInfo.f90673p : jSONObject;
        boolean z18 = (i29 & 1024) != 0 ? wxaPkgV8SnapshotInfo.f90674q : z17;
        java.lang.String snapshotNodeConfig = (i29 & 2048) != 0 ? wxaPkgV8SnapshotInfo.f90675r : str5;
        boolean z19 = z18;
        int i39 = (i29 & 4096) != 0 ? wxaPkgV8SnapshotInfo.f90676s : i19;
        int i47 = (i29 & 8192) != 0 ? wxaPkgV8SnapshotInfo.f90677t : i27;
        int i48 = (i29 & 16384) != 0 ? wxaPkgV8SnapshotInfo.f90678u : i28;
        wxaPkgV8SnapshotInfo.getClass();
        kotlin.jvm.internal.o.g(wxaPkgMd5, "wxaPkgMd5");
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        kotlin.jvm.internal.o.g(snapshotCategory, "snapshotCategory");
        kotlin.jvm.internal.o.g(snapshotPath, "snapshotPath");
        kotlin.jvm.internal.o.g(snapshotBaseConfig, "snapshotBaseConfig");
        kotlin.jvm.internal.o.g(snapshotMetaInfo, "snapshotMetaInfo");
        kotlin.jvm.internal.o.g(snapshotNodeConfig, "snapshotNodeConfig");
        return new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo(i37, wxaPkgMd5, wxaPkgPath, i38, snapshotCategory, snapshotPath, j19, j27, snapshotBaseConfig, snapshotMetaInfo, z19, snapshotNodeConfig, i39, i47, i48);
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader, boolean z17) {
        boolean z18;
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        if (!z17 && (z18 = this.f90674q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfo", "canUse, enableNodeSnapshot: %b, isNodeSnapshot: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            return false;
        }
        if (g()) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.s(commLibReader, this.f90668h, this.f90677t, this.f90678u, true, false);
            return false;
        }
        if (f()) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.s(commLibReader, this.f90668h, this.f90677t, this.f90678u, false, false);
            return false;
        }
        if (this.f90669i.length() == 0) {
            return false;
        }
        if (!e()) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.s(commLibReader, this.f90668h, this.f90677t, this.f90678u, false, true);
        return false;
    }

    public final int c() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.o3 o3Var = f90661v;
        java.lang.String contextName = o3Var.b(this.f90668h);
        kotlin.jvm.internal.o.g(contextName, "contextName");
        int i17 = com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
        org.json.JSONObject jSONObject = this.f90673p;
        int optInt = jSONObject.optInt(contextName, i17);
        if (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX != optInt) {
            return optInt;
        }
        java.lang.String contextName2 = o3Var.b(com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i);
        kotlin.jvm.internal.o.g(contextName2, "contextName");
        return jSONObject.optInt(contextName2, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX);
    }

    public final boolean d(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader) {
        java.lang.String qe6;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var2 = this.f90668h;
        if (l3Var == l3Var2 || (qe6 = commLibReader.qe("snapshotConfig")) == null) {
            return false;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONArray optJSONArray = new org.json.JSONObject(qe6).optJSONArray(f90661v.b(l3Var2));
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf((optJSONArray != null ? optJSONArray.length() : 0) > 0));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) m521constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f90669i);
        if (r6Var.m() && this.f90671n == r6Var.C() && this.f90670m == r6Var.B()) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotBad, maybe snapshot is bad");
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) obj;
        return this.f90664d == wxaPkgV8SnapshotInfo.f90664d && kotlin.jvm.internal.o.b(this.f90665e, wxaPkgV8SnapshotInfo.f90665e) && kotlin.jvm.internal.o.b(this.f90666f, wxaPkgV8SnapshotInfo.f90666f) && this.f90667g == wxaPkgV8SnapshotInfo.f90667g && this.f90668h == wxaPkgV8SnapshotInfo.f90668h && kotlin.jvm.internal.o.b(this.f90669i, wxaPkgV8SnapshotInfo.f90669i) && this.f90670m == wxaPkgV8SnapshotInfo.f90670m && this.f90671n == wxaPkgV8SnapshotInfo.f90671n && kotlin.jvm.internal.o.b(this.f90672o, wxaPkgV8SnapshotInfo.f90672o) && kotlin.jvm.internal.o.b(this.f90673p, wxaPkgV8SnapshotInfo.f90673p) && this.f90674q == wxaPkgV8SnapshotInfo.f90674q && kotlin.jvm.internal.o.b(this.f90675r, wxaPkgV8SnapshotInfo.f90675r) && this.f90676s == wxaPkgV8SnapshotInfo.f90676s && this.f90677t == wxaPkgV8SnapshotInfo.f90677t && this.f90678u == wxaPkgV8SnapshotInfo.f90678u;
    }

    public final boolean f() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        if (!k2Var.b()) {
            k2Var.getClass();
            int i17 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90765q;
            int i18 = this.f90677t;
            if (i17 <= i18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotConsumeException, reach use snapshot exception count threshold, consumingSnapshotCount: " + i18);
                return true;
            }
        }
        if (!k2Var.b()) {
            k2Var.getClass();
            int i19 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90766r;
            int i27 = this.f90678u;
            if (i19 <= i27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfo", "canUse, reach use recover count threshold, recoverCount: " + i27);
            }
        }
        return false;
    }

    public final boolean g() {
        jz5.g gVar = f90662w;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).getValue();
        java.lang.String str2 = this.f90672o;
        if (!kotlin.jvm.internal.o.b(str2, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotEnvChange, snapshotBaseConfig: " + str2 + ", curSnapshotBaseConfig: " + ((java.lang.String) ((jz5.n) gVar).getValue()));
            return true;
        }
        if (!this.f90674q) {
            return false;
        }
        jz5.g gVar2 = f90663x;
        java.lang.String str3 = (java.lang.String) ((jz5.n) gVar2).getValue();
        java.lang.String str4 = this.f90675r;
        if (kotlin.jvm.internal.o.b(str4, str3)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotEnvChange, isNodeSnapshot, snapshotNodeConfig: " + str4 + ", curSnapshotNodeFlag: " + ((java.lang.String) ((jz5.n) gVar2).getValue()));
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f90664d) * 31) + this.f90665e.hashCode()) * 31) + this.f90666f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f90667g)) * 31) + this.f90668h.hashCode()) * 31) + this.f90669i.hashCode()) * 31) + java.lang.Long.hashCode(this.f90670m)) * 31) + java.lang.Long.hashCode(this.f90671n)) * 31) + this.f90672o.hashCode()) * 31) + this.f90673p.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f90674q)) * 31) + this.f90675r.hashCode()) * 31) + java.lang.Integer.hashCode(this.f90676s)) * 31) + java.lang.Integer.hashCode(this.f90677t)) * 31) + java.lang.Integer.hashCode(this.f90678u);
    }

    public java.lang.String toString() {
        return "WxaPkgV8SnapshotInfo(arch=" + this.f90664d + ", wxaPkgMd5=" + this.f90665e + ", wxaPkgPath=" + this.f90666f + ", wxaPkgVersion=" + this.f90667g + ", snapshotCategory=" + this.f90668h + ", snapshotPath=" + this.f90669i + ", snapshotLastModified=" + this.f90670m + ", snapshotLength=" + this.f90671n + ", snapshotBaseConfig=" + this.f90672o + ", snapshotMetaInfo=" + this.f90673p + ", isNodeSnapshot=" + this.f90674q + ", snapshotNodeConfig=" + this.f90675r + ", producingSnapshotCount=" + this.f90676s + ", consumingSnapshotCount=" + this.f90677t + ", recoverCount=" + this.f90678u + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f90664d);
        out.writeString(this.f90665e);
        out.writeString(this.f90666f);
        out.writeInt(this.f90667g);
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = this.f90668h;
        out.writeString(l3Var != null ? l3Var.f90775d : null);
        out.writeString(this.f90669i);
        out.writeLong(this.f90670m);
        out.writeLong(this.f90671n);
        out.writeString(this.f90672o);
        org.json.JSONObject jSONObject = this.f90673p;
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        out.writeString(jSONObject.toString());
        out.writeInt(this.f90674q ? 1 : 0);
        out.writeString(this.f90675r);
        out.writeInt(this.f90676s);
        out.writeInt(this.f90677t);
        out.writeInt(this.f90678u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WxaPkgV8SnapshotInfo(int r21, java.lang.String r22, java.lang.String r23, int r24, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 r25, java.lang.String r26, long r27, long r29, java.lang.String r31, org.json.JSONObject r32, boolean r33, java.lang.String r34, int r35, int r36, int r37, int r38, kotlin.jvm.internal.i r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto Lc
            int r1 = com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d
            int r1 = com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d
            r3 = r1
            goto Le
        Lc:
            r3 = r21
        Le:
            r1 = r0 & 32
            if (r1 == 0) goto L16
            java.lang.String r1 = ""
            r8 = r1
            goto L18
        L16:
            r8 = r26
        L18:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L20
            r9 = r4
            goto L22
        L20:
            r9 = r27
        L22:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L28
            r11 = r4
            goto L2a
        L28:
            r11 = r29
        L2a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            java.lang.String r2 = "{}"
            if (r1 == 0) goto L33
            r13 = r2
            goto L35
        L33:
            r13 = r31
        L35:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L40
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r14 = r1
            goto L42
        L40:
            r14 = r32
        L42:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r1 == 0) goto L49
            r15 = r4
            goto L4b
        L49:
            r15 = r33
        L4b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L52
            r16 = r2
            goto L54
        L52:
            r16 = r34
        L54:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L5b
            r17 = r4
            goto L5d
        L5b:
            r17 = r35
        L5d:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L64
            r18 = r4
            goto L66
        L64:
            r18 = r36
        L66:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L6d
            r19 = r4
            goto L6f
        L6d:
            r19 = r37
        L6f:
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.<init>(int, java.lang.String, java.lang.String, int, com.tencent.mm.plugin.appbrand.v8_snapshot.l3, java.lang.String, long, long, java.lang.String, org.json.JSONObject, boolean, java.lang.String, int, int, int, int, kotlin.jvm.internal.i):void");
    }
}
