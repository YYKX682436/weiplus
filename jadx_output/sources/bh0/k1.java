package bh0;

/* loaded from: classes8.dex */
public class k1 extends com.tencent.mm.sdk.event.n {
    public k1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.webview.model.c0.f182814d = ((com.tencent.mm.autogen.events.WebViewShortcutCommandEvent) iEvent).f54987g.f7508a.substring(11);
        return true;
    }
}
