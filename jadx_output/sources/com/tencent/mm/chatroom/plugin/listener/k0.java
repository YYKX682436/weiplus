package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes5.dex */
public class k0 extends com.tencent.mm.sdk.event.n {
    public k0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent = (com.tencent.mm.autogen.events.RevokeNativeMsgEvent) iEvent;
        if (!(revokeNativeMsgEvent instanceof com.tencent.mm.autogen.events.RevokeNativeMsgEvent)) {
            return false;
        }
        am.ds dsVar = revokeNativeMsgEvent.f54714g;
        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeNativeMessageListener", "RevokeNativeMsgEvent recall result:%s", kn.j0.g(dsVar.f6496a, dsVar.f6498c));
        return false;
    }
}
