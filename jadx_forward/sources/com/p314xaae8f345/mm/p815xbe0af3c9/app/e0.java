package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes11.dex */
public class e0 extends hm0.x {
    public e0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850) {
    }

    @Override // hm0.t
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, onStartupDone");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, not mail process.");
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, account not ready.");
        } else if (!com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, voiceover disable.");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29123, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "VoiceOverUsingReport, voiceover enable report.");
        }
    }
}
