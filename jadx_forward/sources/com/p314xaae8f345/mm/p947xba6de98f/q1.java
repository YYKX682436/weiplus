package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes8.dex */
public class q1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.s1 f152650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.p947xba6de98f.s1 s1Var, android.os.Looper looper) {
        super(looper);
        this.f152650a = s1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.p314xaae8f345.mm.p947xba6de98f.s1 s1Var = this.f152650a;
        if (s1Var.f152664r == 0) {
            return;
        }
        int i17 = message.arg1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(s1Var.f152664r);
        long j17 = s1Var.f152664r;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCdnTransport", "try get dns again scene[%d] lastGetDnsErrorTime[%d]  diff[%d]", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
        gm0.j1.d().g(new com.p314xaae8f345.mm.p947xba6de98f.y2(i17));
    }
}
