package bh0;

/* loaded from: classes9.dex */
public class n1 extends com.tencent.mm.sdk.event.n {
    public n1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AcceptCouponCardEvent acceptCouponCardEvent = (com.tencent.mm.autogen.events.AcceptCouponCardEvent) iEvent;
        if (acceptCouponCardEvent instanceof com.tencent.mm.autogen.events.AcceptCouponCardEvent) {
            android.content.Intent intent = new android.content.Intent();
            am.b bVar = acceptCouponCardEvent.f53962g;
            if (bVar != null) {
                intent.putExtra("card_list", bVar.f6199a);
                intent.putExtra("result_code", bVar.f6200b);
            }
            if (bVar == null || bVar.f6200b != -1) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.b().mmOnActivityResult(16, 0, intent);
            } else {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.b().mmOnActivityResult(16, -1, intent);
            }
        }
        return false;
    }
}
