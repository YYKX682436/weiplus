package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class u2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 f157860a;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var) {
        this.f157860a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        long c17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(r6Var)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_SYMLINK;
        }
        if (r6Var.A() && r6Var.m()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_ALREADY_EXISTS;
        }
        long c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var);
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = (com.p314xaae8f345.mm.vfs.r6) objArr[0];
            int m49652xbea53fe5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11708x9f8fd4e4.m49652xbea53fe5(r6Var2.o(), r6Var.o(), null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "unzip zipFile(%s) iRet(%d)", r6Var2.o(), java.lang.Integer.valueOf(m49652xbea53fe5));
            if (m49652xbea53fe5 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = this.f157860a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var = j3Var.f157761g;
                if (x1Var != null) {
                    c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var).c(j3Var.f157758d, "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "unzipFile: AppBrandStorageSpaceMonitorService size=" + c17);
                    if (c17 == -1) {
                        c17 = this.f157860a.c();
                    }
                } else {
                    c17 = j3Var.c();
                }
                if (this.f157860a.f157760f > 0 && c17 > this.f157860a.f157760f) {
                    if (!b(r6Var2.o(), r6Var.o())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.f(r6Var);
                    }
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var2 = this.f157860a.f157761g;
                if (x1Var2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var2).f(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                }
                return j1Var;
            }
            if (m49652xbea53fe5 != -1) {
                if (m49652xbea53fe5 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_PERMISSION_DENIED;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var3 = this.f157860a.f157761g;
                    if (x1Var3 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var3).f(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                    }
                    return j1Var2;
                }
                if (m49652xbea53fe5 != 2) {
                    switch (m49652xbea53fe5) {
                        case -106:
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_WRITE_ZIP_ENTRY;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var4 = this.f157860a.f157761g;
                            if (x1Var4 != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var4).f(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                            }
                            return j1Var3;
                        case -105:
                        case -104:
                        case -103:
                        case -102:
                            break;
                        default:
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var5 = this.f157860a.f157761g;
                            if (x1Var5 != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var5).f(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
                            }
                            return j1Var4;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_BAD_ZIP_FILE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var6 = this.f157860a.f157761g;
            if (x1Var6 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var6).f(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
            }
            return j1Var5;
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 x1Var7 = this.f157860a.f157761g;
            if (x1Var7 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) x1Var7).f(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(r6Var) - c18, "LuggageNonFlattenedFileSystem#unzipFile");
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
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2, name);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuggageNonFlattenedFileSystem", e17, "undo unzip failed", new java.lang.Object[0]);
            return false;
        }
    }
}
