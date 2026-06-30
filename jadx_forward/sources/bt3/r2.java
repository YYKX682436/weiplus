package bt3;

/* loaded from: classes9.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f105918d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f105920f;

    public r2(bt3.t2 t2Var, zs3.b0 b0Var, boolean z17) {
        this.f105920f = t2Var;
        this.f105918d = b0Var;
        this.f105919e = z17;
    }

    public final byte a(r45.gp0 gp0Var, int i17, boolean z17) {
        boolean z18;
        java.lang.String str;
        int i18 = gp0Var.I;
        byte b17 = 0;
        if (z17 && i18 == 17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable run() inner record");
            r45.ul5 A = bt3.g2.A(gp0Var.Z1);
            if (A == null) {
                return (byte) 0;
            }
            java.util.Iterator it = A.f468998f.iterator();
            while (it.hasNext()) {
                byte a17 = a((r45.gp0) it.next(), i17 + 1, z17);
                java.lang.Long.toBinaryString(a17);
                b17 = (byte) (a17 | b17);
                java.lang.Long.toBinaryString(b17);
            }
            return b17;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s);
        bt3.t2 t2Var = this.f105920f;
        zs3.b0 b0Var = this.f105918d;
        if (K0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456944g2)) {
            z18 = false;
            str = "NormalDataCopyRunnable cdnInfo.field_status:%s";
        } else {
            java.lang.String t17 = bt3.g2.t(gp0Var, b0Var.f68500x2687819, b0Var.f68499x6e8b9edb, i17);
            java.lang.String t18 = bt3.g2.t(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17);
            boolean z19 = com.p314xaae8f345.mm.vfs.w6.d(t17, t18, true) > 0;
            bt3.t2.a(t2Var, t18);
            if (z19) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.M)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "not find full md5, try to calculate");
                    gp0Var.p0(com.p314xaae8f345.mm.vfs.w6.p(t18));
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.P)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "not find head 256 md5, try to calculate");
                    gp0Var.r0(kk.k.f(t18, 0, 256));
                    z18 = true;
                }
            } else {
                z18 = false;
            }
            java.lang.String w17 = bt3.g2.w(gp0Var.T, i17);
            java.lang.String y17 = bt3.g2.y(w17, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, false);
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y17);
            if (D0 == null) {
                zs3.y yVar = new zs3.y();
                yVar.f68317xf47749d7 = gp0Var.f456971u;
                yVar.f68318xf47770e7 = gp0Var.f456967s;
                yVar.f68319xf604e54a = w17;
                yVar.f68324xaca5bdda = y17;
                yVar.f68330xeb1a61d6 = (int) gp0Var.R;
                if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20502x482d5ffe()) == 1) {
                    yVar.f68323x88be67a1 = d75.b.f(yVar.f68324xaca5bdda);
                } else {
                    yVar.f68323x88be67a1 = yVar.f68324xaca5bdda.hashCode();
                }
                yVar.f68326x2260084a = bt3.g2.t(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17);
                yVar.f68334x2262335f = 2;
                yVar.f68321xf1ebe47b = bt3.g2.r(gp0Var.I, gp0Var.R);
                yVar.f68327x4ad5cdd0 = b0Var.f68497x88be67a1;
                java.lang.String str2 = b0Var.f68503x1209e7cb;
                yVar.f68329x1209e7cb = str2;
                yVar.f68322xf00f0c87 = false;
                java.lang.String t19 = bt3.g2.t(gp0Var, str2, b0Var.f68498x297eb4f7, i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456944g2) && !com.p314xaae8f345.mm.vfs.w6.j(t19)) {
                    yVar.f68328x10a0fed7 = -1;
                    c(gp0Var, t19, y17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "[record] insert localId[%d] result[%B], recordLocalId:%d, dataId:%s, mediaId:%s", java.lang.Integer.valueOf(yVar.f68323x88be67a1), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo880xb970c2b9(yVar)), java.lang.Integer.valueOf(yVar.f68327x4ad5cdd0), yVar.f68319xf604e54a, yVar.f68324xaca5bdda);
                b17 = 1;
                str = "NormalDataCopyRunnable cdnInfo.field_status:%s";
            } else {
                if (D0.f68328x10a0fed7 == -1) {
                    c(gp0Var, bt3.g2.t(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17), y17);
                    b17 = 1;
                } else {
                    b17 = 0;
                }
                int i19 = D0.f68328x10a0fed7;
                if (i19 == 0) {
                    b17 = 1;
                }
                str = "NormalDataCopyRunnable cdnInfo.field_status:%s";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", str, java.lang.Integer.valueOf(i19));
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456938d2)) {
            byte b18 = b17;
            java.lang.String H = bt3.g2.H(gp0Var, b0Var.f68500x2687819, b0Var.f68499x6e8b9edb, i17);
            java.lang.String H2 = bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17);
            com.p314xaae8f345.mm.vfs.w6.d(H, H2, true);
            bt3.t2.a(t2Var, H2);
            java.lang.String w18 = bt3.g2.w(bt3.g2.F(gp0Var.T), i17);
            java.lang.String y18 = bt3.g2.y(w18, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, false);
            zs3.y D02 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y18);
            java.lang.String str3 = str;
            java.lang.String H3 = bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17);
            if (D02 == null) {
                zs3.y yVar2 = new zs3.y();
                yVar2.f68317xf47749d7 = gp0Var.f456953m;
                yVar2.f68318xf47770e7 = gp0Var.f456945h;
                yVar2.f68319xf604e54a = w18;
                yVar2.f68324xaca5bdda = y18;
                yVar2.f68330xeb1a61d6 = (int) gp0Var.f456951l1;
                if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20502x482d5ffe()) == 1) {
                    yVar2.f68323x88be67a1 = d75.b.f(yVar2.f68324xaca5bdda);
                } else {
                    yVar2.f68323x88be67a1 = yVar2.f68324xaca5bdda.hashCode();
                }
                yVar2.f68326x2260084a = bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17);
                yVar2.f68334x2262335f = 2;
                yVar2.f68321xf1ebe47b = 1;
                yVar2.f68327x4ad5cdd0 = b0Var.f68497x88be67a1;
                yVar2.f68329x1209e7cb = b0Var.f68503x1209e7cb;
                yVar2.f68322xf00f0c87 = true;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456938d2) && !com.p314xaae8f345.mm.vfs.w6.j(H3)) {
                    yVar2.f68328x10a0fed7 = -1;
                    b(gp0Var, H3, y18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "[record] insert localId[%d] result[%B], recordLocalId:%d, dataId:%s, mediaId:%s", java.lang.Integer.valueOf(yVar2.f68323x88be67a1), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo880xb970c2b9(yVar2)), java.lang.Integer.valueOf(yVar2.f68327x4ad5cdd0), yVar2.f68319xf604e54a, yVar2.f68324xaca5bdda);
                b17 = 1;
            } else {
                if (D02.f68328x10a0fed7 == -1) {
                    b(gp0Var, bt3.g2.H(gp0Var, b0Var.f68503x1209e7cb, b0Var.f68498x297eb4f7, i17), y18);
                    b17 = 1;
                } else {
                    b17 = b18;
                }
                int i27 = D02.f68328x10a0fed7;
                if (i27 == 0) {
                    b17 = 1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", str3, java.lang.Integer.valueOf(i27));
            }
        }
        byte b19 = z18 ? (byte) 1 : (byte) 0;
        return b17 != 0 ? (byte) (b19 | 2) : b19;
    }

    public final void b(r45.gp0 gp0Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl id:%s, mediaId:%s, thumbPath:%s", gp0Var.T, str2, str);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_RecordMsgSendService_2";
        mVar.f69592xf1ebe47b = 19;
        mVar.f69582x4e093552 = gp0Var.f456942f2;
        mVar.f69575xf11df5f5 = gp0Var.f456946h2;
        mVar.f323344z = gp0Var.f456938d2;
        mVar.f69595x6d25b0d9 = str;
        if (str2 != null) {
            str2 = str2.concat("_tp");
        }
        mVar.f69601xaca5bdda = str2;
        mVar.f323320f = new bt3.q2(this, gp0Var, str);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
    }

    public final void c(r45.gp0 gp0Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl id:%s, mediaId:%s, path:%s", gp0Var.T, str2, str);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_RecordMsgSendService_1";
        mVar.f69592xf1ebe47b = 19;
        mVar.f69582x4e093552 = gp0Var.f456942f2;
        mVar.f69575xf11df5f5 = gp0Var.f456940e2;
        mVar.f323344z = gp0Var.f456944g2;
        mVar.f69595x6d25b0d9 = str;
        if (str2 != null) {
            str2 = str2.concat("_tp");
        }
        mVar.f69601xaca5bdda = str2;
        mVar.f323320f = new bt3.p2(this, gp0Var, str);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        zs3.b0 b0Var = this.f105918d;
        r45.bq0 bq0Var = b0Var.f68494x84214f59;
        bt3.t2 t2Var = this.f105920f;
        if (bq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable info.field_dataProto null");
            t2Var.f105945d = false;
            return;
        }
        java.util.Iterator it = bq0Var.f452497f.iterator();
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            z17 = this.f105919e;
            if (!hasNext) {
                break;
            }
            byte a17 = a((r45.gp0) it.next(), 1, z17);
            java.lang.Long.toBinaryString(a17);
            if ((a17 & 1) == 1) {
                z18 = true;
            }
            if ((a17 & 2) == 2) {
                z19 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable startEmbedded:%s infochanged:%s, needRun:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", java.lang.Integer.valueOf(b0Var.f68497x88be67a1), java.lang.Long.valueOf(b0Var.f68498x297eb4f7), java.lang.Integer.valueOf(b0Var.f68504x2262335f));
            ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj().mo9952xce0038c9(b0Var, dm.i4.f66867x2a5c95c7);
        }
        if (!z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable doSendContinue");
            t2Var.b(b0Var, false);
            t2Var.f105945d = false;
            t2Var.f(null, false);
        }
        ((bt3.k1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj()).b();
    }
}
