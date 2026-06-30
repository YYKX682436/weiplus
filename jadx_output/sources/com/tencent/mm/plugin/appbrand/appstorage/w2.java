package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class w2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {
    public w2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        ik1.b0 b0Var = (ik1.b0) objArr[0];
        boolean m17 = r6Var.m();
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        if (!m17) {
            return j1Var;
        }
        if (!r6Var.A()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK;
        }
        try {
            b0Var.f291824a = com.tencent.mm.vfs.w6.C(r6Var);
            return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        } catch (java.io.FileNotFoundException unused) {
            return j1Var;
        }
    }
}
