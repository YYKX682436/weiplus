package qn1;

/* loaded from: classes12.dex */
public class v implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f446557d;

    public v(qn1.c0 c0Var) {
        this.f446557d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qn1.c0 c0Var = this.f446557d;
        sn1.i.Q(11, c0Var.f446490i);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcServer", "requestSessionSceneEnd sessionName or timeInterval null or request session resp number error, errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 119L, 1L, false);
            c0Var.d(false);
            qn1.c.i().e().f391142a = -5;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c0Var.g(-5);
            return;
        }
        wn1.m mVar = ((sn1.p0) m1Var).f491606v;
        java.util.LinkedList q17 = kn1.k.q(mVar.f528972d, mVar.f528973e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "requestSessionSceneEnd receive requestsessionResp, backupSessionList size[%d], sIsMigrate = %b", java.lang.Integer.valueOf(q17.size()), java.lang.Boolean.valueOf(qn1.c0.f446481o));
        ln1.s sVar = c0Var.f446484c;
        int i19 = qn1.c.i().j().f446507n;
        boolean z18 = qn1.c0.f446478l;
        boolean z19 = qn1.c0.f446481o;
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPackAndSend", "startBackup, backupSessionList size[%d], isOnlyText[%b], isPcMigrate[%b]", java.lang.Integer.valueOf(q17.size()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        sVar.f401337e = z19;
        if (sVar.f401338f == 1 && ln1.s.f401331s == 0) {
            ln1.s.f401331s = java.lang.System.currentTimeMillis();
        }
        on1.b.f428337c = z19;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sn1.i.f491552p.a();
        ((ku5.t0) ku5.t0.f394148d).q(new ln1.t(sVar, q17, z18, currentTimeMillis));
    }
}
