package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes7.dex */
public final class i0 implements j35.a {
    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onResultAllow");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        com.tencent.mm.plugin.appbrand.debugger.console.n0.f77690a.a();
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onResultCancel");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onResultRefuse");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
