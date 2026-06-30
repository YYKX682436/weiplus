package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$SharedIPCCallArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs */
/* loaded from: classes7.dex */
public abstract class AbstractC12349x5d9cbdf1 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f165987e;

    /* renamed from: f, reason: collision with root package name */
    public final int f165988f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 f165989g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f165990h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f165991i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f165992m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f165993n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f165994o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f165995p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f165996q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f165997r;

    public AbstractC12349x5d9cbdf1(java.lang.String appId, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 wxaVersionInfo, boolean z17, boolean z18, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 acceptedLibReader, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 reportQualitySession, boolean z27, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaVersionInfo, "wxaVersionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(acceptedLibReader, "acceptedLibReader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportQualitySession, "reportQualitySession");
        this.f165986d = appId;
        this.f165987e = i17;
        this.f165988f = i18;
        this.f165989g = wxaVersionInfo;
        this.f165990h = z17;
        this.f165991i = z18;
        this.f165992m = z19;
        this.f165993n = acceptedLibReader;
        this.f165994o = map;
        this.f165995p = reportQualitySession;
        this.f165996q = z27;
        this.f165997r = z28;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f165986d);
        dest.writeInt(this.f165987e);
        dest.writeInt(this.f165988f);
        dest.writeParcelable(this.f165989g, 0);
        dest.writeByte(this.f165990h ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f165991i ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f165992m ? (byte) 1 : (byte) 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s1.b(this.f165993n, dest, i17);
        dest.writeMap(this.f165994o);
        dest.writeParcelable(this.f165995p, 0);
        dest.writeByte(this.f165996q ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f165997r ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC12349x5d9cbdf1(android.os.Parcel r15) {
        /*
            r14 = this;
            java.lang.String r0 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.String r2 = r15.readString()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            int r3 = r15.readInt()
            int r4 = r15.readInt()
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r15.readParcelable(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            r5 = r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553) r5
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
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s1.a(r15)
            java.lang.String r10 = "readFromParcel(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r10)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r11 = 0
            r15.readMap(r10, r11)
            java.lang.Class<com.tencent.mm.plugin.appbrand.report.quality.QualitySession> r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7.class
            java.lang.ClassLoader r11 = r11.getClassLoader()
            android.os.Parcelable r11 = r15.readParcelable(r11)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r11)
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7) r11
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12349x5d9cbdf1.<init>(android.os.Parcel):void");
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
    public AbstractC12349x5d9cbdf1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "rt"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.String r2 = r15.f156336n
            java.lang.String r0 = "getAppId(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r15.u0()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) r0
            int r3 = r0.L
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r15.f156338p
            int r4 = r0.f158814g
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r15.u0()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r0.N
            java.lang.String r0 = "wxaVersionInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.m48815xb9a3283c(r15)
            k91.z0 r0 = r15.E0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f387385r
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r0 = r0.f156937i
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L4e
            android.util.ArrayMap r0 = r0.f156939d
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
            com.tencent.mm.plugin.appbrand.o6 r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) r8
            boolean r9 = r8.s2()
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r10 = r8.S2(r7)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            com.tencent.mm.plugin.appbrand.appcache.a4 r15 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(r15, r7)
            boolean r12 = r15 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la
            r13 = 0
            if (r12 == 0) goto L6e
            com.tencent.mm.plugin.appbrand.appcache.la r15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la) r15
            goto L6f
        L6e:
            r15 = r13
        L6f:
            if (r15 == 0) goto L74
            com.tencent.mm.plugin.appbrand.appcache.y3 r15 = r15.f157188a
            goto L75
        L74:
            r15 = r13
        L75:
            boolean r12 = r15 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac
            if (r12 == 0) goto L7c
            com.tencent.mm.plugin.appbrand.appcache.ac r15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) r15
            goto L7d
        L7c:
            r15 = r13
        L7d:
            if (r15 == 0) goto La7
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r15 = r15.f156977c
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r15 = r15.f156937i
            if (r15 == 0) goto L89
            java.util.List r13 = r15.c()
        L89:
            if (r13 == 0) goto La7
            java.util.Iterator r15 = r13.iterator()
        L8f:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto La7
            java.lang.Object r12 = r15.next()
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) r12
            java.lang.String r13 = r12.f33473xc52405f1
            int r12 = r12.f33475x14f51cd8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.put(r13, r12)
            goto L8f
        La7:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r15 = r8.u0()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r15 = r15.f158831k2
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r15)
            boolean r12 = r8.a2()
            bm5.i1 r8 = r8.f553277d2
            java.lang.Object r8 = r8.b()
            com.tencent.mm.plugin.appbrand.rd r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.rd) r8
            boolean r13 = r8.f169298b
            if (r13 == 0) goto Lc6
            boolean r8 = r8.f169299c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12349x5d9cbdf1.<init>(com.tencent.mm.plugin.appbrand.AppBrandRuntime):void");
    }
}
