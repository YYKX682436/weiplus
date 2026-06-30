package sn1;

/* loaded from: classes12.dex */
public class m0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.o0 f491590d;

    public m0(sn1.o0 o0Var) {
        this.f491590d = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        sn1.o0 o0Var = this.f491590d;
        if (o0Var.f491597c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler stopped is true, index[%d]", java.lang.Integer.valueOf(sn1.o0.f491594f));
            o0Var.f491596b = 0;
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler start reconnect, index[%d]", java.lang.Integer.valueOf(sn1.o0.f491594f));
        if (sn1.o0.f491594f < o0Var.f491595a.length) {
            qn1.k kVar = (qn1.k) o0Var.f491598d;
            kVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "reconnectCallback callback to reconnect");
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (e17.f391142a != 5) {
                qn1.c.i().e().f391142a = 5;
                int i17 = qn1.c.i().j().f446494a;
                if (1 == i17 || 3 == i17) {
                    qn1.c.i().l().g(5);
                } else if (2 == i17 || 4 == i17) {
                    qn1.c.i().k().a(5);
                }
            }
            kVar.f446525a.e(9);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = o0Var.f491599e;
            long j17 = o0Var.f491595a[sn1.o0.f491594f];
            b4Var.c(j17, j17);
            sn1.o0.f491594f++;
        } else {
            o0Var.f491597c = true;
            o0Var.f491596b = 0;
            int i18 = ((qn1.k) o0Var.f491598d).f446525a.f446494a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "reconnectCallback reconnectFail, commandMode[%d]", java.lang.Integer.valueOf(i18));
            if (1 == i18 || 3 == i18) {
                qn1.c.i().l();
                qn1.c0.f446480n = true;
                qn1.c.i().l().d(true);
                qn1.c.i().h().e();
                qn1.c.i().e().f391142a = -4;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                qn1.c.i().l().g(-4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 9L, 1L, false);
                qn1.c.i().l().c(13737, 3);
            } else if (2 == i18 || 4 == i18) {
                qn1.c.i().k();
                qn1.t.f446538q = true;
                qn1.c.i().k().d(true, false, -4);
                qn1.c.i().h().e();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 17L, 1L, false);
                qn1.c.i().k().b(13737, 3);
            }
        }
        return false;
    }
}
