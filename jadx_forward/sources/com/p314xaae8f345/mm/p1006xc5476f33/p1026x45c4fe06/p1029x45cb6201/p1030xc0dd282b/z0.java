package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public abstract class z0 {
    public static void a(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o oVar) {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue;
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Fail_SvrRetListEmpty;
        if (L0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a.a(oVar != null ? oVar.f157415x : null, r6Var);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.y0(oVar);
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedBlockingQueue = y0Var.f157285a;
            if (!hasNext) {
                break;
            }
            r45.lj6 lj6Var = (r45.lj6) it.next();
            r45.ef7 ef7Var = lj6Var.f461063e;
            if (ef7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s, appId %s, nil Cmds", lj6Var.f461062d, lj6Var.f461064f);
            } else {
                java.lang.Object[] objArr = new java.lang.Object[15];
                objArr[0] = lj6Var.f461062d;
                objArr[1] = lj6Var.f461064f;
                objArr[2] = java.lang.Boolean.valueOf(ef7Var.f454944d != null);
                objArr[3] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454945e != null);
                objArr[4] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454946f != null);
                objArr[5] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454947g != null);
                objArr[6] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454948h != null);
                objArr[7] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454949i != null);
                objArr[8] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454950m != null);
                objArr[9] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454951n != null);
                objArr[10] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454952o != null);
                objArr[11] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454953p != null);
                objArr[12] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454954q != null);
                objArr[13] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454955r != null);
                objArr[14] = java.lang.Boolean.valueOf(lj6Var.f461063e.f454956s != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s appId %s, GetContact(%b), GetCode(%b), IssueContact(%b), IssueLaunch(%b), IssueDecryptKey(%s), UpdateVersion(%b), BlockCgiRequest(%b), PreLaunch(%b), InvalidCode(%b), InvalidContact(%b), PullGlobalConf(%b), GetExptInfo(%b), GetJsApiControlBytes(%b)", objArr);
                r45.gf7 gf7Var = lj6Var.f461063e.f454944d;
                if (gf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, gf7Var).H(new q81.f());
                }
                if (lj6Var.f461063e.f454945e != null) {
                    linkedBlockingQueue.add(lj6Var);
                }
                r45.kf7 kf7Var = lj6Var.f461063e.f454946f;
                if (kf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, kf7Var).H(new q81.l());
                }
                r45.mf7 mf7Var = lj6Var.f461063e.f454947g;
                if (mf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, mf7Var).H(new q81.o());
                }
                r45.lf7 lf7Var = lj6Var.f461063e.f454948h;
                if (lf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, lf7Var).H(new q81.n());
                }
                r45.qf7 qf7Var = lj6Var.f461063e.f454949i;
                if (qf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, qf7Var).H(new q81.s());
                }
                r45.df7 df7Var = lj6Var.f461063e.f454950m;
                if (df7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, df7Var).H(new q81.b());
                }
                r45.of7 of7Var = lj6Var.f461063e.f454951n;
                if (of7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, of7Var).H(new q81.q());
                }
                r45.if7 if7Var = lj6Var.f461063e.f454952o;
                if (if7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, if7Var).H(new q81.j());
                }
                r45.jf7 jf7Var = lj6Var.f461063e.f454953p;
                if (jf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, jf7Var).H(new q81.k());
                }
                r45.pf7 pf7Var = lj6Var.f461063e.f454954q;
                if (pf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, pf7Var).H(new q81.r());
                }
                r45.hf7 hf7Var = lj6Var.f461063e.f454955r;
                if (hf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, hf7Var).H(new q81.g());
                }
                r45.nf7 nf7Var = lj6Var.f461063e.f454956s;
                if (nf7Var != null) {
                    pq5.h.c(lj6Var.f461062d, lj6Var.f461064f, nf7Var).H(new q81.i());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o oVar2 = y0Var.f157439b;
        java.lang.String str = oVar2 != null ? oVar2.f157415x : null;
        if (linkedBlockingQueue.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a.a(str, r6Var);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.a(y0Var, str, oVar2, null), 2, null);
        }
    }
}
