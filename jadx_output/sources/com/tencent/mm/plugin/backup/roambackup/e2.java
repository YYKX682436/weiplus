package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92588d;

    public e2(java.util.ArrayList arrayList) {
        this.f92588d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.h1 b17;
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initAutoBackupEvent start, allPackages.size = ");
        java.util.ArrayList arrayList = this.f92588d;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", sb6.toString());
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_check_interval, 900L);
        long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_interval, 86400L);
        long j17 = bm5.o1.f22719a.j(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamAutoBackupMsgBeforeTime());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j17);
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "auto backup config: checkInterval=" + Ui + ", interval=" + Ui2 + ", reserveTime=" + j17);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) it.next();
            kotlin.jvm.internal.o.g(gVar, "<this>");
            if (((gVar.f215835m & 1) != 0) && (b17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.b(gVar.f215829d)) != null) {
                com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "setup auto backup event for package=" + gVar.f215829d);
                com.tencent.wechat.aff.affroam.e eVar = new com.tencent.wechat.aff.affroam.e();
                eVar.f215818h = gVar.f215835m;
                eVar.f215816f = 60L;
                eVar.f215815e = Ui;
                eVar.f215814d = Ui2;
                eVar.f215817g = j17;
                b17.h(eVar);
            }
        }
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "initAutoBackupEvent done");
        if (com.tencent.mm.plugin.backup.roambackup.l2.f92649f.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "register auto backup trigger listener");
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.plugin.backup.roambackup.l2.f92650g, intentFilter);
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(com.tencent.mm.plugin.backup.roambackup.l2.f92651h);
        }
        com.tencent.mm.plugin.backup.roambackup.l2.f92647d.set(false);
    }
}
