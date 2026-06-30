package bh0;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17;
        com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = (com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent) iEvent;
        qx4.l0 l0Var = qx4.l0.f367422a;
        synchronized (qx4.l0.class) {
            pm0.v.X(qx4.h0.f367409d);
        }
        boolean z18 = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground();
        boolean z19 = destroyPreloadedWebViewEvent.f54089g.f6218b;
        if (z18 || !z19) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184203c;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) ((java.lang.ref.SoftReference) entry.getValue()).get();
                if (e3Var != null && (z17 = e3Var.L) && z17) {
                    e3Var.y1();
                }
            }
            concurrentHashMap.clear();
        }
        if (z18) {
            com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187731a.b();
        }
        return false;
    }
}
