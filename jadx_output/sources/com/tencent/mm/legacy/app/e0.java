package com.tencent.mm.legacy.app;

/* loaded from: classes11.dex */
public class e0 extends hm0.x {
    public e0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
    }

    @Override // hm0.t
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, onStartupDone");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, not mail process.");
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, account not ready.");
        } else if (!com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, voiceover disable.");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29123, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, voiceover enable report.");
        }
    }
}
