package com.tencent.mm.plugin.appbrand.pip;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/c1;", "Lcom/tencent/mm/plugin/appbrand/pip/f1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/pip/PipStablePos;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class c1 extends com.tencent.mm.plugin.appbrand.pip.f1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.pip.PipStablePos pipStablePos = (com.tencent.mm.plugin.appbrand.pip.PipStablePos) obj;
        if (pipStablePos == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "SetStablePosTask#invoke, data is null");
            return;
        }
        pipStablePos.toString();
        com.tencent.mm.plugin.appbrand.pip.d1 d1Var = (com.tencent.mm.plugin.appbrand.pip.d1) ((com.tencent.mm.plugin.appbrand.pip.b1) ((jz5.n) this.f87459d).getValue());
        d1Var.getClass();
        java.lang.String appId = pipStablePos.f87422d;
        kotlin.jvm.internal.o.g(appId, "appId");
        android.graphics.Point point = pipStablePos.f87423e;
        kotlin.jvm.internal.o.g(point, "point");
        k91.v vVar = d1Var.f87449a;
        if (vVar != null) {
            java.lang.String concat = appId.concat("#PipStablePos");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(point.x);
            sb6.append(',');
            sb6.append(point.y);
            vVar.P2(concat, sb6.toString());
        }
        if (rVar != null) {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        }
    }
}
