package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes8.dex */
public final class n implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94164d;

    public n(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f94164d = bizTestUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg webViewControllerPreloadMrg = com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187731a;
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94164d;
        if (!webViewControllerPreloadMrg.c(bizTestUI.g)) {
            return false;
        }
        qk.j9 j9Var = (qk.j9) i95.n0.c(qk.j9.class);
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(new android.content.MutableContextWrapper(bizTestUI.getContext()));
        zg0.k2 k2Var = new zg0.k2(null, false, false, false, false, 0, false, 105, null);
        ((cw4.v0) j9Var).getClass();
        com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.a(webViewControllerPreloadMrg, bizTestUI.g, new com.tencent.mm.plugin.webview.core.e3(a17, new com.tencent.mm.plugin.webview.model.b6(), k2Var, null, null), false, 0, 0, 0, false, 124, null);
        return false;
    }
}
