package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.sdk.event.n {
    public e0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent notifyGroupToolsResetEvent = (com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent) iEvent;
        if ((notifyGroupToolsResetEvent instanceof com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent) && notifyGroupToolsResetEvent.f54547g.f7903a != null) {
            rn.i Di = ((nn.j) i95.n0.c(nn.j.class)).Di();
            am.sl slVar = notifyGroupToolsResetEvent.f54547g;
            rn.h y07 = Di.y0(slVar.f7903a.Q0());
            if (y07 == null) {
                slVar.f7903a.Q0();
            } else if (y07.field_queryState == 0) {
                slVar.f7903a.Q0();
            } else {
                y07.field_queryState = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyGroupToolsResetListener", "NotifyGroupToolsResetEvent(%s) result:%s", slVar.f7903a.Q0(), java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().update(y07, new java.lang.String[0])));
            }
        }
        return false;
    }
}
