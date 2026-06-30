package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class k1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l1 f71030d;

    public k1(com.tencent.mm.modelcdntran.l1 l1Var) {
        this.f71030d = l1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelcdntran.l1 l1Var = this.f71030d;
        int i17 = l1Var.f71046g;
        if (i17 == 0 && l1Var.f71047h == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "CdnDataFlowStat id:%s send:%d recv:%d", l1Var.f71048i, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(l1Var.f71047h));
        c01.s8 s8Var = c01.n8.f37348a;
        if (s8Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", "getNetStat null");
            return false;
        }
        ((com.tencent.mm.modelstat.s0) s8Var).a(l1Var.f71047h, l1Var.f71046g, 0);
        l1Var.f71046g = 0;
        l1Var.f71047h = 0;
        return true;
    }
}
