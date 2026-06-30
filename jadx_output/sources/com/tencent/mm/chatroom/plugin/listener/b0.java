package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.ql qlVar;
        int i17;
        com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = (com.tencent.mm.autogen.events.NotifyGroupTodoEvent) iEvent;
        if (notifyGroupTodoEvent != null && (i17 = (qlVar = notifyGroupTodoEvent.f54545g).f7715a) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyGroupTodoEventIListener", "NotifyGroupTodoEvent %s", qlVar.f7716b, qlVar.f7717c, java.lang.Integer.valueOf(i17));
            if (com.tencent.mm.storage.z3.N4(qlVar.f7716b)) {
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(qlVar.f7716b);
                if (p17 == null) {
                    p17 = new com.tencent.mm.storage.l4(qlVar.f7716b);
                    p17.n1(java.lang.System.currentTimeMillis());
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(p17);
                }
                p17.D1(1);
                p17.z1(xg3.b.b(p17, 1, java.lang.System.currentTimeMillis()));
                g95.u.j(qlVar.f7716b, 10);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, p17.h1(), false, true);
            }
        }
        return false;
    }
}
