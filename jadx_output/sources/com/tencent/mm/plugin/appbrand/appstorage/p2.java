package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class p2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {
    public p2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (!r6Var.m()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        int vfsStat = com.tencent.mm.plugin.appbrand.appstorage.FileStat.vfsStat(r6Var.u(), (com.tencent.mm.plugin.appbrand.appstorage.FileStructStat) objArr[0]);
        if (vfsStat != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "stat err %d, %s", java.lang.Integer.valueOf(vfsStat), r6Var.u());
        }
        return vfsStat == 0 ? com.tencent.mm.plugin.appbrand.appstorage.j1.OK : com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
    }
}
