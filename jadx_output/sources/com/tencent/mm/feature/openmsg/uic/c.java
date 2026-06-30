package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.d f67324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.feature.openmsg.uic.d dVar) {
        super(1);
        this.f67324d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.c)) {
            com.tencent.mm.storage.f9 f9Var = ((eb0.c) dVar).f250705b;
            com.tencent.mm.feature.openmsg.uic.d dVar2 = this.f67324d;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgPreProcessUIC", "msgInfo is null, return");
                dVar2.T6(null, null, null);
            } else {
                com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
                com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = db0.g.f227828a.b(f9Var);
                if (b17 == null) {
                    dVar2.T6(null, f9Var, null);
                } else {
                    com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Ri = k5Var != null ? ((zh1.p) k5Var).Ri(b17) : null;
                    dVar2.T6(Ri, f9Var, b17);
                    if (Ri != null && java.lang.System.currentTimeMillis() - Ri.f86253h > ((java.lang.Number) ((jz5.n) db0.d.f227823a).getValue()).longValue()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgPreProcessUIC", "time:" + (java.lang.System.currentTimeMillis() - Ri.f86253h) + " fetchOpenMaterialsByCgi");
                        ((zh1.p) k5Var).getClass();
                        ai1.p.f5102b.b(b17, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
