package bq3;

/* loaded from: classes4.dex */
public final class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReceivePocketMoneyAppMsgEvent event = (com.tencent.mm.autogen.events.ReceivePocketMoneyAppMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReceivePocketMoneyAppMsgEvent: ");
        am.wp wpVar = event.f54655g;
        sb6.append(wpVar.f8311b);
        sb6.append(", ");
        sb6.append(wpVar.f8310a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ReceivePocketMoneyAppMsgEventListener", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(wpVar.f8311b) || wpVar.f8310a < 0) {
            return false;
        }
        i95.m c17 = i95.n0.c(bq3.l.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        dq3.a aVar = new dq3.a();
        aVar.field_msgId = wpVar.f8310a;
        aVar.field_payMsgId = wpVar.f8311b;
        ((bq3.l) c17).f23581d.insert(aVar);
        return false;
    }
}
