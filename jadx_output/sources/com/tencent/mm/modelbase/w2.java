package com.tencent.mm.modelbase;

/* loaded from: classes11.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70836d;

    public w2(java.lang.String str) {
        this.f70836d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.x2 x2Var;
        java.lang.String str = this.f70836d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (x2Var = com.tencent.mm.modelbase.y2.f70840h) == null) {
            return;
        }
        ((com.tencent.mm.app.w7) x2Var).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "summerdiz onOldDisaster errStr[%s]", str);
        com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = new com.tencent.mm.autogen.events.BroadcastEvent();
        am.c1 c1Var = broadcastEvent.f54012g;
        c1Var.f6298a = 4;
        c1Var.f6299b = str;
        broadcastEvent.e();
    }
}
