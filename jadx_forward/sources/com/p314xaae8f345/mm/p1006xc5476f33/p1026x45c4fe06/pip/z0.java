package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/z0;", "Lcom/tencent/mm/plugin/appbrand/pip/f1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/graphics/Point;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.f1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d == null || rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "GetStablePosTask#invoke, data: " + c10756x2a5d7b2d + ", callback: " + rVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.b1) ((jz5.n) this.f168992d).mo141623x754a37bb();
        java.lang.String value = c10756x2a5d7b2d.f149939d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d1) b1Var;
        d1Var.getClass();
        android.graphics.Point point = null;
        k91.v vVar = d1Var.f168982a;
        java.lang.String z07 = vVar != null ? vVar.z0(value.concat("#PipStablePos"), null) : null;
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "PipStablePosStorage#get, pointStr is null");
        } else {
            java.util.List f07 = r26.n0.f0(z07, new java.lang.String[]{","}, false, 0, 6, null);
            if (2 != f07.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "PipStablePosStorage#unmarshalPoint, size is not 2");
            } else {
                java.lang.Integer h17 = r26.h0.h((java.lang.String) f07.get(0));
                java.lang.Integer h18 = r26.h0.h((java.lang.String) f07.get(1));
                if (h17 == null || h18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "PipStablePosStorage#unmarshalPoint, x: " + h17 + ", y: " + h18);
                } else {
                    point = new android.graphics.Point(h17.intValue(), h18.intValue());
                }
            }
        }
        java.util.Objects.toString(point);
        rVar.a(point);
    }
}
