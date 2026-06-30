package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class r2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {
    public r2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (!r6Var.y()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
        }
        com.tencent.mm.plugin.appbrand.appstorage.l1.g(r6Var, new com.tencent.mm.plugin.appbrand.appstorage.q2(this, java.util.regex.Pattern.quote(r6Var.o()), (java.util.List) objArr[0]));
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
