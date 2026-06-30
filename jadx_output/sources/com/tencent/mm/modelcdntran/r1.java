package com.tencent.mm.modelcdntran;

/* loaded from: classes8.dex */
public class r1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.s1 f71122d;

    public r1(com.tencent.mm.modelcdntran.s1 s1Var) {
        this.f71122d = s1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof com.tencent.mm.modelcdntran.y2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreCdnTransport", "get cdn dns on scene end but is not [NetSceneGetCdnDns]");
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.modelcdntran.s1 s1Var = this.f71122d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCdnTransport", "%d get cdn dns on scene end errType[%d] errCode[%d] errMsg[%s] lastGetDnsErrorTime[%d]", valueOf, valueOf2, valueOf3, str, java.lang.Long.valueOf(s1Var.f71131r));
        if ("doScene failed".equals(str)) {
            return;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(546L, i17 + 10, 1L, true);
        if (i17 == 0) {
            if (s1Var.f71131r > 0) {
                fVar.idkeyStat(546L, 52L, 1L, true);
                s1Var.f71131r = 0L;
                return;
            }
            return;
        }
        if (i17 != 4) {
            if (s1Var.f71131r != 0) {
                s1Var.f71131r = 0L;
                fVar.idkeyStat(546L, 51L, 1L, true);
                return;
            }
            int i19 = ((com.tencent.mm.modelcdntran.y2) m1Var).f71172g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            s1Var.f71131r = java.lang.System.currentTimeMillis();
            s1Var.f71132s.removeMessages(1);
            com.tencent.mm.sdk.platformtools.n3 n3Var = s1Var.f71132s;
            n3Var.sendMessageDelayed(n3Var.obtainMessage(1, i19, 0), 30000L);
            fVar.idkeyStat(546L, 50L, 1L, true);
        }
    }
}
