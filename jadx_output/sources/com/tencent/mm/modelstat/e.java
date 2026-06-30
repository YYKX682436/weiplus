package com.tencent.mm.modelstat;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.modelstat.e f71505a = new com.tencent.mm.modelstat.e();

    public e() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SendMsgSuccessEvent>(a0Var) { // from class: com.tencent.mm.modelstat.ChattingOperationUitl$1
            {
                this.__eventId = -1168836192;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SendMsgSuccessEvent sendMsgSuccessEvent) {
                com.tencent.mm.autogen.events.SendMsgSuccessEvent sendMsgSuccessEvent2 = sendMsgSuccessEvent;
                if (!(sendMsgSuccessEvent2 instanceof com.tencent.mm.autogen.events.SendMsgSuccessEvent)) {
                    return false;
                }
                com.tencent.mm.modelstat.e.this.b(sendMsgSuccessEvent2.f54755g.f7659a);
                return false;
            }
        }.alive();
    }

    public void a(com.tencent.mm.storage.f9 f9Var, int i17) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.modelstat.c(this, f9Var, i17));
    }

    public void b(com.tencent.mm.storage.f9 f9Var) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.modelstat.d(this, f9Var));
    }
}
