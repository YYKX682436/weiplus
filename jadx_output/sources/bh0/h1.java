package bh0;

/* loaded from: classes9.dex */
public class h1 extends com.tencent.mm.sdk.event.n {
    public h1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.JsapiResultEvent jsapiResultEvent = (com.tencent.mm.autogen.events.JsapiResultEvent) iEvent;
        if (!(jsapiResultEvent instanceof com.tencent.mm.autogen.events.JsapiResultEvent)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 b17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.b();
        am.yh yhVar = jsapiResultEvent.f54449g;
        b17.mmOnActivityResult(yhVar.f8461a, yhVar.f8462b, yhVar.f8463c);
        return true;
    }
}
