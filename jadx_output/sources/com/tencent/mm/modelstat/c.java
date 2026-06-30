package com.tencent.mm.modelstat;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f71495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelstat.e f71496e;

    public c(com.tencent.mm.modelstat.e eVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f71496e = eVar;
        this.f71495d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71496e.getClass();
        com.tencent.mm.autogen.events.SendOutMsgEvent sendOutMsgEvent = new com.tencent.mm.autogen.events.SendOutMsgEvent();
        sendOutMsgEvent.f54756g.f7743a = this.f71495d;
        sendOutMsgEvent.e();
    }
}
