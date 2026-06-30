package com.tencent.mm.modelcdntran;

/* loaded from: classes8.dex */
public class q1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.s1 f71117a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.modelcdntran.s1 s1Var, android.os.Looper looper) {
        super(looper);
        this.f71117a = s1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.tencent.mm.modelcdntran.s1 s1Var = this.f71117a;
        if (s1Var.f71131r == 0) {
            return;
        }
        int i17 = message.arg1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(s1Var.f71131r);
        long j17 = s1Var.f71131r;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCdnTransport", "try get dns again scene[%d] lastGetDnsErrorTime[%d]  diff[%d]", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
        gm0.j1.d().g(new com.tencent.mm.modelcdntran.y2(i17));
    }
}
