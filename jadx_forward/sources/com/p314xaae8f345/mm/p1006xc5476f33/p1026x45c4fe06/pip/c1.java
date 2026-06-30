package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/c1;", "Lcom/tencent/mm/plugin/appbrand/pip/f1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/pip/PipStablePos;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.f1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62 c12546x36433d62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62) obj;
        if (c12546x36433d62 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "SetStablePosTask#invoke, data is null");
            return;
        }
        c12546x36433d62.m52296x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.b1) ((jz5.n) this.f168992d).mo141623x754a37bb());
        d1Var.getClass();
        java.lang.String appId = c12546x36433d62.f168955d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        android.graphics.Point point = c12546x36433d62.f168956e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "point");
        k91.v vVar = d1Var.f168982a;
        if (vVar != null) {
            java.lang.String concat = appId.concat("#PipStablePos");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(point.x);
            sb6.append(',');
            sb6.append(point.y);
            vVar.P2(concat, sb6.toString());
        }
        if (rVar != null) {
            rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
        }
    }
}
