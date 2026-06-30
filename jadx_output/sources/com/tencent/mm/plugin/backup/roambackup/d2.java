package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class d2 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "Notify affroam app enter foreground");
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().b(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.atomic.AtomicLong atomicLong = com.tencent.mm.plugin.backup.roambackup.l2.f92648e;
        long j17 = atomicLong.get();
        long j18 = currentTimeMillis - j17;
        if (j18 < 600000) {
            com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "Skip frequent foreground trigger, interval: " + j18 + "ms");
            return;
        }
        if (atomicLong.compareAndSet(j17, currentTimeMillis)) {
            ((ku5.t0) ku5.t0.f312615d).q(com.tencent.mm.plugin.backup.roambackup.c2.f92579d);
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "Notify affroam app exit foreground");
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().b(false);
    }
}
