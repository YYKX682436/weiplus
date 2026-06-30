package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.a2 f92567a = new com.tencent.mm.plugin.backup.roambackup.a2();

    public static void a(com.tencent.mm.plugin.backup.roambackup.a2 a2Var, com.tencent.mm.plugin.backup.roambackup.y1 pageAction, com.tencent.wechat.aff.affroam.g gVar, qo1.j0 j0Var, po1.d dVar, com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo, yz5.l lVar, int i17, java.lang.Object obj) {
        com.tencent.wechat.aff.affroam.g gVar2 = (i17 & 2) != 0 ? null : gVar;
        qo1.j0 j0Var2 = (i17 & 4) != 0 ? null : j0Var;
        po1.d dVar2 = (i17 & 8) != 0 ? null : dVar;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = (i17 & 16) != 0 ? null : backupRangeInfo;
        yz5.l lVar2 = (i17 & 32) == 0 ? lVar : null;
        a2Var.getClass();
        kotlin.jvm.internal.o.g(pageAction, "pageAction");
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.backup.roambackup.z1(pageAction, gVar2, j0Var2, dVar2, backupRangeInfo2, lVar2));
    }

    public static void b(com.tencent.mm.plugin.backup.roambackup.a2 a2Var, long j17, long j18, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            lVar = null;
        }
        a2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageId=" + j17 + ", actionId=" + j18);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = j17;
        roamBackupRecoverReport28098Struct.f60067e = j18;
        if (lVar != null) {
            lVar.invoke(roamBackupRecoverReport28098Struct);
        }
        roamBackupRecoverReport28098Struct.k();
    }
}
