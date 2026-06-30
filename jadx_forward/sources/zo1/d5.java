package zo1;

/* loaded from: classes5.dex */
public final class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f556118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f556119f;

    public d5(long j17, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar) {
        this.f556117d = j17;
        this.f556118e = i17;
        this.f556119f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        long j17 = this.f556117d;
        int i17 = this.f556118e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(j17);
        if (b17 != null) {
            long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_check_interval, 900L);
            long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_interval, 86400L);
            long j18 = bm5.o1.f104252a.j(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20649x7d0b7077());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "setup auto backup event: checkInterval=" + Ui + ", interval=" + Ui2 + ", reserveTime=" + j18 + ", pkgId=" + j17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e eVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e();
            eVar.f297351h = i17;
            eVar.f297349f = 60L;
            eVar.f297348e = Ui;
            eVar.f297347d = Ui2;
            eVar.f297350g = j18;
            b17.h(eVar);
        }
        qo1.j1 j1Var = qo1.j1.f447056a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo = this.f556119f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        synchronized (j1Var.c()) {
            long j19 = pkgInfo.f297362d;
            qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j19));
            if ((j0Var instanceof qo1.f0) && ((qo1.f0) j0Var).b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TaskManager", "There is a running task=" + ((qo1.f0) j0Var).hashCode() + " for pkgId=" + j19);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskManager", "Ready remove and start new task, pkgId=" + j19);
                j1Var.c().put(java.lang.Long.valueOf(j19), new qo1.g0(j19));
                j1Var.g(pkgInfo);
                qo1.d1 d1Var = qo1.d1.f446996d;
            }
        }
    }
}
