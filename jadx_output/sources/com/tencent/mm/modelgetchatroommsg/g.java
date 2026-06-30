package com.tencent.mm.modelgetchatroommsg;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f71243d;

    public g(com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver getChatroomMsgReceiver, java.lang.Object obj) {
        this.f71243d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        xg3.w wi6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
        java.lang.String str = (java.lang.String) this.f71243d;
        com.tencent.mm.storage.d3 d3Var = (com.tencent.mm.storage.d3) wi6;
        if (d3Var.n(str)) {
            com.tencent.mm.storage.c3 i17 = d3Var.i(str);
            mo.d dVar = i17.field_seqBlockInfo;
            if (dVar != null) {
                dVar.f330255d.clear();
            }
            i17.field_lastLocalSeq = i17.field_lastPushSeq;
            i17.field_lastLocalCreateTime = i17.field_lastPushCreateTime;
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "[onNotifyChange] username:" + str + " ret:" + d3Var.o(i17) + " chatroomMsgSeq:" + i17.toString());
        }
    }
}
