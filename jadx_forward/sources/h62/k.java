package h62;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ef3 f360729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h62.l f360730e;

    public k(h62.l lVar, r45.ef3 ef3Var) {
        this.f360730e = lVar;
        this.f360729d = ef3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        h62.l lVar = this.f360730e;
        lVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        r45.ef3 ef3Var = this.f360729d;
        if (ef3Var == null || ef3Var.mo11484xe92ab0a8() == null) {
            return;
        }
        if (ef3Var.mo11484xe92ab0a8().f458492d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetExpt", "get expt error. resp baseResp [%d] [%s]", java.lang.Integer.valueOf(ef3Var.mo11484xe92ab0a8().f458492d), ef3Var.mo11484xe92ab0a8().f458493e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 2L, 1L, false);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = ef3Var.f454921g;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                r45.lm0 lm0Var = (r45.lm0) it.next();
                j62.c cVar = new j62.c();
                cVar.t0(lm0Var.f461128g);
                cVar.f66060x4f0eca5f = lm0Var.f461130i;
                cVar.f66058x81ee695 = lm0Var.f461131m;
                cVar.f66066x92da310b = lm0Var.f461132n;
                int i17 = cVar.f66062xf8fc5057;
                int i18 = lm0Var.f461125d;
                if (i17 != i18 || cVar.f66065x861009b5 != lm0Var.f461126e || cVar.f66063x268de0a3 != lm0Var.f461127f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetExpt", "expt item proto[%d %d %d] is different expt content[%d %d %d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(lm0Var.f461126e), java.lang.Integer.valueOf(lm0Var.f461127f), java.lang.Integer.valueOf(cVar.f66062xf8fc5057), java.lang.Integer.valueOf(cVar.f66065x861009b5), java.lang.Integer.valueOf(cVar.f66063x268de0a3));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 6L, 1L, false);
                }
                linkedList.add(cVar);
            }
        }
        h62.d vj6 = h62.d.vj();
        int i19 = ef3Var.f454922h;
        java.util.LinkedList linkedList3 = ef3Var.f454920f;
        vj6.Ij(i19, linkedList3, linkedList, ef3Var.f454923i);
        lVar.I(ef3Var.f454918d);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_INTERVAL_SEC_INT, java.lang.Integer.valueOf(ef3Var.f454919e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 1L, 1L, false);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(ef3Var.f454918d);
        objArr[1] = java.lang.Integer.valueOf(ef3Var.f454919e);
        objArr[2] = java.lang.Integer.valueOf(ef3Var.f454922h);
        objArr[3] = java.lang.Integer.valueOf(linkedList3 != null ? linkedList3.size() : 0);
        objArr[4] = java.lang.Integer.valueOf(linkedList.size());
        objArr[5] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExpt", "update expt svrTime:%d interval:%d exptFlag:%d  deleteCount:[svr:%d] replaceCount:[svr:%d] cost[%d]", objArr);
    }
}
