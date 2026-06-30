package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f174121d;

    public e2(java.util.ArrayList arrayList) {
        this.f174121d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initAutoBackupEvent start, allPackages.size = ");
        java.util.ArrayList arrayList = this.f174121d;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", sb6.toString());
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_check_interval, 900L);
        long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_interval, 86400L);
        long j17 = bm5.o1.f104252a.j(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20649x7d0b7077());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "auto backup config: checkInterval=" + Ui + ", interval=" + Ui2 + ", reserveTime=" + j17);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
            if (((gVar.f297368m & 1) != 0) && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(gVar.f297362d)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "setup auto backup event for package=" + gVar.f297362d);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e eVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e();
                eVar.f297351h = gVar.f297368m;
                eVar.f297349f = 60L;
                eVar.f297348e = Ui;
                eVar.f297347d = Ui2;
                eVar.f297350g = j17;
                b17.h(eVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "initAutoBackupEvent done");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174182f.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "register auto backup trigger listener");
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174183g, intentFilter);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174184h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174180d.set(false);
    }
}
