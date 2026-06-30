package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes5.dex */
public class u3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public u3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ns.l) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var);
            if (m3Var.f270915i.get("FTSAddContactTestNetScene") != null) {
                java.util.List list = m3Var.f270912f;
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "bind contact %s success", list.toString());
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSSearchTestLogic", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i18 == -44) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(1);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put((java.lang.String) list.get(0), 0);
                    java.lang.String str2 = (java.lang.String) m3Var.f270915i.get("verifyTicket");
                    ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(2, list, linkedList, null, "你好，我是珍惜", str2, hashMap, str2, "");
                    m3Var2.f270915i.put("FTSAddContactTestNetScene", java.lang.Boolean.TRUE);
                    gm0.j1.d().g(m3Var2);
                }
                if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
                }
            }
        }
    }
}
