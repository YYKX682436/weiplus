package qo1;

/* loaded from: classes5.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.v0 f447068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f447069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f447070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f447071g;

    public o0(qo1.v0 v0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, yz5.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f447068d = v0Var;
        this.f447069e = gVar;
        this.f447070f = aVar;
        this.f447071g = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        if (this.f447068d.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
            j17 = bm5.o1.f104252a.j(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20649x7d0b7077());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j17);
        } else {
            j17 = bm5.o1.f104252a.j(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20650x5f885026());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_msg_before_time is " + j17);
        }
        long j18 = this.f447069e.f297362d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupPackageHelper", "Post new task to ThreadPool");
        wu5.c s17 = ((ku5.t0) ku5.t0.f394148d).s(new go1.c(j18, j17 * 1000));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
        try {
            this.f447068d.f447025r = s17.get();
            this.f447068d.f447024q = this.f447070f;
            ku5.u0 u0Var = ku5.t0.f394148d;
            final qo1.v0 v0Var = this.f447068d;
            ((ku5.t0) u0Var).h(new java.lang.Runnable() { // from class: qo1.n0
                @Override // java.lang.Runnable
                public final void run() {
                    qo1.v0.this.i();
                }
            }, v0Var.f447089w);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "exception=" + e17 + ", try call calc directly");
            this.f447071g.f391649d = 104;
        }
    }
}
