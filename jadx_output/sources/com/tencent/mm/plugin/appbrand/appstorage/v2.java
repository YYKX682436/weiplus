package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class v2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f76328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f76329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76330c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.j3 f76331d;

    public v2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var, com.tencent.mm.vfs.r6 r6Var, ik1.b0 b0Var, java.lang.String str) {
        this.f76331d = j3Var;
        this.f76328a = r6Var;
        this.f76329b = b0Var;
        this.f76330c = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        long C = r6Var.C();
        long C2 = this.f76328a.C();
        r6Var.l();
        android.util.Pair a17 = com.tencent.mm.plugin.appbrand.appstorage.i1.a(this.f76328a.o(), r6Var.o());
        if (!((java.lang.Boolean) a17.first).booleanValue()) {
            android.system.ErrnoException errnoException = (android.system.ErrnoException) a17.second;
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
            if (errnoException == null) {
                return j1Var;
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileMove", errnoException, "handleFileMoveErrnoException", new java.lang.Object[0]);
            return errnoException.errno == android.system.OsConstants.ENAMETOOLONG ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NAME_TOO_LONG : j1Var;
        }
        ik1.b0 b0Var = this.f76329b;
        if (b0Var != null) {
            b0Var.f291824a = this.f76330c;
        }
        com.tencent.mm.plugin.appbrand.appstorage.x1 x1Var = this.f76331d.f76228g;
        if (x1Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) x1Var).g(this.f76328a.u(), this.f76328a.C() - C2, "LuggageNonFlattenedFileSystem#saveFile");
            ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) this.f76331d.f76228g).g(r6Var.u(), r6Var.C() - C, "LuggageNonFlattenedFileSystem#saveFile");
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
