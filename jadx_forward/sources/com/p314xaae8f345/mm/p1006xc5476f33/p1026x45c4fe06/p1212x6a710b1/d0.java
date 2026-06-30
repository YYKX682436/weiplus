package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentMap f171935a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f171936b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f171937c;

    static {
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        java.lang.String str = D + "wxacache/";
        f171937c = str;
        com.p314xaae8f345.mm.vfs.w6.u(str);
    }

    public static java.lang.String a(java.lang.String str) {
        return java.lang.String.format("%s%s", f171937c, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? kk.k.g(str.getBytes()) : null);
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid target nil, no check");
            return true;
        }
        java.lang.String e17 = kk.k.e(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid file:%s target:%s", e17, str);
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
    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r8, java.lang.String r9, java.lang.String r10, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String, java.lang.String, com.tencent.mm.plugin.appbrand.utils.c0):void");
    }
}
