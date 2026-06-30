package com.tencent.mm.plugin.backup.roambackup;

@j95.b
/* loaded from: classes5.dex */
public final class t0 extends i95.w implements mv.x {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_unify_enable_new_roam_backup is " + j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigEnableRoamBackup()));
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        l2Var.a();
        l2Var.b();
        ((nv.v1) ((mv.a0) i95.n0.c(mv.a0.class))).Ni(new com.tencent.mm.plugin.backup.roambackup.s0(this));
    }
}
