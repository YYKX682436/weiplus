package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.r f87547d;

    public q(com.tencent.mm.plugin.appbrand.pip.r rVar) {
        this.f87547d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.pip.c cVar;
        com.tencent.mm.plugin.appbrand.pip.r rVar = this.f87547d;
        if (rVar.f87549b.m(false)) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = rVar.f87549b;
            com.tencent.mm.plugin.appbrand.pip.k kVar = o0Var.C;
            if (kVar != null && (cVar = o0Var.f87533p) != null) {
                ((com.tencent.mm.plugin.appbrand.pip.p0) kVar).b(cVar.f87437i, com.tencent.mm.plugin.appbrand.pip.n.OTHER_VIDEO_PLAY);
            }
            rVar.f87549b.a("onPageSwitchEnd 1");
            com.tencent.mars.xlog.Log.i(rVar.f87549b.f87518a, "onPageSwitchEnd, clearPipVideoRelated");
            rVar.f87549b.e(true, true);
        }
    }
}
