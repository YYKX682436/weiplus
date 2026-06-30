package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class g3 extends com.tencent.mm.plugin.appbrand.appstorage.i3 {
    public g3(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        super(j3Var, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.i3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 b(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var.y()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_IS_DIRECTORY;
        }
        if (!r6Var.m()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        int vfsUnlink = com.tencent.mm.plugin.appbrand.appstorage.FileUnlink.vfsUnlink(r6Var.u());
        if (vfsUnlink != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "unlink err %d, %s", java.lang.Integer.valueOf(vfsUnlink), r6Var.u());
        }
        return vfsUnlink == 0 ? com.tencent.mm.plugin.appbrand.appstorage.j1.OK : com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
    }
}
