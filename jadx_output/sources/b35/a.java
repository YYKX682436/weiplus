package b35;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AppBrandSendAppMsgEvent appBrandSendAppMsgEvent = (com.tencent.mm.autogen.events.AppBrandSendAppMsgEvent) iEvent;
        am.x xVar = appBrandSendAppMsgEvent.f53984g;
        if (xVar.f8332c != null) {
            ot0.q qVar = new ot0.q();
            qVar.f348646d = "";
            qVar.H = "";
            qVar.f348706s = 2;
            am.x xVar2 = appBrandSendAppMsgEvent.f53984g;
            qVar.f(xVar2.f8332c);
            com.tencent.mm.pluginsdk.model.app.k0.H(qVar, xVar2.f8330a, xVar2.f8331b, null, null, 0, null, null, null, null, null, null);
        } else {
            com.tencent.mm.pluginsdk.model.app.k0.D(xVar.f8330a, "", "", xVar.f8331b, 2, null);
        }
        return false;
    }
}
