package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class y7 extends com.tencent.mm.plugin.appbrand.launching.q7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f85432a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f85433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f85434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f85435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f85436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f85437f;

    public y7(boolean z17, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, r45.y50 y50Var, yz5.l lVar) {
        this.f85434c = z17;
        this.f85435d = qualitySession;
        this.f85436e = y50Var;
        this.f85437f = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void a(com.tencent.mm.plugin.appbrand.launching.o6 request, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        this.f85437f.invoke(request);
        int[] iArr = qq5.a.f365997d;
        int i18 = request.f84853f;
        if (!kz5.z.F(iArr, i18)) {
            if (kz5.z.F(qq5.a.f365995b, i18)) {
                i();
                j(i18);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.w6 w6Var = request.f84855h;
        boolean z17 = w6Var instanceof com.tencent.mm.plugin.appbrand.launching.v6;
        java.lang.String str2 = request.f84851d;
        if (!z17) {
            i();
            h(2, str2, 0);
            j(i18);
            return;
        }
        int a17 = w6Var.a();
        int[] A = com.tencent.mm.plugin.appbrand.app.r9.Di().A(request.h().toString(), 0);
        if (A == null) {
            i();
            h(2, str2, a17);
            j(i18);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = A.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                break;
            }
            int i27 = A[i19];
            if (!(i27 == w6Var.a())) {
                arrayList.add(java.lang.Integer.valueOf(i27));
            }
            i19++;
        }
        if (!arrayList.isEmpty()) {
            i();
            h(4, str2, a17);
            j(i18);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k3
    public void b() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "onAllPkgDownloaded isLaunch:%b", java.lang.Boolean.valueOf(this.f85434c));
        if (!this.f85433b || !this.f85434c || (copyOnWriteArrayList = this.f85432a) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "mStageList size:%d", java.lang.Integer.valueOf(this.f85432a.size()));
        java.util.Iterator it = this.f85432a.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.launching.t7 t7Var = (com.tencent.mm.plugin.appbrand.launching.t7) it.next();
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct();
            f(weAppQualitySplitCodeLibStatisStruct, this.f85435d);
            weAppQualitySplitCodeLibStatisStruct.f62720k = weAppQualitySplitCodeLibStatisStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
            weAppQualitySplitCodeLibStatisStruct.f62717h = weAppQualitySplitCodeLibStatisStruct.b("Provider", t7Var.f85161b, true);
            weAppQualitySplitCodeLibStatisStruct.f62718i = t7Var.f85162c;
            weAppQualitySplitCodeLibStatisStruct.f62719j = t7Var.f85160a;
            weAppQualitySplitCodeLibStatisStruct.k();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k3
    public void c(com.tencent.mm.plugin.appbrand.launching.o6 request) {
        kotlin.jvm.internal.o.g(request, "request");
        int i17 = request.f84853f;
        if (i17 == 0) {
            k(12);
            return;
        }
        if (i17 == 4) {
            k(14);
            return;
        }
        if (i17 == 6) {
            k(1);
            return;
        }
        if (i17 == 12) {
            k(3);
            return;
        }
        if (i17 == 13) {
            k(5);
        } else if (i17 == 22) {
            k(8);
        } else {
            if (i17 != 23) {
                return;
            }
            k(10);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void d(com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.appbrand.launching.w6 w6Var = request.f84855h;
        boolean z17 = w6Var instanceof com.tencent.mm.plugin.appbrand.launching.u6;
        int[] iArr = qq5.a.f365997d;
        java.lang.String str = request.f84851d;
        int i17 = request.f84853f;
        if (z17 && !((com.tencent.mm.plugin.appbrand.launching.u6) w6Var).f85224b && kz5.z.F(iArr, i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "onPkgCached, will update plugin(" + str + ") to latest in background...");
            pm0.v.K(null, new com.tencent.mm.plugin.appbrand.launching.w7(request, this.f85436e, this.f85435d, this, response));
        }
        if (kz5.z.F(iArr, i17)) {
            h(3, str, response.f84892a.pkgVersion());
            pq5.h.a().i(new com.tencent.mm.plugin.appbrand.launching.x7(request, response)).B();
        }
        g(this.f85435d, request, response);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void e(com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        if (kz5.z.F(qq5.a.f365997d, request.f84853f)) {
            com.tencent.mm.plugin.appbrand.appcache.k6.b(request.f84851d, response.f84892a.pkgVersion());
        }
    }

    public final void h(int i17, java.lang.String str, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "addPluginStage stage:%d,provider:%s,version:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.launching.t7 t7Var = new com.tencent.mm.plugin.appbrand.launching.t7(this);
        kotlin.jvm.internal.o.g(str, "<set-?>");
        t7Var.f85161b = str;
        t7Var.f85160a = i17;
        t7Var.f85162c = i18;
        this.f85432a.add(t7Var);
    }

    public final void i() {
        if (this.f85433b) {
            return;
        }
        this.f85433b = true;
        h(1, "", 0);
    }

    public final void j(int i17) {
        if (i17 == 0) {
            k(11);
            return;
        }
        if (i17 == 4) {
            k(13);
            return;
        }
        if (i17 == 6) {
            k(0);
            return;
        }
        if (i17 == 12) {
            k(2);
            return;
        }
        if (i17 == 13) {
            k(4);
        } else if (i17 == 22) {
            k(7);
        } else {
            if (i17 != 23) {
                return;
            }
            k(9);
        }
    }

    public final void k(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1027L, i17, 1L, false);
    }
}
