package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class f3 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.j3 f76179a;

    public f3(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        this.f76179a = j3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK;
        }
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        boolean z17 = inputStream instanceof java.util.zip.ZipInputStream;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var3 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        if (z17) {
            if (com.tencent.mm.plugin.appbrand.appstorage.l1.j((java.util.zip.ZipInputStream) inputStream, r6Var.o()) != 0) {
                return j1Var3;
            }
            if (this.f76179a.f76227f <= 0 || this.f76179a.c() <= this.f76179a.f76227f) {
                return j1Var2;
            }
            r6Var.l();
            return j1Var;
        }
        if (r6Var.y()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_ALREADY_EXISTS;
        }
        if (this.f76179a.f76227f > 0) {
            try {
                if (this.f76179a.c() + inputStream.available() > this.f76179a.f76227f) {
                    return j1Var;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "writeFile, access available e=%s", e17);
                return j1Var3;
            }
        }
        if (!r6Var.m() && booleanValue) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        java.io.OutputStream outputStream = null;
        try {
            outputStream = com.tencent.mm.vfs.w6.K(r6Var.o(), booleanValue);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageNonFlattenedFileSystem", "writeFile exp %s", e18);
            return j1Var3;
        } finally {
            com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
        }
    }
}
