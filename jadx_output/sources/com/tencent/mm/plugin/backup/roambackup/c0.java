package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.c0 f92577d = new com.tencent.mm.plugin.backup.roambackup.c0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "createFullDiffFile");
            long t17 = r0Var.t();
            if (t17 < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "createFullDiffFile, version < 0, return");
            } else {
                com.tencent.mm.vfs.r6 r6Var = com.tencent.mm.plugin.backup.roambackup.v1.f92916c;
                if (!r6Var.m()) {
                    boolean J2 = r6Var.J();
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "mkdir for " + r6Var + ", ret=" + J2);
                    if (!J2) {
                    }
                }
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "full_diff_dir");
                if (t17 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "createFullDiffFile, clear fullDiffDir");
                    if (r6Var2.m()) {
                        com.tencent.mm.vfs.w6.g(r6Var2.o(), true);
                    }
                } else {
                    com.tencent.mm.vfs.w6.g(r6Var2.o(), true);
                    com.tencent.mm.vfs.w6.u(r6Var2.o());
                    com.tencent.mm.vfs.w6.e(new com.tencent.mm.vfs.r6(r6Var2, java.lang.String.valueOf(t17)).o());
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewRoamBackupManager", th6, "", new java.lang.Object[0]);
        }
    }
}
