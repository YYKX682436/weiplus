package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class k1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.backup.roambackup.v1 v1Var = com.tencent.mm.plugin.backup.roambackup.v1.f92914a;
            com.tencent.wcdb.Cursor rawQuery = d95.f.t(com.tencent.mm.plugin.backup.roambackup.v1.f92920g, false).f227679b.rawQuery("SELECT package_id,package_name,attribute FROM roam_backup_package", null);
            while (rawQuery.moveToNext()) {
                long j17 = rawQuery.getLong(0);
                java.lang.String string = rawQuery.getString(1);
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "pkgId = " + j17 + ", pkgName = " + string + ", size = " + new com.tencent.wechat.aff.affroam.h().parseFrom(rawQuery.getBlob(2)).f215838d);
                } catch (com.google.protobuf.y6 e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "parse attribute error = " + e17.getMessage());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Shell", e18, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
