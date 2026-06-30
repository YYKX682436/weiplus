package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class a3 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.j3 f76139a;

    public a3(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        this.f76139a = j3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (r6Var.A() || !r6Var.m()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        if (r6Var.equals(this.f76139a.b())) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        }
        boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var2 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        if (booleanValue) {
            try {
                com.tencent.mm.plugin.appbrand.appstorage.l1.f(r6Var);
                return j1Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageNonFlattenedFileSystem", "rmdir recursive exp = %s", e17);
                return j1Var2;
            }
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G.length > 0) {
            int length = G.length;
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var3 = com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_DIR_NOT_EMPTY;
            if (length != 1 || !G[0].getName().equals(".nomedia")) {
                return j1Var3;
            }
            G[0].l();
        }
        return r6Var.l() ? j1Var : j1Var2;
    }
}
