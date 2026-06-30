package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class e3 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {
    public e3(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        long j17;
        java.lang.String str;
        long j18;
        ik1.b0 b0Var = (ik1.b0) objArr[0];
        if (objArr.length >= 4) {
            java.lang.String str2 = (java.lang.String) objArr[1];
            long longValue = ((java.lang.Long) objArr[2]).longValue();
            j17 = ((java.lang.Long) objArr[3]).longValue();
            j18 = longValue;
            str = str2;
        } else {
            j17 = Long.MAX_VALUE;
            str = null;
            j18 = 0;
        }
        return !r6Var.m() ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : !r6Var.A() ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED : com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var) ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK : b0Var != null ? com.tencent.mm.plugin.appbrand.appstorage.l1.e(r6Var.o(), b0Var, str, j18, j17) : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
