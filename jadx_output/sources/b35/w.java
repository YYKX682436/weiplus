package b35;

/* loaded from: classes10.dex */
public class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderSendMsgEvent finderSendMsgEvent = (com.tencent.mm.autogen.events.FinderSendMsgEvent) iEvent;
        am.bd bdVar = finderSendMsgEvent.f54322g;
        com.tencent.mm.pluginsdk.model.app.k0.D(bdVar.f6237a, "", "", bdVar.f6238b, bdVar.f6239c, null);
        tg3.a1 a17 = tg3.t1.a();
        am.bd bdVar2 = finderSendMsgEvent.f54322g;
        java.lang.String str = bdVar2.f6238b;
        ((dk5.s5) a17).fj(str, bdVar2.f6240d, c01.e2.C(str), 0);
        return false;
    }
}
