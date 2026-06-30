package ys1;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ys1.a f546670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.o83 f546671b;

    public d(ys1.a aVar, r45.o83 o83Var) {
        this.f546670a = aVar;
        this.f546671b = o83Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.o83 req = this.f546671b;
        ys1.a aVar = this.f546670a;
        if (aVar != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            r45.q83 q83Var = fVar instanceof r45.q83 ? (r45.q83) fVar : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.r2 r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.r2) aVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
            if (i17 != 0 && i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcher", "sendGetA8KeyLiteRequest:" + i17 + ", " + i18 + ", " + str);
            } else if (q83Var != null) {
                long j17 = r2Var.f175957a;
                java.util.HashMap hashMap = r2Var.f175958b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "GetA8KeyLiteResponse: " + q83Var.f465294h.size());
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
                java.util.LinkedList<r45.k83> DomainInfos = q83Var.f465293g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DomainInfos, "DomainInfos");
                for (r45.k83 k83Var : DomainInfos) {
                    java.lang.String str3 = k83Var.f460019d;
                    if (str3 != null) {
                        k83Var.f460022g = java.lang.System.currentTimeMillis();
                        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175979b.i()).H(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.g(str3, false, 2, null), k83Var.mo14344x5f01b1f6());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "save preauth domain:" + str3 + ' ' + k83Var.f460020e + ' ' + k83Var.f460021f);
                    }
                }
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.q2(q83Var, j17, req, hashMap, null), 3, null);
            }
        }
        try {
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ys1.f.f546676c;
            java.util.LinkedList ReqInfo = req.f463560n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ReqInfo, "ReqInfo");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(ReqInfo, 10));
            java.util.Iterator it = ReqInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.n83) it.next()).f462686e);
            }
            concurrentSkipListSet.removeAll(arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcherPreAuther", "[TRACE_PREFETCH-preAuth] Concurrent Remove Exception: " + e17.getMessage());
        }
    }
}
