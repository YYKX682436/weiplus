package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes5.dex */
public class n0 extends com.tencent.mm.sdk.event.n {
    public n0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        if (!(revokeMsgEvent instanceof com.tencent.mm.autogen.events.RevokeMsgEvent)) {
            return false;
        }
        am.cs csVar = revokeMsgEvent.f54713g;
        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeReceiveMessageListener", "RevokeMsgEvent recall result:%s", kn.j0.g(csVar.f6394a, csVar.f6396c.Q0()));
        return false;
    }
}
