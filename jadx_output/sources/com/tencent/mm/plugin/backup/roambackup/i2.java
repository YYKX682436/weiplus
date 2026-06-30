package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes11.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.i2 f92621d = new com.tencent.mm.plugin.backup.roambackup.i2();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "call dart service");
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi();
        if (Bi != null) {
            Bi.flutterBackupInitModel(com.tencent.mm.plugin.backup.roambackup.h2.f92618d);
        }
    }
}
