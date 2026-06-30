package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.g2 f92613d = new com.tencent.mm.plugin.backup.roambackup.g2();

    public g2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList<com.tencent.wechat.aff.affroam.g> packages = (java.util.ArrayList) obj2;
        kotlin.jvm.internal.o.g(packages, "packages");
        if (intValue == 0) {
            java.lang.String d17 = oo1.o.f347151a.d();
            for (com.tencent.wechat.aff.affroam.g gVar : packages) {
                po1.a aVar = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR;
                com.tencent.wechat.aff.affroam.i iVar = gVar.f215834i;
                kotlin.jvm.internal.o.f(iVar, "getBackupRange(...)");
                com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo a17 = aVar.a(iVar);
                int ordinal = a17.f92730d.ordinal();
                int i17 = 2;
                int i18 = 1;
                int i19 = ordinal != 0 ? ordinal != 2 ? 3 : 2 : 1;
                int i27 = gVar.f215832g.f215988d;
                if (i27 == 4011) {
                    i17 = 1;
                } else if (i27 != 13001) {
                    i17 = 0;
                }
                if ((gVar.f215835m & 1) == 0) {
                    i18 = 0;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stock_backup_scan_reported", kz5.c1.k(new jz5.l("is_auto_backup", java.lang.Integer.valueOf(i18)), new jz5.l("scope_of_backup", java.lang.Integer.valueOf(i19)), new jz5.l("last_backup_ts", java.lang.Integer.valueOf(gVar.f215837o.f215839e)), new jz5.l("backup_to_device_id", gVar.f215832g.f215989e), new jz5.l("backup_package_device_type", java.lang.Integer.valueOf(i17)), new jz5.l("backup_source_device_id", d17), new jz5.l("backup_package_id", java.lang.Long.valueOf(gVar.f215829d)), new jz5.l("backup_chat_num", java.lang.Integer.valueOf(a17.f92732f.size()))), 34614);
            }
        }
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "reportPackageScanInfo count = " + packages.size() + " error = " + intValue);
        return jz5.f0.f302826a;
    }
}
