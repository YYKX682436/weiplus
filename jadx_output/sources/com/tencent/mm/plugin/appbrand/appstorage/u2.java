package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class u2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.j3 f76327a;

    public u2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        this.f76327a = j3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        long c17;
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK;
        }
        if (r6Var.A() && r6Var.m()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_ALREADY_EXISTS;
        }
        long c18 = com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var);
        try {
            com.tencent.mm.vfs.r6 r6Var2 = (com.tencent.mm.vfs.r6) objArr[0];
            int vfsUnzip = com.tencent.mm.plugin.appbrand.appstorage.ZipJNI.vfsUnzip(r6Var2.o(), r6Var.o(), null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "unzip zipFile(%s) iRet(%d)", r6Var2.o(), java.lang.Integer.valueOf(vfsUnzip));
            if (vfsUnzip == 0) {
                com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = this.f76327a;
                com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var = j3Var.f76228g;
                if (x1Var != null) {
                    c17 = ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var).c(j3Var.f76225d, "");
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "unzipFile: AppBrandStorageSpaceMonitorService size=" + c17);
                    if (c17 == -1) {
                        c17 = this.f76327a.c();
                    }
                } else {
                    c17 = j3Var.c();
                }
                if (this.f76327a.f76227f > 0 && c17 > this.f76327a.f76227f) {
                    if (!b(r6Var2.o(), r6Var.o())) {
                        com.tencent.mm.plugin.appbrand.appstorage.l1.f(r6Var);
                    }
                    return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
                }
                com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
                com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var2 = this.f76327a.f76228g;
                if (x1Var2 != null) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var2).f(r6Var.o(), com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                }
                return j1Var;
            }
            if (vfsUnzip != -1) {
                if (vfsUnzip == 1) {
                    com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
                    com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var3 = this.f76327a.f76228g;
                    if (x1Var3 != null) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var3).f(r6Var.o(), com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                    }
                    return j1Var2;
                }
                if (vfsUnzip != 2) {
                    switch (vfsUnzip) {
                        case -106:
                            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var3 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_WRITE_ZIP_ENTRY;
                            com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var4 = this.f76327a.f76228g;
                            if (x1Var4 != null) {
                                ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var4).f(r6Var.o(), com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                            }
                            return j1Var3;
                        case -105:
                        case -104:
                        case -103:
                        case -102:
                            break;
                        default:
                            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var4 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
                            com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var5 = this.f76327a.f76228g;
                            if (x1Var5 != null) {
                                ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var5).f(r6Var.o(), com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                            }
                            return j1Var4;
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var5 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_BAD_ZIP_FILE;
            com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var6 = this.f76327a.f76228g;
            if (x1Var6 != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var6).f(r6Var.o(), com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
            }
            return j1Var5;
        } finally {
            com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var7 = this.f76327a.f76228g;
            if (x1Var7 != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var7).f(r6Var.o(), com.tencent.mm.plugin.appbrand.appstorage.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
            }
        }
    }

    public final boolean b(java.lang.String str, java.lang.String str2) {
        try {
            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(str);
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    java.lang.String name = entries.nextElement().getName();
                    if (!name.contains("../") && !name.contains("..\\")) {
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2, name);
                        if (r6Var.m()) {
                            r6Var.l();
                        }
                    }
                }
                zipFile.close();
                return true;
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageNonFlattenedFileSystem", e17, "undo unzip failed", new java.lang.Object[0]);
            return false;
        }
    }
}
