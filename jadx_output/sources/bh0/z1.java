package bh0;

/* loaded from: classes4.dex */
public class z1 extends com.tencent.mm.sdk.event.n {
    public z1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent webviewReportTmplTransferEvent = (com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent) iEvent;
        if (!(webviewReportTmplTransferEvent instanceof com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent)) {
            return false;
        }
        ax4.a.b(974, webviewReportTmplTransferEvent.f54991g.f7867a, 1, false);
        return true;
    }
}
