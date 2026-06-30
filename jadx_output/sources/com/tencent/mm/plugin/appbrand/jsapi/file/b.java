package com.tencent.mm.plugin.appbrand.jsapi.file;

@j95.b
/* loaded from: classes7.dex */
public final class b extends i95.w implements ft.x3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.tencent.mm.plugin.appbrand.appstorage.u1] */
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        k91.v5 k17;
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var;
        com.tencent.mm.vfs.r6 absoluteFile;
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject d17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.d(str, str2);
        if (d17 != null) {
            return d17.f76103e;
        }
        if (!(str == null || str.length() == 0)) {
            com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
            if (b17 != null) {
                com.tencent.mm.plugin.appbrand.jsapi.file.l2 fileSystem = b17.getFileSystem();
                kotlin.jvm.internal.o.e(fileSystem, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.file.AppBrandRuntimeFileSystemRegistry");
                j3Var = ((com.tencent.mm.plugin.appbrand.jsapi.file.f) fileSystem).a("wxfile://usr");
            } else if (com.tencent.mm.sdk.platformtools.x2.n() && (k17 = com.tencent.mm.plugin.appbrand.app.r9.ij().k1(str, "dynamicInfo")) != null) {
                long j17 = k17.v0().f305706a.f77421s;
                if (j17 <= 0) {
                    j17 = 10;
                }
                com.tencent.mm.plugin.appbrand.appstorage.j3 i17 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.i(gm0.j1.b().j(), str);
                i17.f76227f = j17;
                j3Var = i17;
            }
            if (j3Var == null && (absoluteFile = j3Var.getAbsoluteFile(str2)) != null) {
                return absoluteFile.o();
            }
        }
        j3Var = null;
        return j3Var == null ? null : null;
    }

    public java.lang.String wi(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, java.lang.String str2, boolean z17) {
        if ((str == null || str.length() == 0) || r6Var == null || !r6Var.A() || !r6Var.m()) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.b(str, r6Var.o(), str2, z17).f76102d;
    }
}
