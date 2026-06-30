package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class f3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 f157712a;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var) {
        this.f157712a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.a(r6Var)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_SYMLINK;
        }
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        boolean z17 = inputStream instanceof java.util.zip.ZipInputStream;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
        if (z17) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.j((java.util.zip.ZipInputStream) inputStream, r6Var.o()) != 0) {
                return j1Var3;
            }
            if (this.f157712a.f157760f <= 0 || this.f157712a.c() <= this.f157712a.f157760f) {
                return j1Var2;
            }
            r6Var.l();
            return j1Var;
        }
        if (r6Var.y()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_ALREADY_EXISTS;
        }
        if (this.f157712a.f157760f > 0) {
            try {
                if (this.f157712a.c() + inputStream.available() > this.f157712a.f157760f) {
                    return j1Var;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "writeFile, access available e=%s", e17);
                return j1Var3;
            }
        }
        if (!r6Var.m() && booleanValue) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        java.io.OutputStream outputStream = null;
        try {
            outputStream = com.p314xaae8f345.mm.vfs.w6.K(r6Var.o(), booleanValue);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read == -1) {
                    outputStream.flush();
                    return j1Var2;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "writeFile exp %s", e18);
            return j1Var3;
        } finally {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
        }
    }
}
