package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.c0 f174110d = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.c0();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "createFullDiffFile");
            long t17 = r0Var.t();
            if (t17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "createFullDiffFile, version < 0, return");
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174449c;
                if (!r6Var.m()) {
                    boolean J2 = r6Var.J();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "mkdir for " + r6Var + ", ret=" + J2);
                    if (!J2) {
                    }
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "full_diff_dir");
                if (t17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "createFullDiffFile, clear fullDiffDir");
                    if (r6Var2.m()) {
                        com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
                    }
                } else {
                    com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
                    com.p314xaae8f345.mm.vfs.w6.u(r6Var2.o());
                    com.p314xaae8f345.mm.vfs.w6.e(new com.p314xaae8f345.mm.vfs.r6(r6Var2, java.lang.String.valueOf(t17)).o());
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewRoamBackupManager", th6, "", new java.lang.Object[0]);
        }
    }
}
