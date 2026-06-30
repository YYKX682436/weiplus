package com.tencent.mm.app.plugin;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {
    public c0(com.tencent.mm.app.plugin.URISpanHandlerSet.JumpPatSettingUriSpanHandler jumpPatSettingUriSpanHandler) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI != null) {
            launcherUI.closeChatting(false);
            launcherUI.f7().o("tab_settings");
        }
    }
}
