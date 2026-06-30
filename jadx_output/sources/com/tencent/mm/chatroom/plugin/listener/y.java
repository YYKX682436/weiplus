package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes5.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent = (com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent) iEvent;
        if (!(getChatRoomInfoDetailEvent instanceof com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent) || com.tencent.mm.sdk.platformtools.t8.K0(getChatRoomInfoDetailEvent.f54383g.f7147a)) {
            return false;
        }
        gd0.e eVar = (gd0.e) i95.n0.c(gd0.e.class);
        am.kf kfVar = getChatRoomInfoDetailEvent.f54383g;
        ((fd0.e) eVar).wi(kfVar.f7147a).m(kfVar.f7147a).b();
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatRoomInfoDetailListener", "getChatRoomInfoDetailListener roomname:%s", kfVar.f7147a);
        return false;
    }
}
