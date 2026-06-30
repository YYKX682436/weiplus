package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class s1 extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return !com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().getBoolean("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer_transfer_finished", false);
    }

    @Override // c01.i8
    public void c(int i17) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString;
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath.concat("/");
        }
        com.tencent.mm.vfs.w6.f(absolutePath + "tencent/MicroMsg/wxajscache");
        try {
            iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.jsruntime.t1.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.V8CodeCachePathRetriever", "retrieve ipc ex = %s", e17);
            iPCString = null;
        }
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str != null) {
            java.lang.String b17 = com.tencent.mm.plugin.appbrand.jsruntime.u1.b();
            if (com.tencent.mm.vfs.w6.j(str) && !com.tencent.mm.vfs.w6.j(b17)) {
                android.util.Pair a17 = com.tencent.mm.plugin.appbrand.appstorage.i1.a(str, b17);
                if (!((java.lang.Boolean) a17.first).booleanValue()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer", "FileMove error: " + a17.second);
                    com.tencent.mm.vfs.w6.u(b17);
                    com.tencent.mm.vfs.w6.b(str, b17);
                }
            }
            com.tencent.mm.vfs.w6.f(str);
        }
        com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer_transfer_finished", true).commit();
    }
}
