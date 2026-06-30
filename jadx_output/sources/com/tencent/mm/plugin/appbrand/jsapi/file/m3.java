package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class m3 implements com.tencent.mm.plugin.appbrand.appstorage.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.n1 f81098a;

    public m3(com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var) {
        this.f81098a = n1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.k1
    public boolean accept(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = this.f81098a;
        n1Var.getClass();
        return n1Var.f76278g.h(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path)), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.k1
    public java.lang.String key() {
        return "saved_temp";
    }
}
