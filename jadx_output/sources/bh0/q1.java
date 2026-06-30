package bh0;

/* loaded from: classes9.dex */
public class q1 extends com.tencent.mm.sdk.event.n {
    public q1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent consumedCouponCardCodeEvent = (com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent) iEvent;
        if (consumedCouponCardCodeEvent instanceof com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent) {
            android.content.Intent intent = new android.content.Intent();
            am.m3 m3Var = consumedCouponCardCodeEvent.f54074g;
            if (m3Var == null || m3Var.f7318a != -1) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.b().mmOnActivityResult(29, 0, intent);
            } else {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.b().mmOnActivityResult(29, -1, intent);
            }
        }
        return false;
    }
}
