package mn1;

/* loaded from: classes12.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f411408d;

    public p(mn1.e eVar) {
        this.f411408d = eVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        mn1.e eVar = this.f411408d;
        sn1.i.Q(3, eVar.f411370J);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "backupmove receive startrequest response.[%d,%d,%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "start request failed, errMsg:" + str);
            mn1.d.i().e().f391142a = -5;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            eVar.a(-5);
            kn1.q.a(kn1.m.f391169i, kn1.o.f391184g, "onSendStartRequestEnd: start request failed, errMsg:" + str);
            return;
        }
        sn1.t0 t0Var = (sn1.t0) m1Var;
        wn1.r rVar = t0Var.f491634v;
        if (!mn1.d.i().f391137b.equals(rVar.f528994d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "start response not the same id");
            mn1.d.i().e().f391142a = -5;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            eVar.a(-5);
            kn1.q.a(kn1.m.f391169i, kn1.o.f391184g, "onSendStartRequestEnd: wrong id");
            return;
        }
        mn1.d.i().e().f391150i = rVar.f528999i;
        wn1.r rVar2 = t0Var.f491634v;
        wn1.p pVar = rVar2.f529000m;
        eVar.B = pVar.f528979d;
        java.lang.String str2 = pVar.f528982g;
        if (str2.toLowerCase().contains("ios")) {
            eVar.C = 1;
        } else {
            eVar.C = 2;
        }
        java.lang.String lowerCase = str2.toLowerCase();
        if (lowerCase.contains("ios")) {
            kn1.n nVar = kn1.n.f391178g;
            kn1.p pVar2 = kn1.q.f391191a;
            kn1.q.f391192b = nVar;
        } else if (lowerCase.contains(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) {
            kn1.n nVar2 = kn1.n.f391177f;
            kn1.p pVar3 = kn1.q.f391191a;
            kn1.q.f391192b = nVar2;
        } else if (lowerCase.contains("ohos")) {
            kn1.n nVar3 = kn1.n.f391179h;
            kn1.p pVar4 = kn1.q.f391191a;
            kn1.q.f391192b = nVar3;
        } else {
            kn1.n nVar4 = kn1.n.f391176e;
            kn1.p pVar5 = kn1.q.f391191a;
            kn1.q.f391192b = nVar4;
        }
        eVar.f411375e = rVar2.f528996f;
        eVar.f411390t = rVar2.f528998h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "move recover backupMoveDevice[%d], totalCount[%d], totalSize[%d kb], and wait old mobile's pushData", java.lang.Integer.valueOf(eVar.C), java.lang.Long.valueOf(rVar2.f528995e), java.lang.Long.valueOf(rVar2.f528996f / 1024));
        if (eVar.f411392v && eVar.f411391u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            eVar.getClass();
            g0Var.mo68477x336bdfd8(485L, eVar.f411390t == 1 ? 66 : 65, 1L, false);
        }
        if (rVar2.f529001n == 3) {
            eVar.f411393w = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "isQuickBackup!!!");
        } else {
            eVar.f411393w = false;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
        gm0.j1.i();
        kn1.k.d(0L, c19769x48b92ec, c19769x48b92ec2, gm0.j1.u().d());
        long j17 = eVar.f411375e;
        long j18 = j17 + ((long) (((double) j17) * 0.1d <= 5.24288E8d ? j17 * 0.1d : 5.24288E8d));
        eVar.getClass();
        long j19 = c19769x48b92ec2.f38866x6ac9171;
        if (j19 >= j18) {
            eVar.f411387q = java.lang.System.currentTimeMillis();
            sn1.i.V();
            return;
        }
        kn1.q.b(kn1.m.f391169i, kn1.o.f391184g, "onSendStartRequestEnd: space not enough", 0L, 0L, eVar.f411375e, j19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d, dataSize:%d", java.lang.Long.valueOf(c19769x48b92ec2.f38866x6ac9171), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(eVar.f411375e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.d(11787, 5);
        mn1.d.i().h().e();
        mn1.d.i().e().f391142a = -13;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        eVar.a(-13);
        g0Var2.mo68477x336bdfd8(485L, 5L, 1L, false);
    }
}
