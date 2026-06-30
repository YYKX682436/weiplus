package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class w1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h2 f152685d;

    public w1(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var) {
        this.f152685d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "cdnCallbackExecuteTimeReport onTimerExpired");
        com.p314xaae8f345.mm.p947xba6de98f.h2.c(this.f152685d);
        return true;
    }
}
