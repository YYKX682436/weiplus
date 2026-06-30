package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentMap f90402a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f90403b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f90404c;

    static {
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        java.lang.String str = D + "wxacache/";
        f90404c = str;
        com.tencent.mm.vfs.w6.u(str);
    }

    public static java.lang.String a(java.lang.String str) {
        return java.lang.String.format("%s%s", f90404c, !com.tencent.mm.sdk.platformtools.t8.K0(str) ? kk.k.g(str.getBytes()) : null);
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid target nil, no check");
            return true;
        }
        java.lang.String e17 = kk.k.e(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid file:%s target:%s", e17, str);
        return str.equals(e17);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.tencent.mm.plugin.appbrand.jsapi.l r8, java.lang.String r9, java.lang.String r10, com.tencent.mm.plugin.appbrand.utils.c0 r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.d0.c(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String, java.lang.String, com.tencent.mm.plugin.appbrand.utils.c0):void");
    }
}
