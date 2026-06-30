package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf.d f89192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.y f89193e;

    public t(com.tencent.mm.plugin.appbrand.task.y yVar, cf.d dVar) {
        this.f89193e = yVar;
        this.f89192d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.m(-8);
        com.tencent.mm.plugin.appbrand.task.y yVar = this.f89193e;
        com.tencent.mm.plugin.appbrand.task.x0 x0Var = yVar.f89216d;
        com.tencent.mm.plugin.appbrand.task.b0 b0Var = com.tencent.mm.plugin.appbrand.task.r.f89160a;
        if (!com.tencent.xweb.WebView.y0()) {
            if (com.tencent.mm.sdk.platformtools.x2.j() && !com.tencent.mm.plugin.appbrand.l.f()) {
                com.tencent.xweb.a3.z(true);
                ((th0.a0) ((sh0.e) i95.n0.c(sh0.e.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView tried but kernel incompatible");
        } else {
            java.util.Queue queue = (java.util.Queue) com.tencent.mm.plugin.appbrand.task.r.f89162c.get(x0Var);
            java.util.Objects.requireNonNull(queue);
            if (!queue.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView skipped cause already cached");
            } else if (x0Var == com.tencent.mm.plugin.appbrand.task.x0.WAGAME) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView skipped in request[%s]", x0Var);
            } else {
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = new com.tencent.mm.plugin.appbrand.page.n7();
                n7Var.L0(com.tencent.mm.plugin.appbrand.appcache.e8.b());
                n7Var.A3(com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated);
                n7Var.i4(yVar.f89217e);
                queue.add(n7Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView done");
            }
        }
        this.f89192d.a();
    }
}
