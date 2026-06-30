package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class d3 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.j3 f76158a;

    public d3(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        this.f76158a = j3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        java.lang.Long l17;
        java.lang.Long l18;
        ik1.b0 b0Var = (ik1.b0) objArr[0];
        if (objArr.length >= 3) {
            l17 = (java.lang.Long) objArr[1];
            l18 = (java.lang.Long) objArr[2];
        } else {
            l17 = null;
            l18 = null;
        }
        if (!r6Var.m()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        if (!r6Var.A()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_PERMISSION_DENIED;
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (b0Var != null) {
            if (l17 == null || l18 == null) {
                b0Var.f291824a = com.tencent.mm.plugin.appbrand.appstorage.l1.d(r6Var, 0L, -1L);
            } else {
                if (l18.longValue() == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    l18 = java.lang.Long.valueOf(r6Var.C() - l17.longValue());
                }
                com.tencent.mm.plugin.appbrand.appstorage.j1 a17 = this.f76158a.a(l17.longValue(), l18.longValue(), r6Var.C());
                if (a17 != j1Var) {
                    return a17;
                }
                b0Var.f291824a = com.tencent.mm.plugin.appbrand.appstorage.l1.d(r6Var, l17.longValue(), l18.longValue());
            }
        }
        return j1Var;
    }
}
