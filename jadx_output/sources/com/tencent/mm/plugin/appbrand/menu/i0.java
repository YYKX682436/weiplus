package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes4.dex */
public final class i0 extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.MenuDelegate_SendToDesktop.ConfigMigration";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return true;
    }

    @Override // c01.i8
    public void c(int i17) {
        if (com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().contains("key_sendtodesktop_no_more_show_permission_notify_dialog")) {
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", com.tencent.mm.plugin.appbrand.app.r9.Ui().z0("key_sendtodesktop_no_more_show_permission_notify_dialog", "0").equals("1")).apply();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MenuDelegate_SendToDesktop", "SendToDesktopConfigToMMKVMigration.transfer() error=%s", th6);
        }
    }
}
