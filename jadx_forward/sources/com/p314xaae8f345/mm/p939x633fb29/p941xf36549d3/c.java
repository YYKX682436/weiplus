package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.e3 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.f151927a = false;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ABTestUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 86400);
            com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.c();
            com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.b(86400);
            com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.a();
            return 0;
        }
        r45.z83 z83Var = (r45.z83) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.c();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABTEST_SERVER_TIMESTAMP_INT, java.lang.Integer.valueOf(z83Var.f473323f));
        com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.b(z83Var.f473322e);
        java.util.LinkedList<java.lang.Integer> linkedList = z83Var.f473324g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ABTestUpdater", "No expired Exp");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.e Ai = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai();
            Ai.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                for (java.lang.Integer num : linkedList) {
                    if (num != null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.c cVar = new com.p314xaae8f345.mm.p2621x8fb0427b.c();
                        cVar.f66191x29106093 = java.lang.String.valueOf(num);
                        Ai.mo9951xb06685ab(cVar, "expId");
                    }
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.b wi6 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.wi();
            wi6.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                for (java.lang.Integer num2 : linkedList) {
                    if (num2 != null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.a aVar = new com.p314xaae8f345.mm.p2621x8fb0427b.a();
                        aVar.f66023x29106093 = java.lang.String.valueOf(num2);
                        wi6.mo9951xb06685ab(aVar, "expId");
                    }
                }
            }
        }
        java.util.LinkedList linkedList2 = z83Var.f473321d;
        if (linkedList2 == null || linkedList2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ABTestUpdater", "No Exp");
        } else {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.a c17 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.b.c(x51.j1.b((com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next()));
                linkedList3.addAll(c17.f151920a);
                linkedList4.addAll(c17.f151921b);
            }
            com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().D0(linkedList3, 0);
            com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.wi().z0(linkedList4, 1);
        }
        com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABTestUpdater", "Update Interval: %d", java.lang.Integer.valueOf(z83Var.f473322e));
        return 0;
    }
}
