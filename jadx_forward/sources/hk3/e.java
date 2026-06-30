package hk3;

/* loaded from: classes8.dex */
public final class e implements ct1.x {
    @Override // ct1.x
    public void pi(java.util.LinkedList linkedList, boolean z17) {
        r45.du5 du5Var;
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    if (trVar.f468253e == 1) {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                        linkedList2.add(w3Var);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiTaskMsgSyncHandler", "[onReceive] msgList.size = " + linkedList2.size());
            java.util.Iterator it6 = linkedList2.iterator();
            boolean z18 = false;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                r45.j4 j4Var = ((r45.w3) it6.next()).f470359d;
                if (j4Var.f459093g == 10002) {
                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d((j4Var == null || (du5Var = j4Var.f459094h) == null) ? null : du5Var.f454289d, "sysmsg", null);
                    java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("starcmd", str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sync", (java.lang.String) d17.get(".sysmsg.cmd"))) {
                        z18 = true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiTaskMsgSyncHandler", "processMsg: type：%s", str);
                }
            }
            if (z18) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.f231998z0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0.class) : null;
                j75.f Ai = k0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1) k0Var).Ai() : null;
                if (Ai != null) {
                    Ai.B3(new ik3.f());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiTaskMsgSyncHandler", "doSync");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiTaskMsgSyncHandler", e17, "", new java.lang.Object[0]);
        }
    }
}
