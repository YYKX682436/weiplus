package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f88230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.model.kv_14609 f88231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.b f88232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.WebPageProfile f88233g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88234h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f88235i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f88236m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f88237n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f88238o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f88239p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var, m81.b bVar, com.tencent.mars.cdn.CdnManager.WebPageProfile webPageProfile, java.lang.String str, long j17, long j18, long j19, long j27, java.util.Map map) {
        super(0);
        this.f88230d = qualitySession;
        this.f88231e = kv_14609Var;
        this.f88232f = bVar;
        this.f88233g = webPageProfile;
        this.f88234h = str;
        this.f88235i = j17;
        this.f88236m = j18;
        this.f88237n = j19;
        this.f88238o = j27;
        this.f88239p = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map map;
        java.lang.String str;
        java.lang.Iterable iterable;
        com.tencent.mm.autogen.mmdata.rpt.WxaPkgDownloadStruct wxaPkgDownloadStruct = new com.tencent.mm.autogen.mmdata.rpt.WxaPkgDownloadStruct();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = this.f88230d;
        com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var = this.f88231e;
        m81.b bVar = this.f88232f;
        com.tencent.mars.cdn.CdnManager.WebPageProfile webPageProfile = this.f88233g;
        java.lang.String str2 = this.f88234h;
        long j17 = this.f88235i;
        long j18 = this.f88236m;
        long j19 = this.f88237n;
        long j27 = this.f88238o;
        java.util.Map map2 = this.f88239p;
        if (qualitySession != null) {
            str = qualitySession.f88134d;
            map = map2;
        } else {
            map = map2;
            str = null;
        }
        wxaPkgDownloadStruct.f63006d = wxaPkgDownloadStruct.b("InstanceId", str, true);
        wxaPkgDownloadStruct.f63008e = wxaPkgDownloadStruct.b("appid", qualitySession != null ? qualitySession.f88135e : null, true);
        wxaPkgDownloadStruct.f63010f = qualitySession != null ? qualitySession.f88139i : 0L;
        wxaPkgDownloadStruct.f63012g = qualitySession != null ? qualitySession.f88136f : 0L;
        wxaPkgDownloadStruct.f63014h = qualitySession != null ? qualitySession.f88137g : 0L;
        wxaPkgDownloadStruct.f63016i = kv_14609Var.f88034o;
        wxaPkgDownloadStruct.f63018j = qualitySession != null ? qualitySession.f88138h : 0L;
        wxaPkgDownloadStruct.f63020k = kv_14609Var.f88041v;
        wxaPkgDownloadStruct.f63022l = kv_14609Var.f88042w;
        wxaPkgDownloadStruct.f63024m = wxaPkgDownloadStruct.b("moduleName", kv_14609Var.f88031i, true);
        wxaPkgDownloadStruct.f63026n = kv_14609Var.f88045z;
        wxaPkgDownloadStruct.f63028o = kv_14609Var.f88032m;
        wxaPkgDownloadStruct.f63030p = kv_14609Var.f88033n;
        int i17 = 0;
        wxaPkgDownloadStruct.f63032q = kv_14609Var.f88039t > 0 ? 1L : 0L;
        wxaPkgDownloadStruct.f63034r = kv_14609Var.f88044y > 0 ? 1L : 0L;
        java.lang.String f17 = bVar instanceof com.tencent.mm.plugin.appbrand.appcache.fc ? ((com.tencent.mm.plugin.appbrand.appcache.fc) bVar).f() : bVar instanceof com.tencent.mm.plugin.appbrand.appcache.p8 ? ((com.tencent.mm.plugin.appbrand.appcache.p8) bVar).g() : bVar.f189714c;
        wxaPkgDownloadStruct.f63035s = (f17 != null && com.tencent.mm.vfs.w6.j(f17)) ? com.tencent.mm.plugin.appbrand.appcache.y8.f(f17) : 0;
        wxaPkgDownloadStruct.f63036t = wxaPkgDownloadStruct.b("downloadUrl", bVar.f189717f, true);
        wxaPkgDownloadStruct.f63038v = wxaPkgDownloadStruct.b("networktype", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
        wxaPkgDownloadStruct.f63039w = webPageProfile.redirectStart;
        wxaPkgDownloadStruct.f63040x = webPageProfile.redirectEnd;
        wxaPkgDownloadStruct.f63041y = webPageProfile.fetchStart;
        wxaPkgDownloadStruct.f63042z = webPageProfile.domainLookUpStart;
        wxaPkgDownloadStruct.A = webPageProfile.domainLookUpEnd;
        wxaPkgDownloadStruct.B = webPageProfile.connectStart;
        wxaPkgDownloadStruct.C = webPageProfile.connectEnd;
        wxaPkgDownloadStruct.D = webPageProfile.SSLconnectionStart;
        wxaPkgDownloadStruct.E = webPageProfile.SSLconnectionEnd;
        wxaPkgDownloadStruct.F = webPageProfile.requestStart;
        wxaPkgDownloadStruct.G = webPageProfile.requestEnd;
        wxaPkgDownloadStruct.H = webPageProfile.responseStart;
        wxaPkgDownloadStruct.I = webPageProfile.responseEnd;
        wxaPkgDownloadStruct.f63002J = wxaPkgDownloadStruct.b("protocol", webPageProfile.protocol, true);
        wxaPkgDownloadStruct.K = webPageProfile.rtt;
        wxaPkgDownloadStruct.L = webPageProfile.statusCode;
        wxaPkgDownloadStruct.M = webPageProfile.networkTypeEstimate;
        wxaPkgDownloadStruct.N = webPageProfile.httpRttEstimate;
        wxaPkgDownloadStruct.O = webPageProfile.transportRttEstimate;
        wxaPkgDownloadStruct.P = webPageProfile.downstreamThroughputKbpsEstimate;
        wxaPkgDownloadStruct.Q = webPageProfile.throughputKbps;
        wxaPkgDownloadStruct.R = wxaPkgDownloadStruct.b("peerIP", webPageProfile.peerIP, true);
        wxaPkgDownloadStruct.S = webPageProfile.port;
        wxaPkgDownloadStruct.T = webPageProfile.socketReused ? 1L : 0L;
        wxaPkgDownloadStruct.U = webPageProfile.sendBytesCount;
        long j28 = webPageProfile.receivedBytedCount;
        wxaPkgDownloadStruct.V = j28;
        wxaPkgDownloadStruct.W = j28;
        wxaPkgDownloadStruct.X = kv_14609Var.E;
        switch (kv_14609Var.f88040u) {
            case 1:
            case 2:
            case 3:
                wxaPkgDownloadStruct.Y = 1;
                break;
            case 4:
            case 5:
                wxaPkgDownloadStruct.Y = 3;
                break;
            case 6:
                wxaPkgDownloadStruct.Y = 4;
                break;
        }
        if (str2 == null) {
            str2 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(bVar instanceof com.tencent.mm.plugin.appbrand.appcache.fc ? ((com.tencent.mm.plugin.appbrand.appcache.fc) bVar).f() : bVar instanceof com.tencent.mm.plugin.appbrand.appcache.p8 ? ((com.tencent.mm.plugin.appbrand.appcache.p8) bVar).g() : bVar.f189714c);
        }
        wxaPkgDownloadStruct.Z = wxaPkgDownloadStruct.b("finalPkgMd5", str2, true);
        wxaPkgDownloadStruct.f63003a0 = kv_14609Var.F;
        r45.y50 y50Var = bVar.f324691o;
        if (y50Var != null) {
            wxaPkgDownloadStruct.f63004b0 = y50Var.f390799f;
            wxaPkgDownloadStruct.f63005c0 = y50Var.f390798e ? 1L : 0L;
            wxaPkgDownloadStruct.f63007d0 = y50Var.f390800g;
        }
        wxaPkgDownloadStruct.f63009e0 = kv_14609Var.f88025J;
        wxaPkgDownloadStruct.f63011f0 = j17;
        wxaPkgDownloadStruct.f63013g0 = j18;
        wxaPkgDownloadStruct.f63015h0 = j19;
        wxaPkgDownloadStruct.f63017i0 = j27;
        wxaPkgDownloadStruct.f63019j0 = kv_14609Var.K;
        if (map != null) {
            java.lang.String[] strArr = {"X-Cache-LookUp", "x-cache-lookup"};
            while (true) {
                if (i17 < 2) {
                    java.util.Map map3 = map;
                    iterable = (java.util.List) map3.get(strArr[i17]);
                    if (iterable == null) {
                        i17++;
                        map = map3;
                    }
                } else {
                    iterable = kz5.p0.f313996d;
                }
            }
            wxaPkgDownloadStruct.f63021k0 = wxaPkgDownloadStruct.b("xCacheLoopUp", kz5.n0.g0(iterable, ";", null, null, 0, null, null, 62, null), true);
        }
        wxaPkgDownloadStruct.f63023l0 = java.lang.Math.max(0L, wxaPkgDownloadStruct.A - wxaPkgDownloadStruct.f63042z);
        wxaPkgDownloadStruct.f63025m0 = java.lang.Math.max(0L, wxaPkgDownloadStruct.C - wxaPkgDownloadStruct.B);
        wxaPkgDownloadStruct.f63027n0 = java.lang.Math.max(0L, wxaPkgDownloadStruct.E - wxaPkgDownloadStruct.D);
        wxaPkgDownloadStruct.f63029o0 = java.lang.Math.max(0L, wxaPkgDownloadStruct.G - wxaPkgDownloadStruct.F);
        wxaPkgDownloadStruct.f63031p0 = java.lang.Math.max(0L, wxaPkgDownloadStruct.I - wxaPkgDownloadStruct.H);
        wxaPkgDownloadStruct.f63033q0 = kv_14609Var.L ? 1L : 0L;
        wxaPkgDownloadStruct.k();
        return jz5.f0.f302826a;
    }
}
