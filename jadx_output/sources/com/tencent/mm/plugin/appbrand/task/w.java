package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf.d f89204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.y f89205e;

    public w(com.tencent.mm.plugin.appbrand.task.y yVar, cf.d dVar) {
        this.f89205e = yVar;
        this.f89204d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.appbrand.task.y yVar = this.f89205e;
            com.tencent.mm.plugin.appbrand.task.r.i(yVar.f89216d, yVar.f89217e, yVar.f89218f);
        } catch (java.lang.Exception e17) {
            boolean equals = "1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_appbrand_preload_service_catch, "1", true));
            if (!com.tencent.mm.plugin.appbrand.ui.e4.g() && !equals) {
                throw e17;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.task.v(this, e17));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preLoadServices error:" + e17);
            }
        }
        this.f89204d.a();
    }
}
