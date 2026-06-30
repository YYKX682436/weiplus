package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84608a;

    public f4(com.tencent.mm.plugin.appbrand.launching.q4 q4Var) {
        this.f84608a = q4Var;
    }

    public static final void a(com.tencent.mm.plugin.appbrand.launching.f4 f4Var, com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress) {
        com.tencent.mm.plugin.appbrand.launching.q4 q4Var = f4Var.f84608a;
        ((com.tencent.mm.plugin.appbrand.launching.k4) q4Var.f85066i).invoke(wxaPkgLoadProgress);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress2 = q4Var.f85074q;
        if (wxaPkgLoadProgress2 == null && wxaPkgLoadProgress.f75395e > 0) {
            q4Var.f85074q = wxaPkgLoadProgress;
            q4Var.f85075r = currentTimeMillis;
            return;
        }
        if (q4Var.f85073p && wxaPkgLoadProgress2 != null) {
            long j17 = wxaPkgLoadProgress.f75395e - wxaPkgLoadProgress2.f75395e;
            if (currentTimeMillis - q4Var.f85075r <= 0) {
                return;
            }
            q4Var.f85076s = a06.d.c((((float) j17) / ((float) r0)) * 1000);
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                a06.d.b((((float) q4Var.f85076s) / 1024.0f) / 1024.0f);
            }
        }
    }

    public static final void b(com.tencent.mm.plugin.appbrand.launching.f4 f4Var, m81.c cVar, com.tencent.mm.plugin.appbrand.appcache.wa waVar, r45.me3 me3Var) {
        com.tencent.mm.plugin.appbrand.launching.a6 a6Var;
        m81.c cVar2 = m81.c.OK;
        com.tencent.mm.plugin.appbrand.launching.q4 q4Var = f4Var.f84608a;
        if (cVar2 != cVar) {
            yz5.p pVar = q4Var.f85065h;
            com.tencent.mm.plugin.appbrand.launching.a6[] values = com.tencent.mm.plugin.appbrand.launching.a6.values();
            int length = values.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    a6Var = com.tencent.mm.plugin.appbrand.launching.a6.f84487e;
                    break;
                }
                a6Var = values[i17];
                if (a6Var.f84497d == cVar.f324701d) {
                    break;
                } else {
                    i17++;
                }
            }
            ((com.tencent.mm.plugin.appbrand.launching.j4) pVar).invoke(a6Var, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "onPkgUpdateResult, request:" + q4Var.f85059b + ", resp{is_patch:" + me3Var.f380403i + ", is_zstd:" + me3Var.f380404m + '}');
        yz5.l lVar = q4Var.f85064g;
        com.tencent.mm.plugin.appbrand.launching.i4 i4Var = com.tencent.mm.plugin.appbrand.launching.i4.f84656a;
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = q4Var.f85059b;
        kotlin.jvm.internal.o.d(waVar);
        java.lang.String filePath = waVar.f76033a;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        ((com.tencent.mm.plugin.appbrand.launching.l4) lVar).invoke(i4Var.a(o6Var, filePath, me3Var.f380400f, me3Var.f380402h, com.tencent.mm.plugin.appbrand.launching.r6.f85104a));
    }
}
