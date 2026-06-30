package bt3;

/* loaded from: classes9.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f105843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f105844e;

    public k2(bt3.t2 t2Var, zs3.b0 b0Var) {
        this.f105844e = t2Var;
        this.f105843d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        r45.bq0 bq0Var;
        java.util.LinkedList linkedList;
        java.util.Iterator it;
        zs3.b0 b0Var = this.f105843d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "dojob ChatDataCopyRunnable, info id:%s", java.lang.Long.valueOf(b0Var.f68498x297eb4f7));
        bt3.t2 t2Var = this.f105844e;
        if (b0Var == null || (bq0Var = b0Var.f68494x84214f59) == null || (linkedList = bq0Var.f452497f) == null) {
            z17 = false;
            z18 = false;
        } else {
            z17 = false;
            z18 = false;
            for (java.util.Iterator it6 = linkedList.iterator(); it6.hasNext(); it6 = it) {
                r45.gp0 gp0Var = (r45.gp0) it6.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || com.p314xaae8f345.mm.vfs.w6.j(gp0Var.V)) {
                    java.lang.String str = gp0Var.V;
                    it = it6;
                    java.lang.String t17 = bt3.g2.t(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, 1);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "isWXGF");
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        str = m11.b1.Di().P0(str);
                    }
                    if (com.p314xaae8f345.mm.vfs.w6.k(t17) != com.p314xaae8f345.mm.vfs.w6.k(str)) {
                        boolean z19 = com.p314xaae8f345.mm.vfs.w6.d(str, t17, true) > 0;
                        bt3.t2.a(t2Var, t17);
                        if (z19) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.M)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "summerrecord not find full md5, try to calculate");
                                gp0Var.p0(com.p314xaae8f345.mm.vfs.w6.p(t17));
                                z17 = true;
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.P)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "summerrecord not find head 256 md5, try to calculate");
                                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(t17, 0, 256);
                                gp0Var.r0(N == null ? null : kk.k.g(N));
                                z17 = true;
                            }
                        }
                    }
                    if (com.p314xaae8f345.mm.vfs.w6.k(t17) != 0) {
                        gp0Var.q0(com.p314xaae8f345.mm.vfs.w6.k(t17));
                    }
                    java.lang.String y17 = bt3.g2.y(gp0Var.T, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, false);
                    zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y17);
                    if (D0 == null) {
                        zs3.y yVar = new zs3.y();
                        yVar.f68317xf47749d7 = gp0Var.f456971u;
                        yVar.f68318xf47770e7 = gp0Var.f456967s;
                        yVar.f68319xf604e54a = gp0Var.T;
                        yVar.f68324xaca5bdda = y17;
                        yVar.f68330xeb1a61d6 = (int) gp0Var.R;
                        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20502x482d5ffe()) == 1) {
                            yVar.f68323x88be67a1 = d75.b.f(yVar.f68324xaca5bdda);
                        } else {
                            yVar.f68323x88be67a1 = yVar.f68324xaca5bdda.hashCode();
                        }
                        yVar.f68326x2260084a = bt3.g2.t(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, 1);
                        yVar.f68334x2262335f = 2;
                        yVar.f68321xf1ebe47b = bt3.g2.r(gp0Var.I, gp0Var.R);
                        yVar.f68327x4ad5cdd0 = b0Var.f68497x88be67a1;
                        yVar.f68329x1209e7cb = b0Var.f68503x1209e7cb;
                        yVar.f68322xf00f0c87 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "summerrecord insert localId[%d] result[%B] fileType[%d], mediaId[%s]", java.lang.Integer.valueOf(yVar.f68323x88be67a1), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo880xb970c2b9(yVar)), java.lang.Integer.valueOf(yVar.f68321xf1ebe47b), y17);
                    } else {
                        int i17 = D0.f68328x10a0fed7;
                        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != -1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "hasInsertCdn, cdnInfo status:%s", java.lang.Integer.valueOf(i17));
                        }
                    }
                    z18 = true;
                } else {
                    it = it6;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h) || com.p314xaae8f345.mm.vfs.w6.j(gp0Var.X)) {
                    java.lang.String str2 = gp0Var.X;
                    java.lang.String H = bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, 1);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "isWXGF");
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        str2 = m11.b1.Di().P0(str2);
                    }
                    if (com.p314xaae8f345.mm.vfs.w6.k(H) != com.p314xaae8f345.mm.vfs.w6.k(str2)) {
                        boolean z27 = com.p314xaae8f345.mm.vfs.w6.d(str2, H, true) > 0;
                        bt3.t2.a(t2Var, H);
                        gp0Var.L0(com.p314xaae8f345.mm.vfs.w6.k(H));
                        if (z27) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.Z)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "not find ThumbMd5 md5, try to calculate");
                                gp0Var.N0(com.p314xaae8f345.mm.vfs.w6.p(H));
                                z17 = true;
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456978x0)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "not find Thumb Head 256 Md5, try to calculate");
                                gp0Var.M0(kk.k.f(H, 0, 256));
                                z17 = true;
                            }
                        }
                    }
                    java.lang.String F = bt3.g2.F(gp0Var.T);
                    java.lang.String y18 = bt3.g2.y(F, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, false);
                    zs3.y D02 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y18);
                    if (D02 == null) {
                        zs3.y yVar2 = new zs3.y();
                        yVar2.f68317xf47749d7 = gp0Var.f456953m;
                        yVar2.f68318xf47770e7 = gp0Var.f456945h;
                        yVar2.f68319xf604e54a = F;
                        yVar2.f68324xaca5bdda = y18;
                        yVar2.f68330xeb1a61d6 = (int) gp0Var.f456951l1;
                        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20502x482d5ffe()) == 1) {
                            yVar2.f68323x88be67a1 = d75.b.f(yVar2.f68324xaca5bdda);
                        } else {
                            yVar2.f68323x88be67a1 = yVar2.f68324xaca5bdda.hashCode();
                        }
                        yVar2.f68326x2260084a = bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, 1);
                        yVar2.f68334x2262335f = 2;
                        yVar2.f68321xf1ebe47b = 1;
                        yVar2.f68327x4ad5cdd0 = b0Var.f68497x88be67a1;
                        yVar2.f68329x1209e7cb = b0Var.f68503x1209e7cb;
                        yVar2.f68322xf00f0c87 = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", java.lang.Integer.valueOf(yVar2.f68323x88be67a1), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo880xb970c2b9(yVar2)));
                    } else {
                        int i18 = D02.f68328x10a0fed7;
                        if (i18 != 2 && i18 != 3 && i18 != 4 && i18 != -1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "hasInsertCdn, thumb cdnInfo status:%s", java.lang.Integer.valueOf(i18));
                        }
                    }
                    z18 = true;
                }
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", java.lang.Integer.valueOf(b0Var.f68497x88be67a1), java.lang.Long.valueOf(b0Var.f68498x297eb4f7), java.lang.Integer.valueOf(b0Var.f68504x2262335f));
            ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj().mo9952xce0038c9(b0Var, dm.i4.f66867x2a5c95c7);
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "doSendContinue without cdn task");
            t2Var.b(b0Var, false);
            t2Var.f105945d = false;
            t2Var.f(null, false);
        }
        ((bt3.k1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj()).b();
    }
}
