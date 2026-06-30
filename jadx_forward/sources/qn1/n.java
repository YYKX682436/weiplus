package qn1;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f446528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f446529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn1.o f446530g;

    public n(qn1.o oVar, int i17, byte[] bArr, int i18) {
        this.f446530g = oVar;
        this.f446527d = i17;
        this.f446528e = bArr;
        this.f446529f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        int i17 = this.f446529f;
        byte[] bArr = this.f446528e;
        qn1.o oVar = this.f446530g;
        int i18 = this.f446527d;
        if (i18 == 3) {
            qn1.t tVar = oVar.f446531a;
            tVar.getClass();
            wn1.q qVar = (wn1.q) kn1.k.C(new wn1.q(), bArr);
            long j17 = qVar.f528991i * 1024 * 1024;
            tVar.f446541b = j17;
            sn1.i.f491552p.f491625i = j17;
            if (!qn1.c.i().f391137b.equals(qVar.f528986d)) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                objArr[1] = qVar.f528986d;
                objArr[2] = qn1.c.i().f391137b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "startRequestNotify BackupStartRequest parseBuf:%d failed or wrong id[%s,%s]", objArr);
                tVar.h(1, i17, 0L);
                tVar.d(false, false, -5);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 121L, 1L, false);
                return;
            }
            qn1.c.i().e().f391150i = qVar.f528987e;
            if (qVar.f528992m == 3) {
                tVar.f446553n = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 36L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "isQuickBackup!!!");
            }
            long j18 = qVar.f528991i;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
            gm0.j1.i();
            kn1.k.d(0L, c19769x48b92ec, c19769x48b92ec2, gm0.j1.u().d());
            long j19 = c19769x48b92ec2.f38866x6ac9171;
            double d17 = j18 * 0.1d;
            if (d17 > 5.24288E8d) {
                d17 = 5.24288E8d;
            }
            long j27 = j19 - ((long) d17);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            tVar.f446550k = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "startRequestNotify time:%d SessionCount:%d, MsgCount:%d, DataSize:%d validSize:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(qVar.f528988f), java.lang.Long.valueOf(qVar.f528989g), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j27));
            if (j27 >= j18) {
                tVar.h(0, i17, j27);
                sn1.i.V();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j18));
            tVar.h(2, i17, j27);
            ln1.g h17 = qn1.c.i().h();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = h17.f401295g;
            if (n3Var == null) {
                h17.e();
            } else {
                n3Var.mo50297x7c4d7ca2(new ln1.b(h17), 10);
            }
            qn1.c.i().e().f391142a = -13;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            tVar.a(-13);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(400L, 6L, 1L, false);
            g0Var.d(13736, 5, 0, 0, 2, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
            return;
        }
        if (i18 == 11) {
            qn1.t tVar2 = oVar.f446531a;
            tVar2.getClass();
            wn1.l lVar = (wn1.l) kn1.k.C(new wn1.l(), bArr);
            if (lVar == null) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr2[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify parseBuf failed:%d", objArr2);
                qn1.c.i().e().f391142a = -21;
                tVar2.a(-21);
                return;
            }
            tVar2.f446545f = lVar.f528970d;
            java.util.LinkedList linkedList = lVar.f528971e;
            tVar2.f446546g = linkedList;
            if (linkedList.size() != tVar2.f446545f.size() * 2) {
                tVar2.d(false, false, -21);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 119L, 1L, false);
                return;
            }
            qn1.c.i().e().a(23, 1, tVar2.f446545f.size());
            tVar2.a(23);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            c01.d9.b().i().y0(tVar2.f446545f, tVar2.f446546g, linkedList2, linkedList3);
            wn1.m mVar = new wn1.m();
            mVar.f528972d = linkedList2;
            mVar.f528973e = linkedList3;
            sn1.i.W();
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify send requestsession resp, SessionName size:%d, TimeInterval size:%d", java.lang.Integer.valueOf(tVar2.f446545f.size()), java.lang.Integer.valueOf(linkedList3.size()));
                sn1.i.S(mVar.mo14344x5f01b1f6(), 12, i17);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcRecoverServer", e17, "BackupRequestSessionResponse to buf err.", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 == 6) {
            qn1.t tVar3 = oVar.f446531a;
            int i19 = this.f446529f;
            tVar3.getClass();
            wn1.v vVar = (wn1.v) kn1.k.C(new wn1.v(), bArr);
            if (vVar == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr3[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "dataPushNotify parseBuf failed:%d", objArr3);
                tVar3.i("", 0, 0, 0, 1, i19);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive recoverData id:%s, type:%d, start:%d, end:%d, isCancel:%b", vVar.f529024d, java.lang.Integer.valueOf(vVar.f529025e), java.lang.Integer.valueOf(vVar.f529027g), java.lang.Integer.valueOf(vVar.f529028h), java.lang.Boolean.valueOf(tVar3.f446544e));
            if (tVar3.f446544e) {
                return;
            }
            if (qn1.c.i().f391141f != null && (gVar = vVar.f529030m) != null) {
                vVar.f529030m = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(com.p314xaae8f345.mm.p803x79e81b34.C10776x74af9c55.m46312xf9aed125(gVar.f273689a, qn1.c.i().f391141f, false, vVar.f529028h == vVar.f529026f));
            }
            if (vVar.f529025e == 1 && vVar.f529030m != null) {
                java.lang.String m17 = kn1.k.m(vVar.f529024d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush text dataid:%s, dir:%s", vVar.f529024d, m17);
                kn1.k.c(m17, vVar);
                tVar3.f446542c += vVar.f529030m.f273689a.length;
            }
            if (vVar.f529025e == 2) {
                java.lang.String n17 = kn1.k.n(vVar.f529024d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush media dataid:%s, dir:%s", vVar.f529024d, n17);
                kn1.k.H(n17, vVar);
                tVar3.f446542c += vVar.f529030m.f273689a.length;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify recvSize/convDataSize: %d, %d", java.lang.Long.valueOf(tVar3.f446542c), java.lang.Long.valueOf(tVar3.f446541b));
            long j28 = tVar3.f446541b;
            long j29 = tVar3.f446542c;
            if (j28 < j29) {
                tVar3.f446541b = j29;
                sn1.i.f491552p.f491625i = j29;
            }
            tVar3.i(vVar.f529024d, vVar.f529025e, vVar.f529027g, vVar.f529028h, 0, i19);
            return;
        }
        if (i18 == 13) {
            oVar.f446531a.getClass();
            wn1.b0 b0Var = (wn1.b0) kn1.k.C(new wn1.b0(), bArr);
            if (b0Var == null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr4[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d", objArr4);
                return;
            }
            wn1.c0 c0Var = new wn1.c0();
            c0Var.f528943d = b0Var.f528931d;
            c0Var.f528945f = b0Var.f528933f;
            c0Var.f528944e = b0Var.f528932e;
            c0Var.f528946g = b0Var.f528934g;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify send SvrID resp");
                sn1.i.S(c0Var.mo14344x5f01b1f6(), 14, i17);
                return;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcRecoverServer", e18, "PacketSvrIDResponse to buf err.", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 != 15) {
            if (i18 == 8) {
                qn1.t tVar4 = oVar.f446531a;
                tVar4.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "finishReqNotify receive finishReq. hasReceiveFinishReq[%b]", java.lang.Boolean.valueOf(qn1.t.f446539r));
                if (qn1.t.f446539r) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "finishReqNotify has receive finishReq, return.");
                    return;
                }
                qn1.t.f446539r = true;
                wn1.g gVar2 = new wn1.g();
                if (kn1.k.C(gVar2, bArr) == null) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    objArr5[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "finishReqNotify buf to BackupFinishRequest error, buflen[%d]", objArr5);
                }
                kn1.k.D(gVar2.f528963r);
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN, java.lang.Boolean.FALSE);
                sn1.i.Z();
                sn1.i.a0();
                qn1.t.f446538q = true;
                qn1.c.i().e().a(24, tVar4.f446549j.size(), tVar4.f446545f.size());
                tVar4.a(24);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.mo68477x336bdfd8(400L, 19L, 1L, false);
                boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                tVar4.f446552m = currentTimeMillis2;
                long j37 = (currentTimeMillis2 - tVar4.f446550k) / 1000;
                g0Var2.mo68477x336bdfd8(400L, 20L, j37, false);
                g0Var2.mo68477x336bdfd8(400L, 21L, tVar4.f446541b / 1024, false);
                tVar4.b(13737, 0);
                if (!tVar4.f446554o) {
                    tVar4.b(13737, 21);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "finishReqNotify recover success. hasEnterReconnect[%b], recoverCostTime[%d s], recoverStartTime[%d], recoverEndTime[%d], recoverTotalSize[%d kb]", java.lang.Boolean.valueOf(tVar4.f446554o), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(tVar4.f446550k), java.lang.Long.valueOf(tVar4.f446552m), java.lang.Long.valueOf(tVar4.f446541b / 1024));
                return;
            }
            return;
        }
        qn1.t tVar5 = oVar.f446531a;
        tVar5.getClass();
        wn1.x xVar = (wn1.x) kn1.k.C(new wn1.x(), bArr);
        if (xVar == null) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            boolean z38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr6[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "SendTagNotify PacketBackupDataTag parse failed:%d", objArr6);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify receive tagReq, MsgDataID:%s, BakChatName:%s, StartTime:%d, EndTime:%d,  NickName:%s, isCancel:%b", xVar.f529040g, xVar.f529037d, java.lang.Long.valueOf(xVar.f529038e), java.lang.Long.valueOf(xVar.f529039f), xVar.f529041h, java.lang.Boolean.valueOf(tVar5.f446544e));
        java.util.HashSet hashSet = tVar5.f446549j;
        hashSet.add(xVar.f529037d);
        if (tVar5.f446544e) {
            return;
        }
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN, java.lang.Boolean.TRUE);
        kn1.g e19 = qn1.c.i().e();
        kn1.g e27 = qn1.c.i().e();
        e19.getClass();
        boolean z39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        e27.a(e19.f391142a, hashSet.size() < tVar5.f446545f.size() ? hashSet.size() : tVar5.f446545f.size(), tVar5.f446545f.size());
        tVar5.a(e19.f391142a);
        if (c01.d9.b().h().y0(xVar.f529040g) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify the same tag has received, ignore. MsgDataID:%s", xVar.f529040g);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.n nVar = new com.p314xaae8f345.mm.p2621x8fb0427b.n();
            nVar.f68234xd5d4f07f = xVar.f529040g;
            nVar.f68235x6a658e7c = xVar.f529037d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]", java.lang.Boolean.valueOf(c01.d9.b().h().mo880xb970c2b9(nVar)), java.lang.Long.valueOf(nVar.f72763xa3c65b86));
            com.p314xaae8f345.mm.p2621x8fb0427b.p pVar = new com.p314xaae8f345.mm.p2621x8fb0427b.p();
            pVar.f68368x6a658e7c = xVar.f529037d;
            pVar.f68369x1bb3b54a = xVar.f529038e;
            pVar.f68367x14c61803 = xVar.f529039f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]", java.lang.Boolean.valueOf(c01.d9.b().i().mo880xb970c2b9(pVar)), java.lang.Long.valueOf(pVar.f72763xa3c65b86));
        }
        wn1.y yVar = new wn1.y();
        yVar.f529043d = xVar.f529037d;
        yVar.f529044e = xVar.f529038e;
        yVar.f529045f = xVar.f529039f;
        yVar.f529046g = xVar.f529040g;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "tagReqNotify send tag resp");
            sn1.i.S(yVar.mo14344x5f01b1f6(), 16, i17);
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcRecoverServer", e28, "tagReqNotify buf to PacketBackupDataTagResponse err.", new java.lang.Object[0]);
        }
    }
}
