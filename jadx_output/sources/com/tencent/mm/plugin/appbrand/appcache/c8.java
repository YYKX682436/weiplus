package com.tencent.mm.plugin.appbrand.appcache;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class c8 implements com.tencent.mm.ipcinvoker.k0 {
    public static com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "getLib(release:%b)", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.appcache.n9 c17 = z17 ? com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.c(true) : com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.c(false);
        if (c17 == null) {
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c17.field_version);
        java.lang.String str = c17.field_versionMd5;
        com.tencent.mm.plugin.appbrand.appcache.AssetReader assetReader = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "getLib(%b), record.version:%d, record.md5:%s, embed.version:%d", valueOf, valueOf2, str, java.lang.Integer.valueOf(assetReader.i()));
        if (z17 && c17.field_version < assetReader.i()) {
            return null;
        }
        if (com.tencent.mm.vfs.w6.j(c17.field_pkgPath)) {
            return com.tencent.mm.plugin.appbrand.appcache.i8.b(c17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibRuntimeReader", "getLib, file not found, path %s", c17.field_pkgPath);
        return null;
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid) {
        com.tencent.mm.plugin.appbrand.appcache.qa qaVar;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo a17;
        com.tencent.mm.plugin.appbrand.appcache.AbsReader absReader;
        com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
        com.tencent.mm.plugin.appbrand.app.r9.mj();
        if (!gm0.j1.a()) {
            return new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$AccountNotReadyError();
        }
        try {
            try {
                qaVar = com.tencent.mm.plugin.appbrand.app.r9.Di();
            } catch (java.lang.Exception unused) {
                qaVar = null;
            }
            if (qaVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibRuntimeReader", "decideWhichLib, NULL == WxaPkgStorage");
                a17 = null;
            } else {
                synchronized (com.tencent.mm.plugin.appbrand.appcache.e8.f75516b) {
                    a17 = a(false);
                    if (a17 == null) {
                        a17 = a(true);
                    }
                }
            }
            if (a17 == null || !a17.f75401f) {
                if (a17 != null && !android.text.TextUtils.isEmpty(a17.pkgPath)) {
                    absReader = new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader(a17);
                }
                absReader = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibRuntimeReader", "IPC_ReadLib invalid PkgInfo=%s", a17);
            } else {
                absReader = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "IPC_ReadLib use local pkg");
            }
            java.util.Objects.requireNonNull(absReader);
            com.tencent.mm.plugin.appbrand.appcache.x7.b(absReader);
            return absReader;
        } finally {
        }
    }
}
