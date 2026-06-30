package bt3;

/* loaded from: classes9.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f24385d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f24387f;

    public r2(bt3.t2 t2Var, zs3.b0 b0Var, boolean z17) {
        this.f24387f = t2Var;
        this.f24385d = b0Var;
        this.f24386e = z17;
    }

    public final byte a(r45.gp0 gp0Var, int i17, boolean z17) {
        boolean z18;
        java.lang.String str;
        int i18 = gp0Var.I;
        byte b17 = 0;
        if (z17 && i18 == 17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable run() inner record");
            r45.ul5 A = bt3.g2.A(gp0Var.Z1);
            if (A == null) {
                return (byte) 0;
            }
            java.util.Iterator it = A.f387465f.iterator();
            while (it.hasNext()) {
                byte a17 = a((r45.gp0) it.next(), i17 + 1, z17);
                java.lang.Long.toBinaryString(a17);
                b17 = (byte) (a17 | b17);
                java.lang.Long.toBinaryString(b17);
            }
            return b17;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s);
        bt3.t2 t2Var = this.f24387f;
        zs3.b0 b0Var = this.f24385d;
        if (K0 && com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375411g2)) {
            z18 = false;
            str = "NormalDataCopyRunnable cdnInfo.field_status:%s";
        } else {
            java.lang.String t17 = bt3.g2.t(gp0Var, b0Var.field_oriMsgTalker, b0Var.field_oriMsgId, i17);
            java.lang.String t18 = bt3.g2.t(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17);
            boolean z19 = com.tencent.mm.vfs.w6.d(t17, t18, true) > 0;
            bt3.t2.a(t2Var, t18);
            if (z19) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.M)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "not find full md5, try to calculate");
                    gp0Var.p0(com.tencent.mm.vfs.w6.p(t18));
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.P)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "not find head 256 md5, try to calculate");
                    gp0Var.r0(kk.k.f(t18, 0, 256));
                    z18 = true;
                }
            } else {
                z18 = false;
            }
            java.lang.String w17 = bt3.g2.w(gp0Var.T, i17);
            java.lang.String y17 = bt3.g2.y(w17, b0Var.field_toUser, b0Var.field_msgId, false);
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y17);
            if (D0 == null) {
                zs3.y yVar = new zs3.y();
                yVar.field_cdnKey = gp0Var.f375438u;
                yVar.field_cdnUrl = gp0Var.f375434s;
                yVar.field_dataId = w17;
                yVar.field_mediaId = y17;
                yVar.field_totalLen = (int) gp0Var.R;
                if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigAppMsgDeleteInfoAfterCgi()) == 1) {
                    yVar.field_localId = d75.b.f(yVar.field_mediaId);
                } else {
                    yVar.field_localId = yVar.field_mediaId.hashCode();
                }
                yVar.field_path = bt3.g2.t(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17);
                yVar.field_type = 2;
                yVar.field_fileType = bt3.g2.r(gp0Var.I, gp0Var.R);
                yVar.field_recordLocalId = b0Var.field_localId;
                java.lang.String str2 = b0Var.field_toUser;
                yVar.field_toUser = str2;
                yVar.field_isThumb = false;
                java.lang.String t19 = bt3.g2.t(gp0Var, str2, b0Var.field_msgId, i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375411g2) && !com.tencent.mm.vfs.w6.j(t19)) {
                    yVar.field_status = -1;
                    c(gp0Var, t19, y17);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "[record] insert localId[%d] result[%B], recordLocalId:%d, dataId:%s, mediaId:%s", java.lang.Integer.valueOf(yVar.field_localId), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).insert(yVar)), java.lang.Integer.valueOf(yVar.field_recordLocalId), yVar.field_dataId, yVar.field_mediaId);
                b17 = 1;
                str = "NormalDataCopyRunnable cdnInfo.field_status:%s";
            } else {
                if (D0.field_status == -1) {
                    c(gp0Var, bt3.g2.t(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17), y17);
                    b17 = 1;
                } else {
                    b17 = 0;
                }
                int i19 = D0.field_status;
                if (i19 == 0) {
                    b17 = 1;
                }
                str = "NormalDataCopyRunnable cdnInfo.field_status:%s";
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", str, java.lang.Integer.valueOf(i19));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375405d2)) {
            byte b18 = b17;
            java.lang.String H = bt3.g2.H(gp0Var, b0Var.field_oriMsgTalker, b0Var.field_oriMsgId, i17);
            java.lang.String H2 = bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17);
            com.tencent.mm.vfs.w6.d(H, H2, true);
            bt3.t2.a(t2Var, H2);
            java.lang.String w18 = bt3.g2.w(bt3.g2.F(gp0Var.T), i17);
            java.lang.String y18 = bt3.g2.y(w18, b0Var.field_toUser, b0Var.field_msgId, false);
            zs3.y D02 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(y18);
            java.lang.String str3 = str;
            java.lang.String H3 = bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17);
            if (D02 == null) {
                zs3.y yVar2 = new zs3.y();
                yVar2.field_cdnKey = gp0Var.f375420m;
                yVar2.field_cdnUrl = gp0Var.f375412h;
                yVar2.field_dataId = w18;
                yVar2.field_mediaId = y18;
                yVar2.field_totalLen = (int) gp0Var.f375418l1;
                if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigAppMsgDeleteInfoAfterCgi()) == 1) {
                    yVar2.field_localId = d75.b.f(yVar2.field_mediaId);
                } else {
                    yVar2.field_localId = yVar2.field_mediaId.hashCode();
                }
                yVar2.field_path = bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17);
                yVar2.field_type = 2;
                yVar2.field_fileType = 1;
                yVar2.field_recordLocalId = b0Var.field_localId;
                yVar2.field_toUser = b0Var.field_toUser;
                yVar2.field_isThumb = true;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375405d2) && !com.tencent.mm.vfs.w6.j(H3)) {
                    yVar2.field_status = -1;
                    b(gp0Var, H3, y18);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "[record] insert localId[%d] result[%B], recordLocalId:%d, dataId:%s, mediaId:%s", java.lang.Integer.valueOf(yVar2.field_localId), java.lang.Boolean.valueOf(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).insert(yVar2)), java.lang.Integer.valueOf(yVar2.field_recordLocalId), yVar2.field_dataId, yVar2.field_mediaId);
                b17 = 1;
            } else {
                if (D02.field_status == -1) {
                    b(gp0Var, bt3.g2.H(gp0Var, b0Var.field_toUser, b0Var.field_msgId, i17), y18);
                    b17 = 1;
                } else {
                    b17 = b18;
                }
                int i27 = D02.field_status;
                if (i27 == 0) {
                    b17 = 1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", str3, java.lang.Integer.valueOf(i27));
            }
        }
        byte b19 = z18 ? (byte) 1 : (byte) 0;
        return b17 != 0 ? (byte) (b19 | 2) : b19;
    }

    public final void b(r45.gp0 gp0Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl id:%s, mediaId:%s, thumbPath:%s", gp0Var.T, str2, str);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_RecordMsgSendService_2";
        mVar.field_fileType = 19;
        mVar.field_authKey = gp0Var.f375409f2;
        mVar.field_aesKey = gp0Var.f375413h2;
        mVar.f241811z = gp0Var.f375405d2;
        mVar.field_fullpath = str;
        if (str2 != null) {
            str2 = str2.concat("_tp");
        }
        mVar.field_mediaId = str2;
        mVar.f241787f = new bt3.q2(this, gp0Var, str);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
    }

    public final void c(r45.gp0 gp0Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl id:%s, mediaId:%s, path:%s", gp0Var.T, str2, str);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_RecordMsgSendService_1";
        mVar.field_fileType = 19;
        mVar.field_authKey = gp0Var.f375409f2;
        mVar.field_aesKey = gp0Var.f375407e2;
        mVar.f241811z = gp0Var.f375411g2;
        mVar.field_fullpath = str;
        if (str2 != null) {
            str2 = str2.concat("_tp");
        }
        mVar.field_mediaId = str2;
        mVar.f241787f = new bt3.p2(this, gp0Var, str);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        zs3.b0 b0Var = this.f24385d;
        r45.bq0 bq0Var = b0Var.field_dataProto;
        bt3.t2 t2Var = this.f24387f;
        if (bq0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable info.field_dataProto null");
            t2Var.f24412d = false;
            return;
        }
        java.util.Iterator it = bq0Var.f370964f.iterator();
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            z17 = this.f24386e;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable startEmbedded:%s infochanged:%s, needRun:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", java.lang.Integer.valueOf(b0Var.field_localId), java.lang.Long.valueOf(b0Var.field_msgId), java.lang.Integer.valueOf(b0Var.field_type));
            ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj().update(b0Var, dm.i4.COL_LOCALID);
        }
        if (!z19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable doSendContinue");
            t2Var.b(b0Var, false);
            t2Var.f24412d = false;
            t2Var.f(null, false);
        }
        ((bt3.k1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj()).b();
    }
}
