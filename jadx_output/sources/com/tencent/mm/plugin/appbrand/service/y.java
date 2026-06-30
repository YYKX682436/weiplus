package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j f88838a;

    public y(com.tencent.mm.plugin.appbrand.service.j jVar, com.tencent.mm.plugin.appbrand.service.k kVar) {
        this.f88838a = jVar;
    }

    @android.webkit.JavascriptInterface
    public int exec(int i17) {
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88838a;
        try {
            java.lang.Object obj = vb1.d.f434473c.a(((com.tencent.mm.plugin.appbrand.service.c0) jVar.F()).getAppId()).f434476b.get(java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.d(obj);
            return ((vb1.c) obj).f434471a.getVirtualElementId();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", e17, "MagicBrushViewIdTransfer failed. [%d] [%s]", java.lang.Integer.valueOf(i17), ((com.tencent.mm.plugin.appbrand.service.c0) jVar.F()).getAppId());
            return -1;
        }
    }
}
