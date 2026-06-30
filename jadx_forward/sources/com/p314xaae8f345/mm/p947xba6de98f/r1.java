package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes8.dex */
public class r1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.s1 f152655d;

    public r1(com.p314xaae8f345.mm.p947xba6de98f.s1 s1Var) {
        this.f152655d = s1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p947xba6de98f.y2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreCdnTransport", "get cdn dns on scene end but is not [NetSceneGetCdnDns]");
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p947xba6de98f.s1 s1Var = this.f152655d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCdnTransport", "%d get cdn dns on scene end errType[%d] errCode[%d] errMsg[%s] lastGetDnsErrorTime[%d]", valueOf, valueOf2, valueOf3, str, java.lang.Long.valueOf(s1Var.f152664r));
        if ("doScene failed".equals(str)) {
            return;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(546L, i17 + 10, 1L, true);
        if (i17 == 0) {
            if (s1Var.f152664r > 0) {
                fVar.mo68477x336bdfd8(546L, 52L, 1L, true);
                s1Var.f152664r = 0L;
                return;
            }
            return;
        }
        if (i17 != 4) {
            if (s1Var.f152664r != 0) {
                s1Var.f152664r = 0L;
                fVar.mo68477x336bdfd8(546L, 51L, 1L, true);
                return;
            }
            int i19 = ((com.p314xaae8f345.mm.p947xba6de98f.y2) m1Var).f152705g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            s1Var.f152664r = java.lang.System.currentTimeMillis();
            s1Var.f152665s.mo50303x856b99f0(1);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = s1Var.f152665s;
            n3Var.mo50311x7ab51103(n3Var.mo50290x733c63a2(1, i19, 0), 30000L);
            fVar.mo68477x336bdfd8(546L, 50L, 1L, true);
        }
    }
}
