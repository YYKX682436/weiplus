package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.b f67322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.feature.openmsg.uic.b bVar) {
        super(1);
        this.f67322d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.d)) {
            java.util.ArrayList arrayList = ((eb0.d) dVar).f250706b;
            com.tencent.mm.feature.openmsg.uic.b bVar = this.f67322d;
            if (arrayList == null || arrayList.size() <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgAppBrandMultiSelectPreProcessUIC", "msgInfo is null, return");
                bVar.T6(null, null);
            } else {
                com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = db0.g.f227828a.b((com.tencent.mm.storage.f9) it.next());
                    if (b17 != null) {
                        arrayList2.add(b17);
                    } else {
                        arrayList2.add(new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel("unsupported", "", ""));
                    }
                }
                com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Di = k5Var != null ? ((zh1.p) k5Var).Di(arrayList2) : null;
                bVar.T6(Di, arrayList);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                kotlin.jvm.internal.o.d(Di);
                if (currentTimeMillis - Di.f86253h > ((java.lang.Number) ((jz5.n) db0.d.f227825c).getValue()).longValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgAppBrandMultiSelectPreProcessUIC", "time:" + (java.lang.System.currentTimeMillis() - Di.f86253h) + " fetchMultiSelectOpenMaterialsByCgi");
                    ((zh1.p) k5Var).Bi(arrayList2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
