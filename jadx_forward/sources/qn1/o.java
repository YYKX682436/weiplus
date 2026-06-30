package qn1;

/* loaded from: classes12.dex */
public class o implements sn1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.t f446531a;

    public o(qn1.t tVar) {
        this.f446531a = tVar;
    }

    @Override // sn1.h
    public void b(boolean z17, int i17, byte[] bArr, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify isLocal[%b], type[%d], seq[%d], buflen[%d]", objArr);
        qn1.t tVar = this.f446531a;
        if (z17 && 10011 == i17) {
            tVar.getClass();
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            int i19 = e17.f391142a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify local disconnect, backupPcState[%d], isRecoverFinish[%b]", java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(qn1.t.f446538q));
            if (i19 != -21 && i19 != -13) {
                if (i19 != 1) {
                    if (i19 != 4) {
                        if (i19 == 27) {
                            qn1.c.i().h().e();
                            if (qn1.c.i().j().g()) {
                                return;
                            }
                            qn1.c.i().e().f391142a = -100;
                            tVar.a(-100);
                            return;
                        }
                        if (i19 != -5) {
                            if (i19 == -4) {
                                tVar.d(true, false, 0);
                                return;
                            }
                            switch (i19) {
                                case 21:
                                    break;
                                case 22:
                                case 23:
                                    break;
                                default:
                                    return;
                            }
                        }
                    }
                    if (!qn1.c.i().j().f446505l || qn1.t.f446538q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify not support reconnect, disconnect");
                        tVar.d(true, false, -4);
                        qn1.c.i().h().e();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 17L, 1L, false);
                        tVar.b(13737, 3);
                        return;
                    }
                    sn1.o0 o0Var = sn1.i.f491554r;
                    int i27 = o0Var != null ? o0Var.f491596b : 0;
                    if (i27 != 0) {
                        if (i27 == 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify already start reconnect, state[%d]", java.lang.Integer.valueOf(i27));
                            return;
                        } else if (i27 != 2) {
                            return;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify startBackupReconnectHandler, reconnectState[%d]", java.lang.Integer.valueOf(i27));
                    tVar.b(13737, 19);
                    tVar.f446554o = true;
                    sn1.i.U(qn1.c.i().j().f446512s);
                    return;
                }
                qn1.c.i().h().e();
                qn1.c.i().e().f391142a = -100;
                tVar.a(-100);
                return;
            }
            qn1.c.i().h().e();
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive cancelReq.");
            tVar.d(true, false, -100);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 52L, 1L, false);
            tVar.b(13737, 5);
            return;
        }
        int i28 = qn1.c.i().j().f446494a;
        if (2 != i28 && 4 != i28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify cmdmode error[%d]", java.lang.Integer.valueOf(qn1.c.i().j().f446494a));
            return;
        }
        if (i17 == 10) {
            wn1.i iVar = (wn1.i) kn1.k.C(new wn1.i(), bArr);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Long.valueOf(iVar != null ? iVar.f528965d : -1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive heartbeatResp, ack[%d]", objArr2);
            return;
        }
        if (i17 == 18) {
            wn1.f fVar = new wn1.f();
            try {
                fVar.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcRecoverServer", e18, "onBackupPcRecoverServerNotify buf to BackupCommandResponse error.", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandResp, cmd[%d]", java.lang.Integer.valueOf(fVar.f528950d));
            if (fVar.f528950d == 9) {
                sn1.o0 o0Var2 = sn1.i.f491554r;
                int i29 = o0Var2 == null ? 0 : o0Var2.f491596b;
                if (i29 != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify reconnect is started, ignore. state[%d]", java.lang.Integer.valueOf(i29));
                    return;
                }
                if (o0Var2 != null) {
                    o0Var2.f491596b = 2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify reconnect success");
                tVar.b(13737, 20);
                sn1.i.Y();
                qn1.c.i().e().f391142a = 23;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                tVar.a(23);
                sn1.o0 o0Var3 = sn1.i.f491554r;
                if (o0Var3 != null) {
                    o0Var3.f491596b = 0;
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 17) {
            gm0.j1.e().j(new qn1.n(this, i17, bArr, i18));
            return;
        }
        wn1.e eVar = new wn1.e();
        try {
            eVar.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcRecoverServer", e19, "onBackupPcRecoverServerNotify buf to BackupCommandRequest error.", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandReq, cmd[%d]", java.lang.Integer.valueOf(eVar.f528948d));
        if (eVar.f528948d == 10) {
            kn1.g e27 = qn1.c.i().e();
            e27.getClass();
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            int i37 = e27.f391142a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify pc request disconnect, backupPcState[%d]", java.lang.Integer.valueOf(i37));
            if (i37 == 22 || i37 == 23) {
                tVar.d(true, false, -4);
                qn1.c.i().h().e();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(400L, 52L, 1L, false);
                tVar.b(13737, 5);
                long j17 = tVar.f446550k;
                long currentTimeMillis = j17 != 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
                g0Var.d(13737, 3, java.lang.Long.valueOf(tVar.f446541b), java.lang.Long.valueOf(currentTimeMillis), 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", java.lang.Long.valueOf(tVar.f446541b), java.lang.Long.valueOf(currentTimeMillis));
            }
        }
    }
}
