package bt3;

/* loaded from: classes9.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f24310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f24311e;

    public k2(bt3.t2 t2Var, zs3.b0 b0Var) {
        this.f24311e = t2Var;
        this.f24310d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        r45.bq0 bq0Var;
        java.util.LinkedList linkedList;
        java.util.Iterator it;
        zs3.b0 b0Var = this.f24310d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "dojob ChatDataCopyRunnable, info id:%s", java.lang.Long.valueOf(b0Var.field_msgId));
        bt3.t2 t2Var = this.f24311e;
        if (b0Var == null || (bq0Var = b0Var.field_dataProto) == null || (linkedList = bq0Var.f370964f) == null) {
            z17 = false;
            z18 = false;
        } else {
            z17 = false;
            z18 = false;
            for (java.util.Iterator it6 = linkedList.iterator(); it6.hasNext(); it6 = it) {
                r45.gp0 gp0Var = (r45.gp0) it6.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || com.tencent.mm.vfs.w6.j(gp0Var.V)) {
                    java.lang.String str = gp0Var.V;
                    it = it6;
                    java.lang.String t17 = bt3.g2.t(gp0Var, b0Var.field_toUser, b0Var.field_msgId, 1);
                    if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "isWXGF");
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        str = m11.b1.Di().P0(str);
                    }
                    if (com.tencent.mm.vfs.w6.k(t17) != com.tencent.mm.vfs.w6.k(str)) {
                        boolean z19 = com.tencent.mm.vfs.w6.d(str, t17, true) > 0;
                        bt3.t2.a(t2Var, t17);
                        if (z19) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.M)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "summerrecord not find full md5, try to calculate");
                                gp0Var.p0(com.tencent.mm.vfs.w6.p(t17));
                                z17 = true;
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.P)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "summerrecord not find head 256 md5, try to calculate");
                                byte[] N = com.tencent.mm.vfs.w6.N(t17, 0, 256);
                                gp0Var.r0(N == null ? null : kk.k.g(N));
                                z17 = true;
                            }
                        }
                    }
                    if (com.tencent.mm.vfs.w6.k(t17) != 0) {
                        gp0Var.q0(com.tencent.mm.vfs.w6.k(t17));
                    }
                    java.lang.String y17 = bt3.g2.y(gp0Var.T, b0Var.field_toUser, b0Var.field_msgId, false);
                    zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y17);
                    if (D0 == null) {
                        zs3.y yVar = new zs3.y();
                        yVar.field_cdnKey = gp0Var.f375438u;
                        yVar.field_cdnUrl = gp0Var.f375434s;
                        yVar.field_dataId = gp0Var.T;
                        yVar.field_mediaId = y17;
                        yVar.field_totalLen = (int) gp0Var.R;
                        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigAppMsgDeleteInfoAfterCgi()) == 1) {
                            yVar.field_localId = d75.b.f(yVar.field_mediaId);
                        } else {
                            yVar.field_localId = yVar.field_mediaId.hashCode();
                        }
                        yVar.field_path = bt3.g2.t(gp0Var, b0Var.field_toUser, b0Var.field_msgId, 1);
                        yVar.field_type = 2;
                        yVar.field_fileType = bt3.g2.r(gp0Var.I, gp0Var.R);
                        yVar.field_recordLocalId = b0Var.field_localId;
                        yVar.field_toUser = b0Var.field_toUser;
                        yVar.field_isThumb = false;
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "summerrecord insert localId[%d] result[%B] fileType[%d], mediaId[%s]", java.lang.Integer.valueOf(yVar.field_localId), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).insert(yVar)), java.lang.Integer.valueOf(yVar.field_fileType), y17);
                    } else {
                        int i17 = D0.field_status;
                        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != -1) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "hasInsertCdn, cdnInfo status:%s", java.lang.Integer.valueOf(i17));
                        }
                    }
                    z18 = true;
                } else {
                    it = it6;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || com.tencent.mm.vfs.w6.j(gp0Var.X)) {
                    java.lang.String str2 = gp0Var.X;
                    java.lang.String H = bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, 1);
                    if (com.tencent.mm.sdk.platformtools.y1.g(str2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "isWXGF");
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        str2 = m11.b1.Di().P0(str2);
                    }
                    if (com.tencent.mm.vfs.w6.k(H) != com.tencent.mm.vfs.w6.k(str2)) {
                        boolean z27 = com.tencent.mm.vfs.w6.d(str2, H, true) > 0;
                        bt3.t2.a(t2Var, H);
                        gp0Var.L0(com.tencent.mm.vfs.w6.k(H));
                        if (z27) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.Z)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "not find ThumbMd5 md5, try to calculate");
                                gp0Var.N0(com.tencent.mm.vfs.w6.p(H));
                                z17 = true;
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375445x0)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "not find Thumb Head 256 Md5, try to calculate");
                                gp0Var.M0(kk.k.f(H, 0, 256));
                                z17 = true;
                            }
                        }
                    }
                    java.lang.String F = bt3.g2.F(gp0Var.T);
                    java.lang.String y18 = bt3.g2.y(F, b0Var.field_toUser, b0Var.field_msgId, false);
                    zs3.y D02 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y18);
                    if (D02 == null) {
                        zs3.y yVar2 = new zs3.y();
                        yVar2.field_cdnKey = gp0Var.f375420m;
                        yVar2.field_cdnUrl = gp0Var.f375412h;
                        yVar2.field_dataId = F;
                        yVar2.field_mediaId = y18;
                        yVar2.field_totalLen = (int) gp0Var.f375418l1;
                        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigAppMsgDeleteInfoAfterCgi()) == 1) {
                            yVar2.field_localId = d75.b.f(yVar2.field_mediaId);
                        } else {
                            yVar2.field_localId = yVar2.field_mediaId.hashCode();
                        }
                        yVar2.field_path = bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, 1);
                        yVar2.field_type = 2;
                        yVar2.field_fileType = 1;
                        yVar2.field_recordLocalId = b0Var.field_localId;
                        yVar2.field_toUser = b0Var.field_toUser;
                        yVar2.field_isThumb = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", java.lang.Integer.valueOf(yVar2.field_localId), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).insert(yVar2)));
                    } else {
                        int i18 = D02.field_status;
                        if (i18 != 2 && i18 != 3 && i18 != 4 && i18 != -1) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "hasInsertCdn, thumb cdnInfo status:%s", java.lang.Integer.valueOf(i18));
                        }
                    }
                    z18 = true;
                }
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", java.lang.Integer.valueOf(b0Var.field_localId), java.lang.Long.valueOf(b0Var.field_msgId), java.lang.Integer.valueOf(b0Var.field_type));
            ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj().update(b0Var, dm.i4.COL_LOCALID);
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "doSendContinue without cdn task");
            t2Var.b(b0Var, false);
            t2Var.f24412d = false;
            t2Var.f(null, false);
        }
        ((bt3.k1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj()).b();
    }
}
