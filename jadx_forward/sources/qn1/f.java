package qn1;

/* loaded from: classes12.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.d f446518d;

    public f(qn1.d dVar) {
        this.f446518d = dVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBackupAuthEnd onSceneEnd, isNewBackup = ");
        qn1.d dVar = this.f446518d;
        sb6.append(dVar.f446508o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", sb6.toString());
        if (dVar.f446508o) {
            xn1.b.f536987a.b(0, 0, "", 0L, 0L, 0);
        }
        dVar.f446501h = true;
        xn1.c.b("Status", 0);
        dVar.f446503j.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(13736, 0, dVar.f446495b, kn1.k.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), 0, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
        sn1.i.Q(1, dVar.f446509p);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth failed, errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (i18 == -3) {
                g0Var.mo68477x336bdfd8(400L, 115L, 1L, false);
            } else if (i18 != -1) {
                g0Var.mo68477x336bdfd8(400L, 116L, 1L, false);
            } else {
                g0Var.mo68477x336bdfd8(400L, 114L, 1L, false);
            }
            g0Var.d(13737, 1, 0, 0, 0, java.lang.Integer.valueOf(dVar.f446507n));
            qn1.c.i().e().f391142a = -5;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            qn1.c.i().l().g(-5);
            return;
        }
        sn1.a aVar = (sn1.a) m1Var;
        int i19 = aVar.f491500v.f529022m;
        boolean z18 = (i19 & 2) != 0;
        boolean z19 = (i19 & 4) != 0;
        boolean z27 = (i19 & 8) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth success, pcSupportTimeSelect[%b], pcSupportQuickBackup[%b], pcSupportReconnect[%b]", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        if (z27) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = aVar.f491500v.f529023n;
            if (gVar == null) {
                gVar = null;
            }
            if (gVar != null) {
                dVar.f446505l = false;
                dVar.f446506m = gVar;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd pcSupportReconnect but token is null!");
                dVar.f446505l = false;
                dVar.f446506m = null;
            }
        } else {
            dVar.f446505l = false;
            dVar.f446506m = null;
        }
        qn1.c.i().l().getClass();
        qn1.c.i().l().getClass();
    }
}
