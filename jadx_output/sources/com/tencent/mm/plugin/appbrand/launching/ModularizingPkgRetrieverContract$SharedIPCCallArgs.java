package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$SharedIPCCallArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class ModularizingPkgRetrieverContract$SharedIPCCallArgs implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84453d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84454e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84455f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f84456g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84457h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84458i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f84459m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f84460n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f84461o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84462p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f84463q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f84464r;

    public ModularizingPkgRetrieverContract$SharedIPCCallArgs(java.lang.String appId, int i17, int i18, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaVersionInfo, boolean z17, boolean z18, boolean z19, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader acceptedLibReader, java.util.Map map, com.tencent.mm.plugin.appbrand.report.quality.QualitySession reportQualitySession, boolean z27, boolean z28) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(wxaVersionInfo, "wxaVersionInfo");
        kotlin.jvm.internal.o.g(acceptedLibReader, "acceptedLibReader");
        kotlin.jvm.internal.o.g(reportQualitySession, "reportQualitySession");
        this.f84453d = appId;
        this.f84454e = i17;
        this.f84455f = i18;
        this.f84456g = wxaVersionInfo;
        this.f84457h = z17;
        this.f84458i = z18;
        this.f84459m = z19;
        this.f84460n = acceptedLibReader;
        this.f84461o = map;
        this.f84462p = reportQualitySession;
        this.f84463q = z27;
        this.f84464r = z28;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f84453d);
        dest.writeInt(this.f84454e);
        dest.writeInt(this.f84455f);
        dest.writeParcelable(this.f84456g, 0);
        dest.writeByte(this.f84457h ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f84458i ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f84459m ? (byte) 1 : (byte) 0);
        com.tencent.mm.plugin.appbrand.appstorage.s1.b(this.f84460n, dest, i17);
        dest.writeMap(this.f84461o);
        dest.writeParcelable(this.f84462p, 0);
        dest.writeByte(this.f84463q ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f84464r ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ModularizingPkgRetrieverContract$SharedIPCCallArgs(android.os.Parcel r15) {
        /*
            r14 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r2 = r15.readString()
            kotlin.jvm.internal.o.d(r2)
            int r3 = r15.readInt()
            int r4 = r15.readInt()
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo> r0 = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r15.readParcelable(r0)
            kotlin.jvm.internal.o.d(r0)
            r5 = r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo) r5
            byte r0 = r15.readByte()
            r1 = 1
            r6 = 0
            if (r0 <= 0) goto L2f
            r0 = r1
            goto L30
        L2f:
            r0 = r6
        L30:
            byte r7 = r15.readByte()
            if (r7 <= 0) goto L38
            r7 = r1
            goto L39
        L38:
            r7 = r6
        L39:
            byte r8 = r15.readByte()
            if (r8 <= 0) goto L41
            r8 = r1
            goto L42
        L41:
            r8 = r6
        L42:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r9 = com.tencent.mm.plugin.appbrand.appstorage.s1.a(r15)
            java.lang.String r10 = "readFromParcel(...)"
            kotlin.jvm.internal.o.f(r9, r10)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r11 = 0
            r15.readMap(r10, r11)
            java.lang.Class<com.tencent.mm.plugin.appbrand.report.quality.QualitySession> r11 = com.tencent.mm.plugin.appbrand.report.quality.QualitySession.class
            java.lang.ClassLoader r11 = r11.getClassLoader()
            android.os.Parcelable r11 = r15.readParcelable(r11)
            kotlin.jvm.internal.o.d(r11)
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r11 = (com.tencent.mm.plugin.appbrand.report.quality.QualitySession) r11
            byte r12 = r15.readByte()
            if (r12 <= 0) goto L6b
            r12 = r1
            goto L6c
        L6b:
            r12 = r6
        L6c:
            byte r15 = r15.readByte()
            if (r15 <= 0) goto L74
            r13 = r1
            goto L75
        L74:
            r13 = r6
        L75:
            r1 = r14
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs.<init>(android.os.Parcel):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ModularizingPkgRetrieverContract$SharedIPCCallArgs(com.tencent.mm.plugin.appbrand.AppBrandRuntime r15) {
        /*
            r14 = this;
            java.lang.String r0 = "rt"
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r2 = r15.f74803n
            java.lang.String r0 = "getAppId(...)"
            kotlin.jvm.internal.o.f(r2, r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r15.u0()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU"
            kotlin.jvm.internal.o.e(r0, r1)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r0
            int r3 = r0.L
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r15.f74805p
            int r4 = r0.f77281g
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r15.u0()
            kotlin.jvm.internal.o.e(r0, r1)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r0.N
            java.lang.String r0 = "wxaVersionInfo"
            kotlin.jvm.internal.o.f(r5, r0)
            boolean r6 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(r15)
            k91.z0 r0 = r15.E0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f305852r
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r0 = r0.f75404i
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L4e
            android.util.ArrayMap r0 = r0.f75406d
            int r0 = r0.size()
            if (r0 > 0) goto L48
            r0 = r1
            goto L49
        L48:
            r0 = r7
        L49:
            r0 = r0 ^ r1
            if (r0 != r1) goto L4e
            r0 = r1
            goto L4f
        L4e:
            r0 = r7
        L4f:
            r8 = r15
            com.tencent.mm.plugin.appbrand.o6 r8 = (com.tencent.mm.plugin.appbrand.o6) r8
            boolean r9 = r8.s2()
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r10 = r8.S2(r7)
            kotlin.jvm.internal.o.d(r10)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            com.tencent.mm.plugin.appbrand.appcache.a4 r15 = com.tencent.mm.plugin.appbrand.appcache.la.o(r15, r7)
            boolean r12 = r15 instanceof com.tencent.mm.plugin.appbrand.appcache.la
            r13 = 0
            if (r12 == 0) goto L6e
            com.tencent.mm.plugin.appbrand.appcache.la r15 = (com.tencent.mm.plugin.appbrand.appcache.la) r15
            goto L6f
        L6e:
            r15 = r13
        L6f:
            if (r15 == 0) goto L74
            com.tencent.mm.plugin.appbrand.appcache.y3 r15 = r15.f75655a
            goto L75
        L74:
            r15 = r13
        L75:
            boolean r12 = r15 instanceof com.tencent.mm.plugin.appbrand.appcache.ac
            if (r12 == 0) goto L7c
            com.tencent.mm.plugin.appbrand.appcache.ac r15 = (com.tencent.mm.plugin.appbrand.appcache.ac) r15
            goto L7d
        L7c:
            r15 = r13
        L7d:
            if (r15 == 0) goto La7
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r15 = r15.f75444c
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r15 = r15.f75404i
            if (r15 == 0) goto L89
            java.util.List r13 = r15.c()
        L89:
            if (r13 == 0) goto La7
            java.util.Iterator r15 = r13.iterator()
        L8f:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto La7
            java.lang.Object r12 = r15.next()
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r12 = (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) r12
            java.lang.String r13 = r12.provider
            int r12 = r12.version
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.put(r13, r12)
            goto L8f
        La7:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r15 = r8.u0()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r15 = r15.f77298k2
            kotlin.jvm.internal.o.d(r15)
            boolean r12 = r8.a2()
            bm5.i1 r8 = r8.f471744d2
            java.lang.Object r8 = r8.b()
            com.tencent.mm.plugin.appbrand.rd r8 = (com.tencent.mm.plugin.appbrand.rd) r8
            boolean r13 = r8.f87765b
            if (r13 == 0) goto Lc6
            boolean r8 = r8.f87766c
            if (r8 != 0) goto Lc6
            r13 = r1
            goto Lc7
        Lc6:
            r13 = r7
        Lc7:
            r1 = r14
            r7 = r0
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs.<init>(com.tencent.mm.plugin.appbrand.AppBrandRuntime):void");
    }
}
