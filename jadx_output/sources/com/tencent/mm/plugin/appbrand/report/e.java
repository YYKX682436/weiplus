package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public class e implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd.c f87831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.f f87832e;

    public e(com.tencent.mm.plugin.appbrand.report.f fVar, vd.c cVar) {
        this.f87832e = fVar;
        this.f87831d = cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.appbrand.networking.p pVar = (com.tencent.mm.plugin.appbrand.networking.p) obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameExtraConfigMgr", "hy: on get wxa game config resp: success?:%s, exception?:%s", bool, pVar);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.appbrand.report.f fVar = this.f87832e;
        if (booleanValue) {
            r45.xs3 xs3Var = this.f87831d.f435362b;
            if (xs3Var == null) {
                kotlin.jvm.internal.o.o("response");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.report.i iVar = fVar.f87841f;
            iVar.f87863c = xs3Var.f390374d;
            iVar.f87864d = xs3Var.f390375e;
            iVar.f87865e = xs3Var.f390376f;
            iVar.f87866f = xs3Var.f390377g;
            iVar.f87867g = xs3Var.f390378h;
            iVar.f87869i = xs3Var.f390379i;
        }
        com.tencent.mm.plugin.appbrand.report.h hVar = fVar.f87840e;
        if (hVar != null) {
            ((fa1.f) hVar).a(bool.booleanValue(), pVar);
        }
        return jz5.f0.f302826a;
    }
}
