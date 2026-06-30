package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public abstract class z0 {
    public static void a(java.util.List list, com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar) {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue;
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(list);
        com.tencent.mm.plugin.appbrand.service.r6 r6Var = com.tencent.mm.plugin.appbrand.service.r6.Fail_SvrRetListEmpty;
        if (L0) {
            com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a.a(oVar != null ? oVar.f75882x : null, r6Var);
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.y0 y0Var = new com.tencent.mm.plugin.appbrand.appcache.predownload.y0(oVar);
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedBlockingQueue = y0Var.f75752a;
            if (!hasNext) {
                break;
            }
            r45.lj6 lj6Var = (r45.lj6) it.next();
            r45.ef7 ef7Var = lj6Var.f379530e;
            if (ef7Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s, appId %s, nil Cmds", lj6Var.f379529d, lj6Var.f379531f);
            } else {
                java.lang.Object[] objArr = new java.lang.Object[15];
                objArr[0] = lj6Var.f379529d;
                objArr[1] = lj6Var.f379531f;
                objArr[2] = java.lang.Boolean.valueOf(ef7Var.f373411d != null);
                objArr[3] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373412e != null);
                objArr[4] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373413f != null);
                objArr[5] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373414g != null);
                objArr[6] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373415h != null);
                objArr[7] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373416i != null);
                objArr[8] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373417m != null);
                objArr[9] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373418n != null);
                objArr[10] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373419o != null);
                objArr[11] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373420p != null);
                objArr[12] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373421q != null);
                objArr[13] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373422r != null);
                objArr[14] = java.lang.Boolean.valueOf(lj6Var.f379530e.f373423s != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s appId %s, GetContact(%b), GetCode(%b), IssueContact(%b), IssueLaunch(%b), IssueDecryptKey(%s), UpdateVersion(%b), BlockCgiRequest(%b), PreLaunch(%b), InvalidCode(%b), InvalidContact(%b), PullGlobalConf(%b), GetExptInfo(%b), GetJsApiControlBytes(%b)", objArr);
                r45.gf7 gf7Var = lj6Var.f379530e.f373411d;
                if (gf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, gf7Var).H(new q81.f());
                }
                if (lj6Var.f379530e.f373412e != null) {
                    linkedBlockingQueue.add(lj6Var);
                }
                r45.kf7 kf7Var = lj6Var.f379530e.f373413f;
                if (kf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, kf7Var).H(new q81.l());
                }
                r45.mf7 mf7Var = lj6Var.f379530e.f373414g;
                if (mf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, mf7Var).H(new q81.o());
                }
                r45.lf7 lf7Var = lj6Var.f379530e.f373415h;
                if (lf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, lf7Var).H(new q81.n());
                }
                r45.qf7 qf7Var = lj6Var.f379530e.f373416i;
                if (qf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, qf7Var).H(new q81.s());
                }
                r45.df7 df7Var = lj6Var.f379530e.f373417m;
                if (df7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, df7Var).H(new q81.b());
                }
                r45.of7 of7Var = lj6Var.f379530e.f373418n;
                if (of7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, of7Var).H(new q81.q());
                }
                r45.if7 if7Var = lj6Var.f379530e.f373419o;
                if (if7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, if7Var).H(new q81.j());
                }
                r45.jf7 jf7Var = lj6Var.f379530e.f373420p;
                if (jf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, jf7Var).H(new q81.k());
                }
                r45.pf7 pf7Var = lj6Var.f379530e.f373421q;
                if (pf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, pf7Var).H(new q81.r());
                }
                r45.hf7 hf7Var = lj6Var.f379530e.f373422r;
                if (hf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, hf7Var).H(new q81.g());
                }
                r45.nf7 nf7Var = lj6Var.f379530e.f373423s;
                if (nf7Var != null) {
                    pq5.h.c(lj6Var.f379529d, lj6Var.f379531f, nf7Var).H(new q81.i());
                }
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar2 = y0Var.f75906b;
        java.lang.String str = oVar2 != null ? oVar2.f75882x : null;
        if (linkedBlockingQueue.isEmpty()) {
            com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a.a(str, r6Var);
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.appcache.predownload.a(y0Var, str, oVar2, null), 2, null);
        }
    }
}
