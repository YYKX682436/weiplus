package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes13.dex */
public class c extends com.p314xaae8f345.p3210x3857dc.s0 {
    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onConsoleMessage %d %s %s %s", java.lang.Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.messageLevel().name(), consoleMessage.message(), consoleMessage.sourceId());
        if (consoleMessage.messageLevel() != android.webkit.ConsoleMessage.MessageLevel.ERROR || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(consoleMessage.message())) {
            return false;
        }
        jx3.f.INSTANCE.d(19153, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1)), consoleMessage.messageLevel(), 1);
        if (consoleMessage.message().contains("SyntaxError")) {
            su4.k3.e(22);
            return false;
        }
        if (!consoleMessage.message().contains("Maximum call stack size exceeded")) {
            return false;
        }
        su4.k3.e(33);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsAlert %s %s", str, str2);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsConfirm %s %s", str, str2);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.y yVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsPrompt %s %s", str, str2);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17) {
    }
}
