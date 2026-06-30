package mn1;

/* loaded from: classes12.dex */
public class o implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f411407d;

    public o(mn1.e eVar) {
        this.f411407d = eVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        mn1.e.O = true;
        kn1.m mVar = kn1.m.f391167g;
        kn1.o oVar = kn1.o.f391183f;
        kn1.q.a(mVar, oVar, "connect success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(485L, 42L, 1L, false);
        g0Var.d(11787, 0);
        sn1.i.Q(1, this.f411407d.I);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth failed");
            kn1.q.a(kn1.m.f391168h, kn1.o.f391184g, "OnHandShake: auth failed");
            mn1.d.i().e().f391142a = -5;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f411407d.a(-5);
            this.f411407d.e(11789, 3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth success");
        sn1.a aVar = (sn1.a) m1Var;
        int i19 = aVar.f491500v.f529020h;
        if (i19 < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start old move, version:%d", java.lang.Integer.valueOf(i19));
            g0Var.mo68477x336bdfd8(485L, 104L, 1L, false);
            mn1.d.i().e().f391142a = -12;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f411407d.a(-12);
            kn1.q.a(kn1.m.f391168h, kn1.o.f391184g, "OnHandShake: version conflict");
            return;
        }
        kn1.q.f391194d = i19;
        kn1.q.a(kn1.m.f391168h, oVar, "OnHandshake success");
        wn1.u uVar = aVar.f491500v;
        int i27 = uVar.f529021i;
        this.f411407d.f411391u = (uVar.f529022m & 1) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start new move, version:%d, type:%d, isServerSupportKv:%b", java.lang.Integer.valueOf(uVar.f529020h), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(this.f411407d.f411391u));
        if (i27 != 1) {
            if (this.f411407d.i()) {
                this.f411407d.f411396z = 3;
            } else {
                this.f411407d.f411396z = 1;
            }
            this.f411407d.f411394x = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
            ((ku5.t0) ku5.t0.f394148d).g(new mn1.n(this));
            return;
        }
        if (!this.f411407d.i()) {
            this.f411407d.f411394x = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
            this.f411407d.f411396z = 2;
            ((ku5.t0) ku5.t0.f394148d).g(new mn1.m(this));
            return;
        }
        this.f411407d.f411394x = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Resume Move!!!.");
        mn1.e eVar = this.f411407d;
        eVar.f411396z = 4;
        mn1.e.d(eVar);
    }
}
