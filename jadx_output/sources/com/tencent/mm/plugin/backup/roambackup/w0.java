package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.w0 f92922d = new com.tencent.mm.plugin.backup.roambackup.w0();

    public w0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigEnableRoamBackup());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_unify_enable_new_roam_backup is " + c17);
        return java.lang.Boolean.valueOf(c17 == 1);
    }
}
