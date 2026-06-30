package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class z2 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {
    public z2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        return r6Var.m() ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_ALREADY_EXISTS : (!((java.lang.Boolean) objArr[0]).booleanValue() ? r6Var.J() : r6Var.J()) ? com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
