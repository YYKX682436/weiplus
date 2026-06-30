package com.tencent.mm.model.newabtest;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.modelbase.e3 {
    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.model.newabtest.d.f70394a = false;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ABTestUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 86400);
            com.tencent.mm.model.newabtest.d.c();
            com.tencent.mm.model.newabtest.d.b(86400);
            com.tencent.mm.model.newabtest.d.a();
            return 0;
        }
        r45.z83 z83Var = (r45.z83) oVar.f70711b.f70700a;
        com.tencent.mm.model.newabtest.d.c();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ABTEST_SERVER_TIMESTAMP_INT, java.lang.Integer.valueOf(z83Var.f391790f));
        com.tencent.mm.model.newabtest.d.b(z83Var.f391789e);
        java.util.LinkedList<java.lang.Integer> linkedList = z83Var.f391791g;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ABTestUpdater", "No expired Exp");
        } else {
            com.tencent.mm.storage.e Ai = com.tencent.mm.model.newabtest.z.Ai();
            Ai.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                for (java.lang.Integer num : linkedList) {
                    if (num != null) {
                        com.tencent.mm.storage.c cVar = new com.tencent.mm.storage.c();
                        cVar.field_expId = java.lang.String.valueOf(num);
                        Ai.delete(cVar, "expId");
                    }
                }
            }
            com.tencent.mm.storage.b wi6 = com.tencent.mm.model.newabtest.z.wi();
            wi6.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                for (java.lang.Integer num2 : linkedList) {
                    if (num2 != null) {
                        com.tencent.mm.storage.a aVar = new com.tencent.mm.storage.a();
                        aVar.field_expId = java.lang.String.valueOf(num2);
                        wi6.delete(aVar, "expId");
                    }
                }
            }
        }
        java.util.LinkedList linkedList2 = z83Var.f391788d;
        if (linkedList2 == null || linkedList2.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ABTestUpdater", "No Exp");
        } else {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.model.newabtest.a c17 = com.tencent.mm.model.newabtest.b.c(x51.j1.b((com.tencent.mm.protobuf.g) it.next()));
                linkedList3.addAll(c17.f70387a);
                linkedList4.addAll(c17.f70388b);
            }
            com.tencent.mm.model.newabtest.z.Ai().D0(linkedList3, 0);
            com.tencent.mm.model.newabtest.z.wi().z0(linkedList4, 1);
        }
        com.tencent.mm.model.newabtest.d.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ABTestUpdater", "Update Interval: %d", java.lang.Integer.valueOf(z83Var.f391789e));
        return 0;
    }
}
