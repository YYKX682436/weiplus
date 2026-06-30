package ho1;

/* loaded from: classes5.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f364236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364238f;

    public h1(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, ho1.q1 q1Var, long j17) {
        this.f364236d = gVar;
        this.f364237e = q1Var;
        this.f364238f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        xn1.k kVar = new xn1.k();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f364236d;
        if ((gVar.f297368m & 1) != 0) {
            j17 = bm5.o1.f104252a.j(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20649x7d0b7077());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j17);
        } else {
            j17 = bm5.o1.f104252a.j(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20650x5f885026());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_msg_before_time is " + j17);
        }
        long j18 = j17 * 1000;
        po1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = gVar.f297367i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "getBackupRange(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 a17 = aVar.a(iVar);
        long c17 = c01.id.c();
        long j19 = a17.f174267h;
        java.util.ArrayList arrayList = (java.util.ArrayList) p3325xe03a0797.p3326xc267989b.l.f(null, new ho1.g1(a17, j19 <= 0 ? c17 - j18 : java.lang.Math.min(c17 - j18, j19), this.f364236d, kVar, null), 1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "rangeList size = " + arrayList.size() + ", timeInfo=" + kVar);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = this.f364237e.f364320a;
        if (g0Var != null) {
            g0Var.M(this.f364238f, arrayList);
        }
    }
}
