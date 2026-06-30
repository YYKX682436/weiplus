package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class s2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.j3 f76320a;

    public s2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        this.f76320a = j3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        com.tencent.mm.vfs.r6 r6Var2 = (com.tencent.mm.vfs.r6) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        if (r6Var.y()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_ALREADY_EXISTS;
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK;
        }
        if (this.f76320a.f76227f > 0 && this.f76320a.c() + r6Var2.C() > this.f76320a.f76227f) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        if (!booleanValue) {
            return com.tencent.mm.sdk.platformtools.k1.a(r6Var2.o(), r6Var.o(), false) ? j1Var : j1Var2;
        }
        android.util.Pair a17 = com.tencent.mm.plugin.appbrand.appstorage.i1.a(r6Var2.o(), r6Var.o());
        if (((java.lang.Boolean) a17.first).booleanValue()) {
            return j1Var;
        }
        android.system.ErrnoException errnoException = (android.system.ErrnoException) a17.second;
        if (errnoException == null) {
            return j1Var2;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileMove", errnoException, "handleFileMoveErrnoException", new java.lang.Object[0]);
        return errnoException.errno == android.system.OsConstants.ENAMETOOLONG ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NAME_TOO_LONG : j1Var2;
    }
}
