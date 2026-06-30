package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.y f87565e;

    public x(com.tencent.mm.plugin.appbrand.pip.y yVar, boolean z17) {
        this.f87565e = yVar;
        this.f87564d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.pip.c cVar;
        com.tencent.mm.plugin.appbrand.pip.y yVar = this.f87565e;
        if (yVar.f87567a.m(false)) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = yVar.f87567a;
            com.tencent.mm.plugin.appbrand.pip.k kVar = o0Var.C;
            if (kVar != null && (cVar = o0Var.f87533p) != null) {
                ((com.tencent.mm.plugin.appbrand.pip.p0) kVar).b(cVar.f87437i, this.f87564d ? com.tencent.mm.plugin.appbrand.pip.n.OTHER_VIDEO_AUTO_PLAY : com.tencent.mm.plugin.appbrand.pip.n.OTHER_VIDEO_PLAY);
            }
            yVar.f87567a.a("processTransferFromOnPlay");
            com.tencent.mars.xlog.Log.i(yVar.f87567a.f87518a, "processTransferFromOnPlay, clearPipVideoRelated");
            yVar.f87567a.e(true, true);
        }
    }
}
