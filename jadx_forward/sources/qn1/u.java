package qn1;

/* loaded from: classes12.dex */
public class u implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f446556d;

    public u(qn1.c0 c0Var) {
        this.f446556d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qn1.c0 c0Var = this.f446556d;
        sn1.i.Q(3, c0Var.f446489h);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp failed, errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 117L, 1L, false);
            qn1.c.i().e().f391142a = -5;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c0Var.g(-5);
            return;
        }
        sn1.i.f491552p.f491625i = qn1.c.i().m().f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp success, errMsg[%s]", str);
        wn1.r rVar = ((sn1.t0) m1Var).f491634v;
        if (!qn1.c.i().f391137b.equals(rVar.f528994d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp not the same id");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 118L, 1L, false);
            qn1.c.i().e().f391142a = -5;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c0Var.g(-5);
            return;
        }
        kn1.g e17 = qn1.c.i().e();
        long j17 = rVar.f528999i;
        e17.f391150i = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp BigDataSize[%d]", java.lang.Long.valueOf(j17));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, java.lang.Boolean.FALSE);
        sn1.i.V();
        sn1.i.I(11, c0Var.f446490i);
        sn1.p0 p0Var = new sn1.p0(c0Var.f446482a, c0Var.f446487f, c0Var.f446488g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "backupPcSendRequestSession, chooseConvNames size[%d]", java.lang.Integer.valueOf(c0Var.f446482a.size()));
        p0Var.K();
    }
}
