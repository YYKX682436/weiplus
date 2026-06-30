package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.i4 f84656a = new com.tencent.mm.plugin.appbrand.launching.i4();

    public static final java.lang.String c(com.tencent.mm.plugin.appbrand.appcache.a6 a6Var, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.appcache.b4 b4Var, java.lang.String str) {
        java.lang.String f17 = com.tencent.mm.plugin.appbrand.appcache.e9.f(a6Var.toString(), ((com.tencent.mm.plugin.appbrand.launching.v6) o6Var.f84855h).f85263a);
        com.tencent.mm.vfs.w6.c(str, f17);
        ((com.tencent.mm.plugin.appbrand.appcache.qa) b4Var).F(a6Var.toString(), o6Var.f84854g, ((com.tencent.mm.plugin.appbrand.launching.v6) o6Var.f84855h).f85263a, f17);
        kotlin.jvm.internal.o.d(f17);
        return f17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.plugin.appbrand.launching.p6 a(com.tencent.mm.plugin.appbrand.launching.o6 request, java.lang.String wxaPkgFilePath, java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.launching.s6 source) {
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(wxaPkgFilePath, "wxaPkgFilePath");
        kotlin.jvm.internal.o.g(source, "source");
        if (kz5.z.F(qq5.a.f365997d, request.f84853f)) {
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo();
            wxaPluginPkgInfo.pkgPath = wxaPkgFilePath;
            wxaPluginPkgInfo.provider = request.f84851d;
            wxaPluginPkgInfo.version = i17;
            if (str == null || str.length() == 0) {
                str = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(wxaPkgFilePath);
            }
            wxaPluginPkgInfo.f75405md5 = str;
            com.tencent.mm.plugin.appbrand.appcache.eb ebVar = (com.tencent.mm.plugin.appbrand.appcache.eb) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.eb.class);
            java.lang.String provider = wxaPluginPkgInfo.provider;
            kotlin.jvm.internal.o.f(provider, "provider");
            wxaPluginPkgInfo.stringVersion = ebVar.y0(provider, wxaPluginPkgInfo.version);
            modulePkgInfo = wxaPluginPkgInfo;
        } else {
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo2 = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo();
            modulePkgInfo2.pkgPath = wxaPkgFilePath;
            modulePkgInfo2.name = request.f84852e;
            if (str == null || str.length() == 0) {
                str = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.d(wxaPkgFilePath);
            }
            modulePkgInfo2.f75372md5 = str;
            modulePkgInfo2.pkgVersion = i17;
            modulePkgInfo = modulePkgInfo2;
        }
        return new com.tencent.mm.plugin.appbrand.launching.p6(modulePkgInfo, source);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        if (r4 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c A[Catch: all -> 0x031c, TRY_LEAVE, TryCatch #5 {, blocks: (B:105:0x01b0, B:161:0x01f0, B:109:0x0200, B:114:0x020c, B:116:0x0210, B:117:0x0219, B:119:0x021f, B:122:0x0246, B:125:0x024f, B:132:0x0271, B:143:0x027a, B:144:0x027d, B:172:0x01f9, B:173:0x01fc, B:154:0x01d5, B:156:0x01db, B:157:0x01e0, B:128:0x025f, B:130:0x0265, B:168:0x01f6, B:139:0x0277), top: B:104:0x01b0, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0210 A[Catch: all -> 0x031c, TRY_ENTER, TryCatch #5 {, blocks: (B:105:0x01b0, B:161:0x01f0, B:109:0x0200, B:114:0x020c, B:116:0x0210, B:117:0x0219, B:119:0x021f, B:122:0x0246, B:125:0x024f, B:132:0x0271, B:143:0x027a, B:144:0x027d, B:172:0x01f9, B:173:0x01fc, B:154:0x01d5, B:156:0x01db, B:157:0x01e0, B:128:0x025f, B:130:0x0265, B:168:0x01f6, B:139:0x0277), top: B:104:0x01b0, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.appbrand.launching.p6 b(com.tencent.mm.plugin.appbrand.appcache.b4 r22, com.tencent.mm.plugin.appbrand.launching.o6 r23, com.tencent.mm.plugin.appbrand.appcache.s r24) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.i4.b(com.tencent.mm.plugin.appbrand.appcache.b4, com.tencent.mm.plugin.appbrand.launching.o6, com.tencent.mm.plugin.appbrand.appcache.s):com.tencent.mm.plugin.appbrand.launching.p6");
    }
}
