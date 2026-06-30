package com.tencent.mm.modelgetchatroommsg;

/* loaded from: classes11.dex */
public class GetChatroomMsgReceiver extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SilenceNotifyEvent> implements l75.z0, l75.q0, com.tencent.mm.modelgetchatroommsg.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f71231d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f71232e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GetChatroomMsgReceiver() {
        /*
            r2 = this;
            com.tencent.mm.app.a0 r0 = com.tencent.mm.app.a0.f53288d
            r2.<init>(r0)
            com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$2 r1 = new com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$2
            r1.<init>(r2, r0)
            r2.f71231d = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f71232e = r0
            r1.alive()
            com.tencent.mm.modelgetchatroommsg.f r0 = com.tencent.mm.modelgetchatroommsg.f.d()
            r0.f71238d = r2
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.tencent.mm.plugin.messenger.foundation.h2) r0
            com.tencent.mm.storage.m4 r0 = r0.Di()
            com.tencent.mm.sdk.platformtools.u3 r1 = gm0.j1.e()
            android.os.Looper r1 = r1.a()
            l75.v0 r0 = r0.f316939c
            r0.a(r2, r1)
            java.lang.Class<w11.w1> r0 = w11.w1.class
            i95.m r0 = i95.n0.c(r0)
            w11.w1 r0 = (w11.w1) r0
            xg3.w0 r0 = r0.Ai()
            com.tencent.mm.sdk.platformtools.u3 r1 = gm0.j1.e()
            android.os.Looper r1 = r1.a()
            r0.add(r2, r1)
            r0 = 562497440(0x218707a0, float:9.149974E-19)
            r2.__eventId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver.<init>():void");
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.SilenceNotifyEvent silenceNotifyEvent) {
        gm0.j1.e().j(new com.tencent.mm.modelgetchatroommsg.h(silenceNotifyEvent, null));
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di() && (obj instanceof java.lang.String) && 5 == i17) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelgetchatroommsg.g(this, obj));
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (x51.t1.b(str)) {
            return;
        }
        try {
            long longValue = java.lang.Long.valueOf(str).longValue();
            com.tencent.mm.storage.y7 y7Var = new com.tencent.mm.storage.y7();
            y7Var.field_originSvrId = longValue;
            boolean z17 = ((w11.w1) i95.n0.c(w11.w1.class)).Ai().get(y7Var, new java.lang.String[0]);
            java.util.Map map = this.f71232e;
            if (z17) {
                ((java.util.HashMap) map).put(java.lang.Long.valueOf(longValue), y7Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange put info systemRowid[%d], svrId[%d]", java.lang.Long.valueOf(y7Var.systemRowid), java.lang.Long.valueOf(longValue));
            } else {
                ((java.util.HashMap) map).remove(java.lang.Long.valueOf(longValue));
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange remove info svrId[%d]", java.lang.Long.valueOf(longValue));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", e17, "summerbadcr dealSysCmdMsg onNotifyChange:", new java.lang.Object[0]);
        }
    }
}
