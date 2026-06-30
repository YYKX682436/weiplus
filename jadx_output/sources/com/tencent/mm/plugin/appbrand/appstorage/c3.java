package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class c3 implements com.tencent.mm.plugin.appbrand.appstorage.h3 {
    public c3(com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.h3
    public com.tencent.mm.plugin.appbrand.appstorage.j1 a(com.tencent.mm.vfs.r6 r6Var, java.lang.Object... objArr) {
        if (!r6Var.y()) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_IS_FILE;
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.l1.a(r6Var)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_SYMLINK;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r6Var.H(new com.tencent.mm.plugin.appbrand.appstorage.b3(this, java.util.regex.Pattern.quote(r6Var.o()), linkedList));
        ((ik1.b0) objArr[0]).f291824a = linkedList;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
