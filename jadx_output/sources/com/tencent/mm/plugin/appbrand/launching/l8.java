package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class l8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f84759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f84762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.tencent.mm.plugin.appbrand.launching.r8 r8Var, java.util.List list, java.util.Map map, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        super(0);
        this.f84757d = r8Var;
        this.f84758e = list;
        this.f84759f = map;
        this.f84760g = wxaPkgWrappingInfo;
        this.f84761h = atomicReference;
        this.f84762i = countDownLatch;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.f fVar;
        r45.nb5 nb5Var;
        com.tencent.mm.plugin.appbrand.launching.r8 r8Var = this.f84757d;
        java.lang.String instanceId = r8Var.f85112m.f88134d;
        kotlin.jvm.internal.o.f(instanceId, "instanceId");
        af.c b17 = af.d.f4444a.b(instanceId, false);
        if (b17 != null) {
            af.b bVar = (af.b) b17.f4442a.get(1);
            if (bVar == null) {
                bVar = null;
            }
            if (bVar != null && (fVar = (com.tencent.mm.modelbase.f) bVar.a(100)) != null && (nb5Var = (r45.nb5) fVar.f70618d) != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.LinkedList<r45.s35> package_info_list = nb5Var.f381231f;
                kotlin.jvm.internal.o.f(package_info_list, "package_info_list");
                for (r45.s35 s35Var : package_info_list) {
                    if (!s35Var.f385472m) {
                        com.tencent.mm.plugin.appbrand.launching.z6 z6Var = new com.tencent.mm.plugin.appbrand.launching.z6();
                        java.lang.String appid = s35Var.f385466d;
                        kotlin.jvm.internal.o.f(appid, "appid");
                        z6Var.f85461d = appid;
                        z6Var.f85462e = s35Var.f385467e;
                        z6Var.f85463f = s35Var.f385468f;
                        z6Var.f85464g = 0;
                        z6Var.f85465h = s35Var.f385469g;
                        z6Var.f85467m = s35Var.f385474o;
                        r45.me3[] me3VarArr = (r45.me3[]) hashMap.get(z6Var);
                        if (me3VarArr == null) {
                            me3VarArr = new r45.me3[3];
                            hashMap.put(z6Var, me3VarArr);
                        }
                        r45.me3 me3Var = new r45.me3();
                        me3Var.f380399e = s35Var.f385470h;
                        me3Var.f380400f = s35Var.f385471i;
                        r45.jr5 jr5Var = new r45.jr5();
                        me3Var.f380405n = jr5Var;
                        jr5Var.f378070d = s35Var.f385466d;
                        jr5Var.f378072f = s35Var.f385467e;
                        jr5Var.f378073g = s35Var.f385468f;
                        jr5Var.f378074h = 0;
                        if (s35Var.f385473n) {
                            me3Var.f380403i = false;
                            me3Var.f380404m = true;
                            me3VarArr[1] = me3Var;
                        } else {
                            me3Var.f380403i = false;
                            me3Var.f380404m = false;
                            me3VarArr[0] = me3Var;
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    com.tencent.mm.plugin.appbrand.launching.x5 x5Var = com.tencent.mm.plugin.appbrand.launching.x5.f85410a;
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "addPreGetDownloadUrlResult " + entry.getKey() + " -> " + ((java.lang.Object[]) entry.getValue()).length);
                    }
                    com.tencent.mm.plugin.appbrand.launching.x5.f85411b.putAll(hashMap);
                    b17.f4443b.add(new com.tencent.mm.plugin.appbrand.launching.r7(hashMap));
                }
            }
        }
        com.tencent.mm.plugin.appbrand.launching.u3 u3Var = com.tencent.mm.plugin.appbrand.launching.u3.f85212a;
        java.lang.String str = r8Var.f85106d;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = r8Var.f85111i;
        int i17 = r8Var.f85107e;
        java.util.List list = this.f84758e;
        java.util.Map map = this.f84759f;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = r8Var.f85112m;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f84760g;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f84761h;
        java.util.concurrent.CountDownLatch countDownLatch = this.f84762i;
        com.tencent.mm.plugin.appbrand.launching.h8 h8Var = new com.tencent.mm.plugin.appbrand.launching.h8(r8Var, wxaPkgWrappingInfo, atomicReference, countDownLatch);
        com.tencent.mm.plugin.appbrand.launching.i8 i8Var = new com.tencent.mm.plugin.appbrand.launching.i8(r8Var);
        com.tencent.mm.plugin.appbrand.launching.j8 j8Var = new com.tencent.mm.plugin.appbrand.launching.j8(r8Var, countDownLatch);
        boolean z17 = r8Var.f85115p || !com.tencent.mm.plugin.appbrand.launching.r5.f85103b.a(k91.l3.a(r8Var.f85108f));
        r45.y50 y50Var = r8Var.f85113n;
        boolean z18 = y50Var.f390798e;
        com.tencent.mm.plugin.appbrand.launching.k8 k8Var = new com.tencent.mm.plugin.appbrand.launching.k8(r8Var);
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession reportQualitySession = r8Var.f85112m;
        kotlin.jvm.internal.o.g(reportQualitySession, "reportQualitySession");
        r45.y50 y50Var2 = new r45.y50();
        y50Var2.f390797d = reportQualitySession.f88138h;
        y50Var2.f390798e = z18;
        y50Var2.f390799f = 1;
        com.tencent.mm.plugin.appbrand.launching.u3.b(u3Var, str, wxaAttributes$WxaVersionInfo, i17, list, map, qualitySession, h8Var, i8Var, j8Var, z17, y50Var, reportQualitySession.f88137g == 1004 ? new com.tencent.mm.plugin.appbrand.launching.y7(true, reportQualitySession, y50Var2, k8Var) : new com.tencent.mm.plugin.appbrand.launching.d8(reportQualitySession, y50Var2, k8Var), null, null, null, 28672, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parallel: [");
        java.lang.String str2 = r8Var.f85106d;
        sb6.append(str2);
        sb6.append("]: start...");
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", sb6.toString());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_parallel_download_subpackage, 0) != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "parallel: [" + str2 + "]: x config, fast return");
        } else {
            pm0.v.M("parallelDownload[" + str2 + '|' + r8Var.f85107e + ']', false, new com.tencent.mm.plugin.appbrand.launching.q8(str2, r8Var.f85111i, r8Var, this.f84759f), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
