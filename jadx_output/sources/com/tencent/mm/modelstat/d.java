package com.tencent.mm.modelstat;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f71497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelstat.e f71498e;

    public d(com.tencent.mm.modelstat.e eVar, com.tencent.mm.storage.f9 f9Var) {
        this.f71498e = eVar;
        this.f71497d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71498e.getClass();
        com.tencent.mm.autogen.events.SendOutMsgEvent sendOutMsgEvent = new com.tencent.mm.autogen.events.SendOutMsgEvent();
        sendOutMsgEvent.f54756g.f7743a = this.f71497d;
        sendOutMsgEvent.e();
    }
}
