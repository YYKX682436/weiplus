package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.b4 f90390a = new com.tencent.mm.plugin.appbrand.utils.b4();

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(ze.n r43, k01.l r44) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.b4.b(ze.n, k01.l):java.lang.String");
    }

    public final com.tencent.mm.plugin.appbrand.utils.a4 a(ze.n nVar, java.lang.String str, java.lang.String str2) {
        if (r26.i0.y(str, "http://", false) || r26.i0.y(str, "https://", false)) {
            return null;
        }
        java.lang.String d17 = (r26.i0.y(str2, "image", false) || r26.i0.y(str2, "video", false)) ? "" : s46.c.d(str);
        java.lang.String c17 = s46.c.c(str);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            return null;
        }
        int C = (int) r6Var.C();
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = nVar.getFileSystem().createTempFileFrom(r6Var, c17, false, b0Var);
        kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
        if (com.tencent.mm.plugin.appbrand.appstorage.j1.OK != createTempFileFrom) {
            return null;
        }
        java.lang.Object value = b0Var.f291824a;
        kotlin.jvm.internal.o.f(value, "value");
        kotlin.jvm.internal.o.d(d17);
        return new com.tencent.mm.plugin.appbrand.utils.a4((java.lang.String) value, d17, C);
    }
}
