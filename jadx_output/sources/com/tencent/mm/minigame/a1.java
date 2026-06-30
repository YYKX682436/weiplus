package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class a1 implements com.tencent.shadow.core.common.IWVAHostPathDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.a1 f68997a = new com.tencent.mm.minigame.a1();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.service.c0 f68998b;

    @Override // com.tencent.shadow.core.common.IWVAHostPathDelegate
    public java.lang.String convertToHostPath(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (path.length() == 0) {
            return "";
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = f68998b;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("service");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = c0Var.getFileSystem();
        kotlin.jvm.internal.o.d(fileSystem);
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = fileSystem.createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path)), null, false, b0Var);
        kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
        if (createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            java.lang.Object value = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            return (java.lang.String) value;
        }
        com.tencent.mars.xlog.Log.e("WVA.WVAHostPathDelegate", "convertToHostPath failed, opRet=" + createTempFileFrom);
        return "";
    }
}
