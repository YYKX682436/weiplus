package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class x2 extends com.tencent.mm.plugin.appbrand.appstorage.i3 {
    public x2(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
        super(j3Var, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.i3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 b(com.tencent.mm.vfs.r6 r6Var) {
        return r6Var.m() ? com.tencent.mm.plugin.appbrand.appstorage.j1.OK : com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }
}
