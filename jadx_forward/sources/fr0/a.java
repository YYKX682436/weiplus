package fr0;

/* loaded from: classes12.dex */
public final class a extends lh.i {

    /* renamed from: a, reason: collision with root package name */
    public static final fr0.a f347221a = new fr0.a();

    @Override // lh.i, lh.j
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryResetAccMonitor", "#onFlushing: " + z17);
        cr0.u1 u1Var = cr0.u1.f303293a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BinderTracker", "#saveStats");
        cr0.u0 g17 = u1Var.g();
        if (g17.f303290a) {
            g17.c().m40834x32c52b(new cr0.s1(g17));
        }
        cr0.w3 w3Var = cr0.w3.f303333a;
        if (w3Var.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkTracker", "#saveStats");
            w3Var.a().m40834x32c52b(cr0.v3.f303316d);
        }
    }

    @Override // lh.i, lh.j
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryResetAccMonitor", "#onBatteryReset");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearTaskStats, size=");
        kh.p2 p2Var = kh.p2.f389418a;
        jz5.g gVar = kh.p2.f389420c;
        sb6.append(((java.util.List) gVar.mo141623x754a37bb()).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryResetAccMonitor", sb6.toString());
        for (kh.e2 e2Var : (java.util.List) gVar.mo141623x754a37bb()) {
            e2Var.d();
            e2Var.f();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long Ri = ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryResetAccMonitor", "marking new lastBatteryResetTimeStampMs: last=" + Ri + ", new=" + currentTimeMillis + ", delta=" + ((Ri > 0 ? currentTimeMillis - Ri : -1L) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) + "min");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("batt_last_charged_r2", currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryResetAccMonitor", "clear acc stats of mmkv");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("full-charge-proc-life-stats.bin").clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryResetAccMonitor", "clear acc stats of sp");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.Set<java.lang.String> stringSet = context.getSharedPreferences("acc-proc-life-stats.sp", 4).getStringSet("processList", kz5.r0.f395535d);
            if (stringSet != null) {
                java.util.Iterator<T> it = stringSet.iterator();
                while (it.hasNext()) {
                    context.getSharedPreferences("full-charge-proc-life-cpu-stats.sp." + ri.i.g((java.lang.String) it.next()), 4).edit().clear().commit();
                }
            }
        }
    }
}
