package qn1;

/* loaded from: classes12.dex */
public class j implements sn1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.d f446524a;

    public j(qn1.d dVar) {
        this.f446524a = dVar;
    }

    @Override // sn1.r0
    public void a() {
        int i17 = qn1.c.i().j().f446494a;
        if (1 == i17 || 3 == i17) {
            qn1.c0 l17 = qn1.c.i().l();
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            l17.g(e17.f391142a);
            return;
        }
        if (2 == i17 || 4 == i17) {
            qn1.t k17 = qn1.c.i().k();
            kn1.g e18 = qn1.c.i().e();
            e18.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            k17.a(e18.f391142a);
        }
    }

    @Override // sn1.r0
    public void b(int i17) {
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i18 = e17.f391142a;
        qn1.d dVar = this.f446524a;
        if (i17 == 1) {
            int i19 = dVar.f446494a;
            if ((1 == i19 || 3 == i19) && i18 == 14) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
                qn1.c.i().e().f391142a = 4;
                qn1.c.i().l().g(4);
                return;
            } else {
                if ((2 == i19 || 4 == i19) && i18 == 23) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
                    qn1.c.i().e().f391142a = 4;
                    qn1.c.i().k().a(4);
                    return;
                }
                return;
            }
        }
        if (i17 == 0 && i18 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "speedCallback is normal speed now.");
            int i27 = dVar.f446494a;
            if (1 == i27 || 3 == i27) {
                qn1.c.i().e().f391142a = 14;
                qn1.c.i().l().g(14);
            } else if (2 == i27 || 4 == i27) {
                qn1.c.i().e().f391142a = 23;
                qn1.c.i().k().a(23);
            }
        }
    }

    @Override // sn1.r0
    public void c() {
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i17 = e17.f391142a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "speedOverTime callback, backupState[%d]", java.lang.Integer.valueOf(i17));
        int i18 = qn1.c.i().j().f446494a;
        if ((1 == i18 || 3 == i18) && (i17 == 14 || i17 == 4)) {
            qn1.c.i().h().e();
            qn1.c.i().l().d(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 9L, 1L, false);
            qn1.c.i().l().c(13737, 18);
            qn1.c.i().e().f391142a = -4;
            qn1.c.i().l().g(-4);
            return;
        }
        if (2 == i18 || 4 == i18) {
            if (i17 == 23 || i17 == 4) {
                qn1.c.i().h().e();
                qn1.c.i().k().d(true, false, -4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 17L, 1L, false);
                qn1.c.i().k().b(13737, 18);
            }
        }
    }
}
